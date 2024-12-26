import java.util.*;
import java.io.*;

/**
   Chapter 49C - Two-Dimensional Arrays Exercises 1-5

   @author Rohan Chaudhary
   @version 4-15-23

   @author Period - 7
   @author Assignment - Ch49C_2DArrays

   @author Sources - N/A
 */
public class Ch49C_2DArrays_Ex1to5
{
    Scanner scan;

    public Ch49C_2DArrays_Ex1to5()
    {
        scan = new Scanner( System.in );
    }

    /**
      Calculates the Sum of all elements of a matrice.
     */
    public int sumOfAllArrayElements( int[][] data )
    {
        // declare the sum
        int sum = 0;
        // compute the sum
        for ( int row = 0; row < data.length; row++ )
        {
            for ( int col = 0; col < data[row].length; col++ )
            {
                sum += data[row][col];
            }
        }

        // write out the sum
        System.out.println(sum);
        
        return sum;
    }

    /**
       Calculates the sum of each row
     */
    public int[] sumOfEachRow( int[][] data )
    {
        // declare the row sum array
        int [] rowSums = new int[data.length];

        // compute the sums for each row
        for ( int row = 0; row < data.length; row++ )
        {
            // initialize the sum
            int sum = 0;
            // compute the sum for this row
            for ( int col = 0; col < data[row].length; col++ )
            {
                sum += data[row][col];
            }
            rowSums[row] = sum;
            // write the sum for this row
            System.out.println(sum);
        }
        
        return rowSums;
    }

    /**
     * Calculates sum of each column
     */
    public int[] sumOfEachColumn( int[][] data )
    {
        //find the longest row
        int longestRow = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i].length > longestRow) {
                longestRow = data[i].length;
            }

        }
        
        // declare the row sum array
        int [] colSums = new int[longestRow];
        
        for (int i = 0; i < data.length; i++) {
            for (int j = 0 ; j < data[i].length; j++) {
                colSums[j] += data[i][j];
            }
        }
        return colSums;
    }

    /**
       Finds min and max
     */
    public int[] maxAndMinElements( int[][] data )
    {
        // declare the max and the min
        int max = data[0][0];
        int min = data[0][0];
        
        // compute the sum
        for ( int row = 0; row < data.length; row++ )
        {
            for ( int col = 0; col < data[row].length; col++ ) 
            {
                if (data[row][col] < min) {
                    min = data[row][col];
                }
                if (data[row][col] > max) {
                    max = data[row][col];
                }
            }
        }

        // write out the results
        System.out.println(max);
        System.out.println(min);
        
        int[] result = { max, min };
        return result;
    }

    /**
       Finds largest element in each row
     */
    public int[] largestElements( int[][] data )
    {
        // declare the largest in row array
        int[] largestInRow = new int[data.length];
        
        for (int i = 0; i < data.length; i++) {
            largestInRow[i] = 0;
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] > largestInRow[i]) {
                    largestInRow[i] = data[i][j];
                }
            }
        }
        
        return largestInRow;
    }

    /**
      Testing method: instantiates a Lesson49C Exercises object and
      then invokes each method

      @param args command line parameters (not used)
     */
    public static void main( String[] args )
    {
        Scanner kbd = new Scanner( System.in );
        boolean done = false;

        Ch49C_2DArrays_Ex1to5 exercise = new Ch49C_2DArrays_Ex1to5();

        do
        {
            System.out.println();
            System.out.println();
            System.out.println( "Make a selection" );
            System.out.println();
            System.out.println( "   (1) Sum of All Array Elements");
            System.out.println( "   (2) Sum of Each Row");
            System.out.println( "   (3) Sum of Each Column");
            System.out.println( "   (4) Maximum and Minimum Elements");
            System.out.println( "   (5) Largest Elements");
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
                        int[][] dataEx1 = { { 3, 2, 5 },
                            { 1, 4, 4, 8, 13 },
                            { 9, 1, 0, 2 },
                            { 0, 2, 6, 3, -1, -8 } };
                        int sum = exercise.sumOfAllArrayElements(dataEx1);
                        break;
                    case '2':
                        int[][] dataEx2 = { { 3, 2, 5 },
                            { 1, 4, 4, 8, 13 },
                            { 9, 1, 0, 2 },
                            { 0, 2, 6, 3, -1, -8 } };
                        int[] rowSums = exercise.sumOfEachRow(dataEx2);
                        break;
                    case '3':
                        int[][] dataEx3 = { { 3, 2, 5 },
                            { 1, 4, 4, 8, 13 },
                            { 9, 1, 0, 2 },
                            { 0, 2, 6, 3, -1, -8 } };
                        int[] colSums = exercise.sumOfEachColumn( dataEx3 );
                        break;
                    case '4':
                        int[][] dataEx4 = { { 3, 2, 5 },
                            { 1, 4, 4, 8, 13 },
                            { 9, 1, 0, 2 },
                            { 0, 2, 6, 3, -1, -8 } };
                        int[] maxMin = exercise.maxAndMinElements( dataEx4 );
                        break;
                    case '5':
                        int[][] dataEx5 = { { 3, 2, 5 },
                            { 1, 4, 4, 8, 13 },
                            { 9, 1, 0, 2 },
                            { 0, 2, 6, 3, -1, -8 } };
                        int[] largestInRow = exercise.largestElements( dataEx5 );
                        break;
                    default:
                        if ( response.toLowerCase().charAt( 0 ) == 'q' )
                            done = true;
                        else
                            System.out.print( "Invalid Choice" );
                        break;
                }
            }
        } while ( !done );
        System.out.println( "Goodbye!" );
    }
}
