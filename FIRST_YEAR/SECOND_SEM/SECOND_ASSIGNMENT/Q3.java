
class Book {

    int bookId;
    double price;
    int quantity;
    static double totalAmount;

    Book(int bookId, double price, int quantity) {
        this.bookId = bookId;
        this.price = price;
        this.quantity = quantity;

    }

    double cost(double price, int quantity) {
        totalAmount = price * quantity;
        return totalAmount;

    }

    void displayDetails() {
        System.out.println(" BOOKID : " + this.bookId);
        System.out.println(" PRICE : " + this.price);
        System.out.println(" QUANITITY : " + this.quantity);
        System.out.println(" total cost : " + cost(this.price, this.quantity));
    }

}

public class Q3 {

    public static void main(String[] args) {
        Book a = new Book(1, 210.0, 2);
        Book b = new Book(2, 330.0, 3);
        Book c = new Book(3, 130.0, 5);
        Book d = new Book(4, 510.0, 1);
        Book e = new Book(5, 450.0, 6);

        a.displayDetails();
        b.displayDetails();
        c.displayDetails();
        d.displayDetails();
        e.displayDetails();

    }
}
