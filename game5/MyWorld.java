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
    private GreenfootSound bgMusic = new GreenfootSound( "通常時.mp3" );
    public MyWorld()
    {
        super(600, 400, 1);
        addObject( new riichi(), 55, 340 );
        addObject( new Stairs(), 420, 62 );
        setActOrder(Stairs.class, riichi.class);
        addObject( new hantei(), 420, 55 );
        setActOrder(hantei.class, Stairs.class);
        
        //上外壁
        addObject( new iwa(), 0, 85);
        addObject( new iwa(), 50, 85);
        addObject( new iwa(), 100, 85 );
        addObject( new iwa(), 150, 85 );
        addObject( new iwa(), 200, 85 );
        addObject( new iwa(), 250, 85 );
        addObject( new iwa(), 300, 85 );
        addObject( new iwa(), 350, 85 );
        addObject( new iwa(), 370, 85 );
        addObject( new iwa(), 480, 85 );
        addObject( new iwa(), 500, 85 );
        //下外壁
        addObject( new iwa(), 0, 385);
        addObject( new iwa(), 50, 385);
        addObject( new iwa(), 100, 385 );
        addObject( new iwa(), 150, 385 );
        addObject( new iwa(), 200, 385 );
        addObject( new iwa(), 250, 385 );
        addObject( new iwa(), 300, 385 );
        addObject( new iwa(), 350, 385 );
        addObject( new iwa(), 400, 385 );
        addObject( new iwa(), 450, 385 );
        addObject( new iwa(), 500, 385 );
        addObject( new iwa(), 550, 385 );
        //左外壁
        addObject( new iwa(), 15, 85);
        addObject( new iwa(), 15, 130);
        addObject( new iwa(), 15, 180);
        addObject( new iwa(), 15, 230);
        addObject( new iwa(), 15, 280);
        addObject( new iwa(), 15, 330);
        addObject( new iwa(), 15, 380);
        //右外壁
        addObject( new iwa(), 550, 85);
        addObject( new iwa(), 550, 130);
        addObject( new iwa(), 550, 180);
        addObject( new iwa(), 550, 230);
        addObject( new iwa(), 550, 280);
        addObject( new iwa(), 550, 330);
        addObject( new iwa(), 550, 385);
        
        //meiro
        addObject( new iwa(), 100,150);
        addObject( new iwa(), 100,190);
        addObject( new iwa(), 100,230);
        addObject( new iwa(), 100,310);
        addObject( new iwa(), 100,350);
        addObject( new iwa(), 150,150);
        addObject( new iwa(), 300,150);
        addObject( new iwa(), 340,150);
        addObject( new iwa(), 340,190);
        addObject( new iwa(), 340,230);
        addObject( new iwa(), 340,270);
        addObject( new iwa(), 340,310);
        addObject( new iwa(), 340,350);
        
        addObject( new ishi(), 60,270);
        addObject( new ishi(), 60,210);
        
        addObject( new ishi(), 140,250);
        addObject( new ishi(), 300,250);
        addObject( new ishi(), 300,190);
        addObject( new ishi(), 260,190);
        addObject( new ishi(), 180,190);
        addObject( new ishi(), 140,190);
        addObject( new ishi(), 180,280);
        addObject( new ishi(), 220,280);
        addObject( new ishi(), 260,280);
        addObject( new ishi(), 180,220);
        addObject( new ishi(), 220,220);
        addObject( new ishi(), 260,220);
        
        addObject( new iwa(), 400, 115 );
        addObject( new iwa(), 400, 155 );
        addObject( new iwa(), 400, 195 );
        
        
        
        
        prepare();
    }
    @Override
    public void started()
    {
       
        bgMusic.playLoop();
    }
    

    @Override
    public void stopped()
    {
        
        bgMusic.pause();
    }
    private void prepare()
    {
       
        ResetButton resetButton = new ResetButton();
        addObject(resetButton, 100, 50); 
    }
}
