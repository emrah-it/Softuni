//Problem 12.	Extract Bit from Integer
//Write an expression that extracts from given 
//integer n the value of given bit at index p.


namespace GetExtractGivenBit
{
    using System;

    class GetExtractGivenBit
    {
        static void Main()
        {
            Console.Write("Enter number: ");
            int nubmer = int.Parse(Console.ReadLine());
            Console.Write("Wich bit you want: ");
            int p = int.Parse(Console.ReadLine());

            int getbit = nubmer & (1 << p);
            Console.WriteLine(getbit == 0 ? 0 : 1);
        }
    }
}
