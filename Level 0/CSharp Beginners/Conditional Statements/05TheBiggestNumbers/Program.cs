//Problem 5.	The Biggest of 3 Numbers
//Write a program that finds the biggest of three numbers. 


namespace _05TheBiggestNumbers
{
    using System;
    class Program
    {
        static void Main()
        {
            Console.WriteLine("Enter tree Numbers, and i will show you biggest");
            int maxNumber = int.MinValue;
            for (int i = 0; i < 3; i++)
            {
                var current = int.Parse(Console.ReadLine());
                if (current > maxNumber)
                {
                    maxNumber = current;
                }
            }
            Console.WriteLine(maxNumber);
        }
    }
}
