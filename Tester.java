import java.util.Objects;
import java.util.Scanner;

/**
 * Write a description of class Tester here.
 *
 * @author Klevi
 * @version 09/12/2022
 */
public class Tester {
    private void doTest() {
        FIRE wayward = new Resort("Wayward Islands Resort", "temp location 2");

        //Testing option 1
        System.out.println("""
                Testing option 1,
                Expected:
                ********************
                Resort Name: Wayward Islands Resort
                Resort Location: temp location 2
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

        //Testing option 2
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

        //Testing option 3 List all passes on one Island
        System.out.println("Option 3, List all passes on one island in this case, island name: (Base)\n");
        System.out.println(
               """
               This option will display all of the details of current passes that are currently
               residing on an island. In order for this option to function properly,
               you must specify one of the five islands that are: Base, Yorkie, Bounty, Twirl, and Aero.
               """);
        System.out.println(
                """
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

        //Testing option 4-> Find location of a pass
        System.out.println("Option 4 (valid) - Pass ID: 1006\n");
        System.out.println(
               """
               If you provide the right pass id, the software will return the current
               island where a pass is located. If you enter the incorrect pass id,
               the application will indicate that there is no such pass.
               """);
        String ww = wayward.findPassLocation(1006);
        if (ww != null) {
            System.out.println("""
                    Expected: Base
                    Actual:"""+ww+"\n");
        } else {System.out.println("No such pass"+"\n");}
        System.out.println("Option 4 (invalid) - Pass ID: 111");
        String www = wayward.findPassLocation(111);
        System.out.println(Objects.requireNonNullElse(www, "No such pass" + "\n"));

        //Testing option 5-> Say if pass can move by ferry
        System.out.println("Option 5 (valid) - Pass id: 1000\n");
        System.out.println(
               """
               For this option to operate correctly, you must enter the right pass id,
               and it will inform you whether that pass can afford to take a ferry to an
               island in the format of True or False.
               """);
        System.out.println("Ferry code: ABC1");
        System.out.println("Expected: true. Actual:" + wayward.canTravel(1000, "ABC1") + "\n");
        System.out.println("Option 5 (invalid) - Pass id: 1002\n");
        System.out.println("Ferry code: ABC1");
        System.out.println("Expected: false. Actual:" + wayward.canTravel(1002, "ABC1") + "\n");

        //Testing option 6-> Move a pass by ferry
        System.out.println("Option 6 (valid) - Pass id: 1005\n");
        System.out.println(
               """
               For this option to work properly, you must enter a valid pass id number and a valid ferry code.
               This means that for the pass to successfully move to an island, the pass's location should be the
               source island also with ferry, the pass must have credits to use the ferry, his luxury rating must
               be the same or higher than the destination island, and the destination island must have capacity to
               accept the pass. If everything said above is true, a message will appear stating,
               "The person can travel to the next island."
               """);
        System.out.println("Ferry code: ABC1");
        System.out.println("Expected: The person can travel to the next island. Actual:" + wayward.travel(1005, "ABC1") + "\n");
        System.out.println("Moving down we will test all the false version of option 6 and they results");
        System.out.println("Option 6 (invalid) - Inputting variables that does not exist for pass id: 21\n");
        System.out.println("Inputting variables that does not exist for ferry code: 21");
        System.out.println("Expected: Invalid pass or ferry code. Actual:" + wayward.travel(21, "21") + "\n");

        System.out.println("For false version 2, option 6, we are going to send pass id 1005 to Bounty to check if the luxury rating is lower than the destination island");
        System.out.println("Option 6 (invalid version 2) - The pass has a lower luxury rating than the destination island for pass id: 1005");
        System.out.println("Ferry code: CDE3");
        System.out.println("Expected: The pass has a lower luxury rating than the destination island. Actual:" + wayward.travel(1005, "CDE3") + "\n");

        System.out.println("For false version 3, option 6, we are gonna send a pass id to Island Aero first and then we are going to test it");
        System.out.println("We are doing all of that because we want to check the capacity of an island, and in this case 'Aero' has a capacity of 1 pass but currently it has 0, so that's why we are sending a pass to increase it +1");
        System.out.println("Send pass id to Yorkie: 1001");
        System.out.println("Ferry to use: ABC1");
        wayward.travel(1001, "ABC1");
        System.out.println("Send pass id to Aero: 1001");
        System.out.println("Ferry to use: GHJ6");
        wayward.travel(1001, "GHJ6");
        System.out.println("Now the island Aero has a capacity of 1 pass and it's full so we are going to test option 6");
        System.out.println("Option 6 (invalid version 3) - The destination island has reached capacity for pass id: 1005");
        System.out.println("Ferry code: GHJ6");
        System.out.println("Expected: The destination island has reached capacity. Actual:" + wayward.travel(1005, "GHJ6") + "\n");

        System.out.println("For false version 4, option 6, we are sending pass id 1002 to Yorkie but that pass, currently doesn't have enough credits");
        System.out.println("Option 6 (invalid version 4) - The pass does not have enough credits for pass id: 1002");
        System.out.println("Ferry code: ABC1");
        System.out.println("Expected: The pass does not have enough credits to travel. Actual:" + wayward.travel(1002, "ABC1") + "\n");

        System.out.println("For the final false version, option 6, we are going to test pass id 1001 and use ferry code ABC1 to check if this message will appear: 'The person is not on the source island'");
        System.out.println("Option 6 (invalid version 5) - The person is not on the source island for pass id: 1001");
        System.out.println("Ferry code: ABC1");
        System.out.println("Expected: The person is not on the source island. Actual:" + wayward.travel(1001, "ABC1") + "\n");

        //Testing option 7->View pass
        System.out.println(
               """
               For option 7 to work properly we need to input a correct pass id number and we are
               going to check two states of that pass, the before and after state, to check if the details changed or not.
               We expect a change in the Credits and Journey Points.
               """);
        System.out.println("Option 7, view pass ID number before going to Yorkie: 1003");
        System.out.println(
                """
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
        System.out.println(
                """
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

        //Testing option 8->Top up credits
        System.out.println("Option 8 requires us to provide the right pass id, followed by any amount of credits more than zero.");
        System.out.println("Option 8, Please enter the id of the pass topping up their credits: 1003");
        System.out.println("Please enter the number of credits to be added: 100");
        wayward.topUpCredits(1003, 100);
        System.out.println(
                """
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

        //Testing option 9->Convert points to credits
        System.out.println(
               """
               Before we move on with option 9 we need to have 5 journey points in a pass, the way to increase
               them is to use a ferry, so we are gonna use pass id (1001) because she has already 2 journey points from the earlier tests,
               we are going to move her around different islands to increase her journey points
                """);
        System.out.println("Enter pass id: 1001");
        int passId = 1001;
        System.out.println("Enter ferry code: HJK7");
        wayward.travel(passId, "HJK7");
        System.out.println("Enter pass id: 1001");
        System.out.println("Enter ferry code:(BCD2)");
        wayward.travel(passId, "BCD2");
        System.out.println("Enter pass id: 1001");
        System.out.println("Enter ferry code: ABC1");
        wayward.travel(passId, "ABC1");
        System.out.println("View pass ID number before converting: 1001");
        System.out.println(
                """
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
        System.out.println(
                """
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
    }
        //No need to change this
    public static void main(String[] args) {
        Tester tester = new Tester();
        tester.doTest();
    }
}
