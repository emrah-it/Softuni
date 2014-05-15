//Problem 7.	Sum of 5 Numbers
//Write a program that enters 5 numbers (given in 
//a single line, separated by a space), 
//calculates and prints their sum. 

namespace SumOfGivenLineNumbers
{
    using System;
    using System.Linq;

    class SumOfGivenLineNumbers
    {
        static void Main()
        {
            Console.WriteLine("Enter numbers in single line");
            int[] numbers = Console.ReadLine().
                Split(new char[] { ' ' }, StringSplitOptions.RemoveEmptyEntries).
                Select(x => int.Parse(x)).
                ToArray();

            int sum = 0;
            foreach (var item in numbers)
            {
                sum += item;
            }

            Console.WriteLine(sum);
        }
    }
}
