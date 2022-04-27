package mini_test_oop;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagePerson managePerson = new ManagePerson();
         Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("----CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ----");
            System.out.println("Chọn chức năng theo số (để tiếp tục)");
            System.out.println("1.Xem danh sách");
            System.out.println("2.Thêm mới");
            System.out.println("3.Cập nhật");
            System.out.println("4.Xóa");
            System.out.println("5.Tìm kiếm");
            System.out.println("6.Đọc từ file");
            System.out.println("7.Thoát");
            System.out.println("Chọn chức năng : ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    managePerson.displayAll();
                    break;
                case 2:
                    managePerson.addPerson();
                    break;
                case 3:
                    System.out.println("Nhập số điện thoại muốn sửa");
                    int phoneEdit = scanner.nextInt();
                    managePerson.editPerson(phoneEdit);
                    break;
                case 4:
                    System.out.println("Nhập số điện thoại muốn xóa");
                    int phoneDelete = scanner.nextInt();
                    managePerson.deletePerson(phoneDelete);
                    break;
                case 5:
                    System.out.println("Nhập số điện thoại muốn tìm kiếm");
                    int phoneSearch = scanner.nextInt();
                    managePerson.seachByPhone(phoneSearch);
                    break;
                case 6:
                    ArrayList<Person>persons = managePerson.readFile(ManagePerson.PATH_NAME);
                    persons.forEach(System.out::println);
                    break;
                default:
                    System.exit(0);

            }
        } while (choice != 0);
    }
}
