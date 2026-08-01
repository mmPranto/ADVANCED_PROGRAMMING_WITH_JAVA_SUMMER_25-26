import static java.lang.Math.pow;

public class Main{
    public static void main(String[] args){
        //static import
        int i = MyClass.max(20,30);
        double j = pow(2,4);

        System.out.println("Max i = "+i);
        System.out.println("Power j = "+j);

    }
}