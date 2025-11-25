import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ishi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ishi extends Actor
{
    /**
     * Act - do whatever the ishi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public boolean attemptMove(int dx, int dy)
    {
        int newX = getX() + dx;
        int newY = getY() + dy;
        
        // 1. **移動先の座標** (newX, newY) に何か**別の障害物**がないかチェックします♡
        //    新しい位置にBlockや別のPushableBlockがあったら、動けません！♡
        //    ここでは一旦、全てのActorクラスに触れるかチェックします (Block, PushableBlock, Playerなど全て)♡
        //    (ただし、チェックする時には、自分自身を無視する必要があります)
        
        // ワールドの端かどうかもチェック
        if (newX < 0 || newX >= getWorld().getWidth() || newY < 0 || newY >= getWorld().getHeight()) {
            return false; // ワールドの端なので移動できません♡
        }

        // 別のActorがないかチェック (自分自身は除く)
        Actor occupant = getWorld().getObjectsAt(newX, newY, Actor.class).stream()
                                    .filter(a -> a != this)
                                    .findFirst()
                                    .orElse(null);

        if (occupant == null)
        {
            // 2. 移動先に**何もなかった**ので、移動を実行します♡
            setLocation(newX, newY);
            return true; // 移動成功です♡
        }
        
        return false; // 他の何かがあったので移動失敗です♡
    }
}
