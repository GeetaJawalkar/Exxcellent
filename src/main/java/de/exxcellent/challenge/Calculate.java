package de.exxcellent.challenge;

import java.util.Arrays;
import java.util.List;

class Result{
	public final Integer leastDiff;
	public final String tag;
	public Result(Integer diff, String name) {
		this.leastDiff = diff;
		this.tag = name;
	}
}

public class Calculate {

	int[] findIndexes(String[] interested_params, String[] firstLine) {
		
		int par1 = Arrays.asList(firstLine).indexOf(interested_params[0] );
		int par2 = Arrays.asList(firstLine).indexOf(interested_params[1] );
		int par3 = Arrays.asList(firstLine).indexOf(interested_params[2] );

		int[] result = {par1, par2, par3};
		return result;
	}
	
	
	Result calculateDiff(List<String[]> dataList, int[] indexes) {
		
		Integer diff, minDiff = 0;
		String minDiffVar=null;

		int key0 = indexes[0];
		int key1 = indexes[1];
		int key2 = indexes[2];
		
		String[] dataString = dataList.get(key0);

		diff = Math.abs( Integer.valueOf(dataString[key1]) - Integer.valueOf(dataString[key2]) );
		minDiff = diff;
		
		for (int i = 1; i < dataList.size(); i++) {
			
		    dataString = dataList.get(i);
		    diff = Math.abs( Integer.valueOf(dataString[key1]) - Integer.valueOf(dataString[key2]) );
		    
		    if(diff<minDiff) {		    	
		    	minDiff = diff; 
		    	minDiffVar = dataString[0];	    	
		    } 	   
		}

		return new Result(minDiff, minDiffVar);
	}
}
