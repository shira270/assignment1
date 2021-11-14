import java.util.Scanner;
public class MeetingForIRS7 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter which day you would like to arrive (for ex day 1 = Sunday ect..)");
        int day = scanner.nextInt();

        System.out.println("Enter the earliest hour you can arrive");
        int earliestHour = scanner.nextInt();

        System.out.println("Enter the latest hour you can arrive");
        int latestHour = scanner.nextInt();

        switch (day) {
            case 1:
            case 2:
            case 4:
            case 5: {
                if (earliestHour < 0 || earliestHour > 23 || latestHour < 0 || latestHour > 23) {
                    System.out.println("Invalid hour");
                    break;
                }
                if (earliestHour > latestHour) {
                    System.out.println("Earliest hour can't be later than latest hour");
                    break;
                }
                if (earliestHour < 9 && earliestHour > 0 || latestHour > 17 && latestHour < 23) {
                    System.out.println("The opening hours are: 09:00-17:00");
                    break;
                }
                System.out.println("Your meeting request has been accepted");
                break;
            }

            case 3: {
                if (earliestHour < 0 || earliestHour > 23 || latestHour < 0 || latestHour > 23) {
                    System.out.println("Invalid hour");
                    break;
                }
                if (earliestHour > latestHour) {
                    System.out.println("Earliest hour can't be later than latest hour");
                    break;
                }
                if (earliestHour < 8 && earliestHour > 0 || latestHour > 12 && latestHour < 23) {
                    System.out.println("The opening hours are: 08:00-12:00");
                    break;
                }
                System.out.println("Your meeting request has been accepted");
                break;
            }

            case 6:
            case 7: {
                System.out.println("The IRS is closed in days 6 && 7");
                break;
            }
            default:{
                System.out.println("The day you asked for doesn't exist" );
                break;
            }
        }
    }


}
