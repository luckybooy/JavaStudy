package games;

import com.sun.corba.se.spi.orb.StringPair;
import lombok.Data;

/**
 * @program: JavaStudy
 * @description: 游戏玩家
 * @packagename: games
 * @author: xiaoran
 * @date: 2020-06-02 10:44
 **/
public class GamePlayer implements IGamePlayer{

    private String name = null;

    public GamePlayer(String name){
        this.name = name;
    }


    @Override
    public void login(String user, String passwd) {
        System.out.println(user + "登录成功。。。");
    }

    @Override
    public void killMonster() {
        System.out.println(this.name + "在打怪。。。");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name + "打完怪，开始升级。。。");
    }
}
