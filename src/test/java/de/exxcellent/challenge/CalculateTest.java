package de.exxcellent.challenge;

import static org.junit.jupiter.api.Assertions.*;

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

}
