public class Main{
    public static void main(String[] args) throws InterruptedException{
        MyThread t1 = new MyThread("Child1");
        MyThread t2 = new MyThread("Child2");
        MyThread t3 = new MyThread("Child3");

        t1.t.start();
//        t1.t.join();
        t2.t.start();
//        t2.t.join();
        t3.t.start();
//        t3.t.join();

        t1.t.join();
        t2.t.join();
        t3.t.join();

        System.out.println("Main Thread Exiting....");

    }
}