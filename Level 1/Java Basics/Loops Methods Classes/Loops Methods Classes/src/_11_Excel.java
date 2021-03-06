import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class _11_Excel {

	public static Map<String, Double> readXLSXFile(String fileName)
			throws IOException {
		Map<String, Double> dicMap = new HashMap<String, Double>();
		InputStream ExcelFileToRead = new FileInputStream(fileName);
		XSSFWorkbook wb = new XSSFWorkbook(ExcelFileToRead);

		XSSFWorkbook test = new XSSFWorkbook();

		XSSFSheet sheet = wb.getSheetAt(0);
		XSSFRow row;
		XSSFCell cell;

		Iterator rows = sheet.rowIterator();
		while (rows.hasNext()) {
			row = (XSSFRow) rows.next();
			Iterator cells = row.cellIterator();
			while (cells.hasNext()) {
				cell = (XSSFCell) cells.next();

				if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING) {
					String valueOfCell = cell.getStringCellValue();
					if (valueOfCell.equals("Office")) {
						break;
					} else {
						cell = (XSSFCell) cells.next();
						if (dicMap.containsKey(valueOfCell)) {
							String readeNumber = cell.getNumericCellValue()
									+ "";
							double valueOfKey = Double.parseDouble(readeNumber);
							dicMap.put(valueOfCell, dicMap.get(valueOfCell)
									+ valueOfKey);
						} else {
							String readeNumber = cell.getNumericCellValue()
									+ "";
							double valueOfKey = Double.parseDouble(readeNumber);
							dicMap.put(valueOfCell, valueOfKey);
						}
					}
				}
			}
		}
		return dicMap;

	}

	public static void main(String[] args) throws IOException {

		// writeXLSXFile();
		int a = 10;

		Map returnValue = readXLSXFile("Test.xlsx");
		File fileName = new File("totalValue.txt");
		writeToFile(fileName, returnValue);

		
	}
	
	private static void writeToFile(File fileName, Map returnValue) {
        try {
            FileWriter writer = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            
            Set<Entry> entries = returnValue.entrySet();
    		for (Entry<String, Double> entry : entries) {
    			 bufferedWriter.write(entry.getKey() + " Total -> " + entry.getValue());
    			 bufferedWriter.newLine();
    			
    		}            
            
            bufferedWriter.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
