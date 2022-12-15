import java.util.Objects;
/**
 * Write a description of class Tester here.
 *
 * @author Klevi
 * @version 09/12/2022
 */
public class Tester {
    private void doTest() {
        FIRE wayward = new Resort("Wayward Islands Resort", "The Caribbean");

        // Testing option 1
        System.out.println("Option 1, List all resort details\n");
        System.out.println("""
                This option will display all of the details of the current resort
                that are Resort Name, Resort Location, Island List and all pass details that 
                are staying in each island.
                """);
        System.out.println("""
                Testing option 1,
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
                """ + wayward + "\n");

        // Testing option 2
        System.out.println("Option 2, List all passes on all islands\n");
        System.out.println("""
                This option will display the details of current passes
                residing on all islands.
                """);
        System.out.println("""
                Testing option 2,
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
                """+  wayward.getAllPassesOnAllIslands() + "\n");

        // Testing option 3
        System.out.println("Option 3, List all passes on one island in this case - island name: (Base)\n");
        System.out.println("""
               This option will display all of the details of current passes that are currently
               residing on an island. In order for this option to function properly,
               you must specify one of the five islands that are: Base, Yorkie, Bounty, Twirl, and Aero.
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
                """ + wayward.getAllPassesOnIsland("Base") + "\n");
        System.out.println("""
                Expected:
                The island doesn't exist
                Actual:
                """ + wayward.getAllPassesOnIsland("Miami") + "\n");
        // Testing option 4
        System.out.println("Option 4 (valid), Find location of a pass - Pass ID: 1006\n");
        System.out.println("""
                If you provide a valid pass ID, the pass is current island will be returned.
                But if an invalid pass ID is provided, null will be returned.
                The tests:
                1. Valid - Pass ID 1006.
                2. Invalid - Pass ID 111.
                """);
        System.out.println("""
                    Expected: Base
                    Actual:""" + wayward.findPassLocation(1006) + "\n");
        System.out.println("Option 4 (invalid) - Pass ID: 111");
        System.out.println("""
                    Expected: null
                    Actual:""" + wayward.findPassLocation(111) + "\n");

        // Testing option 5
        System.out.println("Option 5 (valid), Checking if pass can move by ferry - Pass id: 1000\n");
        System.out.println("""
                If a valid pass and ferry is provided and the conditions are met,true is returned. 
                Otherwise, false is returned.             
                The tests:
                1. Valid - Pass ID 1000, Ferry Code ABC1.                   
                2. Invalid - Pass ID 1002, Ferry Code ABC1.                   
                """);
        System.out.println("Ferry code: ABC1");
        System.out.println("Expected: true. Actual:" + wayward.canTravel(1000, "ABC1") + "\n");
        System.out.println("Option 5 (invalid) - Pass id: 1002\n");
        System.out.println("Ferry code: ABC1");
        System.out.println("Expected: false. Actual:" + wayward.canTravel(1002, "ABC1") + "\n");

        // Testing option 6
        System.out.println("Option 6 (valid), Moving a pass by ferry - Pass id: 1005\n");
        System.out.println("""
                If a valid pass and ferry code are provided, then the system will check
                the following conditions:
                • The pass location is on the ferry’s source island.
                • The pass has sufficient credits to travel.
                • The pass's luxury rating is the same or higher than the ferry's destination island.
                • The ferry's destination island has sufficient capacity.
                If all the conditions are met, then the pass is allowed to travel.
                Otherwise, the reason is returned.
                The tests:
                1. Valid - Pass ID 1005, Ferry Code ABC1.
                2. Invalid - Pass ID 21, Ferry Code 21.
                3. Invalid - Pass ID 1005, Ferry Code CDE3.
                4. Invalid - Pass ID 1005, Ferry Code GHJ6
                5. Invalid - Pass ID 1002, Ferry Code ABC1.
                6. Invalid - Pass ID 1001, Ferry Code ABC1.
                """);
        System.out.println("Expected: The person can travel to the next island. Actual:" + wayward.travel(1005, "ABC1") + "\n");
        System.out.println("Option 6 (invalid) - Inputting variables that does not exist for pass id: 21\n");
        System.out.println("Expected: Invalid pass or ferry code. Actual:" + wayward.travel(21, "21") + "\n");

        System.out.println("For false version 2, option 6, we are going to send pass id 1005 to Bounty to check if the luxury rating is lower than the destination island");
        System.out.println("Option 6 (invalid version 2) - The pass has a lower luxury rating than the destination island for pass id: 1005");
        System.out.println("Expected: The pass has a lower luxury rating than the destination island. Actual:" + wayward.travel(1005, "CDE3") + "\n");

        System.out.println("For false version 3, option 6, we are gonna send a pass id to Island Aero first and then we are going to test it");
        System.out.println("We are doing all of that because we want to check the capacity of an island, and in this case 'Aero' has a capacity of 1 pass but currently it has 0, so that's why we are sending a pass to increase it +1");
        wayward.travel(1001, "ABC1");
        wayward.travel(1001, "GHJ6");
        System.out.println("Option 6 (invalid version 3) - The destination island has reached capacity for pass id: 1005");
        System.out.println("Expected: The destination island has reached capacity. Actual:" + wayward.travel(1005, "GHJ6") + "\n");

        System.out.println("For false version 4, option 6, we are sending pass id 1002 to Yorkie but that pass, currently doesn't have enough credits");
        System.out.println("Option 6 (invalid version 4) - The pass does not have enough credits for pass id: 1002");
        System.out.println("Expected: The pass does not have enough credits to travel. Actual:" + wayward.travel(1002, "ABC1") + "\n");

        System.out.println("For the final false version, option 6, we are going to test pass id 1001 and use ferry code ABC1 to check if this message will appear: 'The person is not on the source island'");
        System.out.println("Option 6 (invalid version 5) - The person is not on the source island for pass id: 1001");
        System.out.println("Expected: The person is not on the source island. Actual:" + wayward.travel(1001, "ABC1") + "\n");

        // Testing option 7
        System.out.println("""
               If a valid pass ID is provided, the pass details are returned.
               Otherwise, the reason is returned.
               The tests:
               1. Valid - Pass ID 1003 (before and after a state change).
               2. Invalid - Pass ID 23.
               """);
        System.out.println("Option 7(valid), view pass ID number before going to Yorkie: 1003");
        System.out.println("""
                Expected:
                ********************
                Guest Name: Olek
                Pass ID Number: 1003
                Luxury Rating: 1
                Credits: 12
                Journey Points: 0
                ********************
                Actual:
                """ + wayward.viewAPass(1003) + "\n");
        System.out.println("Sending pass to Yorkie: 1003");
        System.out.println("Ferry code: ABC1");
        wayward.travel(1003, "ABC1");
        System.out.println("Option 7, view pass ID number after going to Yorkie: 1003");
        System.out.println("""
                Expected:
                ********************
                Guest Name: Olek
                Pass ID Number: 1003
                Luxury Rating: 1
                Credits: 9
                Journey Points: 1
                ********************
                Actual:
                """ + wayward.viewAPass(1003) + "\n");
        System.out.println("Option 7(invalid), view pass ID number: 23");
        System.out.println("""
                Expected:
                Not found
                Actual:
                """ + wayward.viewAPass(23) + "\n");


        // Testing option 8
        System.out.println("""
                Option 8, If a valid pass ID is provided along with a positive credit number,
                the pass's credit amount is increased.Otherwise, there is no change in state.
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
        System.out.println("""
                Expected:
                Not found
                Actual:
                """ + wayward.viewAPass(979) + "\n");
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
                """ + wayward.viewAPass(1003) + "\n");

        // Testing option 9
        System.out.println("""
               If a valid pass ID is provided, then their journey points are converted to credits.
               However, to conduct this test, we must get a pass with 5 journey points which can only 
               be achieved through using the ferry.
               The tests:                     
               1. Valid - Pass ID 1001 (before and after convert).                     
               2. Invalid - Pass ID 1007.
               """);
        System.out.println("Enter pass id: 1001");
        int passId = 1001;
        wayward.travel(passId, "HJK7");
        wayward.travel(passId, "BCD2");
        wayward.travel(passId, "ABC1");
        System.out.println("View pass ID number before converting: 1001");
        System.out.println("""
                Expected:
                ********************
                Guest Name: May
                Pass ID Number: 1001
                Luxury Rating: 3
                Credits: 15
                Journey Points: 5
                ********************
                Actual:
                """ + wayward.viewAPass(passId) + "\n");
        System.out.println("Now we are continuing with option 9, Enter pass ID number: 1001");
        System.out.println("We just converted the points to credits");
        wayward.convertPoints(passId);
        System.out.println("View pass ID number after converting: 1001");
        System.out.println("""
                Expected:
                ********************
                Guest Name: May
                Pass ID Number: 1001
                Luxury Rating: 3
                Credits: 16
                Journey Points: 0
                ********************
                Actual:
                """ + wayward.viewAPass(passId));
        System.out.println("Enter pass id: 1007");
        int passId2 = 1007;
        System.out.println("View pass ID number before converting: 1007");
        System.out.println("""
                Expected:
                ********************
                Guest Name: Sol
                Pass ID Number: 1007
                Luxury Rating: 7
                Credits: 20
                Journey Points: 0
                ********************
                Actual:
                """ + wayward.viewAPass(passId2) + "\n");
        wayward.convertPoints(passId2);
        System.out.println("View pass ID number after converting: 1007");
        System.out.println("""
                Expected:
                ********************
                Guest Name: Sol
                Pass ID Number: 1007
                Luxury Rating: 7
                Credits: 20
                Journey Points: 0
                ********************
                Actual:
                """ + wayward.viewAPass(passId2));


    }
        // No need to change this
    public static void main(String[] args) {
        Tester tester = new Tester();
        tester.doTest();
    }
}
