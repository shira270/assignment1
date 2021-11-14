import java.util.Scanner;

public class AbsoluteValue1
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int number;

        System.out.println("Enter a number");

        number = scanner.nextInt();

        if (number > 0) {
            System.out.println("The number absolute value is " + number);
        }
        else{
                System.out.println("The  number absolute value is " + number * -1);

            }

        }
    }