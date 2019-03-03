package de.exxcellent.challenge;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class CalculateTest {

	@Test
	public void test_findIndex() {
		Calculate cal = new Calculate();
		
		String[] data0 = {"Day", "MxT", "MnT", "AvT","AvDP","1HrP"};
		String[] interested_params = {"Day", "MxT", "MnT"};
		int[] result = cal.findIndexes(interested_params, data0);
		
		assertEquals(0, result[0]);
		assertEquals(1, result[1]);
		assertEquals(2, result[2]);
	}
	
	@Test
	public void test_calculateDiff() {
		Calculate cal = new Calculate();
		
		String[] data0 = {"Day", "MxT", "MnT"};
		String[] data1 = {"Day1", "10", "20"};
		String[] data2 = {"Day2", "-2", "20"};
		
		List<String[]> dataList = new ArrayList<String[]>();
		dataList.add(data2);
		dataList.add(data1);
		
		int[] indexes = {0, 1, 2};
		Result result = cal.calculateDiff(dataList, indexes);
		assertEquals(10, (int)result.leastDiff);
		assertEquals("brand1", result.tag);
	}
}
