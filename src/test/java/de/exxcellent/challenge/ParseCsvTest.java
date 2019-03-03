package de.exxcellent.challenge;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ParseCsvTest {

	List<String[]> dataList = new ArrayList<String[]>();
	
	@BeforeEach
	void setUp() throws Exception {
		String[] data1 = {"brand1", "10", "20"};
		String[] data2 = {"brand2", "-2", "10"};
		String[] data3 = {"brand3", "-15", "-25"};
		
		dataList.add(data1);
		dataList.add(data2);
		dataList.add(data3);
	}

	@AfterEach
	void tearDown() throws Exception {
		dataList.clear();
	}

	@Test
	void testParse() {
		ParseCsv parser = new ParseCsv();
		List<String[]> result = parser.parse();
		assertTrue(Arrays.equals(dataList.get(0), result.get(0)));
		assertTrue(Arrays.equals(dataList.get(1), result.get(1)));
		assertTrue(Arrays.equals(dataList.get(2), result.get(2)));
	}


}
