//Problem 9.	Sum of n Numbers
//Write a program that enters a number n and after that enters 
//more n numbers and calculates and prints 
//their sum. Note that you may need to use a for-loop. 


namespace SumOfNNumbers
{
    using System;
    class SumOfNNumbers
    {
        static void Main()
        {
            Console.Write("Please enter how many numbers you want to sum: ");
            int n = int.Parse(Console.ReadLine());

            int sum = 0;

            for (int i = 0; i < n; i++)
            {
                sum += int.Parse(Console.ReadLine());
            }

            Console.WriteLine("Sum is: {0}", sum);
        }
    }
}
