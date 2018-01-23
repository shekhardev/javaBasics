package threads;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class Counter implements Runnable
{
    private int counter = 0;    // counter to increment
    private int delay;          // sleep time
    private JTextField display; // display for counter
    // fancy JPanel to display, made public so another
    // object can add it to a containment hierarchy
    public JPanel displayPanel;

    public void run( )
    // morphed from Thread to do what I want it to.
    {
        try // needed for call to Thread.sleep (see below)
        {
            while ( true ) // do forever
            {
                counter++;  // increment counter & display
                display.setText( Integer.toString( counter ) );
                Thread.sleep( delay ); // sleep
                // sleep can throw InterruptedException
            }
        }
        catch( InterruptedException e )
        {  // probably won't happen, but we handle it anyway
            String name = Thread.currentThread().getName();
            System.out.println( name + " halted during run." );
            return;
        }
    }  // end run method

    private final int DELAY_RANGE = 2000;

    public Counter( String name )
    {
        // initialize this thread's delay to a random
        // integer between 0.5 and 2.5 seconds
        delay = (int)( Math.random( ) * DELAY_RANGE ) + 500;
        // initialize the display JTextField
        display = new JTextField( 4 );
        display.setHorizontalAlignment( JTextField.RIGHT );
        display.setEditable( false );
        display.setFont(
                new Font( "Courier New", Font.BOLD, 72 ) );
        display.setBackground ( new Color( 255, 255, 153 ) );
        display.setForeground ( new Color( 0, 0, 255 ) );
        // create the fancy JPanel
        displayPanel = new JPanel( );
        displayPanel.setBorder(
                new TitledBorder( new EtchedBorder( ), name ) );
        // create box with delay label and value
        Box delayBox = Box.createVerticalBox( );
        delayBox.add( new JLabel( "Delay" ) );
        delayBox.add( Box.createVerticalStrut( 5 ) );
        delayBox.add(
                new JLabel( Integer.toString( delay ) ) );
        // add the JTextField and JLabel to the JPanel
        displayPanel.add( display );
        displayPanel.add( delayBox );
    }  // end constructor

    public void start() {
    }
}