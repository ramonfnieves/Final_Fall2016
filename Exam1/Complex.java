
public class Complex {

	double real;
	double imaginary;

	public Complex(double r, double i) {
		real = r;
		imaginary = i;	
	}

	public double getImaginary() {
		return imaginary;
	}

	public double getReal() {
		// TODO Auto-generated method stub
		return real;
	}

	public Complex conjugate() {
		return new Complex(this.real, this.imaginary*(-1));
	}

	public Complex subtract(Complex c2) {
		
		return new Complex(this.getReal()-c2.getReal(), (this.getImaginary()-c2.getImaginary()));
	}
	
	
}
