package mini_test_oop;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ManagePerson {
    public static final String PATH_NAME ="src\\mini_test_oop\\file_mini_test_md2.csv";
    private ArrayList<Person> persons;
    private final Scanner scanner = new Scanner(System.in);

    public ManagePerson(){
        this.persons=readFile(PATH_NAME);
    }

    public ArrayList<Person>getPersons(){
        return persons;
    }

    public Person addPerson(){
        System.out.println("Nhập số điện thoại");
        long phoneNumber = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Nhập nhóm");
        String group = scanner.nextLine();
        System.out.println("Nhập họ tên");
        String name = scanner.nextLine();
        System.out.println("Điền giới tính");
        String sex = scanner.nextLine();
        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();
        System.out.println("Nhập email");
        String email = scanner.nextLine();
        for (Person p:
             persons) {
            if (p.getPhoneNumber() == phoneNumber){
                System.out.println("Trùng số điện thoai. Mời nhập lại !!!");
                return null;
            }
        }
        Person person = new Person(name,phoneNumber,address,email, group,sex);
        persons.add(person);
        writeFile(persons,PATH_NAME);
        return person;
    }
    public void displayAll(){
        for (Person person:
             persons) {
            System.out.println(person);
        }
    }

    public Person editPerson(int phoneNumber){
        Person editPerson = null;
        for (Person person:
             persons) {
            if (person.getPhoneNumber()==phoneNumber){
                editPerson = person;
            }
        }
        if (editPerson != null){
            int index = persons.indexOf(editPerson);
            System.out.println("Nhập nhóm của danh bạ");
            editPerson.setGroup(scanner.nextLine());
            System.out.println("Nhập họ tên");
            editPerson.setName(scanner.nextLine());
            System.out.println("Đặt lại giới tính");
            editPerson.setSex(scanner.nextLine());
            System.out.println("Nhập lại địa chỉ");
            editPerson.setAddress(scanner.nextLine());
            System.out.println("Nhập lại email");
            writeFile(persons,PATH_NAME);
            editPerson.setEmail(scanner.nextLine());
        }
        return editPerson;
    }

    public Person deletePerson(int phoneNumber) {
        Person person = null;
        for (Person p :
                persons) {
            if (p.getPhoneNumber() == phoneNumber) {
                person = p;
            }
        }
        if (person != null) {
            persons.remove(person);
            System.out.println("Xóa người có số điện thoại " + phoneNumber + " thành công!!!");
        }
        return person;
    }

    public void seachByPhone(int phoneNumber){
        Person person = null;
        for (Person p:
             persons) {
            if (p.getPhoneNumber() == phoneNumber){
                person = p;
            }
        }
        if (person != null){
            System.out.println(person);
        } else {
            System.out.println("Không tìm thấy số điện thoại!!!!");
        }
    }
    public ArrayList<Person> readFile(String path){
        ArrayList<Person> persons = new ArrayList<>();
        File file = new File(PATH_NAME);
        try{
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String line;
            while ((line=bufferedReader.readLine())!=null){
                String[] strings = line.split(",");
                persons.add(new Person(strings[0],(Long.parseLong(strings[1])),(strings[2]),(strings[3]),(strings[4]),(strings[5])));
            }
        }catch (IOException ioe){
            System.out.println(ioe.getMessage());
        }
        return persons;
    }

    public void writeFile(ArrayList<Person> persons,String path){
        try{
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
            for (Person person:
                 persons) {
                bufferedWriter.write(person.getPhoneNumber() + "," + person.getName() + "," + person.getAddress() + "," + person.getEmail() + "," + person.getGroup() + "," + person.getSex() + "\n");
            }
            bufferedWriter.close();
            System.out.println("Ghi tệp thành công !!!!");
        }catch (IOException ioe){
            System.out.println(ioe.getMessage());
        }
    }
}
