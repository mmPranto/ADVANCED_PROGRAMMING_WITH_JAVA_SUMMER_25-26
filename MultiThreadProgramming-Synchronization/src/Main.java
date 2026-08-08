public class Main{
    public static void main(String[] args)throws InterruptedException{
        Callme target = new Callme();
        Caller ob1 = new Caller("Hello",target);
        Caller ob2 = new Caller("Synchronized",target);
        Caller ob3 = new Caller("World",target);

        ob1.t.start();
//        ob1.t.join();
        ob2.t.start();
//        ob2.t.join();
        ob3.t.start();
//        ob3.t.join();

        ob1.t.join();
        ob2.t.join();
        ob3.t.join();

        System.out.println("Main Finished");
    }
}