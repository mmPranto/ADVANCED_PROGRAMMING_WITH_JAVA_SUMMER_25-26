public class Main{
    public static void main(String[] args){
        BangladeshBank ssl = new SSL();
        ssl.process(100,"USD");
        ssl= new Bkash();
        ssl.process(200,"USD");
        ssl=new Stripe();
        ssl.process(300,"BDT");
    }
}