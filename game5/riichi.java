import greenfoot.*;

/**
 * プレイヤー（riichi）クラス。
 * 押せるブロック（ishi）と押せないブロック（iwa）を区別して移動します。
 */
public class riichi extends Actor {

    private final int MOVE_DISTANCE = 1; // 1マス（グリッドセル）単位の移動量

    public riichi(){
        getImage().scale( 50, 50 );
        // コンストラクタで、画像が最初から回転しないよう念のため回転をリセット
        setRotation(0); 
    }
    
    public void act() {
        handleMovement();
    }

    /**
     * キー入力を処理し、移動を試みる
     */
    private void handleMovement() {
        int dx = 0; // X方向の移動量
        int dy = 0; // Y方向の移動量

        // キー入力に応じて移動方向を決定 (setRotation行を削除)
        if (Greenfoot.isKeyDown("up")) {
            dy = -MOVE_DISTANCE;
            // setRotation(270); ← 削除
        } else if (Greenfoot.isKeyDown("down")) {
            dy = MOVE_DISTANCE;
            // setRotation(90); ← 削除
        } else if (Greenfoot.isKeyDown("left")) {
            dx = -MOVE_DISTANCE;
            // setRotation(180); ← 削除
        } else if (Greenfoot.isKeyDown("right")) {
            dx = MOVE_DISTANCE;
            // setRotation(0); ← 削除
        }

        // 決定された移動方向に基づき、実際の移動処理を行う
        if (dx != 0 || dy != 0) {
            // ここで Greenfoot.getKey() を使うと、キーを押しっぱなしにしても1フレームに1回しか移動しません
            // 押しっぱなしで移動させたい場合はコメントアウトを外してください
            // if (Greenfoot.getKey() != null) { 
                tryMove(dx, dy);
            // }
        }
    }

    /**
     * 指定された方向に移動を試みる。ishiがあれば押す。
     */
    private void tryMove(int dx, int dy) {
        int nextX = getX() + dx;
        int nextY = getY() + dy;
        
        // 1. Worldの範囲外チェック
        if (nextX < 0 || nextX >= getWorld().getWidth() || 
            nextY < 0 || nextY >= getWorld().getHeight()) {
            return; // 範囲外なら移動しない
        }

        // 2. 移動先に障害物があるかチェック（Obstacleクラスを継承したオブジェクトを取得）
        Obstacle obstacle = (Obstacle) getOneObjectAtOffset(dx, dy, Obstacle.class);

        if (obstacle == null) {
            // 障害物がなければ、プレイヤーが移動
            setLocation(nextX, nextY);
        } else if (obstacle instanceof ishi) {
            // ぶつかったのが 'ishi' (押せるブロック) の場合
            ishi block = (ishi) obstacle;
            
            // ishiを押してみて、移動に成功したらプレイヤーも移動
            if (block.push(dx, dy)) {
                setLocation(nextX, nextY);
            }
        } else if (obstacle instanceof iwa) {
            // ぶつかったのが 'iwa' (押せないブロック) の場合
            // プレイヤーは移動しない
        }
    }
}