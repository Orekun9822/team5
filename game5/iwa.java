import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class iwa extends Obstacle
{
     public iwa(){
        getImage().scale( 50, 50 );
        // コンストラクタで、画像が最初から回転しないよう念のため回転をリセット
        setRotation(0); 
    }

    /**
     * Act - do whatever the iwa wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    }
}
