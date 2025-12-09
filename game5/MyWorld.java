import lang.stride.*;
import java.util.*;
import greenfoot.*;

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
        prepare();
    }
    private void prepare()
    {
       
        ResetButton resetButton = new ResetButton();
        addObject(resetButton, 100, 50); 
    }
}
