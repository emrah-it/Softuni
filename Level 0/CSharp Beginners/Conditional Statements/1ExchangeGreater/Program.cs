//Problem 1.	Exchange If Greater
//Write an if-statement that takes two integer variables a and b and exchanges their values if the first 
//one is greater than the second one. As a result print the values a and b, separated by a space. 


namespace _1ExchangeGreater
{
    using System;
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Enter first Number:");
            int first = int.Parse(Console.ReadLine());
            Console.Write("Enter second Number:");
            int second = int.Parse(Console.ReadLine());
            if (first > second)
            {
                int current = second;
                second = first;
                first = current;
            }
            Console.WriteLine(first);
            Console.WriteLine(second);
        }
    }
}
