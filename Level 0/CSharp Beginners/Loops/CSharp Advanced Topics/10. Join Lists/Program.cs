//Problem 10.	Join Lists
//Write a program that takes as input two lists of integers and joins them. 
//The result should hold all numbers from the first list, and all numbers from
//the second list, without repeating numbers, and arranged in increasing order.
//The input and output lists are given as integers, separated by a space,
//each list at a separate line. 

namespace _10.Join_Lists
{
    using System;
    using System.Linq;

    class Program
    {
        static void Main()
        {
            Console.WriteLine("Enter first line of numbers");
            var firstLineNumbers = Console.ReadLine().Split().Select(x => int.Parse(x)).ToArray();

            Console.WriteLine("Enter second line of numbers");
            var secondLineNumbers = Console.ReadLine().Split().Select(x => int.Parse(x)).ToArray();

            var union = firstLineNumbers.Union(secondLineNumbers);

            var sorted = union.OrderBy(x => x);

            Console.WriteLine(string.Join(" ", sorted));
        }
    }
}