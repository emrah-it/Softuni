//Problem 3.	Min, Max, Sum and Average of N Numbers
//Write a program that reads from the console a sequence of n integer numbers 
//and returns the minimal, the maximal number, the sum and the average of all
//numbers (displayed with 2 digits after the decimal point). The input starts 
//by the number n (alone in a line) followed by n lines, each holding an integer 
//number. The output is like in the examples below

namespace _3.MinMaxSumAndAverageNNumbers
{
    using System;

    class Program
    {
        static void Main()
        {
            Console.Write("Enter lines");
            int length = int.Parse(Console.ReadLine());
            Console.WriteLine("Enter {0} numbers", length);
            decimal sum = 0;
            decimal avg = 0;
            decimal min = decimal.MaxValue;
            decimal max = decimal.MinValue;

            for (int i = 0; i < length; i++)
            {
                decimal currentNumber = decimal.Parse(Console.ReadLine());
                sum += currentNumber;
                if (min > currentNumber)
                {
                    min = currentNumber;
                }
                if (max < currentNumber)
                {
                    max = currentNumber;
                }
                if (i != 0)
                {
                    avg += currentNumber;
                    avg /= 2;
                }
                else
                {
                    avg = currentNumber;
                }
            }
            Console.WriteLine("Sum " + sum);

            Console.WriteLine("Avg " + avg);
            Console.WriteLine("Min " + min);
            Console.WriteLine("Max " + max);
        }
    }
}
