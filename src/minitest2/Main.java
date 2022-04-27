package minitest2;

public class Main {
    public static void main(String[] args) {
        Student student=new Student();
        student.add(new Student(1,"Hiền Hồ",18, 1));
        student.add(new Student(2,"Trâm Anh",20, 2));
        student.add(new Student(3,"Vũ Anh Thư",19, 3));
        student.add(new Student(3,"Vũ Anh Thư",19, 3));
        student.add(new Student(3,"Vũ Anh Thư",19, 3));
        student.add(new Student(3,"Vũ Anh Thư",19, 3));
        student.add(new Student(3,"Vũ Anh Thư",19, 3));
        student.add(new Student(3,"Vũ Anh Thư",19, 3));
        student.display();


    }
}
