//Problem 10.	Fibonacci Numbers
//Write a program that reads a number n and prints on the console the 
//first n members of the Fibonacci sequence (at a single line, separated 
//by spaces) : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, …. 
//Note that you may need to learn how to use loops

namespace FibonachiNumbers
{
    using System;

    class FibonachiNumbers
    {
        static void Main()
        {
            Console.Write("First n numbers, enter n:");
            int n = int.Parse(Console.ReadLine());

            FirstNNumbersFromFibonachi(n);
        }

        private static void FirstNNumbersFromFibonachi(int n)
        {
            int current = 0;
            int next = 1;
            for (int i = 0; i < n; i++)
            {
                Console.Write(current);
                if (i + 1 < n)
                {
                    int temp = current;
                    current = next;
                    next += temp;
                    Console.Write(" ");
                }
                else
                {
                    Console.WriteLine();
                }
            }
        }
    }
}