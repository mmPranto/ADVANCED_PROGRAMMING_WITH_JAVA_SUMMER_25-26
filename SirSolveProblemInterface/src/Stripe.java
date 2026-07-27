public class Stripe implements BangladeshBank{

    public void process(int amount,String currency){
        System.out.println(amount+" in "+currency+" processed... ");
    }

    public String getProvider(){
        return "Stripe";
    }

    public boolean validate(int amount){
        if(amount>0 && amount<500000)
            return true;
        return false;
    }
}
