public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }

    public void display(){
        System.out.println("Title of the book: "+title);
        System.out.println("Author of the book: "+author);
        System.out.println("Price of the book: "+price);
    }

    public static void main(String[] args){
        Book b1=new Book("2States","Chetan Bhagat",500);
        Book b2=new Book("Wings Of Fire","Abdul kalam.A.P.J",500);
        b1.display();
        b2.display();
    }
}

