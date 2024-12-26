import java.util.*;

/**
 * Chapter 15 to 20
 * Selected problems with while loops and random number generation
 * 
 * @author Name - Rohan Chaudhary
 * @author Period - 7
 * @author Assignment - Ch15Ex1to3
 * @author Sources - N/A
 */

public class Ch15to20PS
{
    Scanner scan;
    Random rand = new Random();

    /**
     * Constructs a Scanner for input from the console.
     */
    public Ch15to20PS()
    {
        scan = new Scanner( System.in );
    }

    /**
     * Constructs a Scanner to evaluate passed input (used for testing).
     * 
     * @param str  input for the various methods
     */
    public Ch15to20PS( String str )
    {
        scan = new Scanner( str );
    }
    
    /**
     * Constructs a Scanner to evaluate passed input (used for testing).
     * 
     * @param str  input for the various methods
     * @param seed  seed to use for random number generator
     */    
    public Ch15to20PS( String str, long seed )
    {
        scan = new Scanner( str );
        rand.setSeed( seed );
    }

    /**
     * Inputs word, repeats for how many characters in word.
     */
    public void repeatWord()
    {
        System.out.println("Enter a word:");
        String word = scan.nextLine();
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word);
        }
    }

    /**
     * Given weight of order calcs shipping
     */
    public void shippingCostCalc()
    {
       boolean isEnd = false;
       int orderWeight;
       double price = 0.00;
       while (isEnd == false) {
            orderWeight = 0;
            price = 0.0;
            System.out.println("Weight of order:");
            orderWeight = scan.nextInt();

            if (orderWeight > 10) {
                price = (3.0 + (.25 * (orderWeight - 10)));
                System.out.println("Shipping Cost: " + price);
            }
            else if (orderWeight > 0) {
                price = 3.0;
                System.out.println("Shipping Cost: " + price);
            }
            else {
                System.out.println("bye");
                isEnd = true;
            }
       }
    }
    
    /**
     * Simulates a random walk on coordinate plane
     */
    public void randomWalk2D()
    {
        double x = 0;
        double y = 0;
        int it;
        System.out.println("How many iterations?");
        it = scan.nextInt();
        for (int i = 0; i < it; i++) {
            double xRand = (2 * rand.nextDouble()) - 1;
            double yRand = (2 * rand.nextDouble()) - 1;
            x += xRand;
            y += yRand;
        }
        System.out.println("After " + it + " moves"); 
        System.out.println("X is now at " + x);
        System.out.println("Y is now at " + y);
        double dist = Math.sqrt((Math.pow(x,2.0) + Math.pow(y,2.0)));
        System.out.println("Distance from origin is " + dist);

    }
    
    /**
     * Guessing Game
     */   
    public void furtherImprovedGuessingGame()
    {
        int corrAns = 0;
        for (int i = 1; i <= 10; i++) {
            int newRand = rand.nextInt(10) + 1;
            System.out.println("Round " + i);
            System.out.println("I am thinking of a number from 1 to 10.");
            System.out.println("You must guess what it is in three tries.");
            int guess; 
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter a guess:");
                guess = scan.nextInt();
                int dist = Math.abs(newRand - guess);
                if (guess == newRand) {
                    corrAns += 1;
                    System.out.println("RIGHT!");
                    break;
                }
                else if (j == 2) {
                    System.out.println("wrong");
                    System.out.println("The correct number was " + newRand);
                }
                else if (dist == 1) {
                    System.out.println("hot");
                }
                else if (dist == 2) {
                    System.out.println("warm");
                }
                else if (dist > 2) {
                    System.out.println("cold");
                }

            }
            System.out.println("You have won " + corrAns + " out of " + i + " rounds.");
        }
        String ranking;
        if (corrAns == 10) {
            ranking = "hacker";
        }
        else if (corrAns == 9) {
            ranking = "professional";
        }
        else if (corrAns == 8) {
            ranking = "advanced";
        }
        else {
            ranking = "amateur";
        }
        System.out.println("Your ranking is: " + ranking);
    }

    /**
     * Testing method: instantiates a Ch15to20PS object and then invokes
     * each method.
     * 
     * @param args  command line parameters (not used)
     */
    public static void main( String[] args )
    {
        Scanner kbd = new Scanner( System.in );
        boolean done = false;

        Ch15to20PS exercise = new Ch15to20PS();

        do
        {
            System.out.println();
            System.out.println();
            System.out.println( "Make a selection" );
            System.out.println();
            System.out.println( "   (1) Repeat Word" );
            System.out.println( "   (2) Shipping Cost Calculator" );
            System.out.println( "   (3) randomWalk2D" );
            System.out.println( "   (4) Further Improved Guessing Game" );
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
                        exercise.repeatWord();
                        break;
                    case '2':
                        exercise.shippingCostCalc();
                        break;
                    case '3':
                        exercise.randomWalk2D();
                        break;
                    case '4':
                        exercise.furtherImprovedGuessingGame();
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
