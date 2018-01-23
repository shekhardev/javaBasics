package arrays.examples;

import javax.swing.JOptionPane;

public class Sieve
{
    public static void main( String [] args )
    {
        String prompt = "Enter positive integer: ";
        String input = JOptionPane.showInputDialog( prompt );
        // halt if user cancels input dialog
        if ( input == null ) System.exit( 0 );
        // convert input string to an int
        int n = Integer.parseInt( input );
        // create and initialize the sieve
        boolean [] sieve = new boolean[n+1];
        sieve[0] = sieve[1] = false;
        for ( int k = 2; k <= n; k++ )
            sieve[k] = true;
        // remove the nonprimes
        for ( int k = 2; k*k <= n; k++ ) // quit when k is sqrt(n)
            if ( sieve[k] ) // k is in sieve
            {  // remove its multiples
                // begin with 2k, the first multiple
                int m = k + k;
                while ( m <= n )
                {
                    sieve[m] = false;
                    m += k; // add k to get next multiple
                }
            }
        // print whatever is left in the sieve
        System.out.println( "A list of prime numbers from 2 to " + n );
        int count = 0;
        for ( int k = 2; k <= n; k++ )
            if ( sieve[k] )
                System.out.println( ++count + ": " + k );
    }
}