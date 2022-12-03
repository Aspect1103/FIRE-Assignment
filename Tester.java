import java.util.Scanner;

/**
 * Write a description of class Tester here.
 *
 * @author Jack
 * @version 20/11/2022
 */
public class Tester {
    private void doTest() {
        FIRE Wayward = new Resort("Wayward Islands Resort", "temp location 2");
        Scanner enter = new Scanner(System.in);
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
                .Actual:
                """ + "\n" + Wayward + "\n");
//        Testing option 2
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
                ******************** .Actual:
                """+ "\n" + Wayward.getAllPassesOnAllIslands() + "\n");
        //        Testing option 3 List all passes on one Island
        System.out.println("Option 3, List all passes on one Island in this case, island name: (Base)");
        String islandName = enter.next();
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
                .Actual:""" + "\n" + Wayward.getAllPassesOnIsland(islandName) + "\n");
        //        Testing option 4-> Find location of a pass
        System.out.println("(True version option 4) Enter pass id:(1006)");
        int trav = enter.nextInt();
        String ww = Wayward.findPassLocation(trav);
        if (ww != null) {
            System.out.println("""
                    Expected: Base
                    Actual:"""+ww+"\n");
        } else {
            System.out.println("No such pass"+"\n");
        }
        System.out.println("(False version option 4) Enter pass id:(111)");
        int travel = enter.nextInt();
        String www = Wayward.findPassLocation(travel);
        if (www != null) {
            System.out.println(www);
        } else {
            System.out.println("No such pass"+"\n");        }
        //        Testing option 5-> Say if pass can move by ferry
        System.out.println("(True Version, option 5) Enter pass id:(1000)");
        int trav1 = enter.nextInt();
        enter.nextLine();
        System.out.println("Enter ferry code:(ABC1)");
        String ferry = enter.nextLine();
        System.out.println("Expected: true. Actual:"+Wayward.canTravel(trav1, ferry));
        System.out.println("(False Version, option 5) Enter pass id:(1002)");
        int trav2 = enter.nextInt();
        enter.nextLine();
        System.out.println("Enter ferry code:(ABC1)");
        String ferry1 = enter.nextLine();
        System.out.println("Expected: false. Actual:"+Wayward.canTravel(trav2, ferry1));
        //Testing option 6-> Move a pass by ferry
        System.out.println("(True version, option 6) Enter pass id:(1005)");
        int trav3 = enter.nextInt();
        enter.nextLine();
        System.out.println("Enter ferry code:(ABC1)");
        String ferry2 = enter.nextLine();
        System.out.println("Expected: The person can travel to the next island. Actual:"+Wayward.travel(trav3, ferry2));
        System.out.println("(False version, option 6) Inputting variables that does not exist for pass id:(21)");
        int trav4 = enter.nextInt();
        enter.nextLine();
        System.out.println("Inputting variables that does not exist for ferry code:(21)");
        String ferry3 = enter.nextLine();
        System.out.println("Expected: Invalid pass or ferry code. Actual:"+Wayward.travel(trav4, ferry3));
        System.out.println("(False version 2, option 6) The pass has a lower luxury rating than the destination island for pass id:(1005)");
        int trav5 = enter.nextInt();
        enter.nextLine();
        System.out.println("ferry code:(CDE3)");
        String ferry4 = enter.nextLine();
        System.out.println("Expected: The pass has a lower luxury rating than the destination island. Actual:"+Wayward.travel(trav5, ferry4));
        System.out.println("For false version 3, option 6, we are gonna send a pass id to Island Aero first then we are going to test it");
        System.out.println("Send pass id to Yorkie:(1001)");
        int trav6 = enter.nextInt();
        enter.nextLine();
        System.out.println("Ferry to use:(ABC1)");
        String ferry5 = enter.nextLine();
        Wayward.travel(trav6, ferry5);
        System.out.println("Send pass id to Aero:(1001)");
        int trav7 = enter.nextInt();
        enter.nextLine();
        System.out.println("Ferry to use:(GHJ6)");
        String ferry6 = enter.nextLine();
        Wayward.travel(trav7, ferry6);
        System.out.println("(False version 3, option 6) The destination island has reached capacity for pass id: (1005)");
        int trav8 = enter.nextInt();
        enter.nextLine();
        System.out.println("Ferry code:(GHJ6)");
        String ferry7 = enter.nextLine();
        System.out.println("Expected: The destination island has reached capacity. Actual:"+Wayward.travel(trav8, ferry7));
        System.out.println("(False version 4, option 6) The pass does not have enough credits for pass id:(1002)");
        int trav9 = enter.nextInt();
        enter.nextLine();
        System.out.println("Ferry code:(ABC1)");
        String ferry8 = enter.nextLine();
        System.out.println("Expected: The pass does not have enough credits to travel. Actual:"+Wayward.travel(trav9, ferry8));
        System.out.println("(False version 5, option 6) The person is not on the source island for pass id:(1001)");
        int trav10 = enter.nextInt();
        enter.nextLine();
        System.out.println("Ferry code:(ABC1)");
        String ferry9 = enter.nextLine();
        System.out.println("Expected: The person is not on the source island. Actual:"+Wayward.travel(trav10, ferry9));
        //Testing option 7->View pass
        System.out.println("View pass ID number, option 7, before going to Yorkie:(1003)");
        int cId = enter.nextInt();
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
                Actual:"""+"\n"+Wayward.viewAPass(cId));
        System.out.println("Sending pass to Yorkie:(1003)");
        int trav11 = enter.nextInt();
        enter.nextLine();
        System.out.println("Ferry code:(ABC1)");
        String ferry10 = enter.nextLine();
        Wayward.travel(trav11, ferry10);
        System.out.println("View pass ID number, option 7, after going to Yorkie:(1003)");
        int cId1 = enter.nextInt();
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
                Actual:"""+"\n"+Wayward.viewAPass(cId1));
        //Testing option 8->Top up credits
        System.out.println("Option 8, Please enter the id of the pass topping up their credits:(1003)");
        int passId = enter.nextInt();
        System.out.println("Please enter the number of credits to be added:(100)");
        int credits = enter.nextInt();
        Wayward.topUpCredits(passId, credits);
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
                Actual:"""+"\n"+Wayward.viewAPass(passId));
        //Testing option 9->Convert points to credits
        System.out.println("Before we do option 9 we need to have 5 journey points in a pass, " +
                "the way to increase them is to use a ferry, so we are gonna use pass id (1001) because she has already 2 journey points");
        System.out.println("Enter pass id:(1001)");
        int trav12 = enter.nextInt();
        enter.nextLine();
        System.out.println("Enter ferry code:(HJK7)");
        String ferry11 = enter.nextLine();
        Wayward.travel(trav12, ferry11);
        System.out.println("Enter pass id:(1001)");
        int trav13 = enter.nextInt();
        enter.nextLine();
        System.out.println("Enter ferry code:(BCD2)");
        String ferry12 = enter.nextLine();
        Wayward.travel(trav13, ferry12);
        System.out.println("Enter pass id:(1001)");
        int trav14 = enter.nextInt();
        enter.nextLine();
        System.out.println("Enter ferry code:(ABC1)");
        String ferry13 = enter.nextLine();
        Wayward.travel(trav14, ferry13);
        System.out.println("View pass ID number before converting:(1001)");
        int cId2 = enter.nextInt();
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
                Actual:"""+"\n"+Wayward.viewAPass(cId2));
        System.out.println("Option 9, Enter pass ID number:(1001)");
        int cId3 = enter.nextInt();
        System.out.println("We just converted the points to credits");
        Wayward.convertPoints(cId3);
        System.out.println("View pass ID number after converting:(1001)");
        int cId4 = enter.nextInt();
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
                Actual:"""+"\n"+Wayward.viewAPass(cId4));
    }
    // No need to change this
    public static void main(String[] args) {
        Tester xx = new Tester();
        xx.doTest();
    }
}
