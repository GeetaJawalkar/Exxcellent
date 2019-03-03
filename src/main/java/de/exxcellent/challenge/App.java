package de.exxcellent.challenge;

import java.util.List;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

    /**
     * This is the main entry method of your program.
     * @param args The CLI arguments passed
     */
    public static void main(String... args) {

    	IParser parseCsv = new ParseCsv();
    	List<String[]> dataList = parseCsv.parse();
    	
    	Calculate calc = new Calculate();
    	String[] interested_params = {"Day", "MxT", "MnT"};
    	int[] indexes = calc.findIndexes(interested_params, dataList.get(0));
    	Result result = calc.calculateDiff(dataList, indexes);

        String dayWithSmallestTempSpread = result.tag;     // Your day analysis function call …
        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread, result.leastDiff);

        String teamWithSmallestGoalSpread = "A good team"; // Your goal analysis function call …
        System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);
    }
}
