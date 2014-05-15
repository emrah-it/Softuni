//Bits Exchange
//Write a program that exchanges bits 3, 4 and 5 with 
//bits 24, 25 and 26 of given 32-bit unsigned integer. 

namespace ExchangeBits
{
    using System;

    class ExchangeBits
    {
        static void Main()
        {
            Console.WriteLine("Enter Number: ");
            UInt32 number = UInt32.Parse(Console.ReadLine());
            int p = 3;
            int q = 24;
            int k = 3;

            byte[] bitsP = new byte[k];
            byte[] bitsQ = new byte[k];
            int bits = 0;
            for (int i = p; i < k + p; i++)
            {
                bitsP[bits] = TakeBit(number, i);
                bits++;
            }
            bits = 0;
            for (int i = q; i < k + q; i++)
            {
                bitsQ[bits] = TakeBit(number, i);
                bits++;
            }
            bits = 0;
            for (int i = q; i < q + k; i++)
            {
                ReplaceBits(ref number, bitsP[bits], i);
                bits++;
            }
            bits = 0;
            for (int i = p; i < p + k; i++)
            {
                ReplaceBits(ref number, bitsQ[bits], i);
                bits++;
            }

            Console.WriteLine(Convert.ToString(number, 2));
        }

        private static void ReplaceBits(ref UInt32 n, byte bit, int position)
        {
            if (bit == 0)
            {
                n = (UInt32)(n & (UInt32.MaxValue ^ (1 << position)));
            }
            else
            {
                n = (UInt32)(n | (1 << position));
            }
        }

        static byte TakeBit(UInt32 number, int position)
        {
            if ((number & (1 << position)) == 0)
            {
                return 0;
            }
            return 1;
        }
    }
}
