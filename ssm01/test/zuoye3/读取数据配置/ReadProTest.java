package zuoye3.读取数据配置;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class ReadProTest {

    //第二种读取properties  常用
    @Test
    public void test02(){
        String xml="zuoye3/读取数据配置/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        ComboPooledDataSource dataSource = ac.getBean("dataSource1", ComboPooledDataSource.class);
        System.out.println("dataSource = " + dataSource);
        try {
            System.out.println("dataSource.getConnection = " + dataSource.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
