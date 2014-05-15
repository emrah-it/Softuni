using System;
using System.Collections.Generic;
using System.Linq;

internal class Program
{
    private static readonly int max = 100;
    private static readonly int n = 10;
    private static readonly int k = 3;
    private static readonly int[] array = new int[3];
    private static readonly List<int[]> result = new List<int[]>();

    private static readonly int sum = 0;

    private static readonly List<string> resultInString = new List<string>();

    static private int totalSum;
    static private int diff;

    private static void Main()
    {
        totalSum = int.Parse(Console.ReadLine());
        diff = int.Parse(Console.ReadLine());
        Variate(0);

        ChekDiff();
        if (resultInString.Count == 0)
        {
            Console.WriteLine("No");
        }
        else
        {
            var currResultInString = resultInString.OrderBy(x => x);
            foreach (var item in currResultInString)
            {
                Console.WriteLine(item);
            }
        }
    }

    private static void ChekDiff()
    {
        for (int i = 0; i < result.Count; i++)
        {
            for (int j = 0; j < result.Count; j++)
            {
                int firstThree = int.Parse(string.Join("", result[i]));
                int secondThree = int.Parse(string.Join("", result[j]));

                if (secondThree - firstThree == diff)
                {
                    for (int k = 0; k < result.Count; k++)
                    {
                        if (ChekLineSum(result[i], result[j], result[k]))
                        {
                            int third = int.Parse(string.Join("", result[k]));
                            if (secondThree - firstThree == diff && third - secondThree == diff)
                            {
                                resultInString.Add(string.Format("{0}{1}{2}", firstThree.ToString(), secondThree.ToString(), third.ToString()));
                            }
                        }
                    }
                }
            }
        }
    }

    private static bool ChekLineSum(int[] first, int[] second, int[] third)
    {
        int currentSum = 0;
        for (int i = 0; i < 3; i++)
        {
            currentSum += first[i] + second[i] + third[i];
        }
        return (currentSum == totalSum);
    }

    private static void Variate(int i)
    {
        if (i >= k)
        {
            int[] newArray = new int[3];
            Array.Copy(array, newArray, 3);
            result.Add(newArray);
            return;
        }
        for (int j = 5; j < 10; j++)
        {
            array[i] = j;
            Variate(i + 1);
        }
    }
}