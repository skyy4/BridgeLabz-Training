public class LibraryBook {
    private String title,author;
    private final String isbn;
    private static String libraryName="Egmore Library";

    public LibraryBook(String title,String author,String isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }

    public static void displayLibraryName(){
        System.out.println("Library Name: "+libraryName);
    }

    public void display(Object obj){
        if(obj instanceof LibraryBook){
            System.out.println("Title: "+title);
            System.out.println("Author: "+author);
            System.out.println("ISBN: "+isbn);
        }
    }

    public static void main(String[] args){
        LibraryBook b=new LibraryBook("Effective Java","Joshua Bloch","978-0134685991");
        LibraryBook.displayLibraryName();
        b.display(b);
    }
}

