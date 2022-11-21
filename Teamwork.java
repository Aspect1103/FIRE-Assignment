/**
 * Details of your pair
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Teamwork {
    private String[] details = new String[6];

    public Teamwork() {
        details[0] = "Ashwell";
        details[1] = "Jack";
        details[2] = "20035866";
        details[3] = "";
        details[4] = "Klevi";
        details[5] = "";
    }

    public String[] getTeamDetails() {
        return details;
    }

    public void displayDetails() {
        for (String temp : details) {
            System.out.println(temp.toString());
        }
    }
}
