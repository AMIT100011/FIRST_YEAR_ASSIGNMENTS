import java.util.Scanner;

class Node {
    protected int regd_no;
    protected float mark;
    protected Node next;
    protected Node prev;

    Node(int regd_no, float mark) {
        this.regd_no = regd_no;
        this.mark = mark;
        this.next = null;
        this.prev = null;
    }
}
 class NodePair {
    Node start;
    Node end;

    NodePair(Node start, Node end) {
        this.start = start;
        this.end = end;
    }
}


public class Doubly_LinkedList {
    static Scanner sc = new Scanner(System.in);

    public static NodePair create(Node start, Node end) {
        System.out.println("Enter regd_no and mark (-1 to stop):");
        while (true) {
            int regd_no = sc.nextInt();
            if (regd_no == -1) break;
            float mark = sc.nextFloat();
            Node newNode = new Node(regd_no, mark);
            if (start == null) {
                start = end = newNode;
            } else {
                end.next = newNode;
                newNode.prev = end;
                end = newNode;
            }
        }
        return new NodePair(start, end);
    }

    public static void display(Node start, Node end) {
        if (start == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = start;
        System.out.println("Doubly Linked List:");
        while (temp != null) {
            System.out.println("Regd_no: " + temp.regd_no + ", Mark: " + temp.mark);
            temp = temp.next;
        }
    }

    public static Node insBeg(Node start, Node end) {
        System.out.print("Enter regd_no and mark to insert at beginning: ");
        int regd_no = sc.nextInt();
        float mark = sc.nextFloat();
        Node newNode = new Node(regd_no, mark);
        if (start == null) {
            start = end = newNode;
        } else {
            newNode.next = start;
            start.prev = newNode;
            start = newNode;
        }
        return start;
    }

    public static NodePair insEnd(Node start, Node end) {
        System.out.print("Enter regd_no and mark to insert at end: ");
        int regd_no = sc.nextInt();
        float mark = sc.nextFloat();
        Node newNode = new Node(regd_no, mark);
        if (end == null) {
            start = end = newNode;
        } else {
            end.next = newNode;
            newNode.prev = end;
            end = newNode;
        }
        return new NodePair(start,end);
    }

    public static Node insAny(Node start, Node end) {
        System.out.print("Enter position (1-based), regd_no and mark: ");
        int pos = sc.nextInt();
        int regd_no = sc.nextInt();
        float mark = sc.nextFloat();

        Node newNode = new Node(regd_no, mark);

        if (pos == 1) {
            return insBeg(start, end);
        }

        Node temp = start;
        for (int i = 1; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;

        return start;
    }

    public static Node delBeg(Node start, Node end) {
        if (start == null) {
            System.out.println("List is empty.");
            return null;
        }
        System.out.println("Deleted node: " + start.regd_no);
        if (start == end) {
            return null;
        }
        start = start.next;
        start.prev = null;
        return start;
    }

    public static Node delEnd(Node start, Node end) {
        if (end == null) {
            System.out.println("List is empty.");
            return null;
        }
        System.out.println("Deleted node: " + end.regd_no);
        if (start == end) {
            return null;
        }
        end = end.prev;
        end.next = null;
        return end;
    }

    public static Node delAny(Node start, Node end) {
        System.out.print("Enter position (1-based) to delete: ");
        int pos = sc.nextInt();
        if (start == null) {
            System.out.println("List is empty.");
            return null;
        }
        if (pos == 1) {
            return delBeg(start, end);
        }

        Node temp = start;
        for (int i = 1; temp != null && i < pos; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position.");
            return start;
        }

        if (temp == end) {
            return delEnd(start, end);
        }

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        System.out.println("Deleted node: " + temp.regd_no);
        return start;
    }

    public static void search(Node start) {
        if (start == null) {
            System.out.println("List is empty.");
            return;
        }
        System.out.print("Enter regd_no to search: ");
        int key = sc.nextInt();
        Node temp = start;
        while (temp != null) {
            if (temp.regd_no == key) {
                System.out.print("Enter new mark: ");
                float newMark = sc.nextFloat();
                temp.mark = newMark;
                System.out.println("Mark updated successfully.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Node with regd_no " + key + " not found.");
    }

    public static void main(String[] args) {
        Node start = null, end = null;
        while (true) {
            System.out.println("\n**** MENU *****");
            System.out.println("0: Exit");
            System.out.println("1: Creation");
            System.out.println("2: Display");
            System.out.println("3: Insert at Beginning");
            System.out.println("4: Insert at End");
            System.out.println("5: Insert at Any Position");
            System.out.println("6: Delete from Beginning");
            System.out.println("7: Delete from End");
            System.out.println("8: Delete from Any Position");
            System.out.println("9: Search and Update");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    NodePair result = create(start,end);
                    start = result.start;
                    end = result.end;
                    break;

                case 2:
                    display(start, end);
                    break;
                case 3:
                    start = insBeg(start, end);
                    break;
                case 4:
                    NodePair res = create(start,end);
                    start = res.start;
                    end = res.end;
                    break;
                case 5:
                    start = insAny(start, end);
                    break;
                case 6:
                    start = delBeg(start, end);
                    break;
                case 7:
                    end = delEnd(start, end);
                    break;
                case 8:
                    start = delAny(start, end);
                    break;
                case 9:
                    search(start);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}
