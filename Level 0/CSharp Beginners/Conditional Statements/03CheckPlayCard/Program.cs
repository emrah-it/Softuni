//Problem 3.	Check for a Play Card
//Classical play cards use the following signs to designate the card face:
//2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K and A. Write a program that enters a string and prints “yes” if it is a valid card sign or “no” otherwise


namespace _03CheckPlayCard
{
    using System;
    class Program
    {
        static void Main(string[] args)
        {
            string[] array = new string[] {
                "2", "3", "4", "5","6", "7", "8", "9", "10", "J", "Q", "K", "A" };

            Console.WriteLine("Enter card");
            string card = Console.ReadLine();
            for (int i = 0; i < array.Length; i++)
            {
                if (array[i] == card)
                {
                    Console.WriteLine("yes");
                    return;
                }   
            }
            Console.WriteLine("no");
        }
    }
}
