class Job {
    public static void main(String[] a) {
        Runnable r = () -> System.out.println("Job done");
        new Thread(r).start();
    }
}
