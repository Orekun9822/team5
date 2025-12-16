import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hantei here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hantei extends Actor
{
    /**
     * Act - do whatever the hantei wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Actor riichi = getOneIntersectingObject( riichi.class );
        if( riichi != null ){
            getWorld().showText( "GAME CLEAR", 400, 200 );
            Greenfoot.stop();
        }
    }    
}
