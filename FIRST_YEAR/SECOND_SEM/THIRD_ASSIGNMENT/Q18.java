public class Q18 {
    public static void Hanoi(int n,char start,char mid,char end){
        if(n==1){
            System.out.println("Move disk 1 from " + start + " to " + end);
        return;
        }
        Hanoi(n-1,start,end,mid);

       System.out.println("Move disk " + n + " from " + start + " to " + end);

        Hanoi(n-1,mid,start,end);

    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println("Steps to solve Towers of Hanoi with " + n + " disks:");
        Hanoi(n, 'A', 'B', 'C');
    }
}
