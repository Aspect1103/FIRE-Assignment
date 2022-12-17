/**
 * An EmployeePass extends the Pass class to add a job
 * description and an employee number. It also removes
 * the cost to use the ferry instead opting to increase
 * the pass's journey score.
 *
 * @author Klevi
 * @version 15/12/2022
 */
public class EmployeePass extends Pass {
    private int employeeNumber;
    private String jobDescription;
    private int journeyScore;

    /**
     * Constructs an EmployeePass object.
     *
     * @param employeeNo The employee number.
     * @param name       The employee's name.
     * @param jobDesc    The employee's job description.
     */
    public EmployeePass(int employeeNo, String name, String jobDesc) {
        super(employeeNo, name, 10, 4);
        employeeNumber = employeeNo;
        jobDescription = jobDesc;
        journeyScore = 0;
    }

    /**
     * Uses the ferry if possible.
     */
    public void useFerry() {
        journeyScore += 1;
    }

    /**
     * Creates a string representation of the object.
     *
     * @return The string representation of the object.
     */
    public String toString() {
        return "********************\nEmployee Name: " +
                getGuestName() + "\nPass ID Number: " +
                getPassIdNumber() + "\nEmployee Number: " +
                employeeNumber + "\nJob Description: " +
                jobDescription + "\nJourney Score: " +
                journeyScore + "\n********************";
    }
}
