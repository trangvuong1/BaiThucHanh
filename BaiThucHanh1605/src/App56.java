import java.util. HashSet;
import java.util. Scanner;
public class App56 {
     public static void main(String[] args) {
        String name;
        HashSet<String> hashSetString = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        
        hashSetString.add("Wilson");
        hashSetString.add("Nike");
        hashSetString.add("Volvo");
        hashSetString.add("Kia");
        hashSetString.add("Lenovo");
        hashSetString.add("Lenovo");
        
        System.out.print("Cac phan tu trong hashSetString: ");
        System.out.print(hashSetString);
        System.out.print("Nhap phan tu can xoa: ");
        name = scanner.nextLine();
        
        if (hashSetString.contains(name)) {
            hashSetString.remove(name);
            
            System.out.println("Xoa thanh cong!");
            System.out.println("Cac phan tu con lai trong hashSetString:");
            System.out.println(hashSetString);
        } else {
            System.out.print("Xoa khong thanh cong");
        }
        }



    }
    


