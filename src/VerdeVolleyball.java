// Write your Valley Verde Volleyball Program Here
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

class VerdeVolleyball {
    public static void main(String[] args) throws IOException {
        Scanner menuSelection = new Scanner(System.in);
        Scanner fileNameFromUser = new Scanner(System.in);
        Scanner teamRosterFile = new Scanner(new File(fileNameFromUser));

        int selection = 0;
        while (selection != 5) {
            displayMenu();
            System.out.print("Enter the number of your selection: ");
            selection = menuSelection.nextInt();

            if (selection == 1) {
                System.out.print("Please enter the name of the file name of the roster: ");
                File fileName = teamRosterFile.nextLine();

                ArrayList<Player> rosterList = new ArrayList<Player>();

            } else if (selection == 2) {

            } else if (selection == 3) {

            } else if (selection == 4) {

            } else {
                // close opened file
                System.exit();
            }
        }

    }
}


class Player {
    String firstName;
    String lastName;
    double attacksPerSet;
    double blocksPerSet;

    void createPlayer(String fName, String lName, String attackNumber, String blockNumber){
        firstName = fName;
        lastName = lName;
        attacksPerSet = Double.parseDouble(attackNumber);
        blocksPerSet = Double.parseDouble(blockNumber);
    }

    void print() {
        System.out.println(firstName + lastName + attacksPerSet + blocksPerSet);
    }
}


public static void displayMenu() {
    System.out.println("Here are your options:\n");
    System.out.println("\t1) Open a roster");
    System.out.println("\t2) List top 3 attackers");
    System.out.println("\t3) List top 3 blockers");
    System.out println("\t4) Make and display crimmage teams");
    System.out.println("\t5) Quit\n");
}

