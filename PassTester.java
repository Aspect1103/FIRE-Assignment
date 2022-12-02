/**
 * Tests the Pass class.
 *
 * @author Jack
 * @version 22/11/2022
 */
public class PassTester {
    /**
     * Runs the PassTester class.
     *
     * @param args The command line arguments.
     */
    public static void main(String[] args) {
        // Initialise some passes
        Pass pass1 = new Pass(123, "Temp1", 5, 10);
        Pass pass2 = new Pass(456, "Temp2", 3, 20000);
        Pass pass3 = new Pass(789, "Temp3", 8, 5);

        // Test the accessors
        System.out.println("Expected: 123. Actual: " + pass1.getPassIdNumber());
        System.out.println("Expected: Temp2. Actual: " + pass2.getGuestName());
        System.out.println("Expected: 8. Actual: " + pass3.getLuxuryRating());
        System.out.println("Expected: 20000. Actual: " + pass2.getCredits());
        System.out.println("Expected: 0. Actual: " + pass1.getJourneyPoints());
        System.out.println();

        // Test the methods
        System.out.println("Credit before: 10");
        pass1.addCredits(5);
        System.out.println("Credit expected after: 15. Actual: " + pass1.getCredits() + "\n");

        System.out.println("Credit before: 15");
        pass1.removeCredits(10);
        System.out.println("Credit expected after: 5. Actual: " + pass1.getCredits() + "\n");

        System.out.println("Credit before: 10. Journey before: 0");
        pass1.useFerry();
        System.out.println("Credit expected after: 2. Actual: " + pass1.getCredits() + ". Journey expected after: 1. Actual: " + pass1.getJourneyPoints() + "\n");

        for (int i = 0; i < 10; i++) {
            pass2.useFerry();
        }
        System.out.println("Credit before: 19970. Journey before: 5");
        pass2.journeyPointsToCredits();
        System.out.println("Credit expected after: 19972. Actual: " + pass2.getCredits() + ". Journey expected after: 0. Actual: " + pass2.getJourneyPoints() + "\n");

        // Print out their state
        System.out.println("""
                Expected:
                ********************
                Guest Name: Temp1
                Pass ID Number: 123
                Luxury Rating: 5
                Credits: 2
                Journey Points: 1
                ********************
                Actual:
                """ + pass1 + "\n");
        System.out.println("""
                Expected:
                ********************
                Guest Name: Temp2
                Pass ID Number: 456
                Luxury Rating: 3
                Credits: 19972
                Journey Points: 0
                ********************
                Actual:
                """ + pass2 + "\n");
        System.out.println("""
                Expected:
                ********************
                Guest Name: Temp3
                Pass ID Number: 789
                Luxury Rating: 8
                Credits: 5
                Journey Points: 0
                ********************
                Actual:
                """ + pass3 + "\n");
    }
}
