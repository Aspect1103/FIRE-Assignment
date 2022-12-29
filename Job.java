/**
 * Tests the pass class as part of the mock demo.
 *
 * @author Jack
 * @version 29/12/2022
 */
public class Job {
    private int jobCode;
    private String title;
    private int teamSize;
    private double budget;
    private Boolean active;

    /**
     * Constructs a Job object.
     *
     * @param jobCde    The job code.
     * @param jobTitle  The title of the job.
     * @param jobBudget The job budget.
     */
    public Job(int jobCde, String jobTitle, double jobBudget) {
        jobCode = jobCde;
        title = jobTitle;
        teamSize = 10;
        budget = jobBudget;
        active = false;
    }

    /**
     * Gets the job's title.
     *
     * @return The job title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Increases the team size by a given parameter.
     *
     * @param value The value to increase the team size by.
     */
    public void addToTeam(int value) {
        teamSize += value;
    }

    /**
     * Creates a string representation of the object.
     *
     * @return The string representation of the object.
     */
    public String toString() {
        return "********************\nJob Code: " +
                jobCode + "\nJob Title: " +
                title + "\nTeam Size: " +
                teamSize + "\nBudget: " +
                budget + "\nActive: " +
                active + "\n********************";
    }
}
