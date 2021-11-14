import java.util.Scanner;

public class JuniorSeniorEmployee5 {
    public static void main(String[] args) {
        int typeOfEmployee;
        do {


            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the type of employee [0 for junior 1 for senior]");
            typeOfEmployee = scanner.nextInt();

            System.out.println("Enter the number of the working hours this month ");
            int numberOfHours = scanner.nextInt();

            System.out.println("Enter the number of days the employee reached his goals ");
            int dailyGoals = scanner.nextInt();

            salaryCalculation(typeOfEmployee, numberOfHours, dailyGoals);


        }while(typeOfEmployee == 0 || typeOfEmployee == 1);
    }


        public static void salaryCalculation ( int typeOfEmployee, int numberOfHours, int dailyGoals){
        if (typeOfEmployee == 1) {
            int paymentPerHour = 200;
            int paymentForWorkingHours = paymentPerHour * numberOfHours;
            int paymentForDailyGoal = dailyGoals * 250;
            int totalSalary = paymentForDailyGoal + paymentForWorkingHours;
            System.out.println("The total salary for the month is: " + totalSalary);

        } else if (typeOfEmployee == 0) {
            int paymentPerHour = 50;
            int paymentForWorkingHours = paymentPerHour * numberOfHours;
            int paymentForDailyGoal = dailyGoals * 250;
            int totalSalary = paymentForWorkingHours + paymentForDailyGoal;
            System.out.println("The salary for the month is: " + totalSalary);
        }

    }
    }





