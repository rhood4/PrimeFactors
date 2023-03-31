package primeFactorsTest;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import primeFactors.primeFactors;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class primeFactorsTest {
    primeFactors pf;
    @BeforeEach
    public void setup(){
        pf = new primeFactors();
    }
    public List<Integer> list(int... ints) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i : ints)
            list.add(i);
        return list;
    }
    @Test
    public void testOne() throws Exception {
        assertEquals(list(),pf.generate(1));
    }
    @Test
    public void testTwo() throws Exception {
        assertEquals(list(2),pf.generate(2));
    }
    @Test
    public void testThree() throws Exception {
        assertEquals(list(3),pf.generate(3));
    }
    @Test
    public void testFour() throws Exception {
        assertEquals(list(2,2),pf.generate(4));
    }
    @Test
    public void testSix() throws Exception{
        assertEquals(list(2,3), pf.generate(6));
    }
    @Test
    public void testNine() throws Exception {
        assertEquals(list(3,3), pf.generate(9));
    }

}
