
public class AppBai2 {
    public static void main(String[] args)  {
        Scanner sc =new Scanner(System.in);
        int a;
        System.out.println("Moi nhap vao so nguyen: ");
        a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("Day la so chan "); 
        } else {
            System.out.println("Day la so le"); 
        }
    }
}
   