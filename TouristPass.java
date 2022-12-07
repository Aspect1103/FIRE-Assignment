public class TouristPass extends Pass {
    private String citizenship;
    public TouristPass(int passId, String name, int luxury, int credit,String citizenship){
        super(passId,name,luxury,credit);
        this.citizenship=citizenship;
    }
    public void useFerry() {
        if (getCredits() >= 4) {
             removeCredits(4);
             setJourneyPoints(1);
        }
    }
}
