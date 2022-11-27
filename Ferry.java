import java.util.ArrayList;

/**
 * A ferry provides a one-way journey between two islands. It
 * has a ferry code and information about both the source and
 * the destination island
 *
 * @author (20067052)
 * @version (a version number or a date)
 */
public class Ferry {
    private int ferryID;
    private Island sourceIsland;
    private Island destinationisland;
    private ArrayList<Pass> passInFerry;

    public Ferry(int ferryCode, Island scIsland, Island destinationIsland) {
       ferryID = ferryCode;
        sourceIsland=scIsland ;
        destinationisland = destinationIsland;
        passInFerry = new ArrayList<Pass>();
    }

    public int getFerryCode() {
        return ferryID;
    }

    public Island getSourceIsland() {
        return sourceIsland;
    }

    public Island getDestinationIsland() {
        return destinationisland;
    }

    public boolean canPassTravel(Pass temp) {return temp.getCredits() >= 3;}

    public String processPass(Pass pass, Island island1, Island island2) {
        if (pass.getLuxuryRating() < island2.getIslandRating() ||
            !island1.canPassEnter(pass) ||
            !canPassTravel(pass) ||
            !island1.isPassOnIsland(pass)) {
            return "The person with the Pass can't travel to the next Island";
        } else {
            island1.leave(pass);
            island2.enter(pass);
            passInFerry.add(pass);
            pass.useFerry();
            return "The person with the Pass can travel";
        }
    }

    public String listPass() {
        String s = "";
        for (Pass p : passInFerry) {
            s += p.toString() + "\n";
        }
        return s;
    }

    public String toString() {
        return "\n" + "********************\nFerry ID Number: " +
                ferryID + "\nSource Island : " +
                getSourceIsland() + "\nDestination Island : " +
                getDestinationIsland() + "\nPass List in Ferry: " + "\n" +
                listPass() + "\n********************";
    }

}
