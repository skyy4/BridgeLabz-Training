package AddressBook;

import java.util.Scanner;

// PRESENTATION LAYER
public class AddressBookMain {

    public static void main(String[] args) {

        // START
        System.out.println("Welcome to Address Book Program");

        Scanner sc = new Scanner(System.in);
        AddressBookService ser = new AddressBookService();

        // UC5: Create Address Book
        ser.createBook("MainBook");

        while (true) {
            System.out.println(
                    "\n1 Add 2 Edit 3 Delete 4 View 5 Sort 6 Search 7 Count 8 FileIO 0 Exit");
            int n = sc.nextInt();
            sc.nextLine();

            if (n == 0)
                break;

            // UC1
            if (n == 1) {
                System.out.print("First Name: ");
                String fn = sc.nextLine();
                System.out.print("Last Name: ");
                String ln = sc.nextLine();
                System.out.print("Address: ");
                String ad = sc.nextLine();
                System.out.print("City: ");
                String ct = sc.nextLine();
                System.out.print("State: ");
                String st = sc.nextLine();
                System.out.print("Zip: ");
                String zp = sc.nextLine();
                System.out.print("Phone: ");
                String ph = sc.nextLine();
                System.out.print("Email: ");
                String ml = sc.nextLine();

                boolean ok = ser.addPerson("MainBook",
                        new Contact(fn, ln, ad, ct, st, zp, ph, ml));
                System.out.println(ok ? "Added" : "Duplicate Found");
            }

            // UC2
            if (n == 2) {
                System.out.print("Name: ");
                String fn = sc.nextLine();
                System.out.print("New Phone: ");
                String ph = sc.nextLine();
                System.out.print("New Mail: ");
                String ml = sc.nextLine();
                System.out.println(
                        ser.editPerson("MainBook", fn, ph, ml)
                                ? "Updated"
                                : "Not Found");
            }

            // UC3
            if (n == 3) {
                System.out.print("Name: ");
                String fn = sc.nextLine();
                System.out.println(
                        ser.deletePerson("MainBook", fn)
                                ? "Deleted"
                                : "Not Found");
            }

            // UC4
            if (n == 4) {
                ser.getContacts("MainBook")
                        .forEach(System.out::println);
            }

            // UC10 & UC11: Sort
            if (n == 5) {
                System.out.println("1. Name 2. City 3. State 4. Zip");
                int sortChoice = sc.nextInt();
                sc.nextLine();
                switch (sortChoice) {
                    case 1: ser.sortByName("MainBook"); break;
                    case 2: ser.sortByCity("MainBook"); break;
                    case 3: ser.sortByState("MainBook"); break;
                    case 4: ser.sortByZip("MainBook"); break;
                }
                System.out.println("Sorted");
            }

            // UC8
            if (n == 6) {
                System.out.print("City or State: ");
                ser.searchByCityState(sc.nextLine());
            }

            // UC9
            if (n == 7) {
                ser.countByCityState();
            }

            // UC12, UC13, UC14, UC15, UC16, UC18: File IO & Server & DB
            if (n == 8) {
                System.out.println("1. Text Write 2. Text Read 3. CSV Write 4. CSV Read 5. JSON Write 6. JSON Read 7. Server Write 8. Server Read 9. DB Write 10. DB Read");
                int ioChoice = sc.nextInt();
                sc.nextLine();
                switch (ioChoice) {
                    case 1: ser.writeData("MainBook"); break;
                    case 2: ser.readData(); break;
                    case 3: ser.writeCSV("MainBook"); break;
                    case 4: ser.readCSV(); break;
                    case 5: ser.writeJSON("MainBook"); break;
                    case 6: ser.readJSON(); break;
                    case 7: ser.writeToJSONServer("MainBook"); break;
                    case 8: ser.readFromJSONServer(); break;
                    case 9: ser.writeToDB("MainBook"); break;
                    case 10: ser.readFromDB(); break;
                }
            }
        }
        sc.close();
    }
}
