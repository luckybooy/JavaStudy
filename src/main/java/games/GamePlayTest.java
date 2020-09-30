package games;

/**
 * @program: JavaStudy
 * @description: 游戏玩家测试类
 * @packagename: games
 * @author: xiaoran
 * @date: 2020-06-02 10:49
 **/
public class GamePlayTest {
    public static void main(String[] args) {
        //有接口来接收实现游戏玩家类的实例
        IGamePlayer gamePlayer = new GamePlayer("萧燃大侠");
        //GamePlayer gamePlayer1 = new GamePlayer("萧燃大侠");
        gamePlayer.login("xiaoran","123456");
        gamePlayer.killMonster();
        gamePlayer.upgrade();
    }
}
