import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class LogParser {

    public static LinkedHashMap<String, Integer> countErrors() {
        Map<String, Integer> errorCounts = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("server.log"))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Check if the line strictly starts with the uppercase prefix
                if (line.startsWith("ERROR: ")) {
                    // Extract the error message and convert it to lowercase
                    String errorMsg = line.substring(7).toLowerCase();

                    // Increment the counter for this error
                    errorCounts.put(errorMsg, errorCounts.getOrDefault(errorMsg, 0) + 1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Sort the map by value in descending order and collect into a LinkedHashMap
        return errorCounts.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new
                ));
    }
}
