//Problem 4.	Number Comparer
//Write a program that gets two numbers from the console and prints the greater of them. Try to implement this without if statements. 

namespace NumberComparare
{
    using System;

    class Program
    {
        static void Main()
        {
            Console.WriteLine("Enter numbers that you want to compare and for end presx ctrl+c");
            while (true)
            {
                Console.Write("a : ");
                int a = int.Parse(Console.ReadLine());

                Console.Write("b : ");
                int b = int.Parse(Console.ReadLine());
                Console.WriteLine("Bigger number is: " + (a == b ? " numbers are equal" : (a < b ? b.ToString() : a.ToString())));
            }
        }
    }
}