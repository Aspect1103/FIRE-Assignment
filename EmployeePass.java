public class EmployeePass extends Pass{
    private int employeeNumber;
    private String jobDescription;
    private int journeyScore;
    public EmployeePass(int passId, String name, int luxury, int credit,int employeeNumber,String jobDescription,int journeyScore){
        super(passId,name,luxury,credit);
        this.employeeNumber=employeeNumber;
        this.jobDescription=jobDescription;
        this.journeyScore=journeyScore;
    }
    public void useFerry() {
            removeCredits(0);
            setJourneyPoints(1);
            journeyScore+=1;
    }
}
