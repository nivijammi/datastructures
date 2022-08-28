
/** each element of a LL has 2 parts - value and pointer to the next element
 * we cannot represent a node of LL with built-in data type
 * we need to create our own user-defined data type in order to represent an element of a LL
 * Here we use a inner class, a user defined data type in order to represent one element of a LL
 * We can use element but node is commonly used to represent an element of a LL

 */
class Node {
    // 2 parts of a LL element
    Node next;
    int data;

    //constructor
    public Node(int data) {
        this.data = data;
    }

}
//    public void append(int data){
//        Node current = this;
//        //while current.next not equal to null, keep moving
//        //get to the end of the LL
//        while(current.next != null){
//            current = current.next;
//        }
//        //when at the end of LL create a node
//        current.next = new Node(data);
//
//    }

    /**if we prepend an element we will change what the head node is
     * now if we change the head node in one place how will
     * everybody know that our head value has changed. So the work around for
     * this is rather than giving everyone an access to the head pointer directly
     * we design a class linked list that would wrap the headNode.
     * And now append method should go when it always should have been, in the LL class
     *
     */

    public class LinkedList {
        Node head;

        public void append(int data){
            if(head==null){
                head = new Node(data);
                return;
            }else{
                //Node current = this;
                Node current = head;//current node should point to the head
                //while current.next is not equal to null, keep moving
                //get to the end of the LL
                while (current.next != null) {
                    current = current.next;
                }
                //when at the end of LL create a node
                current.next = new Node(data);
            }

        }

        // prepend
        //the way this method will work is that we will create a new head value
        public void prepend(int data){
            Node newHead = new Node(data);
            //new head's next vale will link w/old head .and
            //we will change the head pointer
            newHead.next = head;
            head = newHead;
        }
        //delete the first node that has a particular value
        public void deleteWithValue(int val){
            Node current = head;
            if(current == null)
                return; //nothing can be done here
            // we will walk through the LL and stop before the element we want to delete.
            //update pointers to work around it
            //so current pointer will be the

            //NOTE: what if the node we want to delete is the head node.
            //The head node is never explicitly "destroyed" but we cannot access
            //it so it is essentially gone.
            if(current.data == val){
                current = current.next; //cut it out of the LL
                return;
            }

            //walk through the link list
            current = head;
            //walk till not at the last element, do not want to walk off the edge
            while(current.next != null){
                if(current.next.data == val){ // if the next value is the one we want to delete
                    //then delete that next value
                    current.next = current.next.next;//so if next value is to be deleted walk around it
                    return;
                }
                current = current.next;
            }
        }




    }


