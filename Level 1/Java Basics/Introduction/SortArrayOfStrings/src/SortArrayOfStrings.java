//Problem 8.	* Sort Array of Strings
//        Write a program that enters from the console number n and n strings,
//      then sorts them alphabetically and prints them. Note: you might
//      need to learn how to use loops and arrays in Java (search in Internet).

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortArrayOfStrings {
    public static void main(String[] args) {



        int var = 10;

        var  = 10;

        Scanner input = new Scanner(System.in);

        List<Integer> arr = new ArrayList<Integer>();


        arr.add(var);
        arr.add(var);
        arr.add(var);
        arr.add(var);
        arr.add(var);

        String joined = StringUtils.join(arr, ",");












        Scanner input = new Scanner(System.in);
        List<String> allNames = new ArrayList<String>();

        System.out.println("Enter n");
        int n = input.nextInt();


        System.out.println("Enter " + "names");
        for (int i = 0; i < n; i++) {
            String    currentLine = input.nextLine();
            if(currentLine.equals("")){
                i--;
                continue;
            }
            allNames.add(currentLine);
        }
        Collections.sort(allNames);

        System.out.println("Sorted names");
        for(String item: allNames){
            System.out.println(item);
        }


    }
}
