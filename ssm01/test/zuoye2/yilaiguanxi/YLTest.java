package zuoye2.yilaiguanxi;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class YLTest {
    //如果06讲的是set注入，07讲的是
     @Test
    public void  test01(){
         //1、加载容器的XML
         String xml="zuoye2/yilaiguanxi/applicationContext.xml";

         //2、xml文件一经加载，所有的对象都已经诞生了，这就和传统的test01创建的不一样
         ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
         CPU cpu = ac.getBean("cpu", CPU.class);
         cpu.play();

     }
}
