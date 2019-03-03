package de.exxcellent.challenge;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParseCsv implements IParser {

	@Override
	public List<String[]> parse(String filename) {

		File file = new File(filename);
		List<String[]> dataList = new ArrayList<String[]>();
		
		try {
			Scanner inputFromCsv = new Scanner(file); 				//Scans the Csv file			
			
			while(inputFromCsv.hasNext()) {							//for every existing line
				String data = inputFromCsv.next();					//Reads one line
				data = data.replace("\"", "");						//Removes the unwanted double quotes
				String[] dataString = data.split(",");				//Splits the line column-wise					
				dataList.add(dataString);								
			}
			inputFromCsv.close();	
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return dataList;
	}

}
