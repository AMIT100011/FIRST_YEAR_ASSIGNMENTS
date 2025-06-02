import java.util.Scanner;

public class QueueDemo1 {
    public static final int MAX = 5;
    public static int front = -1;
    public static int rear = -1;

    public static void insert(int Q[]) {
        Scanner sc = new Scanner(System.in);
        if (is_full()) {
            System.out.println("Queue is Full! Insertion not possible.");
        } else {
            System.out.print("Enter the element to insert: ");
            int x = sc.nextInt();
            if (front == -1) front = 0;
            Q[++rear] = x;
            System.out.println(x + " inserted successfully.");
        }
    }

    public static void delete(int Q[]) {
        if (is_empty()) {
            System.out.println("Queue is Empty! Deletion not possible.");
        } else {
            System.out.println("Deleted element: " + Q[front]);
            if (front == rear) {
                front = rear = -1;
            } else {
                front++;
            }
        }
    }

    public static void display(int Q[]) {
        if (is_empty()) {
            System.out.println("Queue is Empty!");
        } else {
            System.out.print("Queue Elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(Q[i] + " ");
            }
            System.out.println();
        }
    }

    public static boolean is_full() {
        return rear == MAX - 1;
    }

    public static boolean is_empty() {
        return front == -1 || front > rear;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int queue[] = new int[MAX];
        while (true) {
            System.out.println("\n***MENU***");
            System.out.println("0: Exit");
            System.out.println("1: Insert");
            System.out.println("2: Delete");
            System.out.println("3: Display");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    insert(queue);
                    break;
                case 2:
                    delete(queue);
                    break;
                case 3:
                    display(queue);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
