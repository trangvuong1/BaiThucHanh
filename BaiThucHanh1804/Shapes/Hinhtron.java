package Shapes;
import java.util.Scanner;
public class Hinhtron extends HinhHoc {

    public float bankinh;

    public  Hinhtron(){
        ten = "Hinh tron";
    }
    public void nhapbankinh(){
        System.out.println("Ban Kinh = ");
        Scanner scanner= new Scanner(System.in);
        bankinh = scanner.nextFloat();
    }
    public void tichchuvi(){
        chuvi=2 *PI*bankinh;
    }
    public void tinhdientich(){
        dientich=PI*bankinh*bankinh;
    }
}