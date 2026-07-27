public class Bkash implements BangladeshBank{

    public void process(int amount,String currency){
        System.out.println(amount+" in "+currency+" processed...");
    }

    public String getProvider(){
        return "Bkash";
    }


}
