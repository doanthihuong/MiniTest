package mini_test2;

import com.sun.jmx.snmp.SnmpUnknownAccContrModelException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyDanhBa implements QuanLy<DanhBa> {
 List<DanhBa> list= new ArrayList<>();

    public QuanLyDanhBa() {
        list.add(new DanhBa("An Nhiên","123","hà tĩnh","annhien@gmail.com","annhien"));
        list.add(new DanhBa("Thùy linh","456","hà tĩnh","Linhn@gmail.com","natt"));
        list.add(new DanhBa("Hoàng Hà","789","Huế","phudu@gmail.com","phù du"));
        list.add(new DanhBa("Tú Anh","011","Nghệ An","rosia@gmail.com","Tú Anh"));
    }

    @Override
    public void them() {
     DanhBa danhBa=tao();
     list.add(danhBa);
    }
    Scanner sc =new Scanner(System.in);
    public DanhBa tao() {

        System.out.println("Nhập thông tin");
        System.out.println(" Nhập tên");
        String ten=sc.nextLine();
        System.out.println(" Nhập số điện thoại");
        String sdt=sc.nextLine();
        System.out.println(" Nhập địa chỉ");
        String diaChi=sc.nextLine();
        System.out.println(" Nhập email");
        String email=sc.nextLine();
        System.out.println(" Nhập facebook");
        String facebook=sc.nextLine();
        return  new DanhBa(ten,sdt,diaChi,email,facebook);
    }

    @Override
    public void sua() {
        System.out.println("Nhập tên cần sửa");
        String ten = sc.nextLine();
        int vitri = timKiem(ten);
        if(vitri == -1) {
            System.out.println("Không tồn tại");
        } else {
            DanhBa danhBa=tao();
            list.set(vitri,danhBa);
            System.out.println(" Đã sửa thành công!");
        }
    }

    @Override
    public void xoa() {
        System.out.println( " nhập tên cần xóa ! ");
        String ten=sc.nextLine();
        int viTri = timKiem(ten);
        if(viTri == -1) {
            System.out.println("Không tồn tại");
        } else {
           list.remove(viTri);
            System.out.println("đã xóa thành công!");
        }
    }

    @Override
    public void hienthi() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            System.out.println( "------------------------------");

        }
    }
    public void hienThiTheoTen() {
        System.out.println( " nhập tên cần tìm kiếm ! ");
        String ten =sc.nextLine();
        int viTri = timKiem(ten);
        if(viTri == -1) {
            System.out.println("Không tồn tại");
        } else {
            System.out.println(list.get(viTri));
        }
    }
    public int timKiem(String name) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getTen().equals(name)){
                return  i;
            }
        } return  -1 ;
    }
}
