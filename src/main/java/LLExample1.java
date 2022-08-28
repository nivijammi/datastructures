public class LLExample1 {
    static class Node {
        int data;
        Node next;
    }

    public static void printList(Node current){
        //to print it needs to receive the head element
        while(current != null){// print value of current element and move to the next
            System.out.println(current.data);
            current = current.next;
        }

    }
    public static void main(String[] args) {
        LLExample1 list = new LLExample1();

        Node head = new Node(); //first element of a LL
        Node second = new Node();
        Node third = new Node();

        head.data = 1;
        head.next = second;
        second.data = 2;
        second.next = third;
        third.data = 3;
        third.next = null;

        printList(head);
    }
}
