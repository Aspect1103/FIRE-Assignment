/**
 * Tests the Resort class through the ResortUI class.
 *
 * @author Klevi
 * @version 09/12/2022
 */
public class Tester {
    /**
     * Runs the tests for ResortUI.
     */
    private void doTest() {
        FIRE wayward = new Resort("Wayward Islands Resort", "The Caribbean");

        // Testing option 1
        System.out.println("""
                ******************** OPTION 1 ********************
                This test lists the details of a resort. There can’t really be an invalid test here since every resort will be valid.
                The tests:
                    1. Valid - Resort Wayward.
                """);
        System.out.println("""
                Expected:
                ********************
                Resort Name: Wayward Islands Resort
                Resort Location: The Caribbean
                Island List: [********************
                Island ID Number: 0
                Island Name: Base
                Island Rating: 0
                Island capacity: 100
                Pass List in Island:
                [********************
                Guest Name: Lynn
                Pass ID Number: 1000
                Luxury Rating: 5
                Credits: 10
                Journey Points: 0
                ********************, ********************
                Guest Name: May
                Pass ID Number: 1001
                Luxury Rating: 3
                Credits: 30
                Journey Points: 0
                ********************, ********************
                Guest Name: Nils
                Pass ID Number: 1002
                Luxury Rating: 10
                Credits: 0
                Journey Points: 0
                ********************, ********************
                Guest Name: Olek
                Pass ID Number: 1003
                Luxury Rating: 1
                Credits: 12
                Journey Points: 0
                ********************, ********************
                Guest Name: Pan
                Pass ID Number: 1004
                Luxury Rating: 3
                Credits: 3
                Journey Points: 0
                ********************, ********************
                Guest Name: Quin
                Pass ID Number: 1005
                Luxury Rating: 1
                Credits: 30
                Journey Points: 0
                ********************, ********************
                Guest Name: Raj
                Pass ID Number: 1006
                Luxury Rating: 4
                Credits: 5
                Journey Points: 0
                ********************, ********************
                Guest Name: Sol
                Pass ID Number: 1007
                Luxury Rating: 7
                Credits: 20
                Journey Points: 0
                ********************, ********************
                Guest Name: Tel
                Pass ID Number: 1008
                Luxury Rating: 6
                Credits: 30
                Journey Points: 0
                ********************]
                ********************, ********************
                Island ID Number: 1
                Island Name: Yorkie
                Island Rating: 1
                Island capacity: 100
                Pass List in Island:
                []
                ********************, ********************
                Island ID Number: 2
                Island Name: Bounty
                Island Rating: 3
                Island capacity: 10
                Pass List in Island:
                []
                ********************, ********************
                Island ID Number: 3
                Island Name: Twirl
                Island Rating: 5
                Island capacity: 2
                Pass List in Island:
                []
                ********************, ********************
                Island ID Number: 4
                Island Name: Aero
                Island Rating: 1
                Island capacity: 1
                Pass List in Island:
                []
                ********************]
                ********************
                Actual:
                """ + wayward + "\n\n");

        // Testing option 2
        System.out.println("""
                ******************** OPTION 2 ********************
                This test lists the details of all passes on all islands. There can’t really be an invalid test here since every resort will be valid.
                The tests:
                    1. Valid - Resort Wayward.
                """);
        System.out.println("""
                Expected:
                ********************
                Guest Name: Lynn
                Pass ID Number: 1000
                Luxury Rating: 5
                Credits: 10
                Journey Points: 0
                ********************
                ********************
                Guest Name: May
                Pass ID Number: 1001
                Luxury Rating: 3
                Credits: 30
                Journey Points: 0
                ********************
                ********************
                Guest Name: Nils
                Pass ID Number: 1002
                Luxury Rating: 10
                Credits: 0
                Journey Points: 0
                ********************
                ********************
                Guest Name: Olek
                Pass ID Number: 1003
                Luxury Rating: 1
                Credits: 12
                Journey Points: 0
                ********************
                ********************
                Guest Name: Pan
                Pass ID Number: 1004
                Luxury Rating: 3
                Credits: 3
                Journey Points: 0
                ********************
                ********************
                Guest Name: Quin
                Pass ID Number: 1005
                Luxury Rating: 1
                Credits: 30
                Journey Points: 0
                ********************
                ********************
                Guest Name: Raj
                Pass ID Number: 1006
                Luxury Rating: 4
                Credits: 5
                Journey Points: 0
                ********************
                ********************
                Guest Name: Sol
                Pass ID Number: 1007
                Luxury Rating: 7
                Credits: 20
                Journey Points: 0
                ********************
                ********************
                Guest Name: Tel
                Pass ID Number: 1008
                Luxury Rating: 6
                Credits: 30
                Journey Points: 0
                ********************
                Actual:
                """ + wayward.getAllPassesOnAllIslands() + "\n");

        // Testing option 3
        System.out.println("""
                ******************** OPTION 3 ********************
                This option will display all of the details of current passes that are currently residing on an island. In order for this option to function properly, you must specify one of the five islands that are: Base, Yorkie, Bounty, Twirl, and Aero.
                The tests:
                    1. Valid - Island Name Base.
                    2. Invalid - Island Name Miami.
                """);
        System.out.println("""
                Expected:
                ********************
                Guest Name: Lynn
                Pass ID Number: 1000
                Luxury Rating: 5
                Credits: 10
                Journey Points: 0
                ********************
                ********************
                Guest Name: May
                Pass ID Number: 1001
                Luxury Rating: 3
                Credits: 30
                Journey Points: 0
                ********************
                ********************
                Guest Name: Nils
                Pass ID Number: 1002
                Luxury Rating: 10
                Credits: 0
                Journey Points: 0
                ********************
                ********************
                Guest Name: Olek
                Pass ID Number: 1003
                Luxury Rating: 1
                Credits: 12
                Journey Points: 0
                ********************
                ********************
                Guest Name: Pan
                Pass ID Number: 1004
                Luxury Rating: 3
                Credits: 3
                Journey Points: 0
                ********************
                ********************
                Guest Name: Quin
                Pass ID Number: 1005
                Luxury Rating: 1
                Credits: 30
                Journey Points: 0
                ********************
                ********************
                Guest Name: Raj
                Pass ID Number: 1006
                Luxury Rating: 4
                Credits: 5
                Journey Points: 0
                ********************
                ********************
                Guest Name: Sol
                Pass ID Number: 1007
                Luxury Rating: 7
                Credits: 20
                Journey Points: 0
                ********************
                ********************
                Guest Name: Tel
                Pass ID Number: 1008
                Luxury Rating: 6
                Credits: 30
                Journey Points: 0
                ********************
                Actual:
                """ + wayward.getAllPassesOnIsland("Base"));
        System.out.println("Expected: The island doesn't exist. Actual: " + wayward.getAllPassesOnIsland("Miami") + "\n\n");

        // Testing option 4
        System.out.println("""
                ******************** OPTION 4 ********************
                If you provide a valid pass ID, the pass's current island will be returned. But if an invalid pass ID is provided, null will be returned.
                The tests:
                    1. Valid - Pass ID 1006.
                    2. Invalid - Pass ID 111.
                """);
        System.out.println("Expected: Base. Actual: " + wayward.findPassLocation(1006) + "\n");
        System.out.println("Expected: null. Actual: " + wayward.findPassLocation(111) + "\n\n");

        // Testing option 5
        System.out.println("""
                ******************** OPTION 5 ********************
                If a valid pass and ferry is provided and the conditions are met, true is returned. Otherwise, false is returned.
                The tests:
                    1. Valid - Pass ID 1000, Ferry Code ABC1.
                    2. Invalid - Pass ID 1002, Ferry Code ABC1.
                """);
        System.out.println("Expected: true. Actual: " + wayward.canTravel(1000, "ABC1") + "\n");
        System.out.println("Expected: false. Actual: " + wayward.canTravel(1002, "ABC1") + "\n\n");

        // Testing option 6
        System.out.println("""
                ******************** OPTION 6 ********************
                If a valid pass and ferry code are provided, then the system will check the following conditions:
                • The pass location is on the ferry’s source island.
                • The pass has sufficient credits to travel.
                • The pass's luxury rating is the same or higher than the ferry's destination island.
                • The ferry's destination island has sufficient capacity.
                If all the conditions are met, then the pass is allowed to travel. Otherwise, the reason is returned.
                The tests:
                    1. Valid - Pass ID 1005, Ferry Code ABC1.
                    2. Invalid - Pass ID 21, Ferry Code 21.
                    3. Invalid - Pass ID 1005, Ferry Code CDE3.
                    4. Invalid - Pass ID 1005, Ferry Code GHJ6.
                    5. Invalid - Pass ID 1002, Ferry Code ABC1.
                    6. Invalid - Pass ID 1001, Ferry Code ABC1.
                """);
        System.out.println("Expected: The person can travel to the next island. Actual: " + wayward.travel(1005, "ABC1") + "\n");
        System.out.println("Expected: Invalid pass or ferry code. Actual: " + wayward.travel(21, "21") + "\n");
        System.out.println("Expected: The pass has a lower luxury rating than the destination island. Actual: " + wayward.travel(1005, "CDE3") + "\n");
        wayward.travel(1001, "ABC1");
        wayward.travel(1001, "GHJ6");
        System.out.println("Expected: The destination island has reached capacity. Actual: " + wayward.travel(1005, "GHJ6") + "\n");
        System.out.println("Expected: The pass does not have enough credits to travel. Actual: " + wayward.travel(1002, "ABC1") + "\n");
        System.out.println("Expected: The person is not on the source island. Actual: " + wayward.travel(1001, "ABC1") + "\n\n");

        // Testing option 7
        System.out.println("""
                ******************** OPTION 7 ********************
                If a valid pass ID is provided, the pass details are returned. Otherwise, the reason is returned.
                The tests:
                    1. Valid - Pass ID 1003 (before and after a state change).
                    2. Invalid - Pass ID 23.
                """);
        System.out.println("""
                Expected (before):
                ********************
                Guest Name: Olek
                Pass ID Number: 1003
                Luxury Rating: 1
                Credits: 12
                Journey Points: 0
                ********************
                Actual (before):
                """ + wayward.viewAPass(1003) + "\n");
        wayward.travel(1003, "ABC1");
        System.out.println("""
                Expected (after):
                ********************
                Guest Name: Olek
                Pass ID Number: 1003
                Luxury Rating: 1
                Credits: 9
                Journey Points: 1
                ********************
                Actual (after):
                """ + wayward.viewAPass(1003) + "\n");
        System.out.println("Expected: Not found. Actual: " + wayward.viewAPass(23) + "\n\n");

        // Testing option 8
        System.out.println("""
                ******************** OPTION 8 ********************
                If a valid pass ID is provided along with a positive credit number, the pass's credit amount is increased. Otherwise, there is no change in state.
                The tests:
                    1. Valid - Pass ID 1003, Credits 100.
                    2. Invalid - Pass ID 979, Credits 100.
                    3. Invalid - Pass ID 1003, Credits -100.
                """);
        wayward.topUpCredits(1003, 100);
        System.out.println("""
                Expected:
                ********************
                Guest Name: Olek
                Pass ID Number: 1003
                Luxury Rating: 1
                Credits: 109
                Journey Points: 1
                ********************
                Actual:
                """ + wayward.viewAPass(1003) + "\n");
        wayward.topUpCredits(979, 100);
        System.out.println("Expected: Not found. Actual: " + wayward.viewAPass(979) + "\n");
        wayward.topUpCredits(1003, -100);
        System.out.println("""
                Expected:
                ********************
                Guest Name: Olek
                Pass ID Number: 1003
                Luxury Rating: 1
                Credits: 109
                Journey Points: 1
                ********************
                Actual:
                """ + wayward.viewAPass(1003) + "\n\n");

        // Testing option 9
        System.out.println("""
                ******************** OPTION 9 ********************
                If a valid pass ID is provided, then their journey points are converted to credits. However, to conduct this test, we must get a pass with 5 journey points which can only be achieved through using the ferry.
                The tests:
                    1. Valid - Pass ID 1001 (before and after convert).
                    2. Invalid - Pass ID 1007.
                """);
        wayward.travel(1001, "HJK7");
        wayward.travel(1001, "BCD2");
        wayward.travel(1001, "ABC1");
        System.out.println("""
                Expected (before):
                ********************
                Guest Name: May
                Pass ID Number: 1001
                Luxury Rating: 3
                Credits: 15
                Journey Points: 5
                ********************
                Actual (before):
                """ + wayward.viewAPass(1001) + "\n");
        wayward.convertPoints(1001);
        System.out.println("""
                Expected (after):
                ********************
                Guest Name: May
                Pass ID Number: 1001
                Luxury Rating: 3
                Credits: 16
                Journey Points: 0
                ********************
                Actual (after):
                """ + wayward.viewAPass(1001) + "\n");
        System.out.println("""
                Expected (before):
                ********************
                Guest Name: Sol
                Pass ID Number: 1007
                Luxury Rating: 7
                Credits: 20
                Journey Points: 0
                ********************
                Actual (before):
                """ + wayward.viewAPass(1007) + "\n");
        wayward.convertPoints(1007);
        System.out.println("""
                Expected (after):
                ********************
                Guest Name: Sol
                Pass ID Number: 1007
                Luxury Rating: 7
                Credits: 20
                Journey Points: 0
                ********************
                Actual (after):
                """ + wayward.viewAPass(1007) + "\n");
    }

    /**
     * Runs the Tester class.
     *
     * @param args The command line arguments.
     */
    public static void main(String[] args) {
        Tester tester = new Tester();
        tester.doTest();
    }
}
