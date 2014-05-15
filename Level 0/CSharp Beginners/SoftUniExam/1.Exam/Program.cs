using System;
using System.Linq;

internal class Program
{
    private static void Main()
    {
        int yearsLength = 48;

        string yearType = Console.ReadLine();

        decimal holidays = decimal.Parse(Console.ReadLine());
        decimal weekendsInHometown = decimal.Parse(Console.ReadLine());

        decimal homeTownWeekends = weekendsInHometown;
        decimal normalPlay = (yearsLength - weekendsInHometown) * ((decimal)3 / (decimal)4);
        decimal holidaysSum = holidays * ((decimal)2 / (decimal)3);

        decimal result = homeTownWeekends + normalPlay + holidaysSum;

        if (yearType == "leap")
        {
            result = result + result * ((decimal)15 / (decimal)100);
        }
        Console.WriteLine((int)(result / 1));
    }
}