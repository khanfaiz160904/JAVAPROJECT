package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Pr13 {
    public static void main(String[] args) throws Exception {
        String apiKey = "88b41d6cab932d8cc382f9d27eeeef06";
        String city = "sakinaka";
        String urlString = "http://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey + "&units=metric";

        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            // Parse JSON response to extract temperature
            String json = response.toString();
            double temperature = extractTemperature(json);
            System.out.println("Current Temperature in " + city + ": " + temperature + "°C");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static double extractTemperature(String json) {
        // Parse JSON to extract temperature (implementation depends on the JSON library used)
        // Here, you can use any JSON parsing library like Jackson, Gson, or org.json
        // For simplicity, let's assume the temperature is stored in a field called "temp"
        // For example, using org.json:
        // JSONObject jsonObject = new JSONObject(json);
        // return jsonObject.getJSONObject("main").getDouble("temp");

        // For demonstration purposes, let's assume a fixed temperature
        return 25.0; // Replace with actual temperature extraction logic
    }
}
