/**
   Chapter 9b - Expressions and Arithmetic Operators
   Programming Exercises 1-3

   @author  Rohan Chaudhary
   @version 3-26-23

   @author  Period - 7
   @author  Assignment - Ch09bEx1_3

   @author  Sources - N/A
 */
public class Ch09bEx1_3
{
    public Ch09bEx1_3()
    {
    }

    /**
      A method that averages the rain fall for three months, April, May,
      and June. Declares and initializes a variable to the rain fall for
      each month, computes the average, and writes out the results
      something like:

        Rainfall for April: 12
        Rainfall for May:   14
        Rainfall for June:  8
        Average rainfall:   11.333333333333334
     */
    public void averageRainFall()
    {
        int aprF, mayF, junF;
        aprF = 12;
        mayF = 14;
        junF = 8;
        double averagRnd = (aprF + mayF + junF) / 3.0;
        System.out.println("Rainfall for April:\t" + aprF);
        System.out.println("Rainfall for May:\t" + mayF);
        System.out.println("Rainfall for June:\t" + junF);
        System.out.println("Average Rainfall:\t" + averagRnd);
    }

    /**
        A program that:
    
           1. Computes the sine of 0.5236 radians and saves it in a variable.
           2. Computes the cosine of 0.5236 radians and saves it in another variable.
           3. Computes the square of each those two values (use the variables),
              adds the two squares, and saves the result (in a third variable.)
           4. Writes out the three variables.
    
        The output statement should be something like:
        
            System.out.println("sine: " + sinx + " cosine: " + cosx + " sum: " + sum );
     */
    public void trigonometry()
    {
        double sin = Math.sin(.5236);
        double cos = Math.cos(.5236);
        double ans = (Math.pow(sin,2) + Math.pow(cos,2));
        System.out.println("sine: " + sin + " cosine: " + cos + " sum: " + ans);

    }

    /**
        Does the same things as the Trigonometry method (above), but the
        angle used is 30 degrees (which you will convert into radians.)
         
        To convert an angle given in degrees to radians do this:
        
            rad = degrees * Math.PI/180
        
        Math.PI gives you an accurate value of PI.
     */
    public void degreesToRadians()
    {
        double rad = 30 * (Math.PI / 180);
        double sin = Math.sin(rad);
        double cos = Math.cos(rad);
        double ans = (Math.pow(sin,2) + Math.pow(cos,2));
        System.out.println("sine: " + sin + " cosine: " + cos + " sum: " + ans);
    }

    /**
        Testing method: instantiates a Lesson09Exercises object and
        then invokes each method
        
        @param  args  command-line parameters (not used)
     */
    public static void main (String[] args )
    {
        Ch09bEx1_3 exercise = new Ch09bEx1_3();

        exercise.averageRainFall();
        System.out.println();

        exercise.trigonometry();
        System.out.println();

        exercise.degreesToRadians();
        System.out.println();
    }
}
