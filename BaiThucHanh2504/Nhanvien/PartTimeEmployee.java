package Nhanvien;
import java.util.Scanner;
public class PartTimeEmployee {
    public int songaylamviec;
    public float luong;
    public void nhapsongaylv() {
        System.out.println("nhập số ngày lv = ");
        Scanner scanner = new Scanner(System.in);
        songaylamviec = scanner.nextInt();
    }
    public void tienluong() {
        luong = songaylamviec * 1000000000;
        System.out.println("lương = " + luong);
        
    }


}
