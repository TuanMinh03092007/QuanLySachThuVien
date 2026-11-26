import java.util.ArrayList;
import java.util.Scanner;
public class QuanLyThuVien {
    private static final ArrayList<Sach> danhSachSach = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            System.out.println("\nQuản lý sách tư viện");
            System.out.println("1.Them sach giao khoa");
            System.out.println("2.Them sach tham khao");
            System.out.println("3.Xuat danh sach cac loai sach");
            System.out.println("4.Tinh tong thanh tien cho tung loai");
            System.out.println("5.Tinh trung binh cong don gia sach tham khao");
            System.out.println("6.Xuat sach giao khoa theo nha xuat ban X");
            System.out.println("0.Thoat");
            System.out.print("Chon chuc nang: ");
            chon = Integer.parseInt(sc.nextLine().trim());
            switch (chon) {
                case 1 -> themSach(sc, new SachGiaoKhoa());
                case 2 -> themSach(sc, new SachThamKhao());
                case 3 -> xuatDanhSach();
                case 4 -> tinhTongThanhTienTungLoai();
                case 5 -> tinhTrungBinhDonGiaSTK();
                case 6 -> xuatSGKTheoNXB(sc);
                case 0 -> System.out.println("Thoat chuong trinh.");
                default -> System.out.println("Lua chon khong hop le.");
            }
        } while (chon != 0);
        sc.close();
    }
    private static void themSach(Scanner sc, Sach sachMoi) {
        sachMoi.nhapThongTin(sc);
        danhSachSach.add(sachMoi);
        System.out.println("Da them sach thanh cong.");
    }
    private static void xuatDanhSach() {
        if (danhSachSach.isEmpty()) {
            System.out.println("Danh sach sach dang trong.");
            return;
        }
        System.out.println("\n--- DANH SACH SACH ---");
        for (Sach s : danhSachSach) {
            s.xuatThongTin();
        }
    }
    private static void tinhTongThanhTienTungLoai() {
        double tongSGK = 0;
        double tongSTK = 0;
        for (Sach s : danhSachSach) {
            if (s instanceof SachGiaoKhoa) {
                tongSGK += s.tinhThanhTien();
            } else if (s instanceof SachThamKhao) {
                tongSTK += s.tinhThanhTien();
            }
        }
        System.out.printf("Tong thanh tien Sach giao khoa: %.2f%n", tongSGK);
        System.out.printf("Tong thanh tien Sach tham khao: %.2f%n", tongSTK);
    }
    private static void tinhTrungBinhDonGiaSTK() {
        double tongDonGia = 0;
        int dem = 0;
        for (Sach s : danhSachSach) {
            if (s instanceof SachThamKhao) {
                tongDonGia += s.getDonGia();
                dem++;
            }
        }
        if (dem == 0) {
            System.out.println("Khong co sach tham khao nao de tinh trung binh don gia.");
        } else {
            System.out.printf("Trung binh cong don gia sach tham khao: %.2f%n", tongDonGia / dem);
        }
    }
    private static void xuatSGKTheoNXB(Scanner sc) {
        System.out.print("Nhap ten nha xuat ban X can tim: ");
        String nxbX = sc.nextLine().trim();
        boolean timThay = false;
        System.out.println("\n--- SACH GIAO KHOA CUA NXB: " + nxbX + " ---");
        for (Sach s : danhSachSach) {
            if (s instanceof SachGiaoKhoa && s.getNhaXuatBan().equalsIgnoreCase(nxbX)) {
                s.xuatThongTin();
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("Khong tim thay sach giao khoa nao thuoc nha xuat ban " + nxbX);
        }
    }
}