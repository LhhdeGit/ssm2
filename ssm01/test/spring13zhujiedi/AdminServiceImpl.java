package spring13zhujiedi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl  implements AdminService{
  // @Resource  //相当于xml中的注入  注解1  tomcat提供  byName
   @Autowired //注解2： spring提供的，多用这个，spring体系  byType
    private AdminDao adminDao;

    @Override
    public void selectAll() {
        //service层 调用dao层 service层依赖了dao层
        adminDao.selectAll();
    }
}
