/**
 * Interface FIRE specifies requirements for 5COM2007 Cwk 3 - Nov 2022.
 *
 * @author A.Marczyk
 * @version 05/11/22
 */
public interface FIRE {
    /**
     * Returns information about the resort including its location/name and all
     * passes currently on each island, or "No passes" (if no pass is on that island).
     *
     * @return All details of all islands including location and all passes currently
     * on each island, or "No passes" if an island has no passes.
     */
    public String toString();

    /**
     * Returns a String representation of all the passes on all islands
     * with "No passes" if there are no passes on an island.
     *
     * @return A string representation of all passes on all islands.
     **/
    public String getAllPassesOnAllIslands();

    /**
     * Returns the name of the island which contains the specified pass or "Not found".
     *
     * @param cd The id of the pass.
     * @return The name of the island which contains the pass, or "Not found".
     **/
    public String findPassLocation(int cd);

    /**
     * Returns details of the pass with the specified id or "Not found".
     *
     * @param cd The id of the pass.
     * @return the details of the pass, or "Not found".
     **/
    public String viewAPass(int cd);

    /**
     * Given the name of an island, returns the island id number
     * or -1 if island does not exist.
     *
     * @param isl The name of island
     * @return id The number of the island.
     */
    public int getIslandNumber(String isl);

    /**
     * Returns a string representation of all the passes on a specified island.
     *
     * @param isl The name of the island.
     * @return A string representation of all passes on a specified island.
     **/
    public String getAllPassesOnIsland(String isl);

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
     * @param cdId The id of the pass requesting the move.
     * @param ferCode The code of the ferry journey by which the pass wants to move.
     * @return Whether the pass is allowed on the ferry journey or not.
     **/
    public boolean canTravel(int cdId, String ferCode);

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
    public String travel(int pPassId, String ferCode);

    /**
     * Adds credits to a pass.
     *
     * @param id The id of the pass to add credits to.
     * @param creds The number of credits to add to the pass.
     */
    public void topUpCredits(int id, int creds);

    /**
     * Converts a pass's journey points into credits (5 journey points equal 1 credit).
     *
     * @param id The id of the pass whose points are to be converted.
     */
    public void convertPoints(int id);
}
