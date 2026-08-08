public class Main{
    public static void main(String[] args){
        Gen<Integer> g1 = new Gen<>(new Integer[]{1,2,3,4,5});
        System.out.println(g1.avg());

        Gen<String> g2 = new Gen<>(new String[]{"x","Y","Z"});
        System.out.println(g2.avg());
    }
}