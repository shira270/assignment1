import java.util.Random;
import java.util.Scanner;
class GuessingGame10 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNum = random.nextInt(1000) + 1;
        Scanner scanner = new Scanner(System.in);
        int countPlayer1 = 0;
        int countPlayer2 = 0;
        int player1Guess;
        int player2Guess;
        do {
            System.out.println("Player 1 enter your guess: " );
            player1Guess = scanner.nextInt();
            countPlayer1++;
            if (player1Guess == randomNum){
                System.out.println("Player 1 has won with " + countPlayer1 + " guess");
                break;
            }
            else if (player1Guess > randomNum){
                System.out.println("The guess is too big! ");
            }
            else{
                System.out.println("The guess is too small! ");
            }
            System.out.println("Player 2 enter your guess ");
            player2Guess = scanner.nextInt();
            countPlayer2++;
            if (player2Guess == randomNum){
                System.out.println("Player 2 has won with " + countPlayer2 + " guess");
                break;
            }
            else if (player2Guess > randomNum){
                System.out.println("The guess is too big! ");
            }
            else{
                System.out.println("The guess is too small! ");
            }
        }
        while (player1Guess != -1 || player2Guess != -1);






    }



}