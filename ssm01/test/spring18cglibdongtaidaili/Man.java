package spring18cglibdongtaidaili;

public class Man {
    private int gaokaoScore = 300;

    public int dream() {
        System.out.println("考试分数为=" + this.gaokaoScore);
        return this.gaokaoScore;
    }


    public int getGaokaoScore() {
        return gaokaoScore;
    }

    public void setGaokaoScore(int gaokaoScore) {
        this.gaokaoScore = gaokaoScore;
    }
}