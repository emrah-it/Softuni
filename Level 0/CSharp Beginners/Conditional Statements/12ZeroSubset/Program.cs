using System;
using System.Linq;
using System.Collections.Generic;
class Program
{
    static private int n;
    static private int k;
    static private int[] numbers;
    static private int[] array = new int[20];
    static private List<int[]> comb = new List<int[]>();

    static void Main()
    {
        Console.WriteLine("Enter numbers: ");
        numbers = Console.ReadLine().Split(new char[] { ' ' }, StringSplitOptions.RemoveEmptyEntries).Select(x => int.Parse(x)).ToArray();

        n = numbers.Length;

        for (int i = 1; i <= n; i++)
        {
            k = i;
            Comb(1, 0);
        }
        ChenIsZeroSum();
    }

    private static void ChenIsZeroSum()
    {
        var allPosibleSums = new List<string>();
        for (int i = 0; i < comb.Count; i++)
        {
            int currentSum = 0;
            for (int j = 0; j < comb[i].Length; j++)
            {
                currentSum += comb[i][j];
            }
            if (currentSum == 0)
            {
                var currentString = string.Join(" + ", comb[i]);
                allPosibleSums.Add(currentString);
            }
        }
        foreach (var item in allPosibleSums)
        {
            Console.WriteLine(item + " = 0");
        }
    }

    private static void Comb(int i, int after)
    {
        if (i > k)
        {
            return;
        }
        for (int j = after + 1; j <= n; j++)
        {
            array[i - 1] = j;
            if (i == k)
            {
                Print(i);
            }
            Comb(i + 1, j);
        }
    }
    static void Print(int length)
    {
        int[] newArray = new int[length];
        for (int i = 0; i < length; i++)
        {
            newArray[i] = numbers[array[i] - 1];
        }
        Array.Sort(newArray);
        var curr = comb.Contains(newArray);
        comb.Add(newArray);
    }
}
