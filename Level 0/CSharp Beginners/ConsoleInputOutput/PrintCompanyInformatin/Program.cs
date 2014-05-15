//Problem 2.	Print Company Information
//A company has name, address, phone number, fax number, web site 
//and manager. The manager has first name, last name, age and a 
//phone number. Write a program that reads the information about 
//a company and its manager and prints it back on the console.

/*
 Simple input, you can copy and paste to test
Software University
26 V. Kanchev, Sofia
+359 899 55 55 92

http://softuni.bgSvetlin
Nakov
25
+359 2 981 981


*/
namespace PrintCompanyInformatin
{
    using System;

    class Program
    {
        static void Main()
        {
            Console.Write("Company name:");
            string companyName = Console.ReadLine();
            Console.Write("Company adress:");
            string companyAdress = Console.ReadLine();
            Console.Write("Phone Number:");
            string companyPhoneNumber = Console.ReadLine();
            Console.Write("Fax number:");
            string faxNumber = Console.ReadLine();
            Console.Write("Web site:");
            string webSite = Console.ReadLine();
            Console.Write("Menager first name:");
            string managerFirstName = Console.ReadLine();
            Console.Write("Menager last name:");
            string managerLastName = Console.ReadLine();
            Console.Write("Mager age:");
            int managerAge = int.Parse(Console.ReadLine());
            Console.Write("Manager phone:");
            string managerPhone = Console.ReadLine();

            Console.WriteLine();
            Console.WriteLine(companyName != "" ? companyName : "no company name");
            Console.WriteLine("Adress: " + companyAdress != "" ? companyAdress : "no exist adress");
            Console.WriteLine("Tel. " + companyPhoneNumber != "" ? companyPhoneNumber : "no exist phone number");
            Console.WriteLine("Fax: " + (faxNumber != "" ? faxNumber : "(no fax)"));
            Console.WriteLine("Web site: " + (webSite != "" ? webSite : "(no web site)"));
            Console.WriteLine("Manager: " + (managerFirstName != ""? managerFirstName : "(first name is not exist)") + "(age: " + managerAge + ", tel. " + managerPhone + ")");
        }
    }
}
