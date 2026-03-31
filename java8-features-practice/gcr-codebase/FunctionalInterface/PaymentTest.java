interface Pay {
    void pay(double a);
}

class UPI implements Pay {
    public void pay(double a) {
        System.out.println("UPI " + a);
    }
}

class Card implements Pay {
    public void pay(double a) {
        System.out.println("Card " + a);
    }
}

class Wallet implements Pay {
    public void pay(double a) {
        System.out.println("Wallet " + a);
    }
}
