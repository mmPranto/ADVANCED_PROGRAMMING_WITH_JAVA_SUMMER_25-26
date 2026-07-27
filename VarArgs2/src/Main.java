public class Main {
    public static void main(String[] args){
        VarArgs a = new VarArgs();
        a.vaTest("One varargs:",10);
        a.vaTest("Two varargs:",1,2,3);
        a.vaTest("No varargs");
    }
}