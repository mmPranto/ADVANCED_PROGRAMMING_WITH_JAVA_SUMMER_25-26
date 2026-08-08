public class MyThread implements Runnable{
    Thread t;

    public MyThread(String threadName){
        t=new Thread(this,threadName);
        System.out.println("Thread Created="+t.getName());
    }

    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Name="+t.getName()+" "+i);
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                System.out.println(t.getName()+ "interrupted");
            }
        }
    }
}
