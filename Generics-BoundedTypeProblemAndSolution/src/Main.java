public class Main{
    public static void main(String[] args){
        Gen<Integer> g1 = new Gen<>(new Integer[]{1,2,3,4,5});
        System.out.println(g1.avg());

//        Gen<String> g2 = new Gen<>(new String[]{"x","Y","Z"});
//        System.out.println(g2.avg());
        Gen<Double> g2 = new Gen<>(new Double[]{5.00,4.00,3.00,2.00,1.00});
        System.out.println(g2.avg());

        Gen<Integer> g3 = new Gen<>(new Integer[]{5,4,3,2,1});
        System.out.println(g3.avg());

        boolean isSame = g1.isSameAvg(g2);
        if(isSame)
            System.out.println("Both are same");
        else
            System.out.println("Both are not same");





    }
}