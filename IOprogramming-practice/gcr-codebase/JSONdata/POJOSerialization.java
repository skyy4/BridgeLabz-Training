import com.fasterxml.jackson.databind.*;

class Car {
    public String b;
    public int y;

    Car(String b, int y) {
        this.b = b;
        this.y = y;
    }
}

public class POJOSerialization {
    public static void main(String[] a) throws Exception {
        ObjectMapper m = new ObjectMapper();
        System.out.println(m.writeValueAsString(new Car("BMW", 2022)));
    }
}
