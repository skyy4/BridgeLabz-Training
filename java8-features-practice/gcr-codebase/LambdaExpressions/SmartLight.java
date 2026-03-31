import java.util.*;

interface Act {
    void run();
}

class SmartLight {
    public static void main(String[] a) {
        Act motion = () -> System.out.println("Lights ON - Motion");
        Act night = () -> System.out.println("Dim Lights - Night");
        Act voice = () -> System.out.println("Lights ON - Voice");
        motion.run();
        night.run();
        voice.run();
    }
}
