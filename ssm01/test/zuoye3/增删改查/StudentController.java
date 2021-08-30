package zuoye3.增删改查;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class StudentController {
    @Resource
    private StudentService studentService;  //接口的调用
    //查询全部的方法
    public void selectAll(){
        //controller层 service层---即：controller依赖了service层
        studentService.selectAll();
    }
    //修改的方法
    public void update(){
        studentService.update();
    }
    //添加的方法
    public void add(){
        studentService.add();
    }
    //删除的方法
    public void delete(){
        studentService.delete();
    }
}
