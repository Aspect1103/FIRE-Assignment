import java.util.ArrayList;

/**
 * This class implements the FIRE interface.
 *
 * @author Jack
 * @version 29/11/2022
 **/
public class Resort implements FIRE {
    private String resortName;
    private String resortLocation;
    private ArrayList<Island> islands;
    private ArrayList<Ferry> ferries;
    private ArrayList<Pass> passes;

    /**
     * Constructs a Resort class.
     *
     * @param name     The name of the resort.
     * @param location The location of the resort.
     */
    public Resort(String name, String location) {
        // Store some details about the resort
        resortName = name;
        resortLocation = location;
        islands = new ArrayList<Island>();
        ferries = new ArrayList<Ferry>();
        passes = new ArrayList<Pass>();

        // Set up the islands, ferries and passes
        loadIslandsAndFerries();
        loadPasses();

        // Add all the passes to the base island
        Island base = islands.get(0);
        for (Pass temp : passes) {
            base.enter(temp);
        }
    }

    /**
     * Returns information about the resort including its location/name and all
     * passes currently on each island, or "No passes" (if no pass is on that island).
     *
     * @return All details of all islands including location and all passes currently
     * on each island, or "No passes" if an island has no passes.
     */
    public String toString() {
        return "********************\nResort Name: " +
                resortName + "\nResort Location: " +
                resortLocation + "\nIsland List: " +
                islands + "\n********************";
    }

    /**
     * Returns a String representation of all the passes on all islands
     * with "No passes" if there are no passes on an island.
     *
     * @return A string representation of all passes on all islands.
     **/
    public String getAllPassesOnAllIslands() {
        ArrayList<Pass> allPasses = new ArrayList<Pass>();
        islands.forEach(island -> allPasses.addAll(island.getPassList()));
        if (allPasses.size() == 0) {
            return "No passes";
        } else {
            String s = "";
            for (Pass pass : allPasses) {
                s += pass + "\n";
            }
            return s;
        }
    }

    /**
     * Returns the name of the island which contains the specified pass or "Not found".
     *
     * @param cd The id of the pass.
     * @return The name of the island which contains the pass, or "Not found".
     **/
    public String findPassLocation(int cd) {
        for (Island island : islands) {
            if (island.isPassOnIsland(cd)) {
                return island.getIslandName();
            }
        }
        return null;
    }

    /**
     * Returns details of the pass with the specified id or "Not found".
     *
     * @param cd The id of the pass.
     * @return the details of the pass, or "Not found".
     **/
    public String viewAPass(int cd) {
        for (Island island : islands) {
            Pass temp = island.getPassDetails(cd);
            if (temp != null) {
                return temp.toString();
            }
        }
        return "Not found";
    }

    /**
     * Given the name of an island, returns the island id number
     * or -1 if island does not exist.
     *
     * @param isl The name of island
     * @return id The number of the island.
     */
    public int getIslandNumber(String isl) {
        for (Island island : islands) {
            if (island.getIslandName().equals(isl)) {
                return island.getIslandID();
            }
        }
        return -1;
    }

    /**
     * Returns a string representation of all the passes on a specified island.
     *
     * @param isl The name of the island.
     * @return A string representation of all passes on a specified island.
     **/
    public String getAllPassesOnIsland(String isl) {
        int targetInd = getIslandNumber(isl);
        if (targetInd == -1) {
            return "The island doesn't exist";
        } else {
            Island target = islands.get(targetInd);
            String s = "";
            for (Pass pass : target.getPassList()) {
                s += pass + "\n";
            }
            return s;
        }
    }

    /**
     * Returns true if a pass is allowed to journey using a ferry, false otherwise.
     * <p>
     * A journey can be made if all the following conditions are true:
     * <ul>
     * <li>The rating of the pass is bigger than or equal to the rating of the destination island.</li>
     * <li>The destination island is not full.</li>
     * <li>The pass has sufficient credits (a journey costs 3 credits).</li>
     * <li>The pass is currently in the source island.</li>
     * <li>The pass id and ferry code represent objects in the system.</li>
     * </ul>
     *
     * @param cdId    The id of the pass requesting the move.
     * @param ferCode The code of the ferry journey by which the pass wants to move.
     * @return Whether the pass is allowed on the ferry journey or not.
     **/
    public boolean canTravel(int cdId, String ferCode) {
        Ferry ferry = getFerry(ferCode);
        Pass pass = getPass(cdId);
        return ferry != null &&
                pass != null &&
                pass.getLuxuryRating() >= ferry.getDestinationIsland().getIslandRating() &&
                ferry.getDestinationIsland().canPassEnter() &&
                ferry.canPassTravel(pass) &&
                ferry.getSourceIsland().isPassOnIsland(pass);
    }

