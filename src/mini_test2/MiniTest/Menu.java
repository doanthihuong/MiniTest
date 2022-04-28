package mini_test2.MiniTest;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws IOException {
        QuanLyDanhBa quanLyDanhBa =new QuanLyDanhBa();
        Scanner sc= new Scanner(System.in);
        int chon;
        while (true) {
            System.out.println("--------MENU---------------"+
                    " CHỌN CHỨC NĂNG \n"+
                    "1. Hiển thị danh bạ \n"+
                    "2. Thêm mới \n" +
                    "3. Cập nhật \n" +
                    "4. Xóa \n" +
                    "5. Tìm kiếm \n" +
                    "6. Đọc từ file \n"+
                    "7. Ghi từ file \n" +
                    "8. Thoát \n" );
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    quanLyDanhBa.hienthi();
                    break;
                case 2:
                    quanLyDanhBa.them();
                    break;
                case 3:
                    quanLyDanhBa.sua();
                    break;
                case 4:
                    quanLyDanhBa.xoa();
                    break;
               case 5:
                   quanLyDanhBa.hienThiTheoTen( );
                   break;
                case 6 :
                    VietDoc.DocFile("Ghi.csv",quanLyDanhBa.list);
                    break;
                case 7 :
                    System.out.println("chưa làm");
                    break;
            }
         }
    }
}
