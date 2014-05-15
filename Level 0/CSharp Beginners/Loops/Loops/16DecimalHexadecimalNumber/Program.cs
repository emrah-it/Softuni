//Problem 16.	Decimal to Hexadecimal Number
//Using loops write a program that converts an integer number to its hexadecimal representation. The input is entered as long. 
//The output should be a variable of type string. Do not use the built-in .NET functionality. 

namespace _16DecimalHexadecimalNumber
{
    using System;
    using System.Collections.Generic;
    class Program
    {
        static void Main()
        {
            Dictionary<long, string> hex = new Dictionary<long, string>() { { 0, "0" }, { 1, "1" }, { 2, "2" }, { 3, "3" }, { 4, "4" }, { 5, "5" }, { 6, "6" }, { 7, "7" }, { 8, "8" }, { 9, "9" }, { 10, "A" }, { 11, "B" }, {12, "C" }, {13, "D" }, {14,"E" }, { 15, "F" } };
            Console.WriteLine("Enter decimal number to conver to hex");
            long number = long.Parse(Console.ReadLine());
            int currentNumber = 0;
            string result = string.Empty;
            do
            {
                currentNumber = (int)number % 16;
                result = hex[currentNumber] + result;
                number /= 16;
            } while (number != 0);

            Console.WriteLine(result);
        }
    }
}
