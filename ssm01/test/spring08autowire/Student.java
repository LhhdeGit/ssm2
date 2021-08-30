package spring08autowire;

//主体类，要用电脑类
public class Student {
    private  GameInterface gameInterface;

    public void setGameInterface(GameInterface gameInterface) {
        this.gameInterface = gameInterface;
    }
    /*private Computer computer2;

    public Computer getComputer() {
        return computer2;
    }

    public void setComputer(Computer computer) {
        this.computer2 = computer;
    }*/

    public Student(){
        System.out.println("我是学生类，学生类对象被创建了");
    }
    public void play(){
        System.out.println("学生玩");
       gameInterface.game();
    }
}
