package zuoye8jingtaidaili;

public class LiuLanQi {
    private String GongNeng="不能访问谷歌 false";

    public String getGongNeng() {
        return GongNeng;
    }

    public void setGongNeng(String gongNeng) {
        GongNeng = gongNeng;
    }

    public void FangWen(){
        System.out.println("浏览器  "+this.getGongNeng());
    }
}
