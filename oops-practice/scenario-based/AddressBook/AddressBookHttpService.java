package AddressBook;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class AddressBookHttpService {

    private static final String BASE_URL = "http://localhost:3000/contacts";
    private final HttpClient client;

    public AddressBookHttpService() {
        this.client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .connectTimeout(Duration.ofSeconds(10))
                .build();
    }

    public void readData() {
        List<Contact> contactList = new ArrayList<>();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL))
                .GET()
                .build();
        
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() == 200) {
                String json = response.body();
                // Extremely simple manual JSON parser
                // Assumes format: [ { ... }, { ... } ]
                // Removing brackets
                json = json.trim();
                if (json.startsWith("[")) json = json.substring(1);
                if (json.endsWith("]")) json = json.substring(0, json.length() - 1);
                
                String[] objects = json.split("},\\s*\\{");
                for (String obj : objects) {
                    obj = obj.replace("{", "").replace("}", "");
                    String[] fields = obj.split(",\n"); 
                    // This splitting is fragile and depends on exact JSON formatting from server
                    // A more robust manual parser logic:
                    
                    String fname = extractValue(obj, "fname");
                    String lname = extractValue(obj, "lname");
                    String addr = extractValue(obj, "address"); // JSON server usage checking
                    // If we control the JSON server, we should match our fields.
                    // Assuming fields match Contact class
                    
                    if (fname != null) { 
                       // Minimal construction, other fields might be null if parsing fails
                       // For simplicity in this demo, we might just print usage
                    }
                }
                System.out.println("Data retrieved from JSON Server:\n" + response.body());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String extractValue(String json, String key) {
        String pattern = "\"" + key + "\":";
        int start = json.indexOf(pattern);
        if (start == -1) return null;
        start += pattern.length();
        
        // Find start of value
        while(start < json.length() && (json.charAt(start) == ' ' || json.charAt(start) == '"')) {
            start++;
        }
        
        int end = json.indexOf("\"", start);
        if (end == -1) end = json.indexOf(",", start);
        if (end == -1) end = json.length();
        
        return json.substring(start, end).replace("\"", "").trim();
    }

    public void writeData(List<Contact> contactList) {
        contactList.forEach(c -> {
            String json = String.format("{\"fname\": \"%s\", \"lname\": \"%s\", \"city\": \"%s\", \"state\": \"%s\", \"zip\": \"%s\", \"phone\": \"%s\", \"mail\": \"%s\"}",
                    c.getFname(), c.getLname(), c.getCity(), c.getState(), c.getZip(), c.getPhone(), c.getMail());
            
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(BASE_URL))
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(json))
                    .build();
            
            try {
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                System.out.println("Posted person: " + c.getFname() + " -> Status: " + response.statusCode());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
