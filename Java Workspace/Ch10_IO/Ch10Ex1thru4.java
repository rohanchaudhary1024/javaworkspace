import java.util.Scanner;

/**
    Allows five operations, that are listed.
    Additional details can be found in method description.
    
    @author  Rohan Chaudhary
    @version 3-28-24
    
    @author   Period - 7
    @author   Assignment - Ch10_IO
    
    @author   Sources - N/A
 */
public class Ch10Ex1thru4
{
    Scanner scan;

    /**
     *  Constructs a Scanner for input from the console.
     */
    public Ch10Ex1thru4()
    {
        scan = new Scanner( System.in );
    }

    /**
     * Constructs a Scanner to evaluate passed input (used for testing).
     * @param str input for the various methods
     */
    public Ch10Ex1thru4( String str )
    {
        scan = new Scanner( str );
    }

    /**
        Given the radius of a circle, calculates and outputs the area.
     */
    public void areaOfACircle()
    {
        System.out.println("Input the radius:");
        int rad;
        rad = scan.nextInt();
        double area = Math.PI * (Math.pow(rad,2));
        System.out.println("The radius is: " + rad);
        System.out.println("The area is: " + area);
    }

    /**
      Given a value in cents, converts to dollars + cents.
     */
    public void centsToDollars()
    {
        int cents;
        System.out.println("Input the cents:");
        cents = scan.nextInt();
        int dollars = cents / 100;
        int change = cents % 100;
        System.out.println("That is " + dollars + " dollars and " + change +  " cents.");
    }

    /**
      Given a value in cents, converts to 'change', using as little individual notes of currency as possible.
     */
    public void correctChange()
    {
        int cents;
        System.out.println("Input the cents:");
        cents = scan.nextInt();
        int dollars = cents / 100;
        cents = cents - (dollars * 100);
        int quarters = cents / 25;
        cents = cents - (quarters * 25);
        int dimes = cents / 10;
        cents = cents - (dimes * 10);
        int nickles = cents / 5;
        cents = cents - (nickles * 5);
        System.out.println(dollars + " dollar " +  quarters +  " quarter " +  dimes +  " dime " +  nickles +  " nickel " +   cents +  " cent ");

    }

    /**
      Given resistance in ohms and voltage in volts, outputs current in amps.
     */
    public void ohmsLaw()
    {
        int voltage = scan.nextInt();
        int resistance = scan.nextInt();
        double current = (voltage + 0.0) / resistance;
        System.out.println(current);
    }

    /**
      Testing method: instantiates a Lesson10Exercises object and then invokes
      each method.

      @param args  command-line parameters (not used)
     */
    public static void main( String[] args )
    {
        Scanner kbd = new Scanner( System.in );
        boolean done = false;

        Ch10Ex1thru4 exercise = new Ch10Ex1thru4();

        do
        {
            System.out.println();
            System.out.println();
            System.out.println( "Make a selection" );
            System.out.println();
            System.out.println( "    (1) Area of a Circle" );
            System.out.println( "    (2) Cents to Dollars" );
            System.out.println( "    (3) Correct Change" );
            System.out.println( "    (4) Ohm's Law" );
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
                        exercise.areaOfACircle();
                        break;
                    case '2':
                        exercise.centsToDollars();
                        break;
                    case '3':
                        exercise.correctChange();
                        break;
                    case '4':
                        exercise.ohmsLaw();
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
