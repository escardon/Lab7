package edu.cscc;
import java.util.*;

/***
 * @author Ed Scardon, October 13, Lab7 JavaDoc, Unit Testing, and GitHub
 */
public class Main {

    private static Scanner input = new Scanner(System.in);

    /***
     * Allows for main method. Beginning of Java program.
     * @param args allows for command line arguments
     */
    public static void main(String[] args) {
        String h_pick;
        String c_pick;
        String answer;
        boolean isValid;
        /***
         * Do While loop is used for entering choice and determining if valid
         * @parm asks for input on choice for rock, paper, scissors, lizard or spock
         */
        do {
            System.out.println("Let's play rock, paper, scissors, lizard, spock");
            do {
                System.out.print("Enter your choice: ");
                h_pick = input.nextLine();
                isValid = RPSLSpock.isValidPick(h_pick);
                if (!isValid) {
                    System.out.println(h_pick + " is not a valid choice");
                }
            } while (!isValid);
            /***
             * @parm shows computer generated pick
             */
            c_pick = RPSLSpock.generatePick();
            System.out.print("Computer picked " + c_pick + "  ");
            /***
             * @parm tells the player who wins, the computer or the person
             */
            if (c_pick.equalsIgnoreCase(h_pick)) {
                System.out.println("Tie!");
            } else if (RPSLSpock.isComputerWin(c_pick, h_pick)) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("You win!");
            }
            /***
             * @parm asks if person would like to play again, if no wishes well
             */
            System.out.print("Play again ('y' or 'n'): ");
            answer = input.nextLine();
        } while ("Y".equalsIgnoreCase(answer));
        System.out.println("Live long and prosper!");
    }
}