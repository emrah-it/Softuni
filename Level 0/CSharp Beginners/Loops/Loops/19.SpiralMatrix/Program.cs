//Spiral Matrix
//Write a program that reads from the console a positive integer number n (1 ≤ n ≤ 20)
//and prints a matrix holding the numbers from 1 to n*n in the form of square spiral like in the examples below. Examples:


namespace _19.SpiralMatrix
{
    using System;
    class Program
    {
        static void Main()

        {
            Console.Write("Enter n of matrix");
            int N = int.Parse(Console.ReadLine());
            int[,] matrix = new int[N, N];
            for (int i = 0; i < N; i++)
            {
                for (int j = 0; j < N; j++)
                {
                    matrix[i, j] = 0;
                }
            }
            string direction = "right";
            int row = 0;
            int col = 0;

            for (int i = 1; i <= N * N; i++)
            {
                if (direction == "right")
                {
                    if (col == N || matrix[row, col] != 0)
                    {
                        i--;
                        row++;
                        col--;
                        direction = "down";
                    }
                    else
                    {
                        matrix[row, col++] = i;
                    }
                }
                else if (direction == "down")
                {
                    if (row == N || matrix[row, col] != 0)
                    {
                        i--;
                        row--;
                        col--;
                        direction = "left";
                    }
                    else
                    {
                        matrix[row++, col] = i;
                    }
                }
                else if (direction == "left")
                {
                    if (col == -1 || matrix[row, col] != 0)
                    {
                        i--;
                        row--;
                        col++;
                        direction = "up";
                    }
                    else
                    {
                        matrix[row, col--] = i;
                    }
                }
                else if (direction == "up")
                {
                    if (row == -1 || matrix[row, col] != 0)
                    {
                        i--;
                        row++;
                        col++;
                        direction = "right";
                    }
                    else
                    {
                        matrix[row--, col] = i;
                    }
                }
            }
            for (int i = 0; i < N; i++)
            {
                for (int j = 0; j < N; j++)
                {
                    Console.Write("{0, 3}", matrix[i, j]);
                }
                Console.WriteLine();
            }
        }
    }
}
