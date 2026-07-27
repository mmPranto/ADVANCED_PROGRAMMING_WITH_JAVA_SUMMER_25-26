public class Main {
    public static void main(String[] args){
        Outer.StaticNestedClass a = new Outer.StaticNestedClass();

        Outer o = new Outer();
        o.test();
    }
}