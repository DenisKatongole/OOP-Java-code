import java.util.Arrays;
import java.util.Random;

public class AQIAnalyzer {
    public static void main(String[] args) {
        int[] aqiReadings = new int[30];
        Random rand = new Random();
        int hazardousDays = 0;
        
        // Generate readings
        for (int i = 0; i < 30; i++) {
            aqiReadings[i] = rand.nextInt(300) + 1;
            if (aqiReadings[i] > 200) hazardousDays++;
        }
        
        Arrays.sort(aqiReadings);
        double median = (aqiReadings[14] + aqiReadings[15]) / 2.0;
        
        System.out.println("Median AQI: " + median);
        System.out.println("Hazardous Days: " + hazardousDays);
    }
}
