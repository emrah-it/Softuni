//Problem 8.	Sum Numbers from a Text File
//Write a program to read a text file "Input.txt" holding a sequence of integer numbers, each
// at a separate line. Print the sum of the numbers at the console. Ensure you close correctly
// the file in case of exception or in case of normal execution. In case of exception (e.g. the
// file is missing), print "Error" as a result.

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class _8_SumNumbersFromTextFile {
	public static void main(String[] args) {
		int sum = 0;
		File fileName = new File("text.txt");
		try {
			FileWriter writer = new FileWriter(fileName);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);

			for (int i = 0; i < 10; i++) {
				bufferedWriter.write(i + "");
				bufferedWriter.newLine();
			}
			bufferedWriter.close();

			FileReader reader = new FileReader(fileName);
			BufferedReader br = new BufferedReader(reader);
			String line;
			while ((line = br.readLine()) != null) {
				sum += Integer.parseInt(line);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(sum);
	}
}
