package zuoye8jingtaidaili;

public class Vpn {
    private LiuLanQi liuLanQi;
    private String gn;

    public void FangWen(){
        String gongNeng = liuLanQi.getGongNeng();
        this.gn = gongNeng+"  vpn能访问谷歌  true";
        System.out.println("浏览器"+this.gn);
    }


    public LiuLanQi getLiuLanQi() {
        return liuLanQi;
    }

    public void setLiuLanQi(LiuLanQi liuLanQi) {
        this.liuLanQi = liuLanQi;
    }
}
