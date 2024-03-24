// circular queue data structure implementation using array

public class Main {
    static class Queue {
        static int[] arr;
        static int size;
        static int rear = -1;
        static int front = -1;

        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return front == (rear+1)%size;
        }

        // enqueue --> time complexity = O(1)
        public static void add(int data) {
            if (isFull()) {
                System.out.println("queue is full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1)%size;
            arr[rear] = data;
        }

        // dequeue --> time complexity = O(1)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }

            int result = arr[front];
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1)%size;
            }
            return result;
        }

        // peek --> time complexity = O(1)
        public static int peek() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            
            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);
        System.out.println();

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}