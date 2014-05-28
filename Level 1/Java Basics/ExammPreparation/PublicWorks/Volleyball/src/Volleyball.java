import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String yearType = input.nextLine();
        int numberOfHolidays = input.nextInt();
        int weekendsInHomeTown = input.nextInt();


        double holidays = numberOfHolidays * (2.0/ 3.0);
        double normalWeekends = (48 - weekendsInHomeTown) * (3.0/4.0);

        double result;
        result = normalWeekends +  holidays + weekendsInHomeTown    ;
        if(yearType.equals("leap")) {
             result = ((15.0 / 100.0) * result) + result;
        }

        System.out.format("%d\n", (int)result);
    }
}
