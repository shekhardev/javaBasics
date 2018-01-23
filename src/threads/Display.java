package threads;

import javax.swing.*;
import java.awt.*;

public class Display extends JTextArea {
    public Display( ) {
        super( 30, 120 ); // call superclass constructor
        setFont( new Font( "Courier New", Font.PLAIN, 12 ) );
    }

    public void append( String msg, int delay )
            throws InterruptedException {
        for ( int j=0; j<msg.length( ); j++ ) {
            append( Character.toString( msg.charAt( j ) ) );
            Thread.sleep( delay );
        }
    }
}