package zuoye3.增删改查;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
    @Test
    public void test01(){
        String xml="zuoye3/增删改查/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        StudentController studentController = ac.getBean("studentController", StudentController.class);
        studentController.add();
        studentController.selectAll();
        studentController.update();
        studentController.delete();
    }
}
