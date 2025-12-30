public class Item {
    private String code,name;
    private double price;

    public Item(String code,String name,double price){
        this.code=code;
        this.name=name;
        this.price=price;
    }

    public void display(){
        System.out.println("itemCode : "+code);
        System.out.println("itemPrice : "+price);
        System.out.println("itemName : "+name);
        System.out.println("----------------------------");
    }

    public static void main(String[] args){
        Item i1=new Item("01AA","Water bottle",500);
        Item i2=new Item("01BB","Rice",700);
        Item i3=new Item("02AA","blackboard",400);
        i1.display();
        i2.display();
        i3.display();
    }
}

