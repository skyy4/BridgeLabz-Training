public class MovieTicket {
    private String movie,seat;
    private double price;
    private boolean booked=false;

    public void book(String movie,String seat,double price){
        if(booked){
            System.out.println("House full!!! sorry..... Ticket already booked");
            return;
        }
        this.movie=movie;
        this.seat=seat;
        this.price=price;
        booked=true;
    }

    public void display(){
        if(!booked){
            System.out.println("Ticket have not booked yet....");
            return;
        }
        System.out.println("Ticket booked for movie: "+movie);
        System.out.println("Seat Number: "+seat);
        System.out.println("Price: $"+price);
    }

    public static void main(String[] args){
        MovieTicket t=new MovieTicket();
        t.display();
        t.book("Dragon","A10",120);
        t.book("Dragon","A10",120);
        t.display();
    }
}

