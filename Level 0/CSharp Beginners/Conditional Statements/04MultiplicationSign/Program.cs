
namespace _04MultiplicationSign
{
    using System;
    class Program
    {
        static void Main(string[] args)
        {
            int firstNumber = int.Parse(Console.ReadLine());
            int secondNumber = int.Parse(Console.ReadLine());
            int thirdNumber = int.Parse(Console.ReadLine());


            if (firstNumber == 0 || secondNumber == 0 || thirdNumber == 0)
            {
                Console.WriteLine("0");
                return;
            }

            bool result;
            if (firstNumber > 0)
            {
                if (secondNumber > 0)
                {
                    if (thirdNumber > 0)
                    {
                        result = true;
                    }
                    else
                    {
                        result = false;
                    }
                }
                else
                {
                    if (thirdNumber < 0)
                    {
                        result = true;
                    }
                    else
                    {
                        result = false;
                    }
                }
            }
            else
            {
                if (secondNumber < 0)
                {
                    if (thirdNumber > 0)
                    {
                        result = true;
                    }
                    else
                    {
                        result = false;
                    }
                }
                else
                {
                    if (thirdNumber < 0)
                    {
                        result = true;
                    }
                    else
                    {
                        result = false;
                    }
                }
            }
            Console.WriteLine(result ? "+" : "-");
        }
    }
}
