import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main{
    public static void main(String[] args){
        List<String> names = new CopyOnWriteArrayList<>();
        names.add("A");
        names.add("B");
        names.add("C");

        for(String s:names){
            System.out.println(s);

            if(s.equals("B")){
                names.add("D");
            }

        }

        for(String s:names){
            System.out.println(s);
        }
    }
}