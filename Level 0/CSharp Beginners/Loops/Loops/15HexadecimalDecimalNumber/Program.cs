//Problem 15.	Hexadecimal to Decimal Number
//Using loops write a program that converts a hexadecimal integer number to its decimal form. The input is entered as string. The output should be a variable of 
//type long. Do not use the built-in .NET functionality

namespace _15HexadecimalDecimalNumber
{
    using System;
    using System.Collections.Generic;

    class Program
    {
        static void Main()
        {
            Dictionary<char, long> hex = new Dictionary<char, long>() { { '0', 0 }, { '1', 1 }, { '2', 2 }, { '3', 3 }, { '4', 4 }, { '5', 5 }, { '6', 6 }, { '7', 7 }, { '8', 8 }, { '9', 9 }, { 'A', 10 }, { 'B', 11 }, { 'C', 12 }, { 'D', 13 }, { 'E', 14 }, { 'F', 15 } };

            Console.Write("Enter hex number");
            string hexNumber = Console.ReadLine().ToUpper();

            long num = 0;

            for (int i = hexNumber.Length - 1, j = 0; i >= 0; i--, j++)
            {
                if (i != hexNumber.Length - 1)
                {
                    num += (long)(Math.Pow(16, j)) * hex[hexNumber[i]];
                }
                else
                {
                    num += hex[hexNumber[i]];
                }
            }

            Console.WriteLine(num);
        }
    }
}