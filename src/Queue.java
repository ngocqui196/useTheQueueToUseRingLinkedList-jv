import java.util.LinkedList;

public class Queue implements Solution{
    public Node front;
    public Node rear;

    public Queue() {
        front = null;
        rear = null;
    }

    @Override
    public void enQueue(int item) {
        Node p = new Node(item);
        if (isEmpty()) {
            front = rear = p;
        }else {
//            rear.next = p;
            rear = p;
            rear.next = front;
        }
    }
    @Override
    public void deQueue() {
        if (isEmpty()) {
//            System.out.println("Danh sách rỗng!!!");
            return;
        }else {
            if (front == rear) {
                front = rear = null;
            }
            else {
                Node p = front;
                front = front.next;
                rear.next = front;
                p.next = null;
            }
        }


//        Node<E> p = new Node<>(item);
//        if (isEmpty()) {
//            front = rear = p;
//        }else {
//            rear.next = p;
//            rear = p;
//        }
    }

    private boolean isEmpty() {
        return front == null;
    }


    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("danh sách rỗng");
        }
        else {
            Node p = front;
            while (p != null) {
                System.out.println(p.item+ "  ");
                p = p.next;
            }
        }
    }
}
