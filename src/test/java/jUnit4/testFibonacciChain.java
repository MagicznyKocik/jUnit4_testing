package jUnit4;


import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

 public class testFibonacciChain {
    private FibonacciChain fibonacciChain;

    @Before
    public void setup(){
        fibonacciChain = new FibonacciChain();
    }

    @Test
    public void testFirstElement(){
        int result = fibonacciChain.calculate(1);

        assertEquals(5,result);
    }
     @Test
     public void testSecElement(){
         int result = fibonacciChain.calculate(2);

         assertEquals(1,result);
     }

     @Test
     public void testFifthElement(){
         int result = fibonacciChain.calculate(5);

         assertEquals(5,result);
     }

     @Test(expected = UnsupportedOperationException.class)
     public void testIllegalArgument(){
        fibonacciChain.calculate(-1);
     }




 }
