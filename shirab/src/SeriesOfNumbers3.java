import java.util.Scanner;

public class SeriesOfNumbers3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers");

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        {
            if (number1 > number2 && number1 > number3 && number2 > number3) {
                System.out.println("The serial is" + number1 + " " + number2 + " " + " " + number3);
            }
            if (number2 > number1 && number2 > number3 && number1 > number3) {
                System.out.println("the serial is " + number2 + " " + number1 + " " + number3);
            }

            if (number3 > number1 && number3 > number2 && number1 > number2) {
                System.out.println("The serial is " + number3 + " " + number1 + " " + number2);
            }

            if (number1 > number3 && number1 > number2 && number3 > number2) {
                System.out.println("The serial is " + number1 + " " + number3 + " "  + number2);
            }

            if (number2 > number3 && number2 > number1 && number3 > number1) {
                System.out.println("The serial number " + number2 + " " + number3 + " " + number1);
            }

            if (number3 > number2 && number3 > number1 && number2 > number1) {

                System.out.println("The serial is " + number3 + " " + number2 + " " + number1);
            }
        }
    }
}