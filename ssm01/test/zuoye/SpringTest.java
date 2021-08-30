package zuoye;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void test01(){
        String xml = "zuoye/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        //我们要拿主体
        zuoye.Person person = ac.getBean("person", Person.class);
        person.eatw();

    }
}
