//Problem 9.	Remove Names
//Write a program that takes as input two lists of names and removes from the first 
//list all names given in the second list. The input and output lists are given as
//words, separated by a space, each list at a separate line. Examples:

namespace _9.Remove_Names
{
    using System;
    using System.Collections.Generic;
    class Program
    {
        static void Main()
        {
            Console.WriteLine("Enter names: ");

            var allNames = new List<string>( Console.ReadLine().Split(new char[] { ' ' }, StringSplitOptions.RemoveEmptyEntries));


            Console.WriteLine("Enter name to remove: ");
            var namesToRemove = new List<string>(Console.ReadLine().Split(new char[] { ' ' }, StringSplitOptions.RemoveEmptyEntries));

            for (int i = 0; i < namesToRemove.Count; i++)
            {
                while (allNames.Contains(namesToRemove[i]))
                {
                    allNames.Remove(namesToRemove[i]);
                }
               
            }


            Console.WriteLine(string.Join(" ", allNames));
        }
    }
}
