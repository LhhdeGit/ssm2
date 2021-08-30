package spring07DIgouzaoqi;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring07DiTest {
    //如果06讲的是set注入，07讲的是
     @Test
    public void  test01(){
         //1、加载容器的XML
         String xml="spring07Digouzaoqi/applicationContext.xml";

         //2、xml文件一经加载，所有的对象都已经诞生了，这就和传统的test01创建的不一样
         ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
         People people = ac.getBean("people", People.class);
         people.play();

     }
}
