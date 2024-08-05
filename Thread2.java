public class Thread2 extends Thread{
    @Override
    public void run(){
        if(this.isDaemon()){
            System.out.println("This thread is a Daemon thread");
        }else{
            System.out.println("This thread is a user thread");
        }
       
    }
}
