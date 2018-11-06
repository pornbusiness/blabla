import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateTest {

    @Test
    public void add() {
        assertEquals(5, new Calculate().add(2,3));
    }

    @Test
    public void sub() {
        assertEquals(5, new Calculate().sub(8, 3));
    }

    @Test
    public void multiply() {
        assertEquals(8, new Calculate().multiply(2,4));
    }

    @Test
    public void divide() {
        assertEquals(4, new Calculate().divide(8,2));
    }


    @Test
    public void arrayCreat() {
        int[] arrayTest = new Calculate().arrayCreat();

        for(int i = 0; i < arrayTest.length; i++){
            System.out.print(arrayTest[i] + " ");
        }
    }

    @Test
    public void driveCalculate(){
        int a = 10, b = 2;
        new Calculate().driveCalculate(a, b);
    }

    @Test
    public void arrayCreat1() {
        int[] arrayTest = new Calculate().arrayCreat1();

        for(int i = 0; i < arrayTest.length; i++){
            System.out.print(arrayTest[i] + " ");
        }
    }
}