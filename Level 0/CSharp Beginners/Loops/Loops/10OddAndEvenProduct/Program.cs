//Problem 10.	Odd and Even Product
//You are given n integers (given in a single line, separated by a space). 
//Write a program that checks whether the product of the odd elements is 
//equal to the product of the even elements. Elements are counted from 1 
//to n, so the first element is odd, the second is even, etc


//3 10 4 6 5 1
//4 3 2 5 2
//2 1 1 6 3

namespace _10OddAndEvenProduct
{
    using System;

    using System.Linq;

    class Program
    {
        static void Main()
        {
            Console.WriteLine("Enter numbes in same line,(you can copy from comments");
            var numbers = Console.ReadLine().Split(new char[] {   }, StringSplitOptions.RemoveEmptyEntries).Select(x => int.Parse(x)).ToArray();

            var oddProduct = 1;
            var evenProduct = 1;

            for (int i = 0; i < numbers.Length; i++)
            {
                if (i % 2 == 0)
                {
                    oddProduct *= numbers[i];
                }
                else
                {
                    evenProduct *= numbers[i];
                }
            }

            if (oddProduct == evenProduct)
            {
                Console.WriteLine("yes");
                Console.WriteLine("product = " + evenProduct);
            }
            else
            {
                Console.WriteLine("no");
                Console.WriteLine("odd_product = " + oddProduct);
                Console.WriteLine("even_product = " + evenProduct);
            }
        }
    }
}
