public class BusinessPass extends Pass {

    private int loyaltyPoints;

    public BusinessPass(int passId, String name, int luxury){
        super(passId, name, luxury,30);
        loyaltyPoints = 20;
    }

    public void useFerry() {
        if (getCredits() >= 3) {
            removeCredits(3);
            loyaltyPoints += 2;
        }
    }

    public void journeyPointsToCredits() {
        int newCredits = loyaltyPoints / 3;
        addCredits(newCredits);
        loyaltyPoints -= newCredits * 3;
    }

    public String toString() {
        return "********************\nGuest Name: " +
                getGuestName() + "\nPass ID Number: " +
                getPassIdNumber() + "\nLuxury Rating: " +
                getLuxuryRating() + "\nCredits: " +
                getCredits() + "\nLoyalty Points: " +
                loyaltyPoints + "\n********************";
    }
}
