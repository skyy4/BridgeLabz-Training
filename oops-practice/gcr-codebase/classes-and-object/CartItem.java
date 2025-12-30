public class CartItem {
    private String name;
    private double price;
    private int qty;

    public CartItem(String name,double price,int qty){
        this.name=name;
        this.price=price;
        this.qty=qty;
    }

    public void add(int n){
        qty+=n;
    }

    public void remove(int n){
        qty-=n;
    }

    public void total(){
        System.out.println("Total cost: $"+(price*qty));
    }

    public static void main(String[] args){
        CartItem c=new CartItem("Laptop",999.99,1);
        c.add(2);
        c.remove(1);
        c.total();
    }
}

