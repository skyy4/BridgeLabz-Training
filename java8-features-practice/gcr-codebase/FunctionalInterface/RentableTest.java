interface Rentable {
    void rent();

    void ret();
}

class Car implements Rentable {
    public void rent() {
        System.out.println("Car rented");
    }

    public void ret() {
        System.out.println("Car returned");
    }
}

class Bike implements Rentable {
    public void rent() {
        System.out.println("Bike rented");
    }

    public void ret() {
        System.out.println("Bike returned");
    }
}

class Bus implements Rentable {
    public void rent() {
        System.out.println("Bus rented");
    }

    public void ret() {
        System.out.println("Bus returned");
    }
}
