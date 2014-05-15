
namespace _4PrintDeck52Cards
{
    using System;

    class Program
    {
        static void Main()
        {
            string[] array = new string[] {
                "2", "3", "4", "5","6", "7", "8", "9", "10", "J", "Q", "K", "A" };
            var symbol = new char[] { '♣', '♦', '♥', '♠' };


            for (int i = 0; i < array.Length; i++)
            {
                for (int j = 0; j < symbol.Length; j++)
                {
                    Console.Write("{0, 3}{1}", array[i], symbol[j]);
                }
                Console.WriteLine();
            }
        }
    }
}
