//Problem 14.	Longest Word in a Text
//Write a program to find the longest word in a text. Examples:


using System;
using System.Collections.Generic;
namespace _14.Longest_Word_in_a_Text
{
using System;
using System.Collections.Generic;
    using System.Linq;
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter text, and i will show you longest word");
            var word = Console.ReadLine().Split();

            var result = word.Max(x => x.Length);

            Console.WriteLine(word.Where(x => x.Length == result).First());
        }
    }
}
