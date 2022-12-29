public class ComplexTest {
    private double real;
    private double imag;
    public Complex(double real,double image){
        this.real = real;
        this.imag = image;
    }
    public String AddComplex(Complex A1,Complex A2){
        real = A1.real + A2.real;
        imag = A1.imag + A2.imag;
        return real +" + "+imag+"i";
    }
    public String SubComplex(Complex A1,Complex A2){
        real = A1.real - A2.real;
        imag = A1.imag - A2.imag;
        return real +" - "+imag+"i";
    }
    public void printComplex(Complex A1,Complex A2){
        System.out.println("for addition "+AddComplex(A1, A2));
        System.out.println("for substraction "+SubComplex(A1, A2));
    }
}