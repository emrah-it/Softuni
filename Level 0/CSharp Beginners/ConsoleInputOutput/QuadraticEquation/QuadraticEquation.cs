    //Problem 6.	Quadratic Equation
    //Write a program that reads the coefficients a, b 
    //and c of a quadratic equation ax2 + bx + c = 0 
    //and solves it (prints its real roots). 

    namespace QuadraticEquation
    {
        using System;

        class QuadraticEquation
        {
            static void Main()
            {
                Console.Write("Enter a: ");
                double a = double.Parse(Console.ReadLine());
                Console.Write("Enter b: ");
                double b = double.Parse(Console.ReadLine());
                Console.Write("Enter c: ");
                double c = double.Parse(Console.ReadLine());

                double D = b * b - (4 * a * c);
                if (D < 0)
                {
                    Console.WriteLine("No real roots");
                }
                else if (D == 0)
                {
                    Console.WriteLine(-b / (2 * a));
                }
                else
                {
                    Console.WriteLine("First root: {0}", (-b + Math.Sqrt(D)) / (2 * a));
                    Console.WriteLine("Second root: {0}", (-b - Math.Sqrt(D)) / (2 * a));
                }
            }
        }
    }