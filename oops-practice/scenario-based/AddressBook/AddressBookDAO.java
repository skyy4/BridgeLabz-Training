package AddressBook;

import java.util.*;

// DAO LAYER
// UC4: Store multiple contacts using ArrayList
// UC5: Store multiple address books using HashMap
public class AddressBookDAO {

    // UC5: AddressBookName → List of Contacts
    HashMap<String, ArrayList<Contact>> bookMap = new HashMap<>();

    public void addBook(String name) {
        bookMap.putIfAbsent(name, new ArrayList<>());
    }

    public ArrayList<Contact> getBook(String name) {
        return bookMap.get(name);
    }

    // UC1 & UC6: Add contact with duplicate check
    public boolean addContact(String book, Contact c) {
        ArrayList<Contact> list = bookMap.get(book);
        if (list.contains(c))
            return false;
        list.add(c);
        return true;
    }

    // UC2: Find contact for edit
    public Contact findContact(String book, String fname) {
        for (Contact c : bookMap.get(book)) {
            if (c.getFname().equalsIgnoreCase(fname))
                return c;
        }
        return null;
    }

    // UC3: Delete contact by name
    public boolean deleteContact(String book, String fname) {
        ArrayList<Contact> list = bookMap.get(book);
        return list.removeIf(c -> c.getFname().equalsIgnoreCase(fname));
    }

    public HashMap<String, ArrayList<Contact>> getAll() {
        return bookMap;
    }
}
