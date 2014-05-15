using System;
using System.Linq;

internal class Program
{
    private static void Main()
    {
        int length = int.Parse(Console.ReadLine());
        int even = 0;
        int odd = 0;

        for (int i = 0; i < length * 2; i++)
        {
            int input = int.Parse(Console.ReadLine());

            //odd
            if (i % 2 == 0)
            {
                odd += input;
            }
            else
            {
                even += input;
            }
        }

        if (even == odd)
        {
            Console.WriteLine(string.Format("Yes, sum={0}", even));
        }
        else
        {
            int result = even - odd;
            result = result < 0 ? result * -1 : result;
            Console.WriteLine(string.Format("No, diff={0}", result));
        }
    }
}