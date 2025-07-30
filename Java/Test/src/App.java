import sonar.ThreadRunnable;

public class App {
    // public static void main(String[] args) throws Exception {
    //     System.out.println("Hello, World!");
    // }

    public static void main(String[] args)
    {  // Creating Threads Using a Runnable Interfaces  
        ThreadRunnable thr1 = new ThreadRunnable("Awesome thrad");
        thr1.start();

        ThreadRunnable thr2 = new ThreadRunnable("Crazy thread");
        thr2.start();

    }
}
