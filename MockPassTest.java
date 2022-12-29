/**
 * Tests the pass class as part of the mock demo.
 *
 * @author Jack
 * @version 29/12/2022
 */
public class MockPassTest {
    public static void main(String[] args) {
        // Create a pass object
        Pass myPass = new Pass(353, "Vicky", 4, 10);

        // Output the pass' luxury rating and details
        System.out.println("Pass rating: " + myPass.getLuxuryRating());
        System.out.println("Pass details:\n" + myPass);
    }
}
