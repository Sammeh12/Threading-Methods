public class ThreadingMethods extends Thread{
    public void run() 
    {
        try {
            System.out.println("Thread Sleep ends in 4 seconds.");
            Thread.sleep(4000);
            System.out.println("\n[Threads]");
            System.out.println("Thread for getState: "+getState());
            System.out.println("Thread for getName: "+getName());
            System.out.println("Thread for getPriority: "+getPriority());
            System.out.println("Thread for isAlive: "+isAlive());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        ThreadingMethods TM = new ThreadingMethods();
        TM.start();
    }
} 
