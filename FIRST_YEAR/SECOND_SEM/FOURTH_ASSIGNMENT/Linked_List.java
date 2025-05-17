
import java.util.Scanner;

class Node {

    protected int regd_no;
    protected float mark;
    protected Node next;

    Node(int r, float m) {
        this.regd_no = r;
        this.mark = m;
        this.next = null;
    }
}

class LL {

    static Scanner sc = new Scanner(System.in);

    public static Node create(Node start) {
        System.out.print("Enter regd_no: ");
        int regd_no = sc.nextInt();
        System.out.print("Enter mark: ");
        float mark = sc.nextFloat();
        Node a = new Node(regd_no, mark);
        if (start == null) {
            return a;
        }

        Node temp = start;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = a;
        return start;

    }

    public static Node InsBeg(Node start) {
        System.out.print("Enter regd_no: ");
        int regd_no = sc.nextInt();
        System.out.print("Enter mark: ");
        float mark = sc.nextFloat();
        Node newNode = new Node(regd_no, mark);
        newNode.next = start;
        start = newNode;
        return start;

    }

    public static Node InsEnd(Node head) {
        System.out.print("Enter regd_no: ");
        int regd_no = sc.nextInt();
        System.out.print("Enter mark: ");
        float mark = sc.nextFloat();
        Node x = new Node(regd_no, mark);
        if (head == null) {
            return x; // First node in the list
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = x;

        return head;
    }

    public static Node InsAny(Node start) {
        System.out.print("Enter position to insert at: ");
        int index = sc.nextInt();
        if (index <= 0) {
            System.out.println("Invalid position");
            return start;
        }
        System.out.print("Enter regd_no: ");
        int regd_no = sc.nextInt();
        System.out.print("Enter mark: ");
        float mark = sc.nextFloat();
        Node x = new Node(regd_no, mark);
        if (index == 1) {
            InsBeg(start);
        }
        Node temp = start;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        x.next = temp.next;
        temp.next = x;
        return start;

    }

    public static Node DelBeg(Node start) {
        if (start == null) {
            System.out.println("List is empty.");
            return null;
        }
        return start.next;
    }

    public static Node DelEnd(Node start) {
        if (start == null || start.next == null) {
            return null;
        }
        Node temp = start;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return start;

    }

    public static Node DelAny(Node start) {
        System.out.print("Enter position to delete: ");
        int pos = sc.nextInt();
        if (start == null || pos <= 0) {
            System.out.println("Invalid position.");
            return start;
        }
        if (pos == 1) {
            return start.next;
        }

        Node temp = start;
        for (int i = 0; i < pos - 1; i++) {
            if (temp == null || temp.next == null) {
                System.out.println("Index out of bounds.");
                return start;
            }
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Index out of bounds.");
            return start;
        }

        temp.next = temp.next.next;
        return start;
    }

    public static void search(Node start,int key) {

        Node temp = start;
        int i = 0;
        while (temp != null) {
           if(temp.mark == key){
               System.out.println("Present in : " + i);
           }
           i++;
            temp = temp.next;
        }
    }

    public static void sort(Node head) {
        // Bubble Sort
        if (head == null) {
            return;
        }
        int n = count(head); 

        for (int i = 0; i < n - 1; i++) {
            Node curr = head;
            Node nextNode = head.next;

            for (int j = 0; j < n - i - 1; j++) {
                if (curr.mark > nextNode.mark) {
                    // Swap data
                    float temp = curr.mark;
                    curr.mark = nextNode.mark;
                    nextNode.mark = temp;
                }

                curr = curr.next;
                nextNode = nextNode.next;
            }
        }
    }

    public static int count(Node start) {
       int size = 0;
        Node temp = start;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    public static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;


    }

    public static Node DelByRegdNo(Node start) {
        System.out.print("Enter regd_no to delete: ");
        int regd_no = sc.nextInt();

        if (start == null) {
            return null;
        }
        if (start.regd_no == regd_no) {
            return start.next;
        }

        Node temp = start;
        while (temp.next != null && temp.next.regd_no != regd_no) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Regd_no not found.");
            return start;
        }
        temp.next = temp.next.next;
        return start;
    }

    public static void display(Node start) {
        if (start == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = start;
        while (temp != null) {
            System.out.println("Regd No: " + temp.regd_no + ", Mark: " + temp.mark);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node head = null;
        while (true) {

            System.out.println("\n***** MENU *****");
            System.out.println("0: Exit");
            System.out.println("1: Create Node");
            System.out.println("2: Insert at Beginning");
            System.out.println("3: Insert at End");
            System.out.println("4: Insert at Any Position");
            System.out.println("5: Delete from Beginning");
            System.out.println("6: Delete from End");
            System.out.println("7: Delete from Any Position");
            System.out.println("8: Delete by Regd_no");
            System.out.println("9: Search and Update Mark");
            System.out.println("10: Sort by Mark");
            System.out.println("11: Count Nodes");
            System.out.println("12: Reverse List");
            System.out.println("13: Display");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    head = create(head);
                    break;
                case 2:
                    head = InsBeg(head);
                    break;
                case 3:
                    head = InsEnd(head);
                    break;
                case 4:
                    head = InsAny(head);
                    break;
                case 5:
                    head = DelBeg(head);
                    break;
                case 6:
                    head = DelEnd(head);
                    break;
                case 7:
                    head = DelAny(head);
                    break;
                case 8:
                    head = DelByRegdNo(head);
                    break;
                case 9:int key = 0;
                    search(head,key);
                    break;
                case 10:
                    sort(head);
                    break;
                case 11:
                    System.out.println("Total Nodes: " + count(head));
                    break;
                case 12:
                    head = reverse(head);
                    break;
                case 13:
                    display(head);
                    break;
                default:
                    System.out.println("Invalid choice.");

            }
        }
    }
}
