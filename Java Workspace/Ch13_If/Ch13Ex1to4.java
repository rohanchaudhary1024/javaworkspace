import java.util.*;


/**
 * Chapter 13 - Single-branch if Statements Programming Exercises 1-4
 * 
 * @author TODO Your Name
 * @version TODO Date
 * 
 * @author Period - TODO Your Period
 * @author Assignment - Ch13Ex1to4
 * 
 * @author Sources - TODO list collaborators
 */
public class Ch13Ex1to4
{
    Scanner scan;

    /**
     * Constructs a Scanner for input from the console.
     */
    public Ch13Ex1to4()
    {
        scan = new Scanner( System.in );
    }

    /**
     * Constructs a Scanner to evaluate passed input (used for testing).
     * 
     * @param str input for the various methods
     */
    public Ch13Ex1to4( String str )
    {
        scan = new Scanner( str );
    }

    /**
     * Deli Ordering Service
     */
    public void internetDelicatessen()
    {
        String item;
        int cents;
        int dBool;
        System.out.println("Enter the item: ");
        item = scan.nextLine();
        System.out.println("Enter the price: ");
        cents = scan.nextInt();
        System.out.println("Overnight delivery (0==no, 1==yes): ");
        dBool = scan.nextInt();
        double shippingCharge;
        if (cents < 1000) {
            shippingCharge = 2.00;
        }
        else {
            shippingCharge = 3.00;
        }

        if (dBool == 1) {
            shippingCharge += 5.00;
        }
        System.out.println("Invoice: " );
        System.out.println("\t" + item + "\t" + (cents / 100.0));
        System.out.println("\tshipping\t" + shippingCharge );
        System.out.println("\ttotal\t\t" + ((cents / 100.0) + shippingCharge));

    }

    /**
     * Calculates effeciency of steam engine given temperature
     * of steam in boiler and steam in outside air
     */
    public void steamEngineEfficiency()
    {
        int tAir, tSteam;
        System.out.println("Enter air temp: ");
        tAir = scan.nextInt();
        System.out.println("Enter steam temp ");
        tSteam = scan.nextInt();
        if (tSteam < 373) {
            System.out.println("Max Poss Efficiency: " + 0.0);
        }
        else {
            double eff = 1.0 - ((tAir / 1.0) / tSteam);
            System.out.println("Max Poss Efficiency: " + eff);
        }
    }

    /**
     * Given single-heating-time and number of items, returns rec. heating time.
     */
    public void microwaveOven()
    {
        int numItems, singleTime;
        System.out.println("Enter num items: ");
        numItems = scan.nextInt();
        System.out.println("Enter singleTime: ");
        singleTime = scan.nextInt();

        if (numItems == 1) {
            System.out.println(singleTime);
        }
        else if (numItems == 2) {
            System.out.println(singleTime * (1.50));
        }
        else if (numItems == 3) {
            System.out.println(singleTime * (2.00));
        }
        else if (numItems > 3) {
            System.out.println("not recommended");
        }

    }

    /**
     * Stat creator for a game
     */
    public void fantasyGame()
    {
        System.out.println("Welcome to Rohan's Quest");
        String charName;
        int str, hth, lck;
        System.out.println("Enter the name of your character: ");
        charName = scan.nextLine();
        System.out.println("Enter strength (1-10): ");
        str = scan.nextInt();
        System.out.println("Enter health (1-10): ");
        hth = scan.nextInt();
        System.out.println("Enter luck (1-10): ");
        lck = scan.nextInt();
        scan.nextLine();

        if ((lck + hth + str) > 15) {
            System.out.println("You have given your character too many points! ");
            System.out.println("Default values have been assigned. ");
            str = 5;
            hth = 5;
            lck = 5;
        }
        System.out.println();
        System.out.println(charName + ", strength: " + str + ", health: " + hth + ", luck: " + lck);
        
    }

    /**
     * Testing method: instantiates a Lesson15Exercises object and then invokes
     * each method.
     * 
     * @param args  command line parameters (not used)
     */
    public static void main( String[] args )
    {
        Scanner kbd = new Scanner( System.in );
        boolean done = false;

        Ch13Ex1to4 exercise = new Ch13Ex1to4();

        do
        {
            System.out.println();
            System.out.println();
            System.out.println( "Make a selection" );
            System.out.println();
            System.out.println( "   (1) Internet Delicatessen" );
            System.out.println( "   (2) Steam Engine Efficiency" );
            System.out.println( "   (3) Microwave Oven" );
            System.out.println( "   (4) Fantasy Game" );
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
                        exercise.internetDelicatessen();
                        break;
                    case '2':
                        exercise.steamEngineEfficiency();
                        break;
                    case '3':
                        exercise.microwaveOven();
                        break;
                    case '4':
                        exercise.fantasyGame();
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
