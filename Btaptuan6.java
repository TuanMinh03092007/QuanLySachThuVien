//bai 1

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] soLuong = new int[5];
        int tong = 0;
        int max;

        // Nhap so luong 5 cuon sach
        for (int i = 0; i < 5; i++) {
            System.out.print("Nhap so luong sach thu " + (i + 1) + ": ");
            soLuong[i] = sc.nextInt();
        }

        // Hien thi va tinh tong
        max = soLuong[0];

        System.out.println("\nDanh sach so luong sach:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Sach " + (i + 1) + ": " + soLuong[i]);

            tong += soLuong[i];

            if (soLuong[i] > max) {
                max = soLuong[i];
            }
        }

        System.out.println("Tong so luong sach: " + tong);
        System.out.println("So luong lon nhat: " + max);

        sc.close();
    }
}
//bai 2

import java.util.ArrayList;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> maSach = new ArrayList<>();

        // Them ma sach
        maSach.add("S01");
        maSach.add("S02");
        maSach.add("S03");
        maSach.add("S04");

        // Hien thi danh sach
        System.out.println("Danh sach ma sach:");
        for (int i = 0; i < maSach.size(); i++) {
            System.out.println(maSach.get(i));
        }

        // Tim ma sach
        System.out.print("\nNhap ma sach can tim: ");
        String maTim = sc.nextLine();

        if (maSach.contains(maTim)) {
            System.out.println("Tim thay ma sach: " + maTim);
        } else {
            System.out.println("Khong tim thay ma sach!");
        }

        // Xoa ma sach
        System.out.print("Nhap ma sach can xoa: ");
        String maXoa = sc.nextLine();

        if (maSach.remove(maXoa)) {
            System.out.println("Da xoa ma sach!");
        } else {
            System.out.println("Ma sach khong ton tai!");
        }

        // Hien thi sau khi xoa
        System.out.println("\nDanh sach sau khi xoa:");
        for (String ma : maSach) {
            System.out.println(ma);
        }

        sc.close();
    }
}
//bai 3

import java.util.ArrayList;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> danhSachSach = new ArrayList<>();

        // Them sach
        danhSachSach.add("S01 - Lap trinh Java");
        danhSachSach.add("S02 - Co so du lieu");
        danhSachSach.add("S03 - Lap trinh C++");

        // Hien thi sach
        System.out.println("Danh sach sach:");
        for (String sach : danhSachSach) {
            System.out.println(sach);
        }

        // Tim sach
        System.out.print("\nNhap ma sach can tim: ");
        String maTim = sc.nextLine();

        int viTri = -1;

        for (int i = 0; i < danhSachSach.size(); i++) {
            if (danhSachSach.get(i).startsWith(maTim + " -")) {
                viTri = i;
                break;
            }
        }

        if (viTri != -1) {
            System.out.println("Tim thay: " + danhSachSach.get(viTri));
        } else {
            System.out.println("Khong tim thay sach!");
        }

        // Xoa sach
        System.out.print("\nNhap ma sach can xoa: ");
        String maXoa = sc.nextLine();

        boolean daXoa = false;

        for (int i = 0; i < danhSachSach.size(); i++) {
            if (danhSachSach.get(i).startsWith(maXoa + " -")) {
                danhSachSach.remove(i);
                daXoa = true;
                break;
            }
        }

        if (daXoa) {
            System.out.println("Da xoa sach!");
        } else {
            System.out.println("Khong tim thay sach!");
        }

        // Sua sach
        System.out.print("\nNhap ma sach can sua: ");
        String maSua = sc.nextLine();

        for (int i = 0; i < danhSachSach.size(); i++) {
            if (danhSachSach.get(i).startsWith(maSua + " -")) {
                System.out.print("Nhap thong tin sach moi: ");
                String sachMoi = sc.nextLine();

                danhSachSach.set(i, sachMoi);
                System.out.println("Da sua sach!");
                break;
            }
        }

        // Hien thi ket qua
        System.out.println("\nDanh sach sach sau khi thay doi:");
        for (String sach : danhSachSach) {
            System.out.println(sach);
        }

        sc.close();
    }
}
//bai 4

