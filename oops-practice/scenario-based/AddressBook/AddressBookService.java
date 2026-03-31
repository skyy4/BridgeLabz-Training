package AddressBook;

import java.util.*;

// SERVICE LAYER
public class AddressBookService {

    AddressBookDAO dao = new AddressBookDAO();

    // UC5: Create Address Book
    public void createBook(String name) {
        dao.addBook(name);
    }

    // UC1 & UC6
    public boolean addPerson(String book, Contact c) {
        return dao.addContact(book, c);
    }

    // UC2: Edit contact
    public boolean editPerson(String book, String fname, String phone, String mail) {
        Contact c = dao.findContact(book, fname);
        if (c == null)
            return false;
        c.setPhone(phone);
        c.setMail(mail);
        return true;
    }

    // UC3: Delete contact
    public boolean deletePerson(String book, String fname) {
        return dao.deleteContact(book, fname);
    }

    // UC10: Sort alphabetically
    public void sortByName(String book) {
        ArrayList<Contact> list = dao.getBook(book);
        Collections.sort(list,
                (a, b) -> a.getFname().compareToIgnoreCase(b.getFname()));
    }

    // UC8: Search by city or state across address books
    public void searchByCityState(String val) {
        dao.getAll().values().forEach(list -> list.forEach(c -> {
            if (c.getCity().equalsIgnoreCase(val)
                    || c.getState().equalsIgnoreCase(val))
                System.out.println(c);
        }));
    }

    // UC9: Count by city or state
    public void countByCityState() {
        HashMap<String, Integer> map = new HashMap<>();

        dao.getAll().values().forEach(list -> list.forEach(c -> {
            map.put(c.getCity(),
                    map.getOrDefault(c.getCity(), 0) + 1);
            map.put(c.getState(),
                    map.getOrDefault(c.getState(), 0) + 1);
        }));

        map.forEach((k, v) -> System.out.println(k + " : " + v));
    }

    AddressBookFileIOService fileIO = new AddressBookFileIOService();

    // UC11: Sort by City
    public void sortByCity(String book) {
        ArrayList<Contact> list = dao.getBook(book);
        Collections.sort(list, (a, b) -> a.getCity().compareToIgnoreCase(b.getCity()));
    }

    // UC11: Sort by State
    public void sortByState(String book) {
        ArrayList<Contact> list = dao.getBook(book);
        Collections.sort(list, (a, b) -> a.getState().compareToIgnoreCase(b.getState()));
    }

    // UC11: Sort by Zip
    public void sortByZip(String book) {
        ArrayList<Contact> list = dao.getBook(book);
        Collections.sort(list, (a, b) -> a.getZip().compareToIgnoreCase(b.getZip()));
    }

    // UC12: File IO
    public void writeData(String book) {
        new Thread(() -> {
            fileIO.writeData(dao.getBook(book));
        }).start();
    }

    public void readData() {
        fileIO.readData();
    }

    // UC13: CSV IO
    public void writeCSV(String book) {
        new Thread(() -> {
            fileIO.writeCSV(dao.getBook(book));
        }).start();
    }

    public void readCSV() {
        fileIO.readCSV();
    }

    // UC14: JSON IO
    public void writeJSON(String book) {
        new Thread(() -> {
            fileIO.writeJSON(dao.getBook(book));
        }).start();
    }

    public void readJSON() {
        fileIO.readJSON();
    }

    AddressBookHttpService httpService = new AddressBookHttpService();

    // UC15 & UC16: JSON Server
    public void readFromJSONServer() {
        httpService.readData();
    }

    public void writeToJSONServer(String book) {
        new Thread(() -> {
            httpService.writeData(dao.getBook(book));
        }).start();
    }

    AddressBookDBService dbService = new AddressBookDBService();

    // UC18: Database Integration
    public void readFromDB() {
        dbService.readData();
    }

    public void writeToDB(String book) {
        new Thread(() -> {
            dbService.writeData(dao.getBook(book));
        }).start();
    }

    // UC4: View all contacts
    public ArrayList<Contact> getContacts(String book) {
        return dao.getBook(book);
    }

}
