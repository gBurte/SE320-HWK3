import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class AirplaneNames {
    public static void main(String[] args) {
        TreeSet<String> uniqueAirplaneNames = new TreeSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader("src/airplane_names.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        uniqueAirplaneNames.add(word);
                    }
                }
            }

            System.out.println("Non-duplicate airplane names in ascending order:");
            for (String airplaneName : uniqueAirplaneNames) {
                System.out.println(airplaneName);
            }

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}