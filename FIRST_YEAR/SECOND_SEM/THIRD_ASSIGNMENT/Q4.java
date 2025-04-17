class Box<T>{
    T content;
    public void set(T content){
        this.content = content;
    }
    public T get() {
        return content;
    }
}



public class Q4 {
    public static void main(String[] args) {
        Box<String> a = new Box<>();
        a.set("Hello");
        System.out.println(" before change: " + a.get());
        a.set("world");
        System.out.println("after change: " + a.get());

        Box<Integer> c = new Box<>();
        Box<Integer> cref = c;
        cref.set(1);
        System.out.println("\nintBoxRef before change: " + cref.get());

        cref.set(99);
        System.out.println("intBox after change via intBoxRef: " + cref.get());
        Box<Object> objectBox = new Box<>();
        Box<Object> objectBoxRef = objectBox;

        objectBox.set("A string");
        System.out.println("\nobjectBox with String: " + objectBoxRef.get());

        objectBox.set(123); // replaces the string
        System.out.println("objectBox with Integer: " + objectBoxRef.get());
    }

}
