public class CartProduct {
    private String productName;
    private double price;
    private int qty;
    private final String productID;
    private static double discount=10;

    public CartProduct(String productID,String productName,double price,int qty){
        this.productID=productID;
        this.productName=productName;
        this.price=price;
        this.qty=qty;
    }

    public static void updateDiscount(double d){
        discount=d;
    }

    public void display(Object obj){
        if(obj instanceof CartProduct){
            double finalPrice=price-(price*discount/100);
            System.out.println("Product ID: "+productID);
            System.out.println("Product Name: "+productName);
            System.out.println("Price: $"+price);
            System.out.println("Quantity: "+qty);
            System.out.println("Discount: "+discount+"%");
            System.out.println("Price after Discount: $"+finalPrice);
        }
    }

    public static void main(String[] args){
        CartProduct p1=new CartProduct("P001","Laptop",1200,5);
        CartProduct p2=new CartProduct("P002","Smartphone",800,10);
        p1.display(p1);
        p2.display(p2);
    }
}

