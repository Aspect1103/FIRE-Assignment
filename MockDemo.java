/**
 * Tests the resort class as part of the mock demo.
 *
 * @author Jack
 * @version 29/12/2022
 */
public class MockDemo {
    public static void main(String[] args) {
        // Create a resort object
        Resort haven = new Resort("Haven", "Fortunate Islands");

        // Output all the passes
        System.out.println("All passes:\n" + haven.getAllPassesOnAllIslands() + "\n");

        // Travel 1001 from Base to Yorkie
        System.out.println("1001 from Base to Yorkie result: " + haven.travel(1001, "ABC1"));
        System.out.println("1001 pass state:\n" + haven.viewAPass(1001) + "\n\n");

        // Travel 1003 from Yorkie to Bounty
        System.out.println("1001 from Yorkie to Bounty result: " + haven.travel(1001, "CDE3"));
        System.out.println("1001 pass state:\n" + haven.viewAPass(1001));
    }
}
