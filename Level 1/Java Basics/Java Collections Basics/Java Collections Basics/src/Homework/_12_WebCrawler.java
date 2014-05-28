package Homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class _12_WebCrawler {

	public static void main(String[] args) {
		Set<String> visited = new HashSet<String>();
		visited.add("https://softuni.bg/");
		try {
			List<String> urls = extractLinks("https://softuni.bg/");
			//chenge two to other number to search deepest
			for (int i = 0; i < 1; i++) {
				List<String> currentVisited = new ArrayList<String>();
				for (int j = 0; j < urls.size(); j++) {
					if (!visited.contains(urls.get(j))) {
						currentVisited.addAll(extractLinks(urls.get(j)));
						visited.add(urls.get(j));
					}
				}
			}
			writeToFile(new File("crawled-urls.txt"), visited);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("Finish");
	}

	public static List<String> extractLinks(String url) throws IOException {
		final ArrayList<String> result = new ArrayList<String>();
		try {
			Document doc = Jsoup.connect(url).get();

			Elements links = doc.select("a[href]");

			// href ...
			for (Element link : links) {
				result.add(link.attr("abs:href"));
			}
		} catch (UnsupportedMimeTypeException e) {
			
		} catch (HttpStatusException ess) {
			
		}

		return result;
	}
	
	private static void writeToFile(File fileName, Set<String> returnValue) {
        try {
            FileWriter writer = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            
            for(String intem:returnValue){
            	
    			 bufferedWriter.write(intem);
    			 bufferedWriter.newLine();
    			
    		}            
            
            bufferedWriter.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

}