import java.util.ArrayList;

/**
 * An island is part of a FIRE resort. Each island has a name, a luxury rating,
 * and a capacity which represents the maximum number of passes that can be on the
 * island at any one time. Each island must maintain a list of all passes currently
 * on the island. These lists are updated whenever passes enter or leave and island,
 * so that it is always possible to say which passes are on the island.
 *
 * @author Klevi
 * @version 27/11/2022
 */
public class Island {
    private int islandID;
    private String islandName;
    private int islandRating;
    private int islandCapacity;
    private ArrayList<Pass> passList;

    /**
     * Constructs an Island object.
     *
     * @param id       The id of the island.
     * @param name     The name of the island.
     * @param rate     The rating of the island.
     * @param capacity The capacity of the island.
     */
    public Island(int id, String name, int rate, int capacity) {
        islandID = id;
        islandName = name;
        islandRating = rate;
        islandCapacity = capacity;
        passList = new ArrayList<Pass>(islandCapacity);
    }

    /**
     * Gets the island's id.
     *
     * @return The island's id.
     */
    public int getIslandID() {
        return islandID;
    }

    /**
     * Gets the island's name.
     *
     * @return The island's name.
     */
    public String getIslandName() {
        return islandName;
    }

    /**
     * Gets the island's rating.
     *
     * @return The island's rating.
     */
    public int getIslandRating() {
        return islandRating;
    }

    /**
     * Gets the island's capacity.
     *
     * @return The island's capacity.
     */
    public int getIslandCapacity() {
        return islandCapacity;
    }

    /**
     * Gets the pass list.
     *
     * @return The pass list.
     */
    public ArrayList<Pass> getPassList() {
        return passList;
    }

    /**
     * Tests if a pass can enter the island based on the capacity.
     *
     * @return Whether the pass can enter or not.
     */
    public boolean canPassEnter() {
        return passList.size() < islandCapacity;
    }

    /**
     * Allows a pass to enter the island if possible.
     *
     * @param temp The pass that wants to enter the island.
     */
    public void enter(Pass temp) {
        if (passList.size() < islandCapacity) {
            passList.add(temp);
        }
    }

    /**
     * Allows a pass to leave the island.
     *
     * @param temp The pass that wants to leave the island.
     */
    public void leave(Pass temp) {
        passList.remove(temp);
    }

    /**
     * Tests if the island has space for more passes.
     *
     * @return Whether the island has capacity or not.
     */
    public String hasSpace() {
        if (passList.size() < islandCapacity) {
            return "The island has capacity";
        }
        return "The island reached the maximum capacity";
    }

    /**
     * Lists all the current passes currently on the island.
     */
    public void listCurrentPasses() {
        for (Pass pass : passList) {
            System.out.println(pass);
        }
    }

    /**
     * Gets a pass' details.
     *
     * @param id The id of the pass.
     * @return The pass' details.
     */
    public Pass getPassDetails(int id) {
        for (Pass temp : passList) {
            if (temp.getPassIdNumber() == id) {
                return temp;
            }
        }
        return null;
    }

    /**
     * Tests if a pass is on the island.
     *
     * @param p The pass to check for.
     * @return Whether the pass is on the island or not.
     */
    public boolean isPassOnIsland(Pass p) {
        return passList.contains(p);
    }

    /**
     * Tests if a pass is on the island.
     *
     * @param id The pass id to check for.
     * @return Whether the pass is on the island or not.
     */
    public boolean isPassOnIsland(int id) {
        for (Pass pass : passList) {
            if (pass.getPassIdNumber() == id) {
                return true;
            }
        }
        return false;
    }

    /**
     * Creates a string representation of the object.
     *
     * @return The string representation of the object.
     */
    public String toString() {
        return "********************\nIsland ID Number: " +
                islandID + "\nIsland Name: " +
                islandName + "\nIsland Rating: " +
                islandRating + "\nIsland capacity: " +
                islandCapacity + "\nPass List in Island:\n" +
                passList + "\n********************";
    }
}
