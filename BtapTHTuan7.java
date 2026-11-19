import java.util.ArrayList;
import java.util.Scanner;
class Sach {
    public String maSach;
    public String tieuDe;
    public String tacGia;
    public int namXuatBan;
    public int soLuong;

    public Sach() {
    }
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }
    public String getMaSach() {
        return maSach;
    }
    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }
    public String getTieuDe() {
        return tieuDe;
    }
    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }
    public String getTacGia() {
        return tacGia;
    }
    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }
    public int getNamXuatBan() {
        return namXuatBan;
    }
    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }
    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
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
public class Test {
    private static int nhapSoNguyen(Scanner scanner, String thongBao) {
        System.out.print(thongBao);
        while (!scanner.hasNextInt()) {
            System.out.print("Vui lòng nhập số nguyên hợp lệ: ");
            scanner.next();
        }
        int giaTri = scanner.nextInt();
        scanner.nextLine();
        return giaTri;
    }
    public static void main(String[] args) {
        ArrayList<Sach> danhSachSach = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        danhSachSach.add(new Sach("B01", "Lập Trình Java Từ Cơ Bản Đến Nâng Cao", "Nguyễn Văn A", 2023, 12));
        danhSachSach.add(new Sach("B02", "Cấu Trúc Dữ Liệu Và Giải Thuật", "Trần Văn B", 2021, 5));
        int choice;
        do {
            System.out.println("\n--- Quản lý thư viện sách ---");
            System.out.println("1. Hiển thị danh sách sách");
            System.out.println("2. Thêm một cuốn sách mới");
            System.out.println("3. Tìm kiếm sách theo mã sách");
            System.out.println("0. Thoát chương trình");
            choice = nhapSoNguyen(scanner, "Nhập lựa chọn của bạn (0-3): ");
            switch (choice) {
                case 1:
                    System.out.println("\n--- DANH SÁCH SÁCH TRONG THƯ VIỆN ---");
                    if (danhSachSach.isEmpty()) {
                        System.out.println("Thư viện hiện chưa có cuốn sách nào.");
                    } else {
                        for (Sach sach : danhSachSach) {
                            sach.hienThiThongTin();
                        }
                    }
                    break;
                case 2:
                    System.out.println("\n--- NHẬP THÔNG TIN SÁCH MỚI ---");
                    System.out.print("Nhập mã sách: ");
                    String maSach = scanner.nextLine().trim();
                    boolean trungMa = false;
                    for (Sach s : danhSachSach) {
                        if (s.getMaSach().equalsIgnoreCase(maSach)) {
                            trungMa = true;
                            break;
                        }
                    }
                    if (trungMa) {
                        System.out.println("=> Mã sách đã tồn tại, vui lòng nhập mã khác!");
                        break;
                    }
                    System.out.print("Nhập tiêu đề sách: ");
                    String tieuDe = scanner.nextLine();
                    System.out.print("Nhập tên tác giả: ");
                    String tacGia = scanner.nextLine();

                    int namXuatBan = nhapSoNguyen(scanner, "Nhập năm xuất bản: ");
                    int soLuong = nhapSoNguyen(scanner, "Nhập số lượng: ");

                    danhSachSach.add(new Sach(maSach, tieuDe, tacGia, namXuatBan, soLuong));
                    System.out.println("=> Thêm sách mới thành công!");
                    break;
                case 3:
                    System.out.print("\nNhập mã sách cần tìm kiếm: ");
                    String maTimKiem = scanner.nextLine().trim();
                    boolean found = false;
                    for (Sach s : danhSachSach) {
                        if (s.getMaSach().equalsIgnoreCase(maTimKiem)) {
                            System.out.println("=> Đã tìm thấy sách:");
                            s.hienThiThongTin();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("=> Không tìm thấy cuốn sách nào có mã: " + maTimKiem);
                    }
                    break;
                case 0:
                    System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn từ 0 đến 3.");
            }
        } while (choice != 0);
        scanner.close();
    }
}