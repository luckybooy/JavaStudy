package games;

/**
 * @program: JavaStudy
 * @description: 游戏玩家代理类
 * @packagename: games
 * @author: xiaoran
 * @date: 2020-06-02 11:11
 **/
public class GamePlayerProxy implements IGamePlayer {

    private IGamePlayer gamePlayer = null;

    public GamePlayerProxy(IGamePlayer player){
        this.gamePlayer = player;
    }

    @Override
    public void login(String user, String passwd) {
        this.gamePlayer.login("xiaoran","123456");
    }

    @Override
    public void killMonster() {
        this.gamePlayer.killMonster();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }
}
