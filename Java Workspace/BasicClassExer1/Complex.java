/**
   Complex - a basic class that represents a complex number a + bi where a and b are integers

   @author  Rohan Chaudhary
   @version 4-30-26

   @author  Period - 7
   @author  Assignment - Complex

   @author  Sources - N/A
 */
public class Complex {
	
    private int real;
    private int imag;
    /**
     * Constructor
     * 
     * @param r - real component 
     * @param i - imag component 
     */
	public Complex(int r,int i) {
        real = r;
        imag = i;
    }


    /**
     * Gets the real component
     * 
     * @return real 
     */
	public int getReal() {
        return(real);
    }

	
    /**
     * Gets the real component
     * 
     * @return imag 
     */
	public int getImag() {
        return(imag);
    }

	
    /**
     * Calculates the magnitude of the complex number
     * 
     * @return magnutude - sqrt(r^2 + i^2) 
     */
	public double magnitude() {
        return(Math.sqrt(Math.pow(real,2) + Math.pow(imag,2)));
    }

	
    /**
     * Generate the conjugate of the number
     * 
     * @return conjugate 
     */
	public Complex conjugate() {
        Complex conj = new Complex(real,-imag);
        return(conj);
    }
	
    /**
     * Adds two complex numbers
     * 
     * @return sum of two numbers 
     */
	public Complex add(Complex x) {
        Complex sum = new Complex(real + x.getReal(), imag + x.getImag());
        return(sum);
    }
	

    /**
     * For System.out.println() support
     * 
     * Ex. 3 + 4i
     *     3
     *     -5i
     *     -2 - 6i
     * 
     * @return nicely formatted complex number
     */
	public String toString() {
        String out = "";
        if (real == 0) {
            out = imag + "i";
            return (out);
        }
        out += real;
        if (imag > 0) {
            out += " + " + imag + "i";
        }
        else if (imag < 0) {
            out += " - " + (-imag) + "i";
        }
        return(out); 
    }

	public static void main(String[] args) {
		Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(6, 10);
        double m1 = c1.magnitude();
        Complex c3 = c2.conjugate();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(m1);
        System.out.println(c3);

	}

}
