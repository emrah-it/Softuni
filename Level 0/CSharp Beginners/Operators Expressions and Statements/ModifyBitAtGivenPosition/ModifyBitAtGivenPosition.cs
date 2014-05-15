//Problem 14.	Modify a Bit at Given Position
//We are given an integer number n, a bit value v 
//(v=0 or 1) and a position p. Write a sequence of operators 
//(a few lines of C# code) that modifies n to hold the value
//v at the position p from the binary representation of n 
//while preserving all other bits in n. 

namespace ModifyBitAtGivenPosition
{
    using System;

    class ModifyBitAtGivenPosition
    {
        static void Main()
        {
            Console.Write("Enter number: ");
            int nubmer = int.Parse(Console.ReadLine());
            Console.Write("Wich bit you want: ");
            int p = int.Parse(Console.ReadLine());
            Console.Write("Enter bit you want to enter: ");
            int bit = int.Parse(Console.ReadLine());
            if (!(bit == 0 || bit == 1))
            {
                throw new ArgumentException("Enter correct number");
            }
            int getbit;
            if (bit == 1)
            {
                getbit = nubmer | (1 << p);
            }
            else
            {
                getbit = nubmer & (~(1 << p));
            }
            
            Console.WriteLine(getbit);
        }
    }
}

