//Problem 7.	Sort 3 Numbers with Nested Ifs
//Write a program that enters 3 real numbers and prints them sorted
//in descending order. Use nested if statements. Don’t use arrays and the built-in sorting functionality. 

namespace _7Sort3NumbersWithNestedIfs
{
    using System;

    class Program
    {
        static void Main()
        {
            Console.WriteLine("Enter tree numbers, and i will sort it");
            int[] numbers = new int[3];

            numbers[0] = int.Parse(Console.ReadLine());
            numbers[1] = int.Parse(Console.ReadLine());
            numbers[2] = int.Parse(Console.ReadLine());

            if (numbers[0] < numbers[1])
            {
                int temp = numbers[0];
                numbers[0] = numbers[1];
                numbers[1] = temp;
            }
            if (numbers[0] < numbers[2])
            {
                int temp = numbers[0];
                numbers[0] = numbers[2];
                numbers[2] = temp;
            }

            if (numbers[1] < numbers[2])
            {
                int temp = numbers[1];
                numbers[1] = numbers[2];
                numbers[2] = temp;
            }

            Console.WriteLine(string.Join(" ", numbers));
        }
    }
}