//Problem 6.	The Biggest of Five Numbers
//Write a program that finds the biggest of five numbers by using only five if statements. 


namespace _06TheBiggestOfFiveNumbers
{
    using System;
    class Program
    {
        static void Main()
        {
            Console.WriteLine("Enter five Numbers, and i will show you biggest");
            int biggestNumber = int.Parse(Console.ReadLine());

            int current = int.Parse(Console.ReadLine());
            if (biggestNumber < current)
            {
                biggestNumber = current;
            }

            current = int.Parse(Console.ReadLine());
            if (biggestNumber < current)
            {
                biggestNumber = current;
            }
            current = int.Parse(Console.ReadLine());
            if (biggestNumber < current)
            {
                biggestNumber = current;
            }
            current = int.Parse(Console.ReadLine());
            if (biggestNumber < current)
            {
                biggestNumber = current;
            }
            Console.WriteLine(biggestNumber);
        }
    }
}
