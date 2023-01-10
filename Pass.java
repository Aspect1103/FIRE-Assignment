/**
 * A Pass represents a person in the resort who has an
 * id number, a name, a luxury rating, a certain number
 * of credits, and a certain amount of journey points.
 *
 * @author Jack
 * @version 22/11/2022
 */
public class Pass {
    private int passIdNumber;
    private String guestName;
    private int luxuryRating;
    private int credits;
    private int journeyPoints;

    /**
     * Constructs a Pass object.
     *
     * @param passId The pass id.
     * @param name   The person's name.
     * @param luxury The pass' luxury rating.
     * @param credit The amount of credit the pass has.
     */
    public Pass(int passId, String name, int luxury, int credit) {
        passIdNumber = passId;
        guestName = name;
        luxuryRating = luxury;
        credits = credit;
        journeyPoints = 0;
    }

    /**
     * Gets the pass' id number.
     *
     * @return The pass' id number.
     */
    public int getPassIdNumber() {
        return passIdNumber;
    }

    /**
     * Gets the guest's name.
     *
     * @return The guest's name.
     */
    public String getGuestName() {
        return guestName;
    }

    /**
     * Gets the luxury rating.
     *
     * @return The luxury rating.
     */
    public int getLuxuryRating() {
        return luxuryRating;
    }

    /**
     * Gets the number of credits.
     *
     * @return The number of credits.
     */
    public int getCredits() {
        return credits;
    }

    /**
     * Gets the number of journey points.
     *
     * @return The number of journey points.
     */
    public int getJourneyPoints() {
        return journeyPoints;
    }

    /**
     * Adds credits to a pass.
     *
     * @param points The amount of credits to add to the pass.
     */
    public void addCredits(int points) {
        if (credits > 0) {
            credits += points;
        }
    }

    /**
     * Removes credits from a pass.
     *
     * @param points The amount of credits to remove from a pass.
     */
    public void removeCredits(int points) {
        if (credits > 0) {
            credits -= points;
        }
    }

    /**
     * Uses the ferry if possible.
     */
    public void useFerry() {
        if (credits >= 3) {
            credits -= 3;
            journeyPoints += 1;
        }
    }

    /**
     * Convert's the pass's journey points to credits.
     */
    public void journeyPointsToCredits() {
        int newCredits = getJourneyPoints() / 5;
        credits += newCredits;
        journeyPoints -= newCredits * 5;
    }

    /**
     * Adds points to the pass' journey points.
     */
    public void addJourneyPoints(int points) {
        journeyPoints += points;
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
                getCredits() + "\nJourney Points: " +
                getJourneyPoints() + "\n********************";
    }
}
