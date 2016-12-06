import static org.junit.Assert.*;
import org.junit.Test;
public class ComplexTests {
    final double epsilon = 10e-20;
    Complex zero = new Complex(0,0);
    Complex i = new Complex(0,1);
    Complex one = new Complex(1,0);
    @Test
    public void testConstructorAndGetters() {
	Complex c = new Complex(0.0, 0.0);
	assertEquals("Constructor: returns wrong imaginary part", c.getImaginary(), 0.0, epsilon);
	assertEquals("Constructor: returns wrong real part", c.getReal(), 0.0, epsilon);
	c = new Complex(1.0,2.0);
	assertEquals("Constructor: returns wrong imaginary part", c.getImaginary(), 2.0, epsilon);
	assertEquals("Constructor: returns wrong real part", c.getReal(), 1.0, epsilon);
    }
    @Test
    public void testConjugate() {
	Complex j = new Complex(1,-2);
	assertEquals("conjugate: Wrong conjugate of 0", zero.conjugate().getReal(), 0, epsilon);
	assertEquals("conjugate: Wrong conjugate of i", i.conjugate().getImaginary(), -1, epsilon);
	assertEquals("conjugate: Wrong conjugate of 1-2i", j.conjugate().getReal(), 1, epsilon);
	assertEquals("conjugate: Wrong conjugate of 1-2i", j.conjugate().getImaginary(), 2, epsilon);
    }
    @Test
    public void testsubtract() {
      assertEquals("subtract: Wrong real part", zero.subtract(zero).getReal(), 0, epsilon);
            assertEquals("subtract: Wrong imaginary part", zero.subtract(zero).getImaginary(), 0, epsilon);
            assertEquals("subtract: Wrong real part", zero.subtract(one).getReal(), -1, epsilon);        
            assertEquals("subtract: Wrong imaginary part", zero.subtract(one).getImaginary(), 0, epsilon);
            assertEquals("subtract: Wrong real part", one.subtract(i).getReal(), 1, epsilon);
            assertEquals("subtract: Wrong imaginary part", one.subtract(i).getImaginary(), -1, epsilon);
    }
}