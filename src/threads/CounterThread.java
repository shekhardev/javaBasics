package threads;

import java.applet.*;
import java.awt.event.*;
import java.awt.*;

public class CounterThread extends Applet
{
    public void init( )
    {
        // build the counter object
        Counter counter = new Counter( "Counter 1" );
        // change applet's layout (default is BorderLayout)
        setLayout( new FlowLayout( ) );
        // add counter's display panel to applet
        add( counter.displayPanel );
        // start thread running
        counter.start( );
    }
}