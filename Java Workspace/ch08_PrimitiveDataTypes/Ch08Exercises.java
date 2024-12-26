/**
    Chapter 08 - Primitive Data Types
    Programming Exercises 1-4

    @author  Rohan Chaudhary
    @version 3-22-24

    @author  7
    @author  ch8_PrimitiveDataTypes

    @author  Sources - N/A
 */
public class Ch08Exercises
{
    public Ch08Exercises()
    { }

    /**
        A method to explore the short data type
     */
    public void shortEg()
    {
        int value = 35000;
        System.out.println("A short: " +  value);
    }

    /**
        A method to explore the double data type
     */
    public void doubleEg()
    {
        double value = 300;
        System.out.println("A double: " +  value);
    }

    /**
        The following method explores the primitive data type double.
        This program computes and writes out the value of exp(32).
        This is the base of natural logarithms "e" raised to the power 32.
        (Don't worry much about this. The point of the program is not the
        math but the floating point numbers.)
     */
    public void doubleCrash()
    {
        double value = 32;
        System.out.println("e to the power value: " +  Math.exp( value ) );  
    }

    /**
        A method to explore the char data type
     */
    public void charEg()
    {
        char ch =  'A';
        System.out.println("A char: " +  ch );  
    }

    /**
        Testing method: instantiates a Ch08Ex1_4 object and
        then invokes each method

        @param  args  command line parameters (not used)
     */
    public static void main (String[] args )
    {
        Ch08Exercises exercise = new Ch08Exercises();

        exercise.shortEg();
        System.out.println();

        exercise.doubleEg();
        System.out.println();

        exercise.doubleCrash();
        System.out.println();

        exercise.charEg();
        System.out.println();
    }
}
