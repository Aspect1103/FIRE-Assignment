/**
 * A ferry provides a one-way journey between two islands. It
 * has a ferry code and information about both the source and
 * the destination island
 *
 * @author (20067052)
 * @version (a version number or a date)
 */
public class Ferry {
    private int ferry_ID;
    private Island source_island;
    private Island destination_island;

    public  Ferry(int ferryCode,Island sourceIsland,Island destinationIsland) {
        ferry_ID=ferryCode;
        source_island=sourceIsland;
        destination_island=destinationIsland;
    }
    public int getFerryCode(){return ferry_ID;}
    public Island getSourceIsland(){return source_island;}
    public Island getDestinationIsland(){return destination_island;}
    public boolean CanPassTravel(Pass temp){return temp.getCredits() >= 3;}
    public String ProcessPass(Pass pass,Island island1,Island island2){
        if(pass.getLuxuryRating()< island2.islandRating() ||
                !island1.PassEnter(pass) || !CanPassTravel(pass)
                || !island1.isPassOnIsland(pass) ){
                return "The person with the Pass can't travel to the next Island";
        } else {
                    island1.leave(pass);
                    island2.enter(pass);
                    pass.useFerry();
                    return "The person with the Pass can travel ";
        }
    }
    public String toString() {
        return "\n"+"********************\nFerry ID Number: " +
                ferry_ID + "\nSource Island : " +
                getSourceIsland() + "\nDestination Island : " +
                getDestinationIsland() + "\nPass List in Ferry: " +"\n"+
                getDestinationIsland().listPass() + "\n********************";
    }

}
