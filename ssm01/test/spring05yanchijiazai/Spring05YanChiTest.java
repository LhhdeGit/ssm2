package spring05yanchijiazai;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring05YanChiTest {
    @Test
    public void test02(){
        //1、加载容器的XML
        String xml="spring05yanchijiazai/applicationContext.xml";

        //2、xml文件一经加载，所有的对象都已经诞生了，这就和传统的test01创建的不一样
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        System.out.println("ac = " + ac); //是否出现

         /*lazy-init="true" 属性一加上就是懒加载*/

    }
}
