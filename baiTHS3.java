```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String maSach;
        String tenSach;
        String tacGia;
        int namXuatBan;
        double donGia;
        int soLuong;

        double thanhTien;
        double phiVanChuyen;
        double tongTienNhap;

        // Bai 1: Nhap thong tin sach
        System.out.print("Nhap ma sach: ");
        maSach = sc.nextLine();

        System.out.print("Nhap ten sach: ");
        tenSach = sc.nextLine();

        System.out.print("Nhap tac gia: ");
        tacGia = sc.nextLine();

        System.out.print("Nhap nam xuat ban: ");
        namXuatBan = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap don gia: ");
        donGia = Double.parseDouble(sc.nextLine());

        System.out.print("Nhap so luong: ");
        soLuong = Integer.parseInt(sc.nextLine());

        // Bai 2: Tinh thanh tien
        thanhTien = donGia * soLuong;

        // Bai 3: Tinh phi van chuyen
        phiVanChuyen = thanhTien * 0.05;

        // Bai 4: Tinh tong tien nhap
        tongTienNhap = thanhTien + phiVanChuyen;

        // Hien thi thong tin sach
        System.out.println("\n===== THONG TIN SACH =====");
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("Don gia: " + donGia);
        System.out.println("So luong: " + soLuong);

        // Hien thi ket qua tinh tien
        System.out.println("\n===== KET QUA NHAP KHO =====");
        System.out.printf("Thanh tien: %.2f%n", thanhTien);
        System.out.printf("Phi van chuyen: %.2f%n", phiVanChuyen);
        System.out.printf("Tong tien nhap: %.2f%n", tongTienNhap);

        sc.close();
    }
}
```