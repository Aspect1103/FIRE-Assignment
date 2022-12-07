public class BusinessPass extends Pass{
private int loyaltyPoints;
    public BusinessPass(int passId, String name, int luxury, int credit,int loyaltyPoints){
        super(passId,name,luxury,credit);
        this.loyaltyPoints=loyaltyPoints;
    }
    public void useFerry() {
        if (getCredits() >= 3) {
            removeCredits(3);
            setJourneyPoints(1);
            loyaltyPoints+=2;
        }
    }
    public int getloyaltyPoints() {
        return loyaltyPoints;
    }
    public void loyaltyPointsToCredits() {
        int newCredits = getloyaltyPoints() / 3;
        addCredits(newCredits);
        loyaltyPoints -= newCredits * 3;
    }
}
