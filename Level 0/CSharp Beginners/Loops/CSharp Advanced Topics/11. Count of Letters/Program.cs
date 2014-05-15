//Problem 11.	Count of Letters
//Write a program that reads a list of letters and prints for each letter how many 
//times it appears in the list. The letters should be listed in alphabetical order.
//Use the input and output format from the examples below.
namespace _11.Count_of_Letters
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
