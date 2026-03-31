package com.addressbook;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AddressBookServiceTest {

    @Test
    void addContactTest() {
        AddressBookService s = new AddressBookService();
        Contact c = new Contact("Amit", "Sharma", "Delhi", "9999999999");
        assertTrue(s.addContact(c));
    }

    @Test
    void searchContactTest() {
        AddressBookService s = new AddressBookService();
        Contact c = new Contact("Ravi", "Kumar", "Mumbai", "8888888888");
        s.addContact(c);
        assertNotNull(s.searchByName("Ravi"));
    }
}
