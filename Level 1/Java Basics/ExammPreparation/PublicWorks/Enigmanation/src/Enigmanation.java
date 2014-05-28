import java.util.Scanner;

public class Enigmanation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String expression = input.nextLine();
        double result = CalculateValue(expression, new ReferanceInt(0));

        System.out.format("%.3f", result);
    }

    private static double CalculateValue(String expression, ReferanceInt i) {
        double sum = 0;
        double current = 0;
        Character ch = null;
        for (; i.counter < expression.length(); i.counter++) {
            if (Character.isDigit(expression.charAt(i.counter))) {
                if (ch != null) {
                    current = Double.parseDouble(Character.toString(expression.charAt(i.counter)));
                    sum = CalculateCurrentSum(sum, current, ch);
                    current = 0;
                    ch = null;
                } else {
                    sum = Double.parseDouble(Character.toString(expression.charAt(i.counter)));
                }
            } else if (expression.charAt(i.counter) == '(') {
                if (ch != null) {
                    i.counter++;
                    current = CalculateValue(expression, i);
                    sum = CalculateCurrentSum(sum, current, ch);
                    current = 0;
                    ch = null;
                } else {
                    i.counter++;
                    sum = CalculateValue(expression, i);
                }
            } else if (expression.charAt(i.counter) == ')') {
                return sum;
            } else if (expression.charAt(i.counter) == '-') {
                ch = new Character('-');
            } else if (expression.charAt(i.counter) == '+') {
                ch = new Character('+');
            } else if (expression.charAt(i.counter) == '%') {
                ch = new Character('%');
            } else if (expression.charAt(i.counter) == '*') {
                ch = new Character('*');
            }
        }

        return sum;
    }

    private static double CalculateCurrentSum(double sum, double current, Character ch) {
        if (ch == '+') {
            return sum + current;
        } else if (ch == '-') {
            return sum - current;
        } else if (ch == '%') {
            return sum % current;
        } else {
            return sum * current;
        }
    }
}