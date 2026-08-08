import java.sql.SQLOutput;

public class Q {
    int n;
    boolean flag = false;

    synchronized int get(){
        while(!flag){
            try{
                wait();
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Got:"+n);
        flag=false;
        notify();
        return n;
    }

    synchronized void put(int n){
        while(flag){
            try{
                wait();
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
        this.n=n;
        flag=true;
        System.out.println("Put:"+n);
        notify();
    }
}
