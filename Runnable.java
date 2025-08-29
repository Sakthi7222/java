import java.util.*;
public class Runnable{
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        t1.start(); // starts the thread and runs the run() method in MyRunnable
    }
}