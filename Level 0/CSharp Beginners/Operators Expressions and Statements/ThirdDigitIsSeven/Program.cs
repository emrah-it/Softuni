//Problem 1.	Third Digit is 7?
//Write an expression that checks for given integer if 
//its third digit from right-to-left is 7. 

namespace ThirdDigitIsSeven
{
    using System;

    class Program
    {
        static void Main()
        {
            Console.Write("Enter number: ");
            string number = Console.ReadLine();

            if (number.Length > 2)
            {
                if (number[2] == '7')
                {
                    Console.WriteLine(true);
                    return;
                }
            }
            Console.WriteLine(false);
        }
    }
}