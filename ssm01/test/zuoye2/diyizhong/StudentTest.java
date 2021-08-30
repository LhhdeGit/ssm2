package zuoye2.diyizhong;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
    @Test
    public void test01() {
        String xml = "zuoye2/diyizhong/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        Student student = ac.getBean("student", Student.class);
        System.out.println("student = " + student);
    }
}
