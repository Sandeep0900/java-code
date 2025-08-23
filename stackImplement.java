public class stackImplement {
    public static Node head = null;
    static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static void push(int val) {
        Node newNode = new Node(val);
        if(head == null) {
            head = newNode;
        }
        newNode.next = head;
        head = newNode; 
    }

    public static void pop() {
        if(head == null) {
            System.out.println("Nothing to be poped");
            return;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
    }

    public static void top() {
        if(head == null) {
            System.out.println("-1");
            return;
        }
        System.out.println(head.data);
    }


    public static void main(String[] arr) {
        // stackImplement ob = new stackImplement();
        stackImplement.push(1);
        stackImplement.push(2);
        stackImplement.push(3);
        stackImplement.push(4);

        stackImplement.top();
        stackImplement.pop();
        stackImplement.top();
    }
}
