import java.util.*;
import greenfoot.*;
import lang.stride.*;

/**
 * 
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(600, 400, 1);
        addObject( new riichi(), 300, 200 );
        addObject( new Stairs(), 420, 62 );
        
        //上外壁
        addObject( new iwa(), 0, 80);
        addObject( new iwa(), 50, 80);
        addObject( new iwa(), 100, 80 );
        addObject( new iwa(), 150, 80 );
        addObject( new iwa(), 200, 80 );
        addObject( new iwa(), 250, 80 );
        addObject( new iwa(), 300, 80 );
        addObject( new iwa(), 350, 80 );
        addObject( new iwa(), 500, 80 );
        //下外壁
        addObject( new iwa(), 0, 400);
        addObject( new iwa(), 50, 400);
        addObject( new iwa(), 100, 400 );
        addObject( new iwa(), 150, 400 );
        addObject( new iwa(), 200, 400 );
        addObject( new iwa(), 250, 400 );
        addObject( new iwa(), 300, 400 );
        addObject( new iwa(), 350, 400 );
        addObject( new iwa(), 400, 400 );
        addObject( new iwa(), 450, 400 );
        addObject( new iwa(), 500, 400 );
        addObject( new iwa(), 550, 400 );
        //左外壁
        addObject( new iwa(), 0, 80);
        addObject( new iwa(), 0, 130);
        addObject( new iwa(), 0, 180);
        addObject( new iwa(), 0, 230);
        addObject( new iwa(), 0, 280);
        addObject( new iwa(), 0, 330);
        addObject( new iwa(), 0, 380);
        //右外壁
        addObject( new iwa(), 550, 80);
        addObject( new iwa(), 550, 130);
        addObject( new iwa(), 550, 180);
        addObject( new iwa(), 550, 230);
        addObject( new iwa(), 550, 280);
        addObject( new iwa(), 550, 330);
        addObject( new iwa(), 550, 380);
        prepare();
    }
    private void prepare()
    {
       
        ResetButton resetButton = new ResetButton();
        addObject(resetButton, 100, 50); 
    }
}
