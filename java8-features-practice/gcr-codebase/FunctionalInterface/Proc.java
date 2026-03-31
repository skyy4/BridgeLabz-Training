interface Proc {
    void pay();

    default void refund() {
        System.out.println("Refunded");
    }
}
