import java.util.Scanner;

/**
 * Write a description of class ResortUI here.
 *
 * @author Klevi
 * @version 1/12/2022
 */
public class ResortUI {
    private Scanner reader = new Scanner(System.in);
    private FIRE fortunate = new Resort("Fortunate Islands", "temp location 1");

    private void runUI() {
        int choice = getOption();
        while (choice != 0) {
            if (choice == 1) {
                listAllResort();
            } else if (choice == 2) {
                listAllPasses();
            } else if (choice == 3) {
                listOneIsland();
            } else if (choice == 4) {
                findLocationOfPass();
            } else if (choice == 5) {
                tryTravel();
            } else if (choice == 6) {
                travelNow();
            } else if (choice == 7) {
                viewPass();
            } else if (choice == 8) {
                updateCredits();
            } else if (choice == 9) {
                convertPts();
            }

            // Output menu and get choice
            choice = getOption();
        }
        System.out.println("\nThank you");
    }

    private int getOption() {
        System.out.println("What would you like to do ?");
        System.out.println("0. Quit");
        System.out.println("1. List all resort details");
        System.out.println("2. List all passes on all islands");
        System.out.println("3. List all passes on one island");
        System.out.println("4. Find location of pass");
        System.out.println("5. Say if pass can move by ferry");
        System.out.println("6. Move a pass by ferry");
        System.out.println("7. View pass");
        System.out.println("8. Top up credits");
        System.out.println("9. Convert points to credits");
        System.out.println("Enter your choice:");

        // Read choice
        int option = reader.nextInt();
        reader.nextLine();
        return option;
    }

    // This one has been done for you 
    private void listAllResort() {
        System.out.println(fortunate.toString());
    }

    // Provide the code here
    private void listAllPasses() {
        System.out.println(fortunate.getAllPassesOnAllIslands());
    }

    // Provide the code here
    private void listOneIsland() {
        System.out.println("Enter island name:");
        String islandName = reader.next();
        System.out.println(fortunate.getAllPassesOnIsland(islandName));
    }

    // This one has been done for you
    private void findLocationOfPass() {
        System.out.println("Enter pass id:");
        int trav = reader.nextInt();
        String ww = fortunate.findPassLocation(trav);
        if (ww != null) {
            System.out.println(ww);
        } else {
            System.out.println("No such pass");
        }
    }

    // This one has been done for you 
    private void tryTravel() {
        System.out.println("Enter pass id:");
        int trav = reader.nextInt();
        reader.nextLine();
        System.out.println("Enter ferry code:");
        String ferry = reader.nextLine();
        System.out.println(fortunate.canTravel(trav, ferry));
    }

    // Provide the code here
    private void travelNow() {
        System.out.println("Enter pass id:");
        int trav = reader.nextInt();
        reader.nextLine();
        System.out.println("Enter ferry code:");
        String ferry = reader.nextLine();
        System.out.println(fortunate.travel(trav, ferry));
    }

    // This one has been done for you
    private void viewPass() {
        System.out.println("Enter pass ID number:");
        int cId = reader.nextInt();
        System.out.println(fortunate.viewAPass(cId));
    }

    // Provide the code here
    private void updateCredits() {
        System.out.println("Please enter the id of the pass toping up their credits:");
        int passId = reader.nextInt();
        System.out.println("Please enter the number of credits to be added:");
        int credits = reader.nextInt();
        fortunate.topUpCredits(passId, credits);
    }

    // This one has been done for you
    private void convertPts() {
        System.out.println("Enter pass ID number:");
        int cId = reader.nextInt();
        fortunate.convertPoints(cId);
    }

    public static void main(String[] args) {
        ResortUI resortTemp = new ResortUI();
        resortTemp.runUI();
    }
}
