/**
 * Write a description of class BenchTester here.
 *
 * @author (Klevi)
 * @version (a version number or a date)
 */
public class BenchTesting {
    public static void main(String[] args) {
        // Initialise some islands
        Island island1 = new Island(111, "Haven", 5, 2);
        Island island2 = new Island(222, "Sweetfish", 7, 2);
        Island island3 = new Island(333, "Seahorse", 2, 1);
        Island island4 = new Island(444, "Egg", 10, 2);

        // Test the accessors
        System.out.println("Expected: 111. Actual: " + island1.islandNumber());
        System.out.println("Expected: Sweetfish. Actual: " + island2.islandName());
        System.out.println("Expected: 2. Actual: " + island3.islandRating());
        System.out.println("Expected: 2. Actual: " + island1.islandCapacity());

        // Create some passes
        Pass pass1 = new Pass(123, "Temp1", 5, 10, 1);
        Pass pass2 = new Pass(456, "Temp2", 3, 20, 6);
        Pass pass3 = new Pass(789, "Temp3", 8, 5, 0);
        Pass pass4 = new Pass(111, "Temp4", 10, 2, 3);

        // Test the methods
        island1.enter(pass1);
        island2.enter(pass2);
        island3.enter(pass3);
        island3.enter(pass4);
        island4.enter(pass1);
        System.out.println("Expected: The island has capacity. Actual: " + island4.capacity());
        island4.listCurrentPasses();
        System.out.println();
        island4.enter(pass2);
        System.out.println("Expected: The island reached the maximum capacity. Actual: " + island4.capacity());
        island4.listCurrentPasses();
        System.out.println();
        island4.enter(pass3);
        System.out.println("Expected: The island reached the maximum capacity. Actual: " + island4.capacity());
        island4.listCurrentPasses();
        System.out.println();
        island4.leave(pass2);
        System.out.println("Expected: The island has capacity. Actual: " + island4.capacity());
        island4.listCurrentPasses();
        System.out.println();
        island4.leave(pass1);
        System.out.println("Expected: The island has capacity. Actual: " + island4.capacity());
        island4.listCurrentPasses();

        // Test the accessor
        System.out.println("Expected: The island has capacity. Actual: " + island1.capacity());
        System.out.println("Expected: The island has capacity. Actual: " + island2.capacity());
        System.out.println("Expected: The island reached the maximum capacity. Actual: " + island3.capacity());
        island3.leave(pass4);
        System.out.println("Expected: The island reached the maximum capacity. Actual: :" + island3.capacity());

        // Test the methods
        System.out.println("Expected: temp1. Actual: ");
        island1.listCurrentPasses();
        System.out.println("Expected: temp2. Actual: ");
        island2.listCurrentPasses();
        System.out.println("Expected: temp3. Actual: ");
        island3.listCurrentPasses();
        System.out.println("""
                Expected: \nIsland ID Number: 111,
                Island name : Haven,
                Island Rating: 5 ,
                Island capacity: 2 ,
                Pass List in Island: temp1
                Actual:
                \s""");
        System.out.println(island1);
        System.out.println("Expected: temp1. Actual: " + island1.getPassDetails(123));
        System.out.println("Expected: true. Actual: " + island1.isPassOnIsland(pass1));
        System.out.println("Expected: false. Actual: " + island1.isPassOnIsland(pass2));

        // Initialise ferry test
        System.out.println("**********FERRY TEST**********");
        Island island5 = new Island(444, "Pain", 2, 1);
        Island island6 = new Island(444, "Pain", 2, 1);
        Island island7 = new Island(412, "Pain", 2, 2);
        Island island8 = new Island(422, "one", 2, 1);
        Island island9 = new Island(422, "one", 2, 1);
        Island island10 = new Island(412, "two", 2, 2);
        Island sun = new Island(546, "Sun", 2, 2);
        Island moon = new Island(546, "Moon", 2, 2);
        Ferry ferry1 = new Ferry(1, island1, island2);
        Ferry ferry2 = new Ferry(2, island2, island3);
        Ferry ferry3 = new Ferry(3, island3, island4);
        Ferry ferry4 = new Ferry(5, island6, island7);
        Ferry ferry5 = new Ferry(5, island7, island8);
        Ferry ferry6 = new Ferry(5, island9, island10);
        Ferry titanic = new Ferry(767, sun, moon);
        Pass pass5 = new Pass(982, "Temp5", 10, 100, 1);
        Pass pass6 = new Pass(982, "Temp5", 10, 1, 1);
        Pass pass7 = new Pass(982, "Temp6", 10, 22, 1);
        Pass pass8 = new Pass(982, "Temp7", 10, 22, 1);
        Pass vip = new Pass(101, "Rich", 10, 100, 20);

        // Test ferry
        island1.enter(pass1);
        island2.enter(pass2);
        ferry1.ProcessPass(pass1, island1, island2);
        System.out.println("Expected: 1. Actual: " + ferry1.getFerryCode());
        System.out.println("Expected: island2(Sweetfish). Actual: " + ferry2.getSourceIsland());
        System.out.println("Expected: island4(Egg). Actual: " + ferry3.getDestinationIsland());
        System.out.println("Expected: true. Actual:\n " + ferry1.CanPassTravel(pass1));
        System.out.println("Expected: false. Actual:\n " + ferry2.CanPassTravel(pass4));
        island1.enter(pass1);
        System.out.println("Expected: The person with the Pass can't travel to the next Island(luxury rate is lower). " + "Actual:\n " + ferry1.ProcessPass(pass1, island1, island2));
        island5.enter(pass1);
        System.out.println("Expected: The person with the Pass can't travel to the next Island ( exceed the maximum capacity of the destination island)." + "Actual:\n " + ferry1.ProcessPass(pass5, island4, island5));
        island6.enter(pass1);
        System.out.println("Expected: The person with the Pass can't travel to the next Island ( The pass does not have enough credits for the ferry journey)." + "Actual:\n " + ferry4.ProcessPass(pass6, island6, island7));
        island2.enter(pass1);
        System.out.println("Expected: The person with the Pass can't travel to the next Island ( the Pass is not listed in the source island for the ferry)." + " Actual:\n " + ferry5.ProcessPass(pass7, island7, island8));
        island9.enter(pass8);
        System.out.println("Expected: The person with the Pass can travel to the next Island ( Success )." + " Actual:\n " + ferry6.ProcessPass(pass8, island9, island10));
        System.out.println("""
         Expected: 
         ********************
         Ferry ID Number: 767
         Source Island :\s
         ********************
         Island ID Number: 546
         Island Name: Sun
         Island Rating: 2
         Island capacity: 2
         Pass List in Island:\s
         []
         ********************
         Destination Island :\s
         ********************
         Island ID Number: 546
         Island Name: Moon
         Island Rating: 2
         Island capacity: 2
         Pass List in Island:\s
         [********************
         Guest Name: Rich
         Pass ID Number: 101
         Luxury Rating: 10
         Credits: 97
         Journey Points: 21
         ********************]
         ********************
         Pass List in Ferry:\s
         ********************
         Guest Name: Rich
         Pass ID Number: 101
         Luxury Rating: 10
         Credits: 97
         Journey Points: 21
         ********************
                                
         ********************
         \nActual:
          \s""");
        sun.enter(vip);
        titanic.ProcessPass(vip, sun, moon);
        System.out.println(titanic);
    }
}
