interface Export {
    void csv();

    default void json() {
        System.out.println("JSON");
    }
}
