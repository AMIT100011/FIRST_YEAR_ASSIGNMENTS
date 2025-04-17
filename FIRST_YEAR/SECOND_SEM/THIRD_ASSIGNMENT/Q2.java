
public class Q2 {

    public static void main(String[] args) {
        String[] colors = {"Red", "Blue", "Green"};
        try {
            System.out.println(colors[4]);
            colors = null;
            System.out.println("First Color: " + colors[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: Tried to access invalid array index.");
        } catch (NullPointerException e) {
            System.out.println("Exception: Tried to access data from a null array.");
        }

        System.out.println("Program continues smoothly after handling exceptions.");
    }
}
