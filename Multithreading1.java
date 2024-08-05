public class Multithreading1 extends Thread{
    @Override
    public void run(){
        for(int i=10;i>0;i++){
             System.out.println("Thread 1: "+i);
             try{
                Thread.sleep(500);
             } 
             catch(InterruptedException e){
                 e.getMessage();
             }
        }
        System.out.println("Thread 1 is finished");
    }
}
