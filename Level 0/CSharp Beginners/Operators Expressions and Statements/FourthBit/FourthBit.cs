//Problem 11.	Bitwise: Extract Bit #3
//Using bitwise operators, write an expression for finding
//the value of the bit #3 of a given unsigned integer. 
//The bits are counted from right to left, starting from 
//bit #0. The result of the expression should be either 1 or 0. 

namespace FourthBit
{
    using System;

    class FourthBit
    {
        static void Main()
        {
            Console.Write("Enter number: ");
            int nubmer = int.Parse(Console.ReadLine());

            int getbit = nubmer & (1 << 3);
            Console.WriteLine(getbit== 0? 0 : 1);
        }
    }
}
