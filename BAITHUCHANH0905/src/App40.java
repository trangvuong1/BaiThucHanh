import java.util.LinkedList;
import java.util.Scanner;
public class App40 {
    public static void main(String[] args){
        LinkedList<String> linkedList = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);

        linkedList.add("Thang 1");
        linkedList.add("Thang 2");
        linkedList.add("Thang 3");
        linkedList.add("Thang 4");
        linkedList.add("Thang 5");
        linkedList.add("Thang 6");
        linkedList.add("Thang 7");
        linkedList.add("Thang 8");
        linkedList.add("Thang 9");
        linkedList.add("Thang 10");
        linkedList.add("Thang 11");
        linkedList.add("Thang 12");

        System.out.println("Nhap vao chi so cua cac phan tu can lay: ");
        int index = sc.nextInt();
        if ((index < 0) || (index > (linkedList.size()-1))) {
            System.out.println("Chi so can lay phai lon hon 0 va nho hon" + (linkedList.size() -1));
        } else {
            String node = linkedList.get(index);
            System.out.println("Phan tu co chi so = " + index + "trong linkedList la" + node);

        }
        String fistNode = linkedList.getFirst();
        String lastNode = linkedList.getLast();

        System.out.println("\n Phan tu dau tien trong danh sach la: " + fistNode);
        System.out.println("\n Phan tu cuoi cung trong danh sach la: " + lastNode);


}
}
