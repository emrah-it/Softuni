//Problem 13.	Average Load Time Calculator
//We have a report that holds dates, web site URLs and load times (in seconds) 
//in the same format like in the examples below. Your tasks is to calculate the 
//average load time for each URL. Print the URLs in the same order as they first 
//appear in the input report. Print the output in the format given below. Use double floating-point precision. 

namespace _13.Average_Load_Time_Calculator
{
    using System;
    using System.Collections.Generic;
    using System.Linq;
    class Program
    {
        static void Main()
        {
            Console.WriteLine("Enter all input, for end enter empty string");
            Dictionary<string, decimal> result = new Dictionary<string, decimal>();
            var currentInputString = Console.ReadLine();
            while (currentInputString != string.Empty)
            {

               var splitedInput = currentInputString.Split();
                if (!result.ContainsKey(splitedInput[2]))
                {
                    result[splitedInput[2]] = decimal.Parse(splitedInput[3]);
                }
                else
                {
                    result[splitedInput[2]] = (result[splitedInput[2]] + decimal.Parse(splitedInput[3])) / 2;
                   
                }
                currentInputString = Console.ReadLine();
            }

            foreach (var item in result)
            {
                Console.WriteLine("{0} -> {1}", item.Key, item.Value);
            }
        }
    }
}
