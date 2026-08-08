import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main{
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"A",3));
        students.add(new Student(2,"E",4));
        students.add(new Student(3,"C",2));
        students.add(new Student(4,"D",1));
        students.add(new Student(5,"B",0));

        System.out.println("---Comparable cgpa wise sort---");
        Collections.sort(students);
        for(Student s:students)
            System.out.println(s);

        System.out.println("---Comparator Id wise sort---");
        Collections.sort(students, new IdWiseSort());
        for(Student s:students)
            System.out.println(s);

        System.out.println("---Comparator Name wise sort---");
        Collections.sort(students,new NameWiseSort());
        for(Student s:students)
            System.out.println(s);

    }
}