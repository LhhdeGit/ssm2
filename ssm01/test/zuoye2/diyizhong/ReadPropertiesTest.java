package zuoye2.diyizhong;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Properties;

public class ReadPropertiesTest {
    @Test
     public void test01(){
    String xml = "zuoye2/diyizhong/applicationContext.xml";
    ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        Properties db = ac.getBean("db", Properties.class);
        System.out.println("db = " + db);
    }
}
