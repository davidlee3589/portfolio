public class LinkedListQueueTester {
    public static void main(String[] args) {
        LinkedListQueue<String> queue = new LinkedListQueue<>();

        // Test case 1
        queue.enqueue("Tom");
        queue.enqueue("Jane");
        queue.enqueue("Beth");
        printQueue(queue);

        // Test case 2
        queue.enqueue("John");
        queue.enqueue("Mary");
        printQueue(queue);

        // Test case 3
        System.out.println("Queue is empty: " + queue.isEmpty());
        System.out.println("Number of items in queue is " + queue.size());
        System.out.println("The head of the queue is: " + queue.peek());
        System.out.println("Remove " + queue.dequeue());
        printQueue(queue);

        // Test case 4
        queue.dequeue();
        printQueue(queue);

        // Test case 5
        System.out.println("Queue is empty: " + queue.isEmpty());
        System.out.println("Number of items in queue is " + queue.size());
        System.out.println("The head of the queue is: " + queue.peek());

        // Test case 6
        System.out.println("Remove " + queue.dequeue());
        System.out.println("The head of the queue is: " + queue.peek());

        // Test case 7
        System.out.println("Remove " + queue.dequeue());
        System.out.println("The head of the queue is: " + queue.peek());

        // Test case 8
        System.out.println("Remove " + queue.dequeue());
        System.out.println("The head of the queue is: " + queue.peek());

        // Test case 9
        System.out.println("Remove " + queue.dequeue());
        System.out.println("Queue is empty: " + queue.isEmpty());
        System.out.println("The head of the queue is: " + queue.peek());

        // Test case 10
        System.out.println("Queue is empty: " + queue.isEmpty());
    }

    private static void printQueue(LinkedListQueue<String> queue) {
        System.out.println(queue.peek());
        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
    }
}