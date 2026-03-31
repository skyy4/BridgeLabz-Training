interface Device {
    void on();

    void off();
}

class Light implements Device {
    public void on() {
        System.out.println("Light ON");
    }

    public void off() {
        System.out.println("Light OFF");
    }
}

class AC implements Device {
    public void on() {
        System.out.println("AC ON");
    }

    public void off() {
        System.out.println("AC OFF");
    }
}

class TV implements Device {
    public void on() {
        System.out.println("TV ON");
    }

    public void off() {
        System.out.println("TV OFF");
    }
}
