/**
 * Details of your pair
 *
 * @author Jack and Klevi
 * @version 21/11/2022
 */
public class Teamwork {
    private String[] details = new String[6];

    /**
     * Constructs a Teamwork object.
     */
    public Teamwork() {
        details[0] = "Ashwell";
        details[1] = "Jack";
        details[2] = "20035866";
        details[3] = "Alliu";
        details[4] = "Klevi";
        details[5] = "20067052";
    }

    /**
     * Gets the team's details.
     *
     * @return The team's details.
     */
    public String[] getTeamDetails() {
        return details;
    }

    /**
     * Display's the team's details.
     */
    public void displayDetails() {
        for (String temp : details) {
            System.out.println(temp);
        }
    }
}
