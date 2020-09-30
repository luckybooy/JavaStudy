package games;

/**
 * @program: JavaStudy
 * @description: 游戏玩家接口
 * @packagename: games
 * @author: xiaoran
 * @date: 2020-06-02 10:39
 **/
public interface IGamePlayer {

    //登录方法
    public void login(String user,String passwd);
    //打怪方法
    public void killMonster();
    //升级
    public void upgrade();
}
