package Sinhvien;
import java.util.Scanner;
public class OffineStudent {
    
public int chieucao;

public void nhap() {
    System.out.println("nhập chieucao = ");
    Scanner Scanner = new Scanner(System.in);
    chieucao = Scanner.nextInt();
}

public void xuat() {
    System.out.println("sinh viên có chiều cao là: " + chieucao);
}
}

