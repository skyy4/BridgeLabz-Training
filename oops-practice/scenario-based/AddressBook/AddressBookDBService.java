package AddressBook;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AddressBookDBService {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/address_book_service";
    private static final String USER = "root";
    private static final String PASS = "password"; // Placeholder

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, USER, PASS);
    }

    public List<Contact> readData() {
        List<Contact> contactList = new ArrayList<>();
        String query = "SELECT * FROM address_book";

        try (Connection con = getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                Contact c = new Contact(
                    rs.getString("fname"),
                    rs.getString("lname"),
                    rs.getString("address"),
                    rs.getString("city"),
                    rs.getString("state"),
                    rs.getString("zip"),
                    rs.getString("phone"),
                    rs.getString("email")
                );
                // Ideally set ID too if available
                // c.setId(rs.getInt("id"));
                contactList.add(c);
            }
            System.out.println("Data retrieved from Database.");
            contactList.forEach(System.out::println);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contactList;
    }

    public void writeData(List<Contact> contactList) {
        String query = "INSERT INTO address_book (fname, lname, address, city, state, zip, phone, email) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (Connection con = getConnection();
             PreparedStatement pstmt = con.prepareStatement(query)) {
            
            con.setAutoCommit(false); // Transaction functionality
            
            for (Contact c : contactList) {
                pstmt.setString(1, c.getFname());
                pstmt.setString(2, c.getLname());
                pstmt.setString(3, c.getAddr());
                pstmt.setString(4, c.getCity());
                pstmt.setString(5, c.getState());
                pstmt.setString(6, c.getZip());
                pstmt.setString(7, c.getPhone());
                pstmt.setString(8, c.getMail());
                pstmt.addBatch();
            }
            
            int[] updateCounts = pstmt.executeBatch();
            con.commit();
            System.out.println("Data successfully written to Database. Records affected: " + updateCounts.length);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
