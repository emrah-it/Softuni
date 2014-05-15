//Problem 7.	Calculate N! / (K! * (N-K)!)
//In combinatorics, the number of ways to choose k different members out
//of a group of n different elements (also known as the number of combinations)
//is calculated by the following formula:
 
//For example, there are 2598960 ways to withdraw 5 cards out of a standard
//deck of 52 cards. Your task is to write a program that calculates 
//n! / (k! * (n-k)!) for given n and k (1 < k < n < 100). Try to use 
//only two loops.



namespace _7.CalculateExpression
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
            var nMinuskFact = Factoriel(n - k);

            var result = nFact / (kFact * nMinuskFact);

            Console.WriteLine(result);
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

            return numbers[n - 1];
        }
    }
}
