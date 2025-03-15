
interface flyable {

    void fly();
}

interface swimmable {

    void swim();
}

class Duck implements flyable, swimmable {

    String name;

    Duck(String name) {
        this.name = name;
    }

    public void fly() {
        System.out.println("It can fly");
    }

    public void swim() {
        System.out.println("It can swim");
    }

    void display() {
        System.out.println("Duck name : " + this.name);
        System.out.println("Abilities : ");
        swim();
        fly();
    }

}

public class Q8 {

    public static void main(String[] args) {
        Duck duck = new Duck("Monarch");

        duck.display();
    }
}
