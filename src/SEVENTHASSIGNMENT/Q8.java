package SEVENTHASSIGNMENT;

import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a choice = ");
        int y = sc.nextInt();
        System.out.println("enter the array");
        int[] arr = new int[5];

        switch(y){
            case 1 :
                create(arr);
                break;
            case 2 :  create(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            break;
            case 3 :
                create(arr);
                System.out.println("enter the target index = ");
                int x = sc.nextInt();
                System.out.println("enter number to be inserted = ");
                int k = sc.nextInt();
                insert(arr,x,k);
                break;
            case 4 :
                create(arr);
                System.out.println("enter number to be deleted = ");
                int m = sc.nextInt();
                delete(arr,m);
                break;
            case 5 :
                System.out.println("Exit");break;
            default :
                System.out.println("invalid choice");break;

        }
    }

    private static void create(int [] arr) {
        Scanner sc = new Scanner((System.in));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    private static void delete(int[] arr, int m) {
        int [] n = new int [arr.length-1];int j = 0;
        for(int i=0;i < arr.length;i++)
        {
            if(m==arr[i])
            continue;
            else{
                n[j++] = arr[i];
            }

        }
        for (int k=0;k<n.length;k++) {

            System.out.print(n[k] + " ");
        }
    }

    private static void insert(int[] arr, int x,int k) {
        int [] m = new int [arr.length+1];
        for (int i = 0; i < arr.length + 1 ; i++)
        {
          if(i < x ){
              m[i] = arr[i];
          } else if (i == x) {
              m[i] = k;
          }
          else {
              m[i] = arr[i-1];
          }
        }
        for (int j = 0; j < m.length ; j++) {
            System.out.print(m[j] + " ");
        }
    }



    }

