public class LinkList {
    Node head = null;
    private int size;
    LinkList() {
        this.size = 0;
    }


    class Node{
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add - first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add to last
    public void addToLast(String data) {
         Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    public void pringList() {
        if(head == null) {
            System.out.println("list is empty");
            return;
        }
        Node newHeader = head;
        while(newHeader != null) {
            System.out.print(newHeader.data +"->");
            newHeader = newHeader.next;
        }
        System.out.print("NULL");
    }
    // delething the element from link list
    public void deleteingTheElementFromStart() {
        if(head == null) {
            System.out.println("the list is empty");
            return;
        }
        size--;
        head = head.next;
    }
     public void deleteingTheElementFromLast() {
        if(head == null) {
            System.out.println("the list is empty last");
            return;
        }
        Node temp = head;
        size--;
        if(temp.next == null) {
            head = null;
            return;
        }
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;   
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] arr) {
        LinkList list = new LinkList();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        list.addToLast("List");
        // list.deleteingTheElementFromStart();
        // list.deleteingTheElementFromLast();
        // list.deleteingTheElementFromStart();
        // list.deleteingTheElementFromStart();
        list.deleteingTheElementFromLast();
        list.addToLast("List");
        list.addToLast("List");
        list.addToLast("List");
        list.addToLast("List");
        list.addToLast("List");
        list.addToLast("List");
        list.pringList();
        // System.out.println();
        System.out.println("\n" + list.getSize());
        
    }
}
