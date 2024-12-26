import java.util.*;

/**
 * Chapter 14 - Boolean Expressions Programming Exercises 1-4.
 * 
 * @author Rohan Chaudhary
 * @version 4-5-23
 * 
 * @author 7
 * @author Assignment - Ch14Ex1to4
 * 
 * @author Sources - N/A
 */
public class Ch14Ex1to4
{
    Scanner scan;

    /**
     * Constructs a Scanner for input from the console.
     */
    public Ch14Ex1to4()
    {
        scan = new Scanner( System.in );
    }

    /**
     * Constructs a Scanner to evaluate passed input (used for testing).
     * 
     * @param str  input for the various methods
     */
    public Ch14Ex1to4( String str )
    {
        scan = new Scanner( str );
    }

    /**
     * Calculates check charge based on acc balance
     */
    public void checkCharge()
    {
        double c, s;
        System.out.println("Enter balance of checking acc");
        c =  scan.nextDouble();
        System.out.println("Enter balance of savings acc");
        s =  scan.nextDouble();
        double sCharge = 0.0;
        if (!(c >1000.0|| s > 1500.0)) {
            sCharge += .15;
        }
        System.out.println(sCharge);
    }

    /**
     * Given tire pressure, returns if it is alright or not.
     */
    public void tirePressure()
    {
        int rf,lf, rb, lb;
        rf = scan.nextInt();
        lf = scan.nextInt();
        rb = scan.nextInt();
        lb = scan.nextInt();
        if (rf == lf && rb == lb) {
            System.out.println("OK");
        }
        else {
            System.out.println("BAD");
        }
    }

    /**
     * Checks if it is within range
     */
    public void moreTirePressure()
    {
        int rf,lf, rb, lb;
        rf = scan.nextInt();
        boolean goodPressure = true;
        if (rf < 35 || rf > 45) {
            System.out.println("Warning: pressure is out of range");
            goodPressure = false;
        }
        lf = scan.nextInt();
        if (lf < 35 || lf > 45) {
            System.out.println("Warning: pressure is out of range");
            goodPressure = false;

        }
        rb = scan.nextInt();
        if (rb < 35 || rb > 45) {
            System.out.println("Warning: pressure is out of range");
            goodPressure = false;
        }
        lb = scan.nextInt();
        if (lb < 35 || lb > 45) {
            System.out.println("Warning: pressure is out of range");
            goodPressure = false;
        }
        if ((rf == lf && rb == lb) && goodPressure == true) {
            System.out.println("OK");
        }
        else {
            System.out.println("BAD");
        }
        if (goodPressure == false) {
            System.out.println("Warning: pressure is out of range");
        }
        // Warning: pressure is out of range
    }

    /**
     * Checks with leniency.
     */
    public void pressureIsBuilding()
    {
        int rf,lf, rb, lb;
        rf = scan.nextInt();
        boolean goodPressure = true;
        if (rf < 35 || rf > 45) {
            System.out.println("Warning: pressure is out of range");
            goodPressure = false;
        }
        lf = scan.nextInt();
        if (lf < 35 || lf > 45) {
            System.out.println("Warning: pressure is out of range");
            goodPressure = false;

        }
        rb = scan.nextInt();
        if (rb < 35 || rb > 45) {
            System.out.println("Warning: pressure is out of range");
            goodPressure = false;
        }
        lb = scan.nextInt();
        if (lb < 35 || lb > 45) {
            System.out.println("Warning: pressure is out of range");
            goodPressure = false;
        }
        if ((Math.abs(rf  - lf) < 4 && Math.abs(rb  - lb) < 4) && goodPressure == true) {
            System.out.println("OK");
        }
        else {
            System.out.println("BAD");
        }
        if (goodPressure == false) {
            System.out.println("Warning: pressure is out of range");
        }
    }

    /**
     * Testing method: instantiates a Ch14Ex1to4 object and then
     * invokes each method.
     * 
     * @param args  command line parameters (not used)
     */
    public static void main( String[] args )
    {
        Scanner kbd = new Scanner( System.in );
        boolean done = false;

        Ch14Ex1to4 exercise = new Ch14Ex1to4();

        do
        {
            System.out.println();
            System.out.println();
            System.out.println( "Make a selection" );
            System.out.println();
            System.out.println( "   (1) Check Charge" );
            System.out.println( "   (2) Tire Pressure" );
            System.out.println( "   (3) More Tire Pressure" );
            System.out.println( "   (4) The Pressure is Building" );
            System.out.println( "   (Q) Quit" );
            System.out.println();
            System.out.print( "Enter a choice:  " );
            String response = kbd.nextLine();

            if ( response.length() > 0 )
            {
                System.out.println();

                switch ( response.charAt( 0 ) )
                {
                    case '1':
                        exercise.checkCharge();
                        break;
                    case '2':
                        exercise.tirePressure();
                        break;
                    case '3':
                        exercise.moreTirePressure();
                        break;
                    case '4':
                        exercise.pressureIsBuilding();
                        break;
                    default:
                        if ( response.toLowerCase().charAt( 0 ) == 'q' )
                        {
                            done = true;
                        }
                        else
                        {
                            System.out.print( "Invalid Choice" );
                        }
                        break;
                }
            }
        } while ( !done );
        
        System.out.println( "Goodbye!" );
    }
}
