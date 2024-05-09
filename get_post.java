import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class HttpExample {

    // Method to perform a GET request
    public static String getRequest(String urlString) throws IOException {
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
        connection.disconnect();

        return response.toString();
    }

    // Method to perform a POST request
    public static String postRequest(String urlString, List<String> data) throws IOException {
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setDoOutput(true);

        OutputStream outputStream = connection.getOutputStream();
        for (String datum : data) {
            outputStream.write(datum.getBytes());
            outputStream.write("\n".getBytes()); // Assuming each data is on a new line
        }
        outputStream.flush();
        outputStream.close();

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();
        connection.disconnect();

        return response.toString();
    }

    public static void main(String[] args) {
        try {
            // Example usage of GET request
            String getResponse = getRequest("https://api.example.com/data");
            System.out.println("GET Response: " + getResponse);

            // Example usage of POST request
            List<String> postData = List.of("data1", "data2", "data3");
            String postResponse = postRequest("https://api.example.com/submit", postData);
            System.out.println("POST Response: " + postResponse);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
