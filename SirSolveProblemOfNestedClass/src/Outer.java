public class Outer {
    public int x;
    public static int y;

    public Outer(){
        System.out.println("Default constructor Outer");
    }

    void test(){
        class NonStaticNestedClass{
            public NonStaticNestedClass(){
                System.out.println("Default constructor of NonStaticNestedClass");
            }

            void print(){
                System.out.println("Just a message");
            }
        }
        NonStaticNestedClass ns = new NonStaticNestedClass();
        ns.print();
    }

    static class StaticNestedClass{
        public StaticNestedClass(){
            System.out.println("Default constructor of StaticNestedClass");
        }
    }
}
