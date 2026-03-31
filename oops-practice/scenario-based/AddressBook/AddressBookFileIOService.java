package AddressBook;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class AddressBookFileIOService {

    public static String TXT_FILE = "addressbook.txt";
    public static String CSV_FILE = "addressbook.csv";
    public static String JSON_FILE = "addressbook.json";

    // --- TXT Operations ---
    public void writeData(List<Contact> employeePayrollList) {
        StringBuffer empBuffer = new StringBuffer();
        employeePayrollList.forEach(emp -> {
            String empDataString = emp.toString().concat("\n");
            empBuffer.append(empDataString);
        });
        try {
            Files.write(Paths.get(TXT_FILE), empBuffer.toString().getBytes());
            System.out.println("Data Successfully written to " + TXT_FILE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readData() {
        try {
            Files.lines(new File(TXT_FILE).toPath())
                    .map(String::trim)
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // --- CSV Operations (Manual) ---
    public void writeCSV(List<Contact> contactList) {
        StringBuilder csvBuilder = new StringBuilder();
        // Header
        csvBuilder.append("FirstName,LastName,Address,City,State,Zip,Phone,Email\n");
        
        for (Contact c : contactList) {
            csvBuilder.append(c.getFname()).append(",")
                      .append(c.getLname()).append(",")
                      .append(c.getAddr()).append(",")
                      .append(c.getCity()).append(",")
                      .append(c.getState()).append(",")
                      .append(c.getZip()).append(",")
                      .append(c.getPhone()).append(",")
                      .append(c.getMail()).append("\n");
        }

        try {
            Files.write(Paths.get(CSV_FILE), csvBuilder.toString().getBytes());
            System.out.println("Data Successfully written to " + CSV_FILE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readCSV() {
        try {
            List<String> lines = Files.readAllLines(Paths.get(CSV_FILE));
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // --- JSON Operations (Manual) ---
    public void writeJSON(List<Contact> contactList) {
        StringBuilder jsonBuilder = new StringBuilder();
        jsonBuilder.append("[\n");
        
        for (int i = 0; i < contactList.size(); i++) {
            Contact c = contactList.get(i);
            jsonBuilder.append("  {\n");
            jsonBuilder.append("    \"fname\": \"").append(c.getFname()).append("\",\n");
            jsonBuilder.append("    \"lname\": \"").append(c.getLname()).append("\",\n");
            jsonBuilder.append("    \"city\": \"").append(c.getCity()).append("\",\n");
            jsonBuilder.append("    \"state\": \"").append(c.getState()).append("\",\n");
            jsonBuilder.append("    \"zip\": \"").append(c.getZip()).append("\"\n");
            jsonBuilder.append("  }");
            if (i < contactList.size() - 1) {
                jsonBuilder.append(",");
            }
            jsonBuilder.append("\n");
        }
        jsonBuilder.append("]");

        try {
            Files.write(Paths.get(JSON_FILE), jsonBuilder.toString().getBytes());
            System.out.println("Data Successfully written to " + JSON_FILE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readJSON() {
        try {
            String content = new String(Files.readAllBytes(Paths.get(JSON_FILE)));
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
