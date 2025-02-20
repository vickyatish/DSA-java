package linkedList;

public class deleteNthNode {
    public static Node deleteNthNodeFromEnd(Node l1, int n){
        int count = 0;

        Node temp = l1;
        while(temp!=null){
            temp = temp.next;
            count+=1;
        }
        temp = l1;
        if(count==n){
            l1 = l1.next;
            return l1;
        }
        if(n==1) {
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            return l1;
        }
        temp = l1;
        int res = count-n-1;

        while(res!=0){
            temp = temp.next;
            res-=1;
        }
        temp.next=temp.next.next;

        return l1;
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        // Creating a linked list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original List:");
        printList(head);

        Node result = deleteNthNodeFromEnd(head, 5);

        System.out.println("Updated List after deleting 2nd node from end:");
        printList(result);
    }
}
