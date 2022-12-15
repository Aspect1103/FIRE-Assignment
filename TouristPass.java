public class TouristPass extends Pass {
    private String citizenship;

    public TouristPass(int passId, String name, int luxury, int credit, String citizen){
        super(passId, name, luxury,credit);
        citizenship = citizen;
    }

    public void useFerry() {
        if (getCredits() >= 4) {
             removeCredits(4);
        }
    }

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
