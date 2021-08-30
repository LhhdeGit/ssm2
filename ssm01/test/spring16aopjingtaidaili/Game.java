package spring16aopjingtaidaili;

public class Game {
    private  int wangsu = 460;

    public int getWangsu() {
        return wangsu;
    }

    public void setWangsu(int wangsu) {
        this.wangsu = wangsu;
    }

    //目标对象的目的： 目标对象自身的办法是不行的，想要在不改变源代码的前提下，增强这个方法
    public void conNet(){
        System.out.println("游戏本身的网速是："+this.getWangsu());
    }
}
