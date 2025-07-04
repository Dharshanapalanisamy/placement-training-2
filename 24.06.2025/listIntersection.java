
import java.util.Scanner;
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}
public class ListIntersection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size1 = input.nextInt();
        ListNode list1 = null, tail1 = null;
        for (int i = 0; i < size1; i++) {
            int val = input.nextInt();
            ListNode node = new ListNode(val);
            if (list1 == null) {
                list1 = node;
                tail1 = node;
            } else {
                tail1.next = node;
                tail1 = node;
            }
        }
        int size2 = input.nextInt();
        ListNode list2 = null, tail2 = null;
        for (int i = 0; i < size2; i++) {
            int val = input.nextInt();
            ListNode node = new ListNode(val);
            if (list2 == null) {
                list2 = node;
                tail2 = node;
            } else {
                tail2.next = node;
                tail2 = node;
            }
        }
        ListNode current1 = list1, current2 = list2;
        while (current1 != current2) {
            current1 = current1 == null ? list2 : current1.next;
            current2 = current2 == null ? list1 : current2.next;
        }
        System.out.println(current1 != null ? current1.val : -1);
        input.close();
    }
}
