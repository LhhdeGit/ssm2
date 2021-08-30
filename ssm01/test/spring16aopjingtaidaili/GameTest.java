package spring16aopjingtaidaili;

import org.junit.Test;

public class GameTest {
    @Test
    public void test01(){
        Game wangzhe = new Game();
        Jiasuqi xunyou = new Jiasuqi();
        xunyou.setGame(wangzhe);  //set注入  王者注入了迅游，迅游依赖了王者
        xunyou.conNet();
    }

}
