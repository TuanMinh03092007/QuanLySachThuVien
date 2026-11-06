
import java.util.Scanner;
class Sach {
    String maSach;
    String tenSach;
    int soLuong;
    double donGia;
    void nhap(Scanner sc) {
        System.out.print("Nhap ma sach: ");
        maSach = sc.nextLine();
        System.out.print("Nhap ten sach: ");
        tenSach = sc.nextLine();
        System.out.print("Nhap so luong: ");
        soLuong = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap don gia: ");
        donGia = Double.parseDouble(sc.nextLine());
    }
    void xuat() {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("So luong: " + soLuong);
        System.out.println("Don gia: " + donGia);
        System.out.println("Thanh tien: " + (soLuong * donGia));
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sach[] ds = new Sach[100];
        int n = 0;
        int chon;
        do {
            System.out.println("\n========== QUAN LY THU VIEN ==========");
            System.out.println("1. Nhap n sach");
            System.out.println("2. Tinh tong so luong va tong gia tri sach");
            System.out.println("3. Hien thi danh sach sach");
            System.out.println("4. Tim sach theo ma");
            System.out.println("5. Thoat");
            System.out.print("Nhap lua chon: ");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                // BAI 1: NHAP N SACH
                case 1:
                    System.out.print("Nhap so luong sach: ");
                    n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        System.out.println("\nNhap sach thu " + (i + 1));
                        ds[i] = new Sach();
                        ds[i].nhap(sc);
                    }
                    break;
                // BAI 2: TINH TONG SO LUONG VA GIA TRI
                case 2:
                    if (n == 0) {
                        System.out.println("Chua co sach trong thu vien!");
                        break;
                    }
                    int tongSoLuong = 0;
                    double tongGiaTri = 0;
                    for (int i = 0; i < n; i++) {
                        tongSoLuong += ds[i].soLuong;
                        tongGiaTri += ds[i].soLuong * ds[i].donGia;
                    }
                    System.out.println("Tong so luong sach: " + tongSoLuong);
                    System.out.println("Tong gia tri sach: " + tongGiaTri);
                    break;
                // HIEN THI DANH SACH
                case 3:
                    if (n == 0) {
                        System.out.println("Danh sach rong!");
                        break;
                    }
                    for (int i = 0; i < n; i++) {
                        System.out.println("\nSach thu " + (i + 1));
                        ds[i].xuat();
                    }
                    break;
                // BAI 4: TIM SACH THEO MA
                case 4:
                    if (n == 0) {
                        System.out.println("Danh sach rong!");
                        break;
                    }
                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = sc.nextLine();
                    int i = 0;
                    boolean timThay = false;
                    while (i < n) {
                        if (ds[i].maSach.equalsIgnoreCase(maTim)) {
                            System.out.println("Tim thay sach:");
                            ds[i].xuat();
                            timThay = true;
                            break;
                        }
                        i++;
                    }
                    if (!timThay) {
                        System.out.println("Khong tim thay sach!");
                    }
                    break;
                // THOAT
                case 5:
                    System.out.println("Da thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 5);
        sc.close();
    }
}
