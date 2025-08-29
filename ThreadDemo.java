import java.lang.*;

// Extending Thread class
class ThreadDemo extends Thread 
{
    // run() method for the thread that is invoked as threads are started
    public void run()
    {
        System.out.println("Inside run method");
    }

    public static void main(String[] args)
    {
        // Main Thread Priority set to 6
        Thread.currentThread().setPriority(6);

        // Print and display main thread priority using getPriority() method of Thread class
        System.out.println("Main thread priority: "
                           + Thread.currentThread().getPriority());

        // Creting Thread inside Main Thread
        ThreadDemo t1 = new ThreadDemo();

        // t1 thread is child of main thread so t1 thread will also have priority 6

        System.out.println("t1 thread priority: " + t1.getPriority());
    }
}