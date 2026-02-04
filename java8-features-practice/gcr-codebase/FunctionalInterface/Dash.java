interface Dash {
    void speed();

    default void battery() {
        System.out.println("Battery 80%");
    }
}
