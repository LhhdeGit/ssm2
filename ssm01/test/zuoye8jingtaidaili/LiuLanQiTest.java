package zuoye8jingtaidaili;

import org.junit.Test;

public class LiuLanQiTest {
    //测试静态代理
    @Test
    public void test01(){
        LiuLanQi liuLanQi = new LiuLanQi();
        Vpn vpn = new Vpn();
        vpn.setLiuLanQi(liuLanQi);  //set注入  王者注入迅游，迅游依赖王者，迅游包含了王者，迅游才是主体
        vpn.FangWen();   //调用，都调用主体类
    }
}
