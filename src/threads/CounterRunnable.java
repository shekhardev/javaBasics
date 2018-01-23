package threads;

import java.applet.*;
import java.awt.event.*;
import java.awt.*;

public class CounterRunnable extends Applet
{
    public void init( )
    {
        // build runnable object
        Counter counter = new Counter( "Counter 1" );
        // build the thread object from the runnable
        Thread thread = new Thread( counter );
        // change applet's layout (default is BorderLayout)
        setLayout( new FlowLayout( ) );
        // add counter's display panel to applet
        add( counter.displayPanel );
        // start thread running
        thread.start( );
    }
}