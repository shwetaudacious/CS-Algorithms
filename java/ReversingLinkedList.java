// A program for reversing a linked list 

public class ReversingLinkedList { 

    public static Node head; 

    public static class Node { 

        public int key; 
        public Node next; 

        Node(int key) 
        { 
            this.key = key; 
            this.next = null; 
        } 
    } 

    // A simple and tail recursive function to reverse 
    // a linked list. prev is passed as null initially. 
    public Node reverseUtil(Node curr, Node prev) 
    { 

        /* If last node mark it head*/
        if (curr.next == null) { 
            head = curr; 

            /* Update next to prev node */
            curr.next = prev; 

            return head; 
        } 

        /* Save curr->next node for recursive call */
        Node next1 = curr.next; 

        /* and update next ..*/
        curr.next = prev; 

        reverseUtil(next1, curr); 
        return head; 
    } 

    // prints content of double linked list 
    public void printList(Node node) 
    { 
        while (node != null) { 
            System.out.print(node.key + " "); 
            node = node.next; 
        } 
    } 

    public static void main(String[] args) 
    { 
        ReversingLinkedList list = new ReversingLinkedList(); 
        list.head = new Node(1); 
        list.head.next = new Node(2); 
        list.head.next.next = new Node(3); 
        list.head.next.next.next = new Node(4); 

        System.out.println("Original Linked list "); 
        list.printList(head); 
        Node res = list.reverseUtil(head, null); 
        System.out.println(""); 
        System.out.println(""); 
        System.out.println("Reversed linked list "); 
        list.printList(res); 
    } 
} 

