package zuoye2.dierzhong;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student2Test {
    @Test
    public void test01(){
        //1、加载容器的XML
        String xml="zuoye2/dierzhong/applicationContext.xml";

        //2、xml文件一经加载，所有的对象都已经诞生了，这就和传统的test01创建的不一样
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        Student2 student2 = ac.getBean("student2", Student2.class);
        System.out.println("student2 = " + student2);

    }
}
