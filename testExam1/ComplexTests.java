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
	   @Test
	    public void testDivide() {
	      Complex c = new Complex(2,-3);
	            assertEquals("divide: Wrong real part", zero.divide(one).getReal(), 0, epsilon);
	            assertEquals("divide: Wrong imaginary part", zero.divide(one).getImaginary(), 0, epsilon);
	            assertEquals("divide: Wrong real part", i.divide(one).getReal(), 0, epsilon);
	            assertEquals("divide: Wrong imaginary part", i.divide(one).getImaginary(), 1, epsilon);
	            assertEquals("divide: Wrong real part", c.divide(c).getReal(), 1, epsilon);
	            assertEquals("divide: Wrong imaginary part", c.divide(c).getImaginary(), 0, epsilon);
	    }
	   
	   @Test
	   public void testReciprocal() {
	     Complex c = new Complex(0.5,0.5);
	     assertEquals("reciprocal: Wrong real part", one.reciprocal().getReal(), 1, epsilon);
	     assertEquals("reciprocal: Wrong imaginary", one.reciprocal().getImaginary(), 0, epsilon);
	     assertEquals("reciprocal: Wrong real part", i.reciprocal().getReal(), 0, epsilon);
	     assertEquals("reciprocal: Wrong imaginary part", i.reciprocal().getImaginary(), -1, epsilon);
	     assertEquals("reciprocal: Wrong real part", c.reciprocal().getReal(), 1, epsilon);
	     assertEquals("reciprocal: Wrong imaginary part", c.reciprocal().getImaginary(), -1, epsilon);
	   }
}