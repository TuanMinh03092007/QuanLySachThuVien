import java.time.LocalDate;
public class Sach {
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

    public Sach() {
    }
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        setNamXuatBan(namXuatBan); // Đi qua setter để kiểm tra năm xuất bản
        setSoLuong(soLuong);         // Đi qua setter để kiểm tra số lượng
    }
    public String getMaSach() {
        return maSach;
    }
    public void setMaSach(String maSach) {
        if (maSach != null && !maSach.trim().isEmpty()) {
            this.maSach = maSach.trim();
        } else {
            System.out.println("Lỗi: Mã sách không được để trống!");
        }
    }
    public String getTieuDe() {
        return tieuDe;
    }
    public void setTieuDe(String tieuDe) {
        if (tieuDe != null && !tieuDe.trim().isEmpty()) {
            this.tieuDe = tieuDe.trim();
        } else {
            System.out.println("Lỗi: Tiêu đề sách không được để trống!");
        }
    }
    public String getTacGia() {
        return tacGia;
    }
    public void setTacGia(String tacGia) {
        if (tacGia != null && !tacGia.trim().isEmpty()) {
            this.tacGia = tacGia.trim();
        } else {
            System.out.println("Lỗi: Tên tác giả không được để trống!");
        }
    }
    public int getNamXuatBan() {
        return namXuatBan;
    }
    public void setNamXuatBan(int namXuatBan) {
        int currentYear = LocalDate.now().getYear();
        if (namXuatBan > 0 && namXuatBan <= currentYear) {
            this.namXuatBan = namXuatBan;
        } else {
            System.out.println("Lỗi: Năm xuất bản (" + namXuatBan + ") không hợp lệ! Phải từ 1 đến " + currentYear + ".");
        }
    }
    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        if (soLuong >= 0) {
            this.soLuong = soLuong;
        } else {
            System.out.println("Lỗi: Số lượng (" + soLuong + ") không được nhỏ hơn 0!");
        }
    }
    public void hienThiThongTin() {
        System.out.println(" Mã sách : " + maSach);
        System.out.println(" Tiêu đề : " + tieuDe);
        System.out.println(" Tác giả : " + tacGia);
        System.out.println(" Năm xuất bản : " + namXuatBan);
        System.out.println(" Số lượng : " + soLuong);
        System.out.println("----------------------------------------");
    }
}