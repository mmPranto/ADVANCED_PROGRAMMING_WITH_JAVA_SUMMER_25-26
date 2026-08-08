import java.util.HashSet;
import java.util.Set;

public class Main{
    public static void main(String[] args){
        Set<Student> students = new HashSet<>();
        students.add(new Student("XYZ"));
        students.add(new Student("XYZ"));
        students.add(new Student("XYZ"));
        students.add(new Student("ABC"));
        students.add(new Student("XYZ"));
        System.out.println("Student Size: "+students.size());
        for(Student student:students)
            System.out.println(student.name);
    }
}