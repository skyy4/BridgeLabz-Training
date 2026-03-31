package FoodDeliverySystem;

import java.util.*;

class Order {
    int id;

    Order(int id) {
        this.id = id;
    }
}

class Agent {
    String n;
    boolean free = true;

    Agent(String n) {
        this.n = n;
    }
}

class NoAgentAvailableException extends Exception {
    NoAgentAvailableException(String m) {
        super(m);
    }
}

class DeliveryService {
    Queue<Order> oq = new LinkedList<>();
    List<Agent> al = new ArrayList<>();

    void addOrder(Order o) {
        oq.add(o);
    }

    void addAgent(Agent a) {
        al.add(a);
    }

    void assign() throws NoAgentAvailableException {
        for (Agent a : al) {
            if (a.free && !oq.isEmpty()) {
                Order o = oq.poll();
                a.free = false;
                System.out.println("Order " + o.id + " assigned to " + a.n);
                return;
            }
        }
        throw new NoAgentAvailableException("No agent available");
    }
}

public class FoodDelivery {
    public static void main(String[] a) {
        try {
            DeliveryService d = new DeliveryService();
            d.addAgent(new Agent("A1"));
            d.addOrder(new Order(101));
            d.assign();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
