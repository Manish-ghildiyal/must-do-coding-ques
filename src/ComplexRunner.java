class Complex {
    private double real;
    private double imag;
    //two constructors
    //1. default; 2.parameters initialize the instance variables

    public Complex () {
        real=0;
        imag=0;
    }

    public Complex(double realnum, double imagnum) {
        real=realnum;
        imag=imagnum;
    }
    //methods
    public void setReal(double newReal) {
        real= newReal;
    }
    public void setImag(double newImag) {
        imag=newImag;
    }
    public double getReal() {
        return real;
    }
    public double getImag() {
        return imag;
    }
    public void addComplex(Complex a ) {
        real+=a.real;
        imag+=a.imag;

    }
    public void subtractComplex(Complex b ) {
        System.out.println(this.real);
        System.out.println(b.real);
        this.real-=b.real;
        this.imag-=b.imag;
    }
    public void multiplyComplex(Complex c) {
        real= (real*c.real)-(imag * c.imag);
        imag= (real*c.imag)+(c.real*imag);

    }
    public String print() {
        if(imag==0) {
            return real + "";

        }
        else if(real==0) {
            return imag + "i";

        }
        else if(imag<0) {
            return real + "-" + (-imag) + "i";
        }
        else {
            return real + " + " + imag + "i";
        }
    }
}
public class ComplexRunner {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //numbers to test out
        Complex a = new Complex(7,4);
        Complex b = new Complex(23,-12);

        System.out.println("a=" +a.print());
        System.out.println("b=" +b.print());

        //calling the method to add the real
        //and imag numbers
        a.addComplex(b);
        System.out.println("a+b= " + a.print());
        //calling the method to subtract
        a.subtractComplex(b);
        System.out.println("a-b= "+ a.print());
        a.multiplyComplex(b);
        System.out.println("a*b= " + a.print());

    }

}
