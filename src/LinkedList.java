public class LinkedList {
    Node firstNode;
    Node lastNode;

    public LinkedList() {
        firstNode = null;
        lastNode = null;
    }


    public void insertFront(int item) {
        Node p = new Node(item);
        if (isEmpty()) {
            firstNode = lastNode = p;
        }
        else {
            p.next = firstNode;
            firstNode = p;
        }
    }





    public void insertEnd(int item) {
        Node p = new Node(item);
        if (isEmpty()) {
            firstNode = lastNode = p;
        }else {
            lastNode.next = p;
            lastNode = p;
        }
    }

    public boolean isEmpty() {
        return firstNode == null;
    }

    public void travel() {
        if (isEmpty()) {
            System.out.println("danh sách rỗng");
        }
        else {
            Node p = firstNode;
            while (p != null) {
                System.out.println(p.getItem()+ "  ");
                p = p.next;
            }
        }
    }
}
