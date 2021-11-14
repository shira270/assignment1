import java.util.Scanner;
public class PositivePrimeNumber9 {
    public static void main(String[] args) {
        int num = positiveNumber();
        for (int i = 2; i <= num ; i++) {
            if(primeNumber(i)) {
                System.out.print(i + " ");
            }
    }
}


    public static boolean moduloZero (int number1, int number2){
        if (number1 % number2 == 0){
            return true; }
        else{
            return false;
        }}
        public static boolean primeNumber (int integerNumber) {
            for (int i = 2; i < integerNumber; i++) {
                if (moduloZero(integerNumber, i)) {
                    return false;
                }
            } return true;
        }

    public static int positiveNumber() {
        int number;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a positive number:");
            number = scanner.nextInt();
            if (number > 0) {
                System.out.println(number);
            } else {
                System.out.println("Please enter a positive number " );
            }
        } while (number < 0);{}
        return number;
    }


    }
