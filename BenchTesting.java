/**
 * Tests the Island and Ferry classes.
 *
 * @author Klevi
 * @version 28/11/2022
 */
public class BenchTesting {
    /**
     * Runs the BenchTester class.
     *
     * @param args The command line arguments.
     */
    public static void main(String[] args) {
        // Initialise some islands and ferries
        Island island1 = new Island(111, "Haven", 5, 2);
        Island island2 = new Island(222, "Sweetfish", 4, 2);
        Island island3 = new Island(333, "Seahorse", 8, 1);
        Ferry ferry1 = new Ferry("1", island1, island2);
        Ferry ferry2 = new Ferry("2", island2, island1);
        Ferry ferry3 = new Ferry("3", island2, island3);

        // Create a test pass
        Pass pass = new Pass(1, "temp", 5, 20);

        // Test the island accessors
        System.out.println("Expected: 111. Actual: " + island1.getIslandID());
        System.out.println("Expected: Sweetfish. Actual: " + island2.getIslandName());
        System.out.println("Expected: 2. Actual: " + island3.getIslandRating());
        System.out.println("Expected: 2. Actual: " + island1.getIslandCapacity());
        System.out.println("Expected: []. Actual: " + island2.getPassList());
        System.out.println();

        // Test the ferry accessors
        System.out.println("Expected: 111. Actual: " + ferry1.getFerryCode());
        System.out.println("""
                Expected:
                ********************
                Island ID Number: 222
                Island Name: Sweetfish
                Island Rating: 7
                Island capacity: 2
                Pass List in Island: []
                ********************
                Actual:
                """ + ferry2.getSourceIsland() + "\n");
        System.out.println("""
                Expected:
                ********************
                Island ID Number: 333
                Island Name: Seahorse
                Island Rating: 2
                Island capacity: 1
                Pass List in Island: []
                ********************
                Actual:
                """ + ferry3.getDestinationIsland() + "\n");

        // Test the island methods
        island1.enter(pass);
        System.out.println("Expected: 1. Actual: " + island1.getPassList().size() + "\n");
        island1.leave(pass);
        System.out.println("Expected: 0. Actual: " + island1.getPassList().size() + "\n");

        System.out.println("Expected: true. Actual: " + island1.hasSpace() + "\n");

        island1.enter(pass);
        System.out.println("""
                Expected:
                ********************
                Guest Name: temp
                Pass ID Number: 1
                Luxury Rating: 5
                Credits: 20
                Journey Points: 0
                ********************
                Actual:""");
        island1.listCurrentPasses();
        System.out.println();

        System.out.println("""
                Expected:
                ********************
                Guest Name: temp
                Pass ID Number: 1
                Luxury Rating: 5
                Credits: 20
                Journey Points: 0
                ********************
                Actual:
                """ + island1.getPassDetails(1) + "\n");

        System.out.println("Expected: true. Actual: " + island1.isPassOnIsland(pass) + "\n");

        island1.leave(pass);
        System.out.println("Expected: false. Actual: " + island1.isPassOnIsland(1) + "\n");

        // Test the ferry methods
        System.out.println("Expected: true. Actual: " + ferry1.canPassTravel(pass) + "\n");

        island1.enter(pass);
        System.out.println("Expected: The pass has a lower luxury rating than the destination island. Actual: " + ferry3.processPass(pass, island2, island3) + "\n");
        System.out.println("Expected: The person can travel to the next island. Actual: " + ferry1.processPass(pass, island1, island2) + "\n");

        // Print out the island states
        System.out.println("""
                Expected:
                ********************
                Island ID Number: 111
                Island Name: Haven
                Island Rating: 5
                Island capacity: 2
                Pass List in Island: []
                ********************
                Actual:
                """ + island1 + "\n");
        System.out.println("""
                Expected:
                ********************
                Island ID Number: 222
                Island Name: Sweetfish
                Island Rating: 4
                Island capacity: 2
                Pass List in Island:
                [********************
                Guest Name: temp
                Pass ID Number: 1
                Luxury Rating: 5
                Credits: 17
                Journey Points: 1
                ********************]
                ********************
                Actual:
                """ + island2 + "\n");
        System.out.println("""
                Expected:
                ********************
                Island ID Number: 333
                Island Name: Seahorse
                Island Rating: 8
                Island capacity: 1
                Pass List in Island:
                []
                ********************
                Actual:
                """ + island3 + "\n");

        // Print out the ferry states
        System.out.println("""
                Expected:
                ********************
                Ferry ID Number: 1
                Source Island:
                ********************
                Island ID Number: 111
                Island Name: Haven
                Island Rating: 5
                Island capacity: 2
                Pass List in Island:
                []
                ********************

                Destination Island:
                ********************
                Island ID Number: 222
                Island Name: Sweetfish
                Island Rating: 4
                Island capacity: 2
                Pass List in Island:
                [********************
                Guest Name: temp
                Pass ID Number: 1
                Luxury Rating: 5
                Credits: 17
                Journey Points: 1
                ********************]
                ********************
                ********************
                Actual:
                """ + ferry1 + "\n");
        System.out.println("""
                Expected:
                ********************
                Ferry ID Number: 2
                Source Island:
                ********************
                Island ID Number: 222
                Island Name: Sweetfish
                Island Rating: 4
                Island capacity: 2
                Pass List in Island:
                [********************
                Guest Name: temp
                Pass ID Number: 1
                Luxury Rating: 5
                Credits: 17
                Journey Points: 1
                ********************]
                ********************

                Destination Island:
                ********************
                Island ID Number: 111
                Island Name: Haven
                Island Rating: 5
                Island capacity: 2
                Pass List in Island:
                []
                ********************
                ********************
                Actual:
                """ + ferry2 + "\n");
        System.out.println("""
                Expected:
                ********************
                Ferry ID Number: 3
                Source Island:
                ********************
                Island ID Number: 222
                Island Name: Sweetfish
                Island Rating: 4
                Island capacity: 2
                Pass List in Island:
                [********************
                Guest Name: temp
                Pass ID Number: 1
                Luxury Rating: 5
                Credits: 17
                Journey Points: 1
                ********************]
                ********************

                Destination Island:
                ********************
                Island ID Number: 333
                Island Name: Seahorse
                Island Rating: 8
                Island capacity: 1
                Pass List in Island:
                []
                ********************
                ********************
                Actual:
                """ + ferry3 + "\n");
    }
}
