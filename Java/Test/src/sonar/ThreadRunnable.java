package sonar;

public class ThreadRunnable implements Runnable
{   // Creating Threads Using a Runnable Interfaces  
    private Thread thr;
    private String name;

    public ThreadRunnable(String name)
    {
        this.name = name;
        System.out.println("The Thread called "+name+ "is being created.");
    }

    public void run()
    {
        System.out.println("The thread called "+name+" is being run.");

        try
        {
            for(int i= 4; i>0; i--)
            {
                System.out.println("Thread --" + name + " " + i);
                Thread.sleep(100);
            }
        }
        catch(InterruptedException ex)
        {
            System.out.println(name + " is interuppted");
        }

        System.out.println(name +" is stopping");

    }

    public void start()
    {
        System.out.println("starting the thread called "+ name);

        if(thr == null)
        {
            thr = new Thread(this, name);
            thr.start();
        }
    }
}