package zuoye2.diyizhong;

public class StudentEL {
    private String name;
    private int age;
    private String friend;
    private String goodfriend;
    private Double scroe;
    private String db;

    @Override
    public String toString() {
        return "StudentEL{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friend='" + friend + '\'' +
                ", goodfriend='" + goodfriend + '\'' +
                ", scroe=" + scroe +
                ", db='" + db + '\'' +
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

    public String getFriend() {
        return friend;
    }

    public void setFriend(String friend) {
        this.friend = friend;
    }

    public String getGoodfriend() {
        return goodfriend;
    }

    public void setGoodfriend(String goodfriend) {
        this.goodfriend = goodfriend;
    }

    public Double getScroe() {
        return scroe;
    }

    public void setScroe(Double scroe) {
        this.scroe = scroe;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }
}
