package zuoye2.diyizhong;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentELTest {
    @Test
    public void test01(){
        String xml = "zuoye2/diyizhong/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        StudentEL studentEL = ac.getBean("studentEL", StudentEL.class);
        System.out.println("studentEL = " + studentEL);
    }
}
