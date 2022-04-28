package mini_test2.MiniTest;

public class DanhBa {
    private String ten;
    private  String sdt;
    private String diaChi;
    private String email;
    private String faceBook;

    public DanhBa() {
    }

    public DanhBa(String ten, String sdt, String diaChi, String email, String faceBook) {
        this.ten = ten;
        this.sdt = sdt;
        this.diaChi = diaChi;
        this.email = email;
        this.faceBook = faceBook;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFaceBook() {
        return faceBook;
    }

    public void setFaceBook(String faceBook) {
        this.faceBook = faceBook;
    }

    @Override
    public String toString() {
        return "Danh bạ " +
                "tên: " + ten  +
                ", sdt: " + sdt  +
                ", địa chỉ: '" + diaChi  +
                ", email: " + email +
                ", faceBook: " + faceBook  ;
    }
}
