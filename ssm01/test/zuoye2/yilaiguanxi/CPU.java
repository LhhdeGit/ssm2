package zuoye2.yilaiguanxi;

public class CPU {
    private JP jp;

    public CPU(){
        System.out.println("CPU对象被创建");
    }

    public CPU(JP jp){
        this.jp=jp;
    }
    public void play(){
        System.out.println("打字的方法");
        jp.game();
    }
}