import java.util.ArrayList;
import java.util.Scanner;

class Sach {
    String maSach;
    String tenSach;
    int soLuong;
    double donGia;

    // Nhap thong tin sach
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

    // Hien thi thong tin sach
    void xuat() {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("So luong: " + soLuong);
        System.out.println("Don gia: " + donGia);
        System.out.println("Thanh tien: " + (soLuong * donGia));
    }
}

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Sach> danhSachSach = new ArrayList<>();

        int chon;

        do {
            System.out.println("\n========== QUAN LY THU VIEN ==========");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi sach");
            System.out.println("3. Tim sach");
            System.out.println("4. Xoa sach");
            System.out.println("5. Sua sach");
            System.out.println("6. Tinh tong so luong");
            System.out.println("7. Tinh tong gia tri");
            System.out.println("8. Thoat");
            System.out.print("Nhap lua chon: ");

            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {

                // BAI 1: THEM SACH
                case 1: {
                    Sach s = new Sach();
                    s.nhap(sc);

                    danhSachSach.add(s);

                    System.out.println("Them sach thanh cong!");
                    break;
                }

                // BAI 2: HIEN THI SACH
                case 2:
                    if (danhSachSach.isEmpty()) {
                        System.out.println("Danh sach sach rong!");
                    } else {
                        for (int i = 0; i < danhSachSach.size(); i++) {
                            System.out.println("\nSach thu " + (i + 1));
                            danhSachSach.get(i).xuat();
                        }
                    }
                    break;

                // BAI 3: TIM SACH
                case 3: {
                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = sc.nextLine();

                    boolean timThay = false;

                    for (int i = 0; i < danhSachSach.size(); i++) {
                        if (danhSachSach.get(i).maSach.equalsIgnoreCase(maTim)) {
                            System.out.println("Tim thay sach:");
                            danhSachSach.get(i).xuat();
                            timThay = true;
                            break;
                        }
                    }

                    if (!timThay) {
                        System.out.println("Khong tim thay sach!");
                    }
                    break;
                }

                // BAI 4: XOA SACH
                case 4: {
                    System.out.print("Nhap ma sach can xoa: ");
                    String maXoa = sc.nextLine();

                    boolean daXoa = false;

                    for (int i = 0; i < danhSachSach.size(); i++) {
                        if (danhSachSach.get(i).maSach.equalsIgnoreCase(maXoa)) {
                            danhSachSach.remove(i);
                            daXoa = true;
                            break;
                        }
                    }

                    if (daXoa) {
                        System.out.println("Xoa sach thanh cong!");
                    } else {
                        System.out.println("Khong tim thay sach!");
                    }
                    break;
                }

                // BAI 5: SUA SACH
                case 5: {
                    System.out.print("Nhap ma sach can sua: ");
                    String maSua = sc.nextLine();

                    boolean daSua = false;

                    for (int i = 0; i < danhSachSach.size(); i++) {
                        if (danhSachSach.get(i).maSach.equalsIgnoreCase(maSua)) {
                            System.out.println("Nhap thong tin moi:");

                            danhSachSach.get(i).nhap(sc);

                            daSua = true;
                            System.out.println("Sua sach thanh cong!");
                            break;
                        }
                    }

                    if (!daSua) {
                        System.out.println("Khong tim thay sach!");
                    }
                    break;
                }

                // BAI 6: TINH TONG SO LUONG
                case 6: {
                    int tongSoLuong = 0;

                    for (int i = 0; i < danhSachSach.size(); i++) {
                        tongSoLuong += danhSachSach.get(i).soLuong;
                    }

                    System.out.println("Tong so luong sach: " + tongSoLuong);
                    break;
                }

                // BAI 7: TINH TONG GIA TRI
                case 7: {
                    double tongGiaTri = 0;

                    for (int i = 0; i < danhSachSach.size(); i++) {
                        tongGiaTri += danhSachSach.get(i).soLuong
                                * danhSachSach.get(i).donGia;
                    }

                    System.out.println("Tong gia tri sach: " + tongGiaTri);
                    break;
                }

                // BAI 8: THOAT
                case 8:
                    System.out.println("Da thoat chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (chon != 8);

        sc.close();
    }
}
