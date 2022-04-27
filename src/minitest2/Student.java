package minitest2;
import java.util.ArrayList;

public class Student extends Human {
    private double score;

    ArrayList<Student>students;

    public Student(){
        this.students=new ArrayList<>();
    }

    public Student(int id, String name, int age, int score) {
        super(id,name,age);
        this.score = score;
    }

//    public Student(int i, String hiền_hồ, int i1) {
//    }

    public void add(Student student){
        students.add(student);
    }
    public void display(){
        for (int i=0;i<students.size();i++){
            System.out.println(students.get(i));
        }
    }

    @Override
    public String toString() {
        return "Student{ Name : " + getName()+ " , Id : "+ getId()+ " , Age : " + getAge()+ ", Score: " + score + '}';
    }
}
