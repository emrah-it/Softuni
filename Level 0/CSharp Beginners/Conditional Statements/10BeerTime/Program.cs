//Problem 10.	* Beer Time
//A beer time is after 1:00 PM and before 3:00 AM. Write a program that enters a time in format
//“hh:mm tt” (an hour in range [01...12], a minute in range [00…59] and AM / PM designator) and 
//prints “beer time” or “non-beer time” according to the definition above or “invalid time” if 
//the time cannot be parsed. Note that you may need to learn how to parse dates and times. 


namespace _10BeerTime
{
    using System;
    using System.Globalization;
    using System.Threading;
    class Program
    {
        static void Main()
        {
            Thread.CurrentThread.CurrentCulture = new CultureInfo("en-US");
            var startBeerTime = Convert.ToDateTime("1:00 PM");
            var endBeerTime = Convert.ToDateTime("11:59 PM");


            var startNightBeerTime = Convert.ToDateTime("1:00 AM");
            var endNigtBeerTime = Convert.ToDateTime("3:00 AM");

            Console.Write("Enter correct time: ");
            var test = new DateTime();
            try
            {
                test = Convert.ToDateTime(Console.ReadLine());
            }
            catch (Exception ex)
            {
                Console.WriteLine("invalid time");
                return;
            }

            if (startBeerTime <= test && endBeerTime >= test ||
                startNightBeerTime <= test && endNigtBeerTime >= test)
            {
                Console.WriteLine("Beer time");
            }
            else
            {
                Console.WriteLine("non-beer time");
            }

        }
    }
}
