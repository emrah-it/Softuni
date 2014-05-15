//Problem 15.	Extract URLs from Text
// Write a program that extracts and prints all URLs from given text. URL can be in only two formats:

namespace _15.Extract_URLs_from_Text
{
    using System;
    using System.Collections.Generic;
    using System.Linq;
    using System.Text.RegularExpressions;
    class Program
    {
        static void Main(string[] args)
        {
            string regex = @"((([A-Za-z]{3,9}:(?:\/\/)?)(?:[-;:&=\+\$,\w]+@)?[A-Za-z0-9.-]+|(?:www.|[-;:&=\+\$,\w]+@)[A-Za-z0-9.-]+)((?:\/[\+~%\/.\w-_]*)?\??(?:[-\+=&;%@.\w_]*)#?(?:[\w]*))?)";



            var inputString = Console.ReadLine();

            var result = Regex.Matches(inputString, regex);


            foreach (Match item in result)
            {
                Console.WriteLine(item.Value);
            }
        }


    }
}
