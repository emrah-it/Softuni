//Numbers in Interval Dividable by Given Number
//Write a program that reads two positive integer numbers and 
//prints how many numbers p exist between them such that
//the reminder of the division by 5 is 0. 


namespace NumbersInIntervalDividableByGivenNumber
{
    using System;
    class NumbersInIntervalDividableByGivenNumber
    {
        static void Main()
        {
            Console.WriteLine("Enter start: ");
            int start = int.Parse(Console.ReadLine());

            Console.WriteLine("Enter end");
            int end = int.Parse(Console.ReadLine());

            int totalNumber = (end - start) / 5;
            totalNumber += (end % 5) == 0 ? 1 : 0;

            Console.WriteLine(totalNumber);
        }
    }
}
