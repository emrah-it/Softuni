//Problem 12.	Count of Names
//Write a program that reads a list of names and prints for each name 
//how many times it appears in the list. The names should be listed in
//alphabetical order. Use the input and output format from the examples below. 
namespace _12.Count_of_Names
{
    using System;
    using System.Collections.Generic;
    using System.Linq;
    class Program
    {
        static void Main()
        {
            Dictionary<string, int> counterAlphabet = new Dictionary<string, int>();
            Console.WriteLine("Enter all alphabets you want to count");

            var chars = Console.ReadLine().Split();

            for (int i = 0; i < chars.Length; i++)
            {
                if (!counterAlphabet.ContainsKey(chars[i]))
                {
                    counterAlphabet[chars[i]] = 1;
                }
                else
                {
                    counterAlphabet[chars[i]]++;
                }
            }

            foreach (var item in counterAlphabet)
            {
                Console.WriteLine("{0} -> {1}", item.Key, item.Value);
            }
        }
    }
}
