package spring08autowire;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//自动装配
public class Spring08autowireTest {
@Test
    public void test01(){
    //1、加载容器的XML
    String xml="spring08autowire/applicationContext.xml";
    //2、xml文件一经加载，所有的对象都已经诞生了，这就和传统的test01创建的不一样
    ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
    Student student = ac.getBean("student", Student.class);
    student.play();
    System.out.println("student = " + student);
}
}
