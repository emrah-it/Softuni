using System;
using System.Linq;

internal class Program
{
    private static void Main()
    {
        int length = int.Parse(Console.ReadLine());

        //first row
        string firstRow = string.Format(" {0}{1}{2} ", new String('*', (length * 2) - 2), new String(' ', (length - 1) + 2), new String('*', (length * 2) - 2));
        Console.WriteLine(firstRow);

        int middleRow = (length - 2) / 2;

        for (int i = 0; i < length - 2; i++)
        {
            string currentLine;

            if (middleRow == i)
            {
                currentLine = string.Format("*{0}*{1}*{2}*", new String('/', (length * 2) - 2), new String('-', (length - 1)), new String('/', (length * 2) - 2));
            }
            else
            {
                currentLine = string.Format("*{0}*{1}*{2}*", new String('/', (length * 2) - 2), new String(' ', (length - 1)), new String('/', (length * 2) - 2));
            }

            Console.WriteLine(currentLine);
        }

        //last row
        string lastRow = string.Format(" {0}{1}{2} ", new String('*', (length * 2) - 2), new String(' ', (length - 1) + 2), new String('*', (length * 2) - 2));
        Console.WriteLine(lastRow);
    }
}