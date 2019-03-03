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
    	Calculate calc = new Calculate();
    	
    	List<String[]> dataListWeather = parseCsv.parse("src/main/resources/de/exxcellent/challenge/weather.csv");
    	String[] weather_params = {"Day", "MxT", "MnT"};
    	int[] weather_indexes = calc.findIndexes(weather_params, dataListWeather.get(0));
    	Result weather_result = calc.calculateDiff(dataListWeather, weather_indexes);

        String dayWithSmallestTempSpread = weather_result.tag;     // Your day analysis function call …
        System.out.printf("Day with smallest temperature spread : %s with difference of %d %n", dayWithSmallestTempSpread, weather_result.leastDiff);

        List<String[]> dataListFootball = parseCsv.parse("src/main/resources/de/exxcellent/challenge/football.csv");
    	String[] football_params = {"Team", "Goals", "GoalsAllowed"};
    	int[] football_indexes = calc.findIndexes(football_params, dataListFootball.get(0));
    	Result football_result = calc.calculateDiff(dataListFootball, football_indexes);
        
        String teamWithSmallestGoalSpread = football_result.tag; // Your goal analysis function call …
        System.out.printf("Team with smallest goal spread       : %s with difference of %d %n", teamWithSmallestGoalSpread, football_result.leastDiff);
    }
}
