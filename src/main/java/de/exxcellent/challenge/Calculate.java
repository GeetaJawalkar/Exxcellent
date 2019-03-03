package de.exxcellent.challenge;

import java.util.Arrays;

public class Calculate {

	int[] findIndexes(String[] interested_params, String[] firstLine) {
		
		int par1 = Arrays.asList(firstLine).indexOf(interested_params[0] );
		int par2 = Arrays.asList(firstLine).indexOf(interested_params[1] );
		int par3 = Arrays.asList(firstLine).indexOf(interested_params[2] );
		System.out.println(par1 + " " +  par2 + " " + par3);
		
		int[] result = {par1, par2, par3};
		return result;
	}
}
