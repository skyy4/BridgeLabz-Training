package com.addressbook;

import java.util.*;

// DAO LAYER
public class AddressBookDAO {

    HashMap<String, ArrayList<Contact>> bookMap = new HashMap<>();

    public void addBook(String name) {
        bookMap.putIfAbsent(name, new ArrayList<>());
    }

    public ArrayList<Contact> getBook(String name) {
        return bookMap.get(name);
    }

    public boolean addContact(String book, Contact c) {
        ArrayList<Contact> list = bookMap.get(book);
        if (list == null) {
            addBook(book);
            list = bookMap.get(book);
        }
        if (list.contains(c))
            return false;
        list.add(c);
        return true;
    }

    public Contact findContact(String book, String fname) {
        ArrayList<Contact> contacts = bookMap.get(book);
        if (contacts == null)
            return null;
        for (Contact c : contacts) {
            if (c.getFname().equalsIgnoreCase(fname))
                return c;
        }
        return null;
    }

    public boolean deleteContact(String book, String fname) {
        ArrayList<Contact> list = bookMap.get(book);
        if (list == null)
            return false;
        return list.removeIf(c -> c.getFname().equalsIgnoreCase(fname));
    }

    public HashMap<String, ArrayList<Contact>> getAll() {
        return bookMap;
    }
}
