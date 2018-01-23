package threads;

import java.awt.*;

public class Sprite implements Runnable
{
    private Rectangle space;     // space the sprite occupies
    private Dimension size;      // sprite's dimensions
    private Point pos;           // sprite's center position
    private int speed, interval; // sprite's speed and interval
    // speed is number of pixels, interval is number of milliseconds
    // the sprite moves 'speed' pixels every 'interval' milliseconds
    private int heading;         // sprite's heading (0 to 360 degrees)
    private int health;          // sprite's health
    private final int FULL_HEALTH = 4;
    private boolean isMoving;    // is it moving?

    public Sprite( Rectangle spc, Point ctr, Dimension sz )
    // Create stationary sprite with full health.
    {
        space = spc;
        pos = ctr;
        size = sz;
        health = FULL_HEALTH;
        isMoving = false;
    }

    public void animate( int spd, int intvl, int hdg )
    // Start sprite animating at given speed, interval and heading.
    {
        isMoving = true;
        speed = spd;
        interval = intvl;
        heading = hdg;
        ( new Thread( this ) ).start( );
    }

    public void move( )
    // Move the sprite.
    {
        pos.x += Math.cos(heading*Math.PI/180)*speed;
        pos.y += Math.sin(heading*Math.PI/180)*speed;
    }

    public void paint( Graphics g )
    // Draw the sprite.
    {
        g.setColor( Color.BLUE );
        g.fillOval( pos.x-size.width/2, pos.y-size.height/2, size.width, size.height );
    }

    public void run( )
    {
        while ( isMoving )
        {
            move( );
            try {
                Thread.sleep( interval );
            }
            catch( InterruptedException e ) {
                return;
            }
        }
    }
}