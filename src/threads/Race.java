package threads;

import javax.swing.*;

public class Race extends JApplet {
    // a device on which to display messages
    private Display display;
    // two concurrent threads that display messages
    private Printer printer1, printer2;

    public void init( ) {
        // instantiate the shared display device
        display = new Display( );
        // add to applet within scrolled pane
        add( new JScrollPane( display ) );
        // instantiate each thread
        printer1 = new Printer( "PRINTER1",
                "ABCDEFGHIJKLMNOPQRSTUVWXYZ\n", display );
        printer2 = new Printer( "printer2",
                "abcdefghijklmnopqrstuvwxyz\n", display );
        // start the race
        printer1.start( );
        printer2.start( );
    }
}