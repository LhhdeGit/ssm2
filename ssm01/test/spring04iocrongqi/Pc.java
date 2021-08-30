package spring04iocrongqi;

public class Pc {
    public  Pc(){
        System.out.println("电脑的无参构造，就是对象已诞生就会执行的方法，比如人一出生就会哭");
        System.out.println("构造方法就是对象已诞生就会执行的方法，一般用来初始化自己的属性");
    }
    public  void  initShow(){
        System.out.println("开机.....");
        System.out.println("构造方法就是对象已诞生就会执行的方法和构造方法不同的是他多用直接调用自己的方法");
    }

    //对象的普通方法
    public  void  playGame(){
        System.out.println("电脑的普通方法，用来打游戏");
    }

    //对象的死亡方法
    public  void  destroyObj(){
        System.out.println("电脑中毒了...打球爆炸了...电脑对象死亡了，执行的方法");
    }
}
