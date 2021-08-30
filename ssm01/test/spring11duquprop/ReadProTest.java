package spring11duquprop;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class ReadProTest {
    @Test
    public void test01(){
        //1、加载容器的XML
        String xml="spring11duquprop/applicationContext.xml";

        //2、xml文件一经加载，所有的对象都已经诞生了，这就和传统的test01创建的不一样
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        ComboPooledDataSource dataSource = ac.getBean("dataSource", ComboPooledDataSource.class);
        System.out.println("dataSource = " + dataSource);
        try {
            System.out.println("dataSource.getConnection = " + dataSource.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //第二种读取properties  常用
    @Test
    public void test02(){
        //1、加载容器的XML
        String xml="spring11duquprop/applicationContext.xml";

        //2、xml文件一经加载，所有的对象都已经诞生了，这就和传统的test01创建的不一样
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        ComboPooledDataSource dataSource = ac.getBean("dataSource1", ComboPooledDataSource.class);
        System.out.println("dataSource = " + dataSource);
        try {
            System.out.println("dataSource.getConnection = " + dataSource.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //第三种 读取多个  属性为string
    @Test
    public void test03(){
        String xml="spring11duquprop/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        ReadPropertiesBean readPropertiesBean = ac.getBean("readPropertiesBean", ReadPropertiesBean.class);
        System.out.println("readPropertiesBean = " + readPropertiesBean);
    }
}
