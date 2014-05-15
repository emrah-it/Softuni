using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

internal class Program
{
    private static void Main()
    {
        int length = int.Parse(Console.ReadLine());
        int step = int.Parse(Console.ReadLine());

        List<char> arrayOfBits = new List<char>();

        for (int i = 0; i < length; i++)
        {
            int currentNumber = int.Parse(Console.ReadLine());
            var inputNUmber = Convert.ToString(currentNumber, 2).PadLeft(8, '0').ToCharArray();
            arrayOfBits.AddRange(inputNUmber);
        }

        for (int i = 1; i < arrayOfBits.Count; i += step)
        {
            arrayOfBits[i] = '1';
        }

        StringBuilder current = new StringBuilder();
        List<int> result = new List<int>();

        for (int i = 0; i < arrayOfBits.Count; i += 8)
        {
            List<char> currentNUmber = arrayOfBits.GetRange(i, 8);

            int res = Convert.ToInt32(string.Join("", currentNUmber), 2);
            result.Add(res);
            current.Clear();
        }

        foreach (var item in result)
        {
            Console.WriteLine(item);
        }
    }
}