public class Main{
    public static void main(String[] args) throws InterruptedException{
        Q q = new Q();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);

        p.t.start();
        c.t.start();

        System.out.println("Exit");
    }
}