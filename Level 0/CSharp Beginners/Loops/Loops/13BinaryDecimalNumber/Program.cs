//Problem 13.	Binary to Decimal Number
//Using loops write a program that converts a binary integer number to its decimal form. The input is entered as string. The output should 
//be a variable of type long. Do not use the built-in .NET functionality.

namespace _13BinaryDecimalNumber
{
    using System;
    using System.Linq;
    class Program
    {
        static void Main()
        {
            Console.WriteLine("Enter binary number");
            var binaryNumber = Console.ReadLine().ToCharArray().Select(x => int.Parse(x.ToString())).ToArray();
            Array.Reverse(binaryNumber);
            long num = 0;
            for (int i = 0; i < binaryNumber.Length; i++)
            {
                if (i != 0)
                {
                    if(binaryNumber[i] == 1){

                    num += (long)(Math.Pow(2, i));
                    }
                }
                else
                {
                    num += binaryNumber[i];
                }
            }

            Console.WriteLine(num);
        }
    }
}
