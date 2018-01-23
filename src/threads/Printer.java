package threads;

public class Printer extends Thread {
    private Display display; // where to write msgs
    private String msg;      // message for thread to print
    private int delay;       // thread sleep time

    public void run( ) {
        while ( true ) {
            try {
                // simulate doing something important
                Thread.sleep( delay );
                // write message to the display
                synchronized ( display ) {
                    display.append( msg, delay/10 );
                }
            }
            catch( InterruptedException e ) {
                return; // probably won't happen
            }
        }  // end while
    }

    private final int MAX_DELAY = 2000; // 2 sec.

    public Printer( String n, String m, Display d ) {
        // Create Printer thread with name 'n',
        // message 'm' and display device 'd'.
        super( n ); // call Thread constructor
        display = d;
        msg = m;
        delay = (int)( Math.random( ) * MAX_DELAY ) + 100;
        display.append( n + "'s delay is " + delay + "\n" );
    }
}