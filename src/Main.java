class Complex {
 
    private double re, im;
 
    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }
}
 
public class Main {
     
    public static void main(String[] args) {
        Complex c1 = new Complex(10, 15);  
        Complex c2 = new Complex(c1);  // compiler error here
    }
}