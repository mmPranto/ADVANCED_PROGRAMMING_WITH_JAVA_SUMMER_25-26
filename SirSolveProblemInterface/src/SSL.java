public class SSL implements BangladeshBank{

//    @Override
    public void process(int amount,String currency){
        System.out.println(amount+" in "+currency+" processed...");
        BangladeshBank.checkCurrency(currency);
    }
    public String getProvider(){
        return "SSL";
    }

}
