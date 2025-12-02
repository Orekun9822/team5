import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class ishi here.
 * @author (your name) @version (a version number or a date)
 */
public class ishi extends Obstacle {
    /**
     * 指定された方向（dx, dy）に移動を試みる
     * @param dx X方向の移動量（-1, 0, 1）
     * @param dy Y方向の移動量（-1, 0, 1）
     * @return 移動に成功した場合 true, 失敗した場合 false
     */
    public boolean push(int dx, int dy) {
        int nextX = getX() + dx;
        int nextY = getY() + dy;

        // 1. Worldの範囲外に出ていないか確認
        if (nextX < 0 || nextX >= getWorld().getWidth() || 
            nextY < 0 || nextY >= getWorld().getHeight()) {
            return false; // 範囲外なら移動失敗
        }

        // 2. 移動先に別の障害物がないか確認
        // ishiまたはiwaのどちらかがあれば移動不可
        Actor wall = getOneObjectAtOffset(dx, dy, Obstacle.class);
        
        if (wall == null) {
            // 移動先に何もなければ移動実行
            setLocation(nextX, nextY);
            return true; // 移動成功
        } else {
            return false; // 障害物があり移動失敗
        }
    }

    public void act() {
        // ishi自体はactメソッドで動かない
    }
}
