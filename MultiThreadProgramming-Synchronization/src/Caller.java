public class Caller implements Runnable{
    String msg;
    Thread t;
    Callme target;

    public Caller(String msg,Callme target){
        this.msg=msg;
        this.target=target;
        this.t= new Thread(this);
    }

    public void run(){
        target.call(msg);
    }
}
