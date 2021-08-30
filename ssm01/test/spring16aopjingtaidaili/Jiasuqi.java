package spring16aopjingtaidaili;

/**
 * 代理对象，用于增强目标对象的方法
 * 游戏   迅游加速器
 * 王宝强  宋吉吉
 * 浏览器  vpn
 * 被告人 律师
 *
 * 请问谁依赖了谁，谁拥有了谁，谁应该注入谁的类
 * 谁是主体类，谁是辅助类
 */
public class Jiasuqi {
    private Game game;  //代理类才是主体，代理对象依赖了目标对象，代理对象包含了目标对象
    private int ws;


    //代理对象的方法 而且必须和目标对象一样，因为代理对象也要有目标对象的方法，不然怎么加强
    public void conNet(){
        //这个方法要承接目标对象的方法
        int wangsu = game.getWangsu();
        this.ws = wangsu-400;
        System.out.println("现在的网速="+this.ws);
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
