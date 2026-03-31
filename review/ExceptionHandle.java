import java.util.*;

public class ExceptionHandle {
    
    public void handling() {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException exc) {
            System.out.println("Caught NullPointerException" );       
        }  
} 
     public static void main(String[] args) {
        ExceptionHandle exc = new ExceptionHandle();
        exc.handling();
     } 
     }
