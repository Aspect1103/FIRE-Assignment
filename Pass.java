/**
 * A Pass has an id number, name, a luxury rating,
 * number of credits and journey points
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

    public Pass(int passId, String name, int luxury, int credit) {
        passIdNumber = passId;
        guestName = name;
        luxuryRating = luxury;
        credits = credit;
        journeyPoints = 0;
    }

    public int getPassIdNumber() {
        return passIdNumber;
    }

    public String getGuestName() {
        return guestName;
    }

    public int getLuxuryRating() {
        return luxuryRating;
    }

    public int getCredits() {
        return credits;
    }

    public int getJourneyPoints() {
        return journeyPoints;
    }

    public void addCredits(int points) {
        credits += points;
    }

    public void removeCredits(int points) {
        if (credits > 0) {
            credits -= points;
        }
    }

    public void useFerry() {
        if (credits >= 3) {
            credits -= 3;
            journeyPoints += 1;
        }
    }

    public void journeyPointsToCredits() {
        if (journeyPoints >= 5) {
            journeyPoints -= 5;
            credits += 1;
        }
    }

    public String toString() {
        return "********************\nGuest Name: " +
                getGuestName() + "\nPass ID Number: " +
                getPassIdNumber() + "\nLuxury Rating: " +
                getLuxuryRating() + "\nCredits: " +
                getCredits() + "\nJourney Points: " +
                getJourneyPoints() + "\n********************";
    }
}
