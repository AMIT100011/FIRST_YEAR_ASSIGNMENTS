import java.util.*;

public class Stack_Array_Implementation {

    public static int push(int[] arr,int top){
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to push = ");
        int x = sc.nextInt();
        if(isFull(top)){
            System.out.println("stack is full");
            return top;
        }
        top++;
        arr[top] = x ;
        return top;
    }
    public static int pop(int[] arr,int top){
        if(isEmpty(top)){
            System.out.println("stack is empty");
            return -1;
        }
        int x = arr[top];
        top--;
        System.out.println("element removed was = " + x);
        return top;
    }
    public static void display(int s[],int top){
        for (int i = top; i >= 0 ; i--) {
            System.out.print(s[i] + " ");
        }
        System.out.println();
    }

    public static boolean isFull(int top) {
            return top == MAX - 1;
    }
    public static boolean isEmpty(int top) {
           return top == -1;
    }


    public static final int MAX = 10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stack[] = new int[MAX];
        int top = -1;
        while (true) {
            System.out.println("***MENU***");
            System.out.println("0: Exit");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Display");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    top = push(stack,top);
                    break;
                case 2:
                    top = pop(stack,top);
                    break;
                case 3:
                    display(stack,top);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
