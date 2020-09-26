public class Main {
    public static void main(String[] args) {
//        Queue<String> queue = new Queue<>();
//        LinkedList ll = new LinkedList();
//        ll.insertFront(10);
//        ll.insertFront(20);
//        ll.insertFront(12);
//        ll.insertFront(45);
//        ll.insertFront(34);
//        ll.insertFront(23 );
//        ll.insertEnd(45);
//        ll.travel();


        Queue queue = new Queue();
        queue.displayQueue();
        queue.enQueue(10);
        queue.displayQueue();
        queue.deQueue();
        queue.displayQueue();
    }
}
