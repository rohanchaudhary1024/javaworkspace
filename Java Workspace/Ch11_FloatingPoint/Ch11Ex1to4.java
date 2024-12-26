import java.util.Scanner;

/**
   TODO Write a one-sentence summary of your class here.
   TODO Follow it with additional details about its purpose, what abstraction
   it represents, and how to use it.

   @author  Rohan Chaudhary
   @version 3-28-23

   @author  Period - 7
   @author  Assignment - Ch11_FloatingPoint

   @author  Sources - N/A
 */
public class Ch11Ex1to4
{
    Scanner scan;

    /**
     * Constructs a Scanner for input from the console.
     */
    public Ch11Ex1to4()
    {
        scan = new Scanner( System.in );
    }


    /**
     * Constructs a Scanner to evaluate passed input (used for testing).
     * 
     * @param str input for the various methods
     */
    public Ch11Ex1to4( String str )
    {
        scan = new Scanner( str );
    }

    /**
     * Given cost per hour of an appliance (cents), and the amount of hours used per year, outputs annual cost.
     */
    public void annualCost()
    {   
        double cph, hours;
        System.out.println("Enter cost per kilowatt-hour in cents");
        cph = scan.nextDouble();
        hours = scan.nextDouble();
        System.out.println("Enter kilowatt-hours used per year");
        double annCost = (cph * hours) / 100;
        System.out.println("Annual cost:" + annCost);
    }

    /**
     * Given seconds, returns distance of brick falling, given distance, records time of falling.
     */
    public void fallingBrick()
    {
        double seconds;
        System.out.println("Enter the number of seconds: ");
        seconds = scan.nextDouble();
        double distance = (.5) * 32.174 * (Math.pow(seconds,2));
        System.out.println( "The brick fell " + distance + " feet in " + seconds+ " seconds." );
        System.out.println("Enter the distance: ");
        distance = scan.nextDouble();
        seconds = (Math.sqrt((distance* 2.0)/ 32.174));
        System.out.println( "The brick fell " + distance + " feet in " + seconds+ " seconds." );
    }

    /**
     * Given double, returns base two log
     */
    public void base2Log()
    {
        double x;
        System.out.println("Enter a double: ");
        x = scan.nextDouble();
        double output = Math.log(x) / Math.log(2.0);
        System.out.println("Base 2 log of " + x + " is " + output);
    }

    /**
     * For X and Y, finds harmonic and arithmetic mean.
     */
    public void harmonicMean()
    {
        double x, y;
        System.out.println("Enter X: ");
        x = scan.nextDouble();
        System.out.println("Enter Y:");
        y = scan.nextDouble();
        double arithMean = (x + y) / 2.0;
        System.out.println("Arithmetic Mean: " + arithMean);
        double harmMean = 2.0 / (1.0/x + 1.0 / y);
        System.out.println("Harmonic Mean: " + harmMean);
    }

    /**
     * Testing method: instantiates a Ch11Ex1_4 object and then
     * invokes each method
     * 
     * @param args command-line parameters (not used)
     */
    public static void main( String[] args )
    {
        Scanner kbd = new Scanner( System.in );
        boolean done = false;

        Ch11Ex1to4 exercise = new Ch11Ex1to4();

        do
        {
            System.out.println();
            System.out.println();
            System.out.println( "Make a selection" );
            System.out.println();
            System.out.println( "    (1) Annual Cost of Running an Appliance" );
            System.out.println( "    (2) Falling Brick" );
            System.out.println( "    (3) Base 2 Logarithm of a Number" );
            System.out.println( "    (4) Harmonic Mean" );
            System.out.println( "    (Q) Quit" );
            System.out.println();
            System.out.print( "Enter a choice:  " );
            String response = kbd.nextLine();

            if ( response.length() > 0 )
            {
                System.out.println();

                switch ( response.charAt( 0 ) )
                {
                    case '1':
                        exercise.annualCost();
                        break;
                    case '2':
                        exercise.fallingBrick();
                        break;
                    case '3':
                        exercise.base2Log();
                        break;
                    case '4':
                        exercise.harmonicMean();
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
