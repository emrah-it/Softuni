//Problem 8.	Catalan Numbers
//In combinatorics, the Catalan numbers are calculated by the following formula:
//Write a program to calculate the nth Catalan number by given n (1 < n < 100)


namespace _8CatalanNumbers
{

    using System;
    using System.Numerics;
    class Program
    {
        static void Main(string[] args)
        {
            int N = int.Parse(Console.ReadLine());

            BigInteger c = Factoriel(2 * N) /(Factoriel(1 + N) * Factoriel(N));
            Console.WriteLine(c);
        }

        public static BigInteger Factoriel(int n)
        {
            var numbers = new BigInteger[n];

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
            if (n == 0)
            {
                return 1;
            }
            return numbers[n - 1];
        }
    }
}
