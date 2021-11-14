import java.util.Scanner;

public class Asterisk8 {
    public static void main(String[] args) {
        int num = returnValue();
        ast(num);
    }

    public static int returnValue() {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter a number between 5-20: ");
            number = scanner.nextInt();
        }while (number < 5 || number > 20);
        return number;
}
    public static void ast(int count){
        String asterisk = "*";
        for (int i = 0; i < count; i++){
            System.out.println(asterisk);
            asterisk = asterisk + "*";
        }
    }
}
