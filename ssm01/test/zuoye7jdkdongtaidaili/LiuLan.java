package zuoye7jdkdongtaidaili;

public class LiuLan implements Conn {
    private String GongNeng="不能访问谷歌  false";

    public String getGongNeng() {
        return GongNeng;
    }

    public void setGongNeng(String gongNeng) {
        GongNeng = gongNeng;
    }

    public String FangWen(){
        System.out.println("浏览器"+GongNeng);
        return this.GongNeng;
    }
}
