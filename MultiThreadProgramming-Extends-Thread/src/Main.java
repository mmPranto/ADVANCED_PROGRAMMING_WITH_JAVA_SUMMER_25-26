public class Main{
    public static void main(String[] args)throws InterruptedException{
        MyThread t1 = new MyThread();
        t1.setName("Child1");
        MyThread t2 = new MyThread();
        t2.setName("Child2");
        MyThread t3 = new MyThread();
        t3.setName("Child3");

        t1.start();
//        t1.join();
        t2.start();
//        t2.join();
        t3.start();
//        t3.join();

        t1.join();
        t1.join();
        t1.join();

        System.out.println("Main Thread Exiting....");
    }
}