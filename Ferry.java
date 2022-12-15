/**
 * A ferry provides a one-way journey between two islands. It
 * has a ferry code and information about both the source and
 * destination islands.
 *
 * @author Klevi
 * @version 27/11/2022
 */
public class Ferry {
    private String ferryID;
    private Island sourceIsland;
    private Island destinationIsland;

    /**
     * Constructs a Ferry object.
     *
     * @param ferryCode The code for the ferry.
     * @param startIsland The starting island.
     * @param endIsland The ending island.
     */
    public Ferry(String ferryCode, Island startIsland, Island endIsland) {
        ferryID = ferryCode;
        sourceIsland = startIsland;
        destinationIsland = endIsland;
    }

    /**
     * Gets the ferry code.
     *
     * @return The ferry code.
     */
    public String getFerryCode() {
        return ferryID;
    }

    /**
     * Gets the source island.
     *
     * @return The source island.
     */
    public Island getSourceIsland() {
        return sourceIsland;
    }

    /**
     * Gets the destination island.
     *
     * @return The destination island.
     */
    public Island getDestinationIsland() {
        return destinationIsland;
    }

    /**
     * Tests if a pass can travel based on their credit count.
     *
     * @param pass The pass to determine if they can trevel.
     * @return Whether the pass can travel or not.
     */
    public boolean canPassTravel(Pass pass) {
        return pass.getCredits() >= 3;
    }

    /**
     * Allows the pass to use the ferry if possible.
     *
     * @param pass The pass to process.
     * @param island1 The source island.
     * @param island2 The destination island.
     * @return The output of processing the pass.
     */
    public String processPass(Pass pass, Island island1, Island island2) {
        if (pass.getLuxuryRating() < island2.getIslandRating()) {
            return "The pass has a lower luxury rating than the destination island";
        } else if (!island2.canPassEnter()) {
            return "The destination island has reached capacity";
        } else if (!canPassTravel(pass)) {
            return "The pass does not have enough credits to travel";
        } else if (!island1.isPassOnIsland(pass)) {
            return "The person is not on the source island";
        } else {
            island1.leave(pass);
            island2.enter(pass);
            pass.useFerry();
            return "The person can travel to the next island";
        }
    }

    /**
     * Creates a string representation of the object.
     *
     * @return The string representation of the object.
     */
    public String toString() {
        return "********************\nFerry ID Number: " +
                ferryID + "\nSource Island: " + "\n" +
                getSourceIsland() + "\n\nDestination Island: " + "\n" +
                getDestinationIsland() + "\n********************";
    }
}
