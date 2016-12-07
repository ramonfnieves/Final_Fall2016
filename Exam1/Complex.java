
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

	public Complex divide(Complex c2) {

		return new Complex((this.getReal()*c2.getReal()+this.getImaginary()*c2.getImaginary())/(Math.pow(c2.getReal(),2)+Math.pow(c2.getImaginary(), 2)),((this.getImaginary()*c2.getReal()-this.getReal()*this.getImaginary())/(Math.pow(c2.getReal(), 2)+(Math.pow(c2.getImaginary(),2)))));
	}

	public Complex reciprocal() {

		return new Complex(this.getReal()/(Math.pow(this.getReal(), 2)+Math.pow(this.getImaginary(), 2)), (-1)*this.getImaginary()/(Math.pow(this.getReal(), 2)+Math.pow(this.getImaginary(), 2)));
	}
	
	
}
