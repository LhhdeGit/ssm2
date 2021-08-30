package spring09basicdi;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Teacher {
    private String name;
    private int age;
    private List<String> friendName;
    private Set<String> loverName;
    private Map<String,Double> scroe;
    private Properties db;

    public Properties getDb() {
        return db;
    }

    public void setDb(Properties db) {
        this.db = db;
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

    public List<String> getFriendName() {
        return friendName;
    }

    public void setFriendName(List<String> friendName) {
        this.friendName = friendName;
    }

    public Set<String> getLoverName() {
        return loverName;
    }

    public void setLoverName(Set<String> loverName) {
        this.loverName = loverName;
    }

    public Map<String, Double> getScroe() {
        return scroe;
    }

    public void setScroe(Map<String, Double> scroe) {
        this.scroe = scroe;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friendName=" + friendName +
                ", loverName=" + loverName +
                ", scroe=" + scroe +
                ", db=" + db +
                '}';
    }
}
