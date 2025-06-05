import java.util.Scanner;

class Node {
    int info;
    Node next;
}

public class QueueDemo2 {

    public static Node insert(Node rear, Node front) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to insert: ");
        int x = sc.nextInt();
        Node newNode = new Node();
        newNode.info = x;
        newNode.next = null;

        if (front == null && rear == null) {
            // First element
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        return front;
    }

    public static Node delete(Node rear, Node front) {
        if (front == null) {
            System.out.println("Queue is empty. Cannot delete.");
        } else {
            System.out.println("Deleted element: " + front.info);
            front = front.next;
        }
        return front;
    }

    public static void display(Node rear, Node front) {
        if (front == null) {
            System.out.println("Queue is empty.");
        } else {
            Node temp = front;
            System.out.print("Queue elements: ");
            while (temp != null) {
                System.out.print(temp.info + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Node rear = null, front = null;

        while (true) {
            System.out.println("\n****MENU****");
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
                    front = insert(rear, front);
                    if (rear == null) rear = front;  // sync rear if it was null
                    else {
                        Node temp = front;
                        while (temp.next != null) temp = temp.next;
                        rear = temp;
                    }
                    break;

                case 2:
                    front = delete(rear, front);
                    if (front == null) rear = null;  // if queue is empty, reset rear too
                    break;

                case 3:
                    display(rear, front);
                    break;

                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}