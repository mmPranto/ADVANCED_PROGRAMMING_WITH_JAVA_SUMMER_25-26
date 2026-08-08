public class Main{
    public static void main(String[] args){
        MyInterface mi = (p1)->{
            System.out.println("My message "+p1);
        };
        mi.print("Java");

        MyInterface mi2 = (p1)-> System.out.println("My Message "+p1);
        mi2.print("C#");
    }
}

interface MyInterface{
    void print(String msg);
}

