import java.util.*;
class Node
{
    int info;
    Node next;
    Node(int info){
        this.info = info;
        this.next = null;
    }
}
public class Stack_LinkedList_Implementation {
    public static Node push(Node top){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the element you want to push");
        int x = sc.nextInt();
        Node newNode = new Node(x);
        if(top == null){
            return newNode;
        }
        newNode.next = top;
        top = newNode;
        return top;

    }
    public static Node pop(Node top){
        if(top == null){
            return null;
        }
        return top.next;
    }
    public static void display(Node top){
        Node temp = top;
        while(temp != null){
            System.out.print(temp.info + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node top;
        top = null;
        while (true) {
            System.out.println("****MENU****");
            System.out.println("0:Exit");
            System.out.println("1:Push");
            System.out.println("2:Pop");
            System.out.println("3:Display");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    top = push(top);
                    break;
                case 2:
                    top = pop(top);
                    break;
                case 3:
                    display(top);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }}
