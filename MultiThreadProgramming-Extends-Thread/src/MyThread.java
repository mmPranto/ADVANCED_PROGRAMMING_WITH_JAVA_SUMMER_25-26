public class MyThread extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Name="+Thread.currentThread()+" "+i);
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                System.out.println(Thread.currentThread()+" interrupted");
            }
        }
    }
}
