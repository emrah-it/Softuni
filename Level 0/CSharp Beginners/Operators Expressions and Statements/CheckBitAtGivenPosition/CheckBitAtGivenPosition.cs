//Problem 13.	Check a Bit at Given Position
//Write a Boolean expression that returns if the bit at position p 
//(counting from 0, starting from the right) in given integer
//number n has value of 1. 
namespace CheckBitAtGivenPosition
{
    using System;

    class CheckBitAtGivenPosition
    {
        static void Main()
        {
            Console.Write("Enter number: ");
            int nubmer = int.Parse(Console.ReadLine());
            Console.Write("Wich bit you want: ");
            int p = int.Parse(Console.ReadLine());

            int getbit = nubmer & (1 << p);
            Console.WriteLine(getbit == 0 ? false : true);
        }
    }
}
