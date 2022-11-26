import java.util.*;

/**
 * Write a description of class PassTester here.
 *
 * @author (Jack)
 * @version (a version number or a date)
 */
public class PassTester {
    public static void main(String[] args) {
        // Initialise some passes
        Pass pass1 = new Pass(123, "Temp1", 5, 10, 1);
        Pass pass2 = new Pass(456, "Temp2", 3, 20, 6);
        Pass pass3 = new Pass(789, "Temp3", 8, 5, 0);

        // Test the accessors
        System.out.println("Expected: 123. Actual: " + pass1.getPassIdNumber());
        System.out.println("Expected: Temp2. Actual: " + pass2.getGuestName());
        System.out.println("Expected: 8. Actual: " + pass3.getLuxuryRating());
        System.out.println("Expected: 20. Actual: " + pass2.getCredits());
        System.out.println("Expected: 1. Actual: " + pass1.getJourneyPoints());

        // Test the methods
        System.out.println("Credit before: 10");
        pass1.addCredits(5);
        System.out.println("Credit expected after: 15. Actual: " + pass1.getCredits());

        System.out.println("Credit before: 15");
        pass1.removeCredits(10);
        System.out.println("Credit expected after: 5. Actual: " + pass1.getCredits());

        System.out.println("Credit before: 10. Journey before: 1");
        pass1.useFerry();
        System.out.println("Credit expected after: 2. Actual: " + pass1.getCredits() + ". Journey expected after: 2. Actual: " + pass1.getJourneyPoints());

        System.out.println("Credit before: 20. Journey before: 2");
        pass2.journeyPointsToCredits();
        System.out.println("Credit expected after: 21. Actual: " + pass2.getCredits() + ". Journey expected after: 1. Actual: " + pass2.getJourneyPoints());

        // Print out their state
        System.out.println(pass1);
        System.out.println(pass2);
        System.out.println(pass3);
    }
}
