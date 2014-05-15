//Counting a Word in a Text
//Write a program that counts how many times a given word occurs 
//in given text. The first line in the input holds the word. The 
//second line of the input holds the text. The output should be a
//single integer number – the number of word occurrences. Matching
//should be case-insensitive. Note that not all matching substrings
//are words and should be counted. A word is a sequence of letters 
//separated by punctuation or start / end of text. 

namespace _16.Counting_a_Word_in_a_Text
{
    using System;
    using System.Text.RegularExpressions;
    class Program
    {
        static void Main()
        {
            Console.WriteLine("Word to count");
            var word = Console.ReadLine();

            Console.WriteLine("Enter text");
            var text = Console.ReadLine();


            var result = Regex.Matches(text, word, RegexOptions.IgnoreCase);

            Console.WriteLine(result.Count);
        }
    }
}
