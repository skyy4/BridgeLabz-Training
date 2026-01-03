class Order {
    int orderId;

    public Order(int orderId){
        this.orderId=orderId;
    }

    String getOrderStatus(){
        return "Order Placed";
    }
}

class ShippedOrder extends Order {
    String track;

    public ShippedOrder(int id,String track){
        super(id);
        this.track=track;
    }

    @Override
    String getOrderStatus(){
        return "Order Shipped";
    }
}

public class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    public DeliveredOrder(int id,String track,String date){
        super(id,track);
        deliveryDate=date;
    }

    @Override
    String getOrderStatus(){
        return "Order Delivered";
    }
}

