package games;

/**
 * @program: JavaStudy
 * @description: 代理测试类
 * @packagename: games
 * @author: xiaoran
 * @date: 2020-06-02 11:16
 **/
public class GamesPlayerProxyTest {
    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("萧燃" );
        //创建一个游戏代练者的角色
        GamePlayerProxy gamePlayerProxy = new GamePlayerProxy(player);

        gamePlayerProxy.login("xiaoran ","123");
        gamePlayerProxy.killMonster();
        gamePlayerProxy.upgrade();
    }
}
