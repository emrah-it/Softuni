//Problem 8.	Prime Number Check
//Write an expression that checks if given positive integer number 
//n (n ≤ 100) is prime (i.e. it is divisible without remainder 
//only to itself and 1). 


namespace IsPrime
{
    using System;
    class IsPrime
    {
        static void Main()
        {
            int n = int.Parse(Console.ReadLine());
            n = Math.Abs(n);
            if (n == 1 || n == 2 || n == 3 || n == 5)
            {
                Console.WriteLine("Prime");
            }
            else
            {
                if (n % 2 == 0 ||n % 3 == 0 || n % 5 == 0)
                {
                    Console.WriteLine("Not Prime");
                }
                else
                {
                    Console.WriteLine("Prime");
                }
            }
            

            
        }
    }

}
