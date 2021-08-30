package spring18cglibdongtaidaili;

import org.junit.Test;

public class ManTest {
    @Test
    public void tets01(){
        Man erzi = new CglibFactory().cglibCreator();
        int score = erzi.dream();
        System.out.println("score = " + score);
    }
}
