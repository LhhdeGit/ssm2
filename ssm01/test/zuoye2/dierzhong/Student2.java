package zuoye2.dierzhong;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student2 {
    private String name;
    private  int age;
    private List<String> friend;
    private Set<String> goodfriend;
    private Map<String,Double> scroe;
    private Properties db;

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friend=" + friend +
                ", goodfriend=" + goodfriend +
                ", scroe=" + scroe +
                ", db=" + db +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getFriend() {
        return friend;
    }

    public void setFriend(List<String> friend) {
        this.friend = friend;
    }

    public Set<String> getGoodfriend() {
        return goodfriend;
    }

    public void setGoodfriend(Set<String> goodfriend) {
        this.goodfriend = goodfriend;
    }

    public Map<String, Double> getScroe() {
        return scroe;
    }

    public void setScroe(Map<String, Double> scroe) {
        this.scroe = scroe;
    }

    public Properties getDb() {
        return db;
    }

    public void setDb(Properties db) {
        this.db = db;
    }
}
