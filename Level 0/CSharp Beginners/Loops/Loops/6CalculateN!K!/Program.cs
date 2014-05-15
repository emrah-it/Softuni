//Problem 6.	Calculate N! / K!
//Write a program that calculates n! / k! for given n and k (1 < k < n < 100). 
//Use only one loop. Examples:


namespace _6CalculateN_K_
{
    using System;

    class Program
    {
        static void Main()
        {
            Console.WriteLine("Enter n: ");
            int n = int.Parse(Console.ReadLine());

            Console.WriteLine("Enter k: ");
            int k = int.Parse(Console.ReadLine());


            var nFact = Factoriel(n);
            var kFact = Factoriel(k);

            Console.WriteLine(nFact / kFact);
        }
        public static decimal Factoriel(int n)
        {
            var numbers = new decimal[n];

            for (int i = 1; i <= n; i++)
            {
                if (i != 1)
                {
                    numbers[i - 1] = i * numbers[i - 2];
                }
                else
                {
                    numbers[i - 1] = i;
                }
            }

            return numbers[n-1];
        }
    }
}
