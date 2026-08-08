import java.util.Objects;

public class Student {
    String name;

    Student(String name){
        this.name=name;
    }

    public boolean equals(Object o){
        if(o==null||getClass()!=o.getClass())
            return false;
        Student student=(Student) o;
        return Objects.equals(name,student.name);

    }

    public int hashCode(){
        return Objects.hashCode(name);
    }
}
