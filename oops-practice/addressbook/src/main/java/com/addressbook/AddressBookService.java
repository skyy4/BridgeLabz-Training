package com.addressbook;

import java.util.*;

// SERVICE LAYER
public class AddressBookService {

    AddressBookDAO dao = new AddressBookDAO();

    // Adapter for test compatibility
    public boolean addContact(Contact c) {
        return addPerson("default", c);
    }

    // Adapter for test compatibility
    public Contact searchByName(String name) {
        return dao.findContact("default", name);
    }

    public void createBook(String name) {
        dao.addBook(name);
    }

    public boolean addPerson(String book, Contact c) {
        return dao.addContact(book, c);
    }

    public boolean editPerson(String book, String fname, String phone, String mail) {
        Contact c = dao.findContact(book, fname);
        if (c == null)
            return false;
        c.setPhone(phone);
        c.setMail(mail);
        return true;
    }

    public boolean deletePerson(String book, String fname) {
        return dao.deleteContact(book, fname);
    }

    public void sortByName(String book) {
        ArrayList<Contact> list = dao.getBook(book);
        if (list != null) {
            Collections.sort(list,
                    (a, b) -> a.getFname().compareToIgnoreCase(b.getFname()));
        }
    }

    public void searchByCityState(String val) {
        dao.getAll().values().forEach(list -> list.forEach(c -> {
            if ((c.getCity() != null && c.getCity().equalsIgnoreCase(val))
                    || (c.getState() != null && c.getState().equalsIgnoreCase(val)))
                System.out.println(c);
        }));
    }

    public void countByCityState() {
        HashMap<String, Integer> map = new HashMap<>();

        dao.getAll().values().forEach(list -> list.forEach(c -> {
            if (c.getCity() != null)
                map.put(c.getCity(), map.getOrDefault(c.getCity(), 0) + 1);
            if (c.getState() != null)
                map.put(c.getState(), map.getOrDefault(c.getState(), 0) + 1);
        }));

        map.forEach((k, v) -> System.out.println(k + " : " + v));
    }

    public ArrayList<Contact> getContacts(String book) {
        return dao.getBook(book);
    }
}
