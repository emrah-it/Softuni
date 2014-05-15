using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Four_Digit_Number
{
    
    class Program
    {
        private const int MaxLength = 4;
        static void Main()
        {
            Console.Write("Enter four digit number: ");
            string number = Console.ReadLine();
            IsValid(number);

            int sum = SumOfNumbers(number);

            string reversed = ReversDigit(number);

            string lastDigitInFront = LastDigitInFront(number);
            string reversSecondAndTird = ReversFirstAndLastDigit(number, 1, 2);


            Console.WriteLine("Sum: {0}", sum);
            Console.WriteLine("Reversed: {0}", reversed);
            Console.WriteLine("LastDigitInFront: {0}", lastDigitInFront);
            Console.WriteLine("Reverse third and second digits: {0}", reversSecondAndTird);
        }

        private static string LastDigitInFront(string number)
        {
            char[] array = new char[number.Length];

            array[0] = number[number.Length - 1];

            for (int i = 0; i < number.Length - 1; i++)
            {
                array[i + 1] = number[i];
            }
            return new string(array);
        }

        private static string ReversFirstAndLastDigit(string number, int first, int last)
        {
            char[] numberToReverse = number.ToCharArray();

            char temp = numberToReverse[first];
            numberToReverse[first] = numberToReverse[last];
            numberToReverse[last] = temp;

            return new string(numberToReverse);
        }

        private static string ReversDigit(string number)
        {
            char[] digits = number.ToCharArray();
            Array.Reverse(digits);

            return new string(digits);
        }

        private static int SumOfNumbers(string number)
        {
            int sum = 0;

            foreach (var item in number)
            {
                sum += int.Parse(item.ToString());
            }

            return sum;
        }

        private static void IsValid(string number)
        {
            if (number.Length > MaxLength)
            {
                throw new ArgumentException("Number is too logns");
            }
            foreach (var num in number)
            {
                if (!char.IsDigit(num))
                {
                    Console.WriteLine("Integer is not correct");
                    throw new ArgumentException("Enter correct number");
                }
            }
        }
    }
}
