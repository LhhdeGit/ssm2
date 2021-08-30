package spring10beasicdi2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Teacher2Test {
    @Test
    public void test01(){
        //1、加载容器的XML
        String xml="spring10beasicdi2/applicationContext.xml";

        //2、xml文件一经加载，所有的对象都已经诞生了，这就和传统的test01创建的不一样
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        Teacher2 teacher2 = ac.getBean("teacher2", Teacher2.class);
        System.out.println("teacher2= " + teacher2);

    }
}
