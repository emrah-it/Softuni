//Longest Non-Decreasing Subsequence
//Write a program that reads a sequence of integers and find0s
//in it the longest non-decreasing subsequence. In other words, 
//you should remove a minimal number of numbers from the starting 
//sequence, so that the resulting sequence is non-decreasing. In
//case of several longest non-decreasing sequences, print the 
//leftmost of them. The input and output should consist of a single 
//line, holding integer numbers separated by a space. 


namespace Problem_8.Longest_Non_Decreasing_Subsequence
{
    using System;
    using System.Linq;
    using System.Collections.Generic;

    class SubSetSum
    {
        static bool AreSorted(List<long> array)
        {
            bool isSorted = true;
            for (int i = 0; i < array.Count - 1; i++)
            {
                if (!(array[i] <= array[i + 1]))
                {
                    isSorted = false;
                }
            }
            return isSorted;
        }
        static void Main()
        {
            Console.WriteLine("Enter numbers in one line");
            var elements = Console.ReadLine().Split().Select(x => int.Parse(x)).ToArray();
            int len = 0;
            int bestLen = 0;
            List<long> bestResult = new List<long>();
            int maxSubsets = (int)Math.Pow(2, elements.Length);
            for (int i = 1; i < maxSubsets; i++)
            {
                List<long> result = new List<long>();

                for (int j = 0; j <= elements.Length; j++)
                {
                    int mask = 1 << j;
                    int nAndMask = i & mask;
                    int bit = nAndMask >> j;
                    if (bit == 1)
                    {
                        result.Add(elements[j]);
                        len++;
                    }
                }
                if (AreSorted(result))
                {
                    if (len > bestLen)
                    {
                        bestLen = len;
                        bestResult = result;
                    }
                }
                len = 0;

            }
            foreach (var item in bestResult)
            {
                Console.Write("{0} ", item);
            }
            Console.WriteLine();
        }
    }
}
