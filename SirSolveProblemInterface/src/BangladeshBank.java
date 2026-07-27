public interface BangladeshBank {
    void process(int amount,String currency);
    String getProvider();

    default boolean validate(int amount){
        log("Start Validate...");
        if(amount>0 && amount<100000){
            log("End Validating...");
            return true;
        }
        log("End Validating...");
        return false;
    }

    private void log(String msg){
        System.out.println(msg);
    }

    static boolean checkCurrency(String curr){
        String[] currencies= new String[]{"USD","BDT"};
        for(var c:currencies){
            if(c.equals(curr))
                return true;
        }
        return false;
    }



}
