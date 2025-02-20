package linkedList;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class mergeLinkedList {
        public static Node mergeLinkedList(Node l1, Node l2){
            Node dummy = new Node(-1);
            Node temp = dummy;

            while(l1!=null && l2!=null){
                if(l1.data<=l2.data){
                    temp.next = l1;
                    l1 = l1.next;
                }
                else{
                    temp.next = l2;
                    l2 = l2.next;
                }
                temp = temp.next;
            }

            while(l1!=null){
                temp.next = l1;
                l1 = l1.next;
            }
            while(l2!=null){
                temp.next = l2;
                l2 = l2.next;
            }
            return dummy.next;
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        Node l1 = new Node(1);
        l1.next = new Node(3);
        l1.next.next = new Node(5);

        // Creating second sorted linked list: 2 -> 4 -> 6
        Node l2 = new Node(2);
        l2.next = new Node(4);
        l2.next.next = new Node(6);

        // Merging both lists
        Node mergedHead = mergeLinkedList(l1, l2);

        // Printing merged linked list
        System.out.print("Merged Linked List: ");
        printList(mergedHead);
    }
}
