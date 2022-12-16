/**
 * A TouristPass extends the Pass class to add a citizenship
 * field and an increased cost for the ferry.
 *
 * @author Klevi
 * @version 15/12/2022
 */
public class TouristPass extends Pass {
    private String citizenship;

    /**
     * Constructs a TouristPass object.
     *
     * @param passId  The pass id.
     * @param name    The tourist's name.
     * @param luxury  The pass' luxury rating.
     * @param credit  The amount of credit the pass has.
     * @param citizen The tourist's home country.
     */
    public TouristPass(int passId, String name, int luxury, int credit, String citizen) {
        super(passId, name, luxury, credit);
        citizenship = citizen;
    }

    /**
     * Uses the ferry if possible.
     */
    public void useFerry() {
        if (getCredits() >= 4) {
            removeCredits(4);
        }
    }

    /**
     * Creates a string representation of the object.
     *
     * @return The string representation of the object.
     */
    public String toString() {
        return "********************\nGuest Name: " +
                getGuestName() + "\nPass ID Number: " +
                getPassIdNumber() + "\nLuxury Rating: " +
                getLuxuryRating() + "\nCredits: " +
                getCredits() + "\nCitizenship: " +
                citizenship + "\nJourney Points: " +
                getJourneyPoints() + "\n********************";
    }
}
