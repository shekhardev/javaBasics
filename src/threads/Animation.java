package threads;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Animation
{
    final Rectangle area = new Rectangle( 0, 0, 500, 500 );

    public static void main( String [] args )
    {
        new Animation( );
    }

    public Animation( )
    {
        JFrame win = new JFrame( "Animation" );
        win.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        JButton goBtn = new JButton( "GO" );
        win.add( new MyPanel( area ) );
        win.setSize( area.width, area.height );
        win.setVisible( true );
    }

    public class MyPanel extends JPanel
    {
        Sprite s;

        public MyPanel( Rectangle area )
        {
            s = new Sprite( area, new Point( 30, area.height/2 ), new Dimension( 30, 30 ) );
            s.animate( 5, 40, -45 );
        }

        public void paintComponent( Graphics g )
        {
            super.paintComponent( g );
            s.paint( g );
        }
    }
}