import java.util.Scanner;

public class QuadraticEquation4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number a");

        double a = scanner.nextInt();
        System.out.println("Enter number b");

        double b = scanner.nextInt();

        System.out.println("Enter number c");
        double c = scanner.nextInt();

        double calculationRoot = (b * b - (4 * a * c));
        double root = Math.sqrt(calculationRoot);
        double result1 = (-b + root) / (2 * a);
        double result2 = (-b - root) / (2 * a);

        if (calculationRoot == 0) {
            System.out.println("There is one result: x= " + result1);
        }

        if (calculationRoot > 0) {

            System.out.println("The result is X1 = " + result1 + " X2 = " + result2);
        }

            if  (calculationRoot < 0) {

                System.out.println("There is no result");


            }}}

