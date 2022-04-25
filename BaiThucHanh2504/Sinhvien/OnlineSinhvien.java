package Sinhvien;
import java.util.Scanner;

public class OnlineSinhvien  {
    public String classname;

    public void nhap() {
        System.out.println("nhập lớp = ");
        Scanner scanner = new Scanner(System.in);
        classname = scanner.nextLine();
    }
}