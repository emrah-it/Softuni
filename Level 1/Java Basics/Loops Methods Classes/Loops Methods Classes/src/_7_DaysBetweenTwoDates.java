//Problem 7.	Days between Two Dates
//Write a program to calculate the difference between two dates in number of days.
// The dates are entered at two consecutive lines in format day-month-year. Days are in range [1…31].
// Months are in range [1…12]. Years are in range [1900…2100].

//1-01-2014
//2-01-2014

import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class _7_DaysBetweenTwoDates {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two dates in separated line");

        String firstDate = input.nextLine();
        String secondLine = input.nextLine();

        int[] firstDayMonthYear = soplitAndGetDates(firstDate);
        int[] secondDayMonthYear = soplitAndGetDates(secondLine);


        Date past = new Date(firstDayMonthYear[2] - 1900, firstDayMonthYear[1] - 1, firstDayMonthYear[0]); // June 20th, 2010
        Date today = new Date(secondDayMonthYear[2] - 1900, secondDayMonthYear[1] - 1, secondDayMonthYear[0]); // July 24th
        long result = today.getTime() - past.getTime();

        long days = TimeUnit.MILLISECONDS.toDays(result);
        System.out.println(days);
    }

    private static int[] soplitAndGetDates(String dateAsString) {
        int[] dayMonthYear = new int[3];
        String[] splited = dateAsString.split("-");
        for (int i = 0; i < splited.length; i++) {
            dayMonthYear[i] = Integer.parseInt(splited[i]);
        }

        return dayMonthYear;
    }
}
