
class Deposit {

    long Principle;
    int time;
    double rate;
    static double Total_amt;

    public Deposit() {

    }

    Deposit(long Principle, int time, double rate) {
        this.Principle = Principle;
        this.time = time;
        this.rate = rate;

    }

    Deposit(long Principle, int time) {
        this.Principle = Principle;
        this.time = time;
    }

    Deposit(long Principle, double rate) {
        this.Principle = Principle;
        this.rate = rate;
    }

    void display() {
        System.out.println("Principle : " + Principle);
        System.out.println("Time : " + time);
        System.out.println("Rate : " + rate);
        System.out.println("Total amoutn : " + cost_amt());
    }

    double cost_amt() {
        Total_amt = Principle + (Principle * rate * time) / 100;
        return Total_amt;
    }

}

public class Q4 {

    public static void main(String[] args) {
        Deposit a = new Deposit();

        Deposit b = new Deposit(100, 2, 0.05);

        Deposit c = new Deposit(200, 2);

        Deposit d = new Deposit(300, 0.04);

        a.display();
        b.display();
        c.display();
        d.display();

    }
}
