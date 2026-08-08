public class Student implements Comparable<Student>{
    private int id;
    private String name;
    private int cgpa;

    public Student(int id,String name,int cgpa){
        this.id=id;
        this.name=name;
        this.cgpa=cgpa;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getCgpa() {
        return cgpa;
    }

    public void setId(int id){
        this.id=id;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setCgpa(int cgpa){
        this.cgpa=cgpa;
    }

    public String toString(){
        return "Student{" +
                "id="+id+
                ",name="+name+
                ",cgpa="+cgpa+
                "}";
    }

    public int compareTo(Student o){
        return this.getCgpa()-o.getCgpa();
    }
}
