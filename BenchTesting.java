import java.util.ArrayList;


public class BenchTesting {
    public static void main(String[] args) {

        // Initialise some islands

        Island island1= new Island(111,"Haven",5,2);
        Island island2 = new Island(222,"Sweetfish",7,2 );
        Island island3= new Island(333,"Seahorse",2,1 );
        Island island4 = new Island(444,"Egg",10,2);

        // Test the accessors
        System.out.println("Expected: 111. Actual: "+ island1.islandNumber());
        System.out.println("Expected: Sweetfish. Actual: "+ island2.islandName());
        System.out.println("Expected: 2. Actual: "+ island3.islandRating());
        System.out.println("Expected: 2. Actual: "+ island1.islandCapacity());

        //Test the methods
        Pass pass1 = new Pass(123, "Temp1", 5, 10, 1);
        Pass pass2 = new Pass(456, "Temp2", 3, 20, 6);
        Pass pass3 = new Pass(789, "Temp3", 8, 5, 0);
        Pass pass4 = new Pass(111, "Temp4", 10, 2, 3);

        island1.enter(pass1);
        island2.enter(pass2);
        island3.enter(pass3);
        island3.enter(pass4);


        island4.enter(pass1);
        System.out.println("Expected : The island has capacity. Actual: "+island4.capacity());
        island4.listCurrentPasses();
        System.out.println();
        island4.enter(pass2);
        System.out.println("Expected : The island reached the maximum capacity. Actual: "+island4.capacity());
        island4.listCurrentPasses();
        System.out.println();
        island4.enter(pass3);
        System.out.println("Expected : The island reached the maximum capacity. Actual: "+island4.capacity());
        island4.listCurrentPasses();
        System.out.println();
        island4.leave(pass2);
        System.out.println("Expected : The island has capacity. Actual: "+island4.capacity());
        island4.listCurrentPasses();
        System.out.println();
        island4.leave(pass1);
        System.out.println("Expected : The island has capacity. Actual: "+island4.capacity());
        island4.listCurrentPasses();

//         Test the accessor
        System.out.println("Expected: The island has capacity. Actual: "+ island1.capacity());
        System.out.println("Expected: The island has capacity. Actual: "+island2.capacity());
        System.out.println("Expected: The island reached the maximum capacity. Actual: "+island3.capacity());
        island3.leave(pass4);
        System.out.println("Expected: The island reached the maximum capacity. Actual: :"+island3.capacity());


//         Test the methods
        island1.listCurrentPasses();//Expected : temp1.
        island2.listCurrentPasses();//Expected : temp2.
        island3.listCurrentPasses();// Expected : temp3.


        System.out.println(island1.toString());
        System.out.println(island2.toString());
        System.out.println(island3.toString());




        System.out.println("Expected: temp1. Actual: "+island1.getPassDetails(123));

        System.out.println("Expected: true. Actual: "+island1.isPassOnIsland(pass1));
        System.out.println("Expected: false. Actual: "+island1.isPassOnIsland(pass2));


    }



}
