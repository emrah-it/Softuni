//Problem 9.	Play with Int, Double and String
//Write a program that, depending on the user’s choice, inputs an int, double or string variable. If the variable 
//is int or double, the program increases it by one. If the variable is a string, the program appends
//"*" at the end. Print the result at the console. Use switch statement. 

namespace _09PlayWithIntDoubleAndString
{
    using System;

    class Program
    {
        static void Main()
        {
            var pleaseEnter = "Please enter a ";
            string menu = @"
Please choose a type:
1 --> int
2 --> double
3 --> string";
            byte choose = byte.Parse(Console.ReadLine());

            switch (choose)
            {
                case 1:
                    {
                        Console.WriteLine(pleaseEnter + "int");
                        int current = int.Parse(Console.ReadLine());
                        Console.WriteLine(++current);
                    }
                    break;
                case 2:
                    {
                        Console.WriteLine(pleaseEnter + "double");
                        double current = double.Parse(Console.ReadLine());
                        Console.WriteLine(++current);
                    }
                    break;
                case 3:
                    {
                        Console.WriteLine(pleaseEnter + "string");
                        string current = Console.ReadLine();
                        Console.WriteLine(current + "*");
                    }
                    break;
                default:
                    Console.WriteLine("Wrong choise, sorry");
                    break;
            }
        }
    }
}