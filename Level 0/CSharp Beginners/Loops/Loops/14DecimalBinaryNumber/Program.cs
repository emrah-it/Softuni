//Problem 14.	Decimal to Binary Number
//Using loops write a program that converts an integer number to its binary representation. The input is entered as long. The output should be a 
//variable of type string. Do not use the built-in .NET functionality. 


namespace _14DecimalBinaryNumber
{
    using System;
    class Program
    {
        static void Main()
        {
            Console.WriteLine("Enter decimal number");
            long number = long.Parse(Console.ReadLine());
            long currentNumber = 0;
            string result = string.Empty;
            do
            {
                currentNumber = number % 2;
                result = currentNumber.ToString() + result;
                number /= 2;
            } while (number != 0);

            Console.WriteLine(result);
        }
    }
}
