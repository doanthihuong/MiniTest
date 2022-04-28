package mini_test2.lamLai;

import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManageDirector mn1 = new ManageDirector();
        Scanner sc = new Scanner(System.in);
        int choice = 1;
        System.out.println("---------------Menu-----------");
        System.out.println("1.Display");
        System.out.println("2.Add");
        System.out.println("3.Edit");
        System.out.println("4.Delete");
        System.out.println("5.Search");
        System.out.println("6.Read to file");
        System.out.println("7.Write to file");
        System.out.println("8.Exit");
        System.out.println("8.Enter your choice: ");
        choice=sc.nextInt();
        if (choice < 1 || choice > 8) {
            System.out.println("không tồn tại!");
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("chỉ được nhập số");
                sc.nextLine();
                choice = -1;
            }

        } else {
            switch (choice) {
                case 1:
                    mn1.display();
                    break;
                case 2:
                    System.out.println("nhập số điện thoại");
                    int phonenumber = sc.nextInt();
                    sc.nextLine();
                    System.out.println("nhập group");
                    String group = sc.nextLine();
                    System.out.println(" nhập họ tên");
                    String name = sc.nextLine();
                    System.out.println(" nhập giới tính");
                    String sex = sc.nextLine();
                    System.out.println(" nhập địa chỉ");
                    String address = sc.nextLine();
                    System.out.println(" Nhập ngày sinh");
                    String birth = sc.nextLine();
                    System.out.println(" Nhập email");
                    String email = sc.nextLine();
                    PhoneDirector phoneDirector = new PhoneDirector(name, name, email, sex, group, birth, phonenumber);
                    mn1.add(phoneDirector);
                    System.out.println(" thêm thành công");
                    break;
                case 3:
                    System.out.println("nhập số điện thoại");
                    phonenumber = sc.nextInt();
                    sc.nextLine();
                    System.out.println("nhập group");
                    group = sc.nextLine();
                    System.out.println(" nhập họ tên");
                    name = sc.nextLine();
                    System.out.println(" nhập giới tính");
                    sex = sc.nextLine();
                    System.out.println(" nhập địa chỉ");
                    address = sc.nextLine();
                    System.out.println(" Nhập ngày sinh");
                    birth = sc.nextLine();
                    System.out.println(" Nhập email");
                    email = sc.nextLine();
                    PhoneDirector phoneDirector1 = new PhoneDirector(name, address, email, sex, group, birth, phonenumber);
                    mn1.add(phoneDirector1);
                    System.out.println(" Sửa thành công");
                    break;
                case 4:
                    System.out.println("nhập số điện thoại cần xóa");
                    phonenumber = sc.nextInt();
                    mn1.delete(phonenumber);
                    break;

                case 5:
                    System.out.println(" Nhập số điện thoại cần tìm");
                    phonenumber=sc.nextInt();
                    mn1.search(phonenumber);

                    break;
                case 6:
                    System.out.println("chưa làm");
                    break;
                case 8:
                    System.out.println("chưa làm");
                    break;
                default:
                    System.out.println(" vui lòng nhập từ 1 tới 8");
            }

        }

    }
}
