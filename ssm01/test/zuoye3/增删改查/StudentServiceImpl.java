package zuoye3.增删改查;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{
@Autowired
private StudentDao studentDao;
    @Override
    public void selectAll() {
        studentDao.selectAll();
    }

    @Override
    public void update() {
        studentDao.update();
    }

    @Override
    public void add() {
        studentDao.add();
    }

    @Override
    public void delete() {
        studentDao.delete();
    }
}
