
class Complex {

    int real;
    int imag;

    void setData(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    public void Display() {
        System.out.println("Sum of complex number is : " + this.real + " + i" + this.imag);
    }

    public Complex add(Complex i, Complex j) {
        Complex result = new Complex();
        result.real = i.real + j.real;
        result.imag = i.imag + j.imag;

        return result;

    }

}

public class Q2 {

    public static void main(String[] args) {

        Complex c1 = new Complex();
        Complex c2 = new Complex();

        Complex res = new Complex();
        c1.setData(5, 10);
        c2.setData(6, 7);
        res = res.add(c1, c2);
        res.Display();
    }
}
