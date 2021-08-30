package spring06di;
//人是我们的 主体，主要的类，他需要以来的手机
public class Person {
    public  Person(){
        System.out.println("人在容器中诞生了");
    }

    //接口都是抽象的
    private PlayGame playGame;

    public PlayGame getPlayGame() {
        return playGame;
    }

    public void setPlayGame(PlayGame playGame) {
        this.playGame = playGame;
    }

    /*  private Phone phone; //人依赖了手机，所以人就拥有了手机
        private Psp psp;
    */
   /* public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) { //setv是暴露给别人看的，让别人给你东西的
        this.phone = phone;
    }


    public Psp getPsp() {
        return psp;
    }

    public void setPsp(Psp psp) {
        this.psp = psp;
    }
*/
    public void play(){
        System.out.println("人玩的方法");
       // phone.game(); //手机玩游戏
        playGame.game();
    }
}
