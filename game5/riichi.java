import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class riichi extends Actor
{

    /**
     * Act - do whatever the riichi wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
      if( Greenfoot.isKeyDown( "right" ) ){
        setRotation(0);
        move(1);
      }  
      if( Greenfoot.isKeyDown( "left" ) ){
        setRotation(0);
        move(-1);
      }  
      if( Greenfoot.isKeyDown( "down" ) ){
        setRotation(90);
        move(1);
      }  
      if( Greenfoot.isKeyDown( "up" ) ){
        setRotation(90);
        move(-1);
      }   
    }
}
