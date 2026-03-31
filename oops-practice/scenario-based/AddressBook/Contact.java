package AddressBook;

import java.util.Objects;

// MODEL LAYER
// UC1: Create contact with required details
// UC6 & UC7: Duplicate check
// UC10: Display contact details
public class Contact {

    private int id;
    private String fname;
    private String lname;
    private String addr;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private String mail;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Contact(String fname, String lname, String addr, String city,
            String state, String zip, String phone, String mail) {
        this.fname = fname;
        this.lname = lname;
        this.addr = addr;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.mail = mail;
    }

    public String getFname() {
        return fname;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getLname() {
        return lname;
    }

    public String getAddr() {
        return addr;
    }

    public String getPhone() {
        return phone;
    }

    public String getMail() {
        return mail;
    }

    // UC7: Override equals to avoid duplicate by name
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Contact c = (Contact) o;
        return fname.equalsIgnoreCase(c.fname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fname.toLowerCase());
    }

    // UC10: Used while printing
    @Override
    public String toString() {
        return fname + " " + lname + " | " + city + " | " + state + " | " + zip + " | " + phone;
    }
}
