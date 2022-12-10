public class EmployeePass extends Pass{
    private int employeeNumber;
    private String jobDescription;
    private int journeyScore;

    public EmployeePass(int passId, String name, int employeeNumber,String jobDescription,int journeyScore){
        super(passId,name,10,4);
        this.employeeNumber=employeeNumber;
        this.jobDescription=jobDescription;
        this.journeyScore=journeyScore;
    }

    public void useFerry() {
            journeyScore+=1;
    }

    public String toString() {
        return "********************\nEmployee Name: " +
                getGuestName() + "\nPass ID Number: " +
                getPassIdNumber() + "\nEmployee Number: " +
                employeeNumber + "\nJob Description: " +
                jobDescription + "\nJourney Score: " +
                journeyScore + "\n********************";
    }
}
