/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rockpaperscissors;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Stefano
 */
public class RockPaperScissors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char playerChoice = getChoice();
        char computerChoice = getComputerChoice();

        System.out.println("Your choice: " + playerChoice);
        System.out.println("Computer choice: " + computerChoice);
        
        getWin(playerChoice, computerChoice);
    }
    
    public static char getChoice(){
        String choice;
        char choiceToReturn;
        Scanner scanner = new Scanner(System.in);

        System.out.println("***** ROCK PAPER SCISSORS *****");
        System.out.println("R = Rock");
        System.out.println("P = Paper");
        System.out.println("S = Scissors");
        
        do{
            System.out.print("Choice: ");
            choice = scanner.nextLine();

            if (choice.charAt(0) == 'R' || choice.charAt(0) == 'P' || choice.charAt(0) == 'S')
            {
                choiceToReturn = choice.charAt(0);
                scanner.close();
                break;
            }
        } while(true);
        
        return choiceToReturn;
    }

    public static char getComputerChoice(){
        Random rand = new Random();
        int choice = rand.nextInt(3) + 1;
        char choiceToReturn = ' ';

        switch (choice){
            case 1:
                choiceToReturn = 'R';
                break;

            case 2:
                choiceToReturn = 'P';
                break;

            case 3:
                choiceToReturn = 'S';
                break;
        }
        
        return choiceToReturn;
    }

    public static void getWin(char playerChoice, char computerChoice){
        switch (playerChoice){
            case 'R':
                if (computerChoice == 'R') System.out.println("It's a draw!");
                if (computerChoice == 'P') System.out.println("You lost!");
                if (computerChoice == 'S') System.out.println("You won!");
                break;

            case 'P':
                if (computerChoice == 'P') System.out.println("It's a draw!");
                if (computerChoice == 'S') System.out.println("You lost!");
                if (computerChoice == 'R') System.out.println("You won!");
                break;

            case 'S':
                if (computerChoice == 'S') System.out.println("It's a draw!");
                if (computerChoice == 'R') System.out.println("You lost!");
                if (computerChoice == 'P') System.out.println("You won!");
                break;
        }
    }
}
