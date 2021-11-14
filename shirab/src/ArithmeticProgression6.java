import java.util.Scanner;

public class ArithmeticProgression6 {
public static void main(String[]args){

     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter the progression first term" );
     int firstTerm = scanner.nextInt();

     System.out.println(" Enter the difference between the terms" );
     int differenceBetweenTerms = scanner.nextInt();

     System.out.println("Enter the numbers of the terms" );
     int numberOfTerms = scanner.nextInt();

     if (numberOfTerms > 0) {
          System.out.println("The Arithmetic Progression is ");
          calculationOfArithmeticProgression(firstTerm, differenceBetweenTerms , numberOfTerms);
     }
else{
          System.out.println("Enter an even & positive number");

     }

}
public static int calculationOfArithmeticProgression(int firstTerm, int differenceBetweenTerms, int numbersOfTerms){

     for (int i = 0; i < numbersOfTerms; i++){
          System.out.println(firstTerm + "  "  + "  ");
          firstTerm = firstTerm + differenceBetweenTerms;
     }
     return firstTerm;
}








}

