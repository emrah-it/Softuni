//Write a program that enters 3 integers n, min and max (min ≤ max) and prints n random numbers in the range [min...max]. 

namespace _11RandomNumbersGivenRange
{
    using System;
    class Program
    {
        static void Main()
        {
            Console.Write("How many numbers you want to eneter: ");
            int n = int.Parse(Console.ReadLine());

            Console.Write("Enter min number: ");
            int min = int.Parse(Console.ReadLine());
            Console.Write("Enter max number: ");
            int max = int.Parse(Console.ReadLine());


            var random = new Random();
            for (int i = 0; i < n; i++)
            {
                Console.Write("{0,-2}", random.Next(min,max + 1));
            }
            Console.WriteLine();
        }
    }
}
