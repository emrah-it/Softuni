import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JSpinner.ListEditor;

//Problem 1.	* Order of Products
//Create a class Product to hold products, which have name (string) and price (decimal number). 
//Read from a text file named "Products.txt" a list of product with prices and keep them in a list 
//of products. Each product will be in format name + space + price. You should hold the products in 
//objects of class Product. Read from a text file named "Order.txt" an order of products with quantities. 
//Each order line will be in format product + space + quantity. Calculate and print in a text file 
//"Output.txt" the total price of the order. Ensure you close correctly all used resources. 

public class _10_OrderOfProducts {

	public static void main(String[] args) {
		File file = new File("Input.txt");
		List<String> readedFromFile = readStringFromFile(file);
		List<Product> parsedToProcudt = parseStringToProduts(readedFromFile);
		
		file = new File("Order.txt");
		readedFromFile = readStringFromFile(file);
		List<Order> orderList = getOrderList(readedFromFile);
		
		double calculated = calculateOrders(orderList, parsedToProcudt);

		file = new File("Output.txt");
		writeToFile(file, calculated);
		

	}

	private static double calculateOrders(List<Order> orderList,
			List<Product> parsedToProcudt) {
		double sum = 0;
		for (int i = 0; i < orderList.size(); i++) {
			for (int j = 0; j < parsedToProcudt.size(); j++) {
				if(orderList.get(i).getName().equals(parsedToProcudt.get(j).getName())){
					sum += orderList.get(i).getOrder() * parsedToProcudt.get(j).getPrice();
					break;
				}
			}
		}
		return sum;
	}

	private static List<Order> getOrderList(List<String> readedFromFile) {
		List<Order> allOrders = new ArrayList<Order>();
		
		for(String item:readedFromFile){
			String[] currentItemStrings = item.split(" ");
			allOrders.add(new Order(currentItemStrings[1], Double.parseDouble(currentItemStrings[0])));
		}
		return allOrders;
	}

	private static List<Product> parseStringToProduts(
			List<String> readedFromFile) {
		List<Product> allProducts = new ArrayList<Product>();
		
		for(String item:readedFromFile){
			String[] currentItemStrings = item.split(" ");
			allProducts.add(new Product(currentItemStrings[0], Double.parseDouble(currentItemStrings[1])));
		}
		
		
		return allProducts;
	}

	private static List<String> readStringFromFile(File fileName) {
        List<String> readFromFIle = new ArrayList<String>();
        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader br = new BufferedReader(reader);
            String line;
            while ((line = br.readLine()) != null) {
                readFromFIle.add(line);
            }
            br.close();
        } catch (IOException e){
            e.printStackTrace();
        }

        return readFromFIle;
    }

    private static void writeToFile(File fileName, double sum) {
        try {
            FileWriter writer = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            
            bufferedWriter.write("" + sum);
            bufferedWriter.newLine();
            
            bufferedWriter.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

}
