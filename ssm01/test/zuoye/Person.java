package zuoye;

public class Person {
    public Person(){
        System.out.println("人在容器中诞生了");
    }
    private Eat eat;

    public Eat getEat() {
        return eat;
    }

    public void setEat(Eat eat) {
        this.eat = eat;
    }

    public void eatw(){
        System.out.println("人吃什么的方法");
        eat.EatWhat();
    }

}
