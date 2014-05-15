//Problem 5.	Calculate 1 + 1!/X + 2!/X2 + … + N!/XN
//Write a program that, for a given two integer numbers n and x, calculates
//the sum S = 1 + 1!/x + 2!/x2 + … + n!/xn. Use only one loop. Print the
//result with 5 digits after the decimal point.



using System;
namespace _5CalculateFactoriel
{
    using System;

    class Program
    {
        static void Main()
        {
            Console.WriteLine("Enter N");
            int n = int.Parse(Console.ReadLine());
            Console.WriteLine("Enter X");
            decimal x = decimal.Parse(Console.ReadLine());

            var factoriels = Factoriel(n);
            var powedNumbers = PowedNumbers(x, n);

            decimal sum = 1;
            for (int i = 0; i < n; i++)
            {
                sum += factoriels[i] / powedNumbers[i];
            }

            Console.WriteLine("{0:F5}", sum);

        }



        public static decimal[] Factoriel(int n)
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

            return numbers;
        }

        public static decimal[] PowedNumbers(decimal x, int n)
        {
            var result = new decimal[n];
            for (int i = 0; i < n; i++)
            {
                if (i != 0)
                {
                    result[i] = result[i - 1] * x;
                }
                else
                {
                    result[i] = x;
                }
            }

            return result;
        }
    }
}
