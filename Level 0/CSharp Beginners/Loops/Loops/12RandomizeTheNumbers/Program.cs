//Randomize the Numbers 1…N
//Write a program that enters in integer n and prints the numbers 1, 2, …, n in random order.


namespace _12RandomizeTheNumbers
{
    using System;
    class Program
    {
        static void Main()
        {
            Console.WriteLine("Enter how many numbers you want to randomise");
            var length = int.Parse(Console.ReadLine());
            var arrayFromNumbers = new int[length];

            for (int i = 0; i < length; i++)
            {
                arrayFromNumbers[i] = i + 1;
            }

            var random = new Random();
            for (int i = 0; i < length; i++)
            {
                int first = random.Next(0, length);
                int second = random.Next(0, length);

                int temp = arrayFromNumbers[first];
                arrayFromNumbers[first] = arrayFromNumbers[second];
                arrayFromNumbers[second] = temp;
            }

            Console.WriteLine(string.Join(", ", arrayFromNumbers));
        }
    }
}
