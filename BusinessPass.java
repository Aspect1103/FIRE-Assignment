/**
 * A BusinessPass extends the Pass class to add a
 * loyalty points field which is increased every time a
 * pass uses the ferry and can be exchanged for credits.
 *
 * @author Klevi
 * @version 10/12/2022
 */
public class BusinessPass extends Pass {
    private int loyaltyPoints;

    /**
     * Constructs a BusinessPass object.
     *
     * @param passId The pass id.
     * @param name   The person's name.
     * @param luxury The pass' luxury rating.
     */
    public BusinessPass(int passId, String name, int luxury) {
        super(passId, name, luxury, 30);
        loyaltyPoints = 20;
    }

    /**
     * Uses the ferry if possible.
     */
    public void useFerry() {
        if (getCredits() >= 3) {
            removeCredits(3);
            loyaltyPoints += 2;
        }
    }

    /**
     * Allows the pass's loyalty points to be converted into credits (3 loyalty points = 1 credit).
     */
    public void loyaltyPointsToCredits() {
        int newCredits = loyaltyPoints / 3;
        addCredits(newCredits);
        loyaltyPoints -= newCredits * 3;
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
                getCredits() + "\nLoyalty Points: " +
                loyaltyPoints + "\n********************";
    }
}
