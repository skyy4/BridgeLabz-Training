public class LibrarySystem {

    static String[][] books={
        {"Effective Java","Joshua Bloch","Available"},
        {"Clean Code","Robert Martin","Available"},
        {"Java Basics","Herbert Schildt","Checked Out"},
        {"Data Structures","Narasimha","Available"}
    };

    static void displayBooks(){
        for(String[] b:books){
            System.out.println(b[0]+" | "+b[1]+" | "+b[2]);
        }
    }

    static void searchBook(String key){
        boolean found=false;
        for(String[] b:books){
            if(b[0].toLowerCase().contains(key.toLowerCase())){
                System.out.println("Found: "+b[0]+" | "+b[2]);
                found=true;
            }
        }
        if(!found)
            System.out.println("No book found");
    }

    static void checkoutBook(String title){
        for(String[] b:books){
            if(b[0].equalsIgnoreCase(title)){
                if(b[2].equals("Available")){
                    b[2]="Checked Out";
                    System.out.println("Book checked out");
                }else{
                    System.out.println("Book already checked out");
                }
                return;
            }
        }
        System.out.println("Book not found");
    }

    public static void main(String[] args){
        displayBooks();
        searchBook("java");
        checkoutBook("Effective Java");
        displayBooks();
    }
}