    /**
     * Gets the result of a pass requesting to journey by ferry.
     * <p>
     * A journey will be successful if all the following conditions are true:
     * <ul>
     * <li>The rating of the pass is bigger than or equal to the rating of the destination island.</li>
     * <li>The destination island is not full.</li>
     * <li>The pass has sufficient credits (a journey costs 3 credits).</li>
     * <li>The pass is currently in the source island.</li>
     * <li>The pass id and ferry code represent objects in the system.</li>
     * </ul>
     * <p>
     * If the ferry journey can be made, the pass is removed from the source island,
     * added to the destination island, and a suitable message is returned. Pass
     * information should be updated (a journey costs 3 credits and journey points
     * incremented by 1). If the ferry journey cannot be made, the state of the
     * system remains unchanged and a message specifying the reason is returned.
     *
     * @param pPassId The id of the pass requesting the move.
     * @param ferCode The code of the ferry by which the pass wants to travel.
     * @return The result of the request.
     **/
    public String travel(int pPassId, String ferCode) {
        Pass pass = getPass(pPassId);
        Ferry ferry = getFerry(ferCode);
        if (pass != null && ferry != null) {
            return ferry.processPass(pass, ferry.getSourceIsland(), ferry.getDestinationIsland());
        }
        return "Invalid pass or ferry code";
    }

    /**
     * Adds credits to a pass.
     *
     * @param id    The id of the pass to add credits to.
     * @param creds The number of credits to add to the pass.
     */
    public void topUpCredits(int id, int creds) {
        Pass pass = getPass(id);
        if (pass != null && creds > 0) {
            pass.addCredits(creds);
        }
    }

    /**
     * Converts a pass's journey points into credits (5 journey points equal 1 credit).
     *
     * @param id The id of the pass whose points are to be converted.
     */
    public void convertPoints(int id) {
        Pass pass = getPass(id);
        if (pass != null) {
            pass.journeyPointsToCredits();
        }
    }

    /**
     * Loads the example passes from the specification.
     */
    private void loadPasses() {
        // Create the passes and add them to the array list
        passes.add(new Pass(1000, "Lynn", 5, 10));
        passes.add(new Pass(1001, "May", 3, 30));
        passes.add(new Pass(1002, "Nils", 10, 0));
        passes.add(new Pass(1003, "Olek", 1, 12));
        passes.add(new Pass(1004, "Pan", 3, 3));
        passes.add(new Pass(1005, "Quin", 1, 30));
        passes.add(new Pass(1006, "Raj", 4, 5));
        passes.add(new Pass(1007, "Sol", 7, 20));
        passes.add(new Pass(1008, "Tel", 6, 30));
        passes.add(new TouristPass(3, "Bill", 10, 10, "Ukraine"));
        passes.add(new BusinessPass(11, "Anna", 10));
        passes.add(new EmployeePass(321, "Henry", "Cleaner"));
        // REMOVE THIS NEWLINE
    }

    /**
     * Loads the example islands and ferries from the specification.
     */
    private void loadIslandsAndFerries() {
        // Create the island
        Island base = new Island(0, "Base", 0, 100);
        Island yorkie = new Island(1, "Yorkie", 1, 100);
        Island bounty = new Island(2, "Bounty", 3, 10);
        Island twirl = new Island(3, "Twirl", 5, 2);
        Island aero = new Island(4, "Aero", 1, 1);

        // Add the islands to the array list
        islands.add(base);
        islands.add(yorkie);
        islands.add(bounty);
        islands.add(twirl);
        islands.add(aero);

        // Create the ferries and add them to the array list
        ferries.add(new Ferry("ABC1", base, yorkie));
        ferries.add(new Ferry("BCD2", yorkie, base));
        ferries.add(new Ferry("CDE3", yorkie, bounty));
        ferries.add(new Ferry("DEF4", bounty, yorkie));
        ferries.add(new Ferry("JKL8", bounty, twirl));
        ferries.add(new Ferry("EFG5", twirl, yorkie));
        ferries.add(new Ferry("GHJ6", yorkie, aero));
        ferries.add(new Ferry("HJK7", aero, yorkie));
    }

    /**
     * Gets a pass object from the given id.
     *
     * @param id The pass id.
     * @return The pass with the given id.
     **/
    public Pass getPass(int id) {
        for (Pass pass : passes) {
            if (pass.getPassIdNumber() == id) {
                return pass;
            }
        }
        return null;
    }

    /**
     * Gets an island object from the given name.
     *
     * @param islandName The island name.
     * @return The island with the given name.
     **/
    private Island getIsland(String islandName) {
        for (Island island : islands) {
            if (island.getIslandName().equals(islandName)) {
                return island;
            }
        }
        return null;
    }

    /**
     * Gets a ferry object from the given code.
     *
     * @param fer The ferry code.
     * @return The ferry with the given code.
     **/
    private Ferry getFerry(String fer) {
        for (Ferry ferry : ferries) {
            if (ferry.getFerryCode().equals(fer)) {
                return ferry;
            }
        }
        return null;
    }
}
