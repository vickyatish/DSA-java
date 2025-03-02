package Arrays;

public class findDuplicateN {
    public static Boolean findDuplicateN(Node head){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow==fast){
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public static void main(String[] args) {
        Node first = new Node(1);
        first.next = new Node(2);
        first.next.next = new Node(3);
        first.next.next.next = new Node(4);
        first.next.next.next.next = first.next;

        System.out.println(findDuplicateN(first));
    }
}
