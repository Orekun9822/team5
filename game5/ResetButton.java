import greenfoot.*;

public class ResetButton extends Actor
{
    
    public void act()
    {
        
        if (Greenfoot.mouseClicked(this))
        {
           
            World currentWorld = getWorld();
            Class<? extends World> worldClass = currentWorld.getClass();
            
            try {
               
                World newWorld = worldClass.getDeclaredConstructor().newInstance();
                
                
                Greenfoot.setWorld(newWorld);
            } catch (Exception e) {
                
                System.err.println("Worldのリセット中にエラーが発生しました: " + e.getMessage());
            }
        }
        
        
    }
    
}