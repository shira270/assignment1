import java.util.Scanner;

public class SumOddEven2
{

    public static void main(String[] args)
    {
   Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number");
   int number1 = scanner.nextInt();
        System.out.print("Enter second number");
   int number2 = scanner.nextInt();

   int sum = number1 + number2;
   System.out.println();
if
(sum % 2 == 0)

    System.out.println("the sum  " + sum + "  is even ");

else
    System.out.println("the sum  " + sum + "  is odd ");

    }



}
