//Problem 3.	Divide by 7 and 5
//Write a Boolean expression that checks 
//for given integer if it can be divided (without 
//remainder) by 7 and 5 in the same time. 

namespace Divideby7And5
{
    using System;
    class Program
    {
        static void Main()
        {
            Console.WriteLine("Enter Number");
            int number = int.Parse(Console.ReadLine());

            Console.WriteLine((number % 5) == 0 && (number % 7) == 0);
        }
    }
}
