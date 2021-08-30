package zuoye3.增删改查;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
    public void selectAll(){
        System.out.println("我是dao层，我负责 数据的 查询全部");
    }
    public void update(){
        System.out.println("我是dao层，我负责 数据的 修改");
    }
    public void add(){
        System.out.println("我是dao层，我负责 数据的 添加");
    }
    public void delete(){
        System.out.println("我是dao层，我负责 数据的 删除");
    }
}
