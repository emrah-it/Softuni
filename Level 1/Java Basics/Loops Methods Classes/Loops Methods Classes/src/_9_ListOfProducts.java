//Problem 9.	List of Products
//Create a class Product to hold products, which have name
// (string) and price (decimal number). Read from a text
// file named "Input.txt" a list of products. Each product
// will be in format name + space + price. You should hold
// the products in objects of class Product. Sort the products
// by price and write them in format price + space + name in
// a file named "Output.txt". Ensure you close correctly all used resources.

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _9_ListOfProducts {

    public static void main(String[] args) {
        List<Product> unorderedList = new ArrayList<Product>();
        addSimpleExample(unorderedList);


        File fileName = new File("Input.txt");

        writeToFile(fileName, unorderedList);

        List<Product> readedFromFile = readStringFromFile(fileName);

        List<Product> orderedList = orderGivenList(readedFromFile);
        
        fileName = new File("Output.txt");
        writeToFile(fileName, orderedList);
    }


    private static List<Product> orderGivenList(List<Product> readedFromFile) {
        readedFromFile
                .sort((p1, p2) -> (int) (((p1.getPrice() - (p2.getPrice())) * 10)));

        return readedFromFile;
    }

    private static void addSimpleExample(List<Product> unorderedList) {
    	
    	unorderedList.add(new Product("milk", 2.80));
    	unorderedList.add(new Product("apple", 1.20));
    	unorderedList.add(new Product("coffee", 8.50));
    	unorderedList.add(new Product("juice", 2.50));
    	unorderedList.add(new Product("water", 1.20));
    	unorderedList.add(new Product("vodka", 18.70));
    	unorderedList.add(new Product("beer", 1.12));
    }

    private static List<Product> readStringFromFile(File fileName) {
        List<Product> readFromFIle = new ArrayList<Product>();
        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader br = new BufferedReader(reader);
            String line;
            while ((line = br.readLine()) != null) {
            	String[] currentLine = line.split(" ");
                readFromFIle.add(new Product(currentLine[0], Double.parseDouble(currentLine[1])));
            }
            br.close();
        } catch (IOException e){
            e.printStackTrace();
        }

        return readFromFIle;
    }

    private static void writeToFile(File fileName, List<Product> unorderedList) {
        try {
            FileWriter writer = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            for(Product item:unorderedList){
                bufferedWriter.write(item.getName() + " " + item.getPrice());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}