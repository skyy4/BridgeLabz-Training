class Book {
    String title;
    int year;

    public Book(String title,int year){
        this.title=title;
        this.year=year;
    }
}

public class Author extends Book {
    String name;

    public Author(String title,int year,String name){
        super(title,year);
        this.name=name;
    }

    void displayInfo(){
        System.out.println(title+" "+year+" "+name);
    }
}

