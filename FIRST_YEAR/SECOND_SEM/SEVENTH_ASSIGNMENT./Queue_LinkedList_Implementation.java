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
        if (front == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println(x + " inserted successfully.");
        return front; // we update front outside and maintain rear using wrapper
    }

    public static Node delete(Node rear, Node front) {
        if (front == null) {
            System.out.println("Queue is Empty! Deletion not possible.");
        } else {
            System.out.println("Deleted element: " + front.info);
            front = front.next;
            if (front == null) {
                rear = null;
            }
        }
        return front;
    }

    public static void display(Node front) {
        if (front == null) {
            System.out.println("Queue is Empty!");
        } else {
            System.out.print("Queue Elements: ");
            Node temp = front;
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
                    if (front == null && rear == null) {
                        Node newNode = new Node();
                        System.out.print("Enter the element to insert: ");
                        newNode.info = sc.nextInt();
                        newNode.next = null;
                        front = rear = newNode;
                        System.out.println(newNode.info + " inserted successfully.");
                    } else {
                        Node newNode = new Node();
                        System.out.print("Enter the element to insert: ");
                        newNode.info = sc.nextInt();
                        newNode.next = null;
                        rear.next = newNode;
                        rear = newNode;
                        System.out.println(newNode.info + " inserted successfully.");
                    }
                    break;
                case 2:
                    if (front == null) {
                        System.out.println("Queue is Empty! Deletion not possible.");
                    } else {
                        System.out.println("Deleted element: " + front.info);
                        front = front.next;
                        if (front == null) {
                            rear = null;
                        }
                    }
                    break;
                case 3:
                    display(front);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}
