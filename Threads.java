public class Threads {
    public static void main(String[] args) throws InterruptedException {
        // threads- a thread is an execution in a program (like a virtual CPU)
        //          JVM allows the application to run multiple threads concurrent
        //          threads of higher priority are executed first before those with lower priority 

        System.out.println(Thread.activeCount()); //to count the number of threads that are running
        System.out.println(Thread.currentThread().getName()); //it gives the default name as output (ie main)
        Thread.currentThread().setName("Vyapti");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority()); //prints default priority of thread
        Thread.currentThread().setPriority(1);
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().isAlive());
        System.out.println();

        for(int i=3;i>0;i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Done!");
        System.out.println();

        Thread1 thread1= new Thread1();
        thread1.run();
        System.out.println(thread1.isAlive());
        System.out.println(thread1.getName());
        
        thread1.setDaemon(true);
        System.out.println(thread1.isDaemon());
        thread1.start();

        Thread2 thread2= new Thread2();
        thread2.setDaemon(true);
        System.out.println(thread2.isDaemon());
        thread2.run();

        //Daemon Thread- thread with low priority that runs in the background to perfom tasks such as garbage collection
        //JVM does not care if the daemon threads are running 
        //JVM terminates when the the non-daemon threads (ie user threads) finish their execution
    }
}
