package jUnit4;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class testFibonacciChain2 {

 FibonacciChain fibonacciChain;

 @Before
 public void setup(){
     fibonacciChain = new FibonacciChain();
 }

@Parameterized.Parameter(value = 0)
    public int argument;

 @Parameterized.Parameter(value = 1)
 public int expectedResult;


//@Parameterized.Parameters(name = "fibonacci1")
//    public static Object[] data1(){
//    return new Object[]{1,3,4,5};
//}
//@Parameterized.Parameters(name = "fibonacci")
//public static Collection<Object[]> data(){
//    return Arrays.asList(new Object[][]{{1,2},{3,2},{2,5},{3,3},{5,5},{4,3}});
//}
//@Parameterized.Parameters(name = "fibonacci")
//public static Collection<Integer[]> data(){
//    List<Integer[]> params = new ArrayList<>();
//    params.add(createIntTable(1,1));
//    return params;
//}
//
//public static Integer[] createIntTable (int param1, int param2){
//    return new Integer[]{param1, param2};
//}

    @Parameterized.Parameters(name = "fibonacci")
public static Collection<Integer[]> data(){
    List<Integer[]> params = new ArrayList<>();
    addIntTableToParams(params, 1, 1);
    addIntTableToParams(params, 2, 1);
    addIntTableToParams(params, 3, 2);
    addIntTableToParams(params, 4, 3);
    return params;
}

 private static void  addIntTableToParams(List<Integer[]> params, int param1, int param2){
    params.add(new Integer[]{param1, param2});
}


@Test
    public void testFibonacciChain(){
    int result = fibonacciChain.calculate(argument);
    assertEquals(3,result);
}

@Test
    public void testFibonacciChain2(){
    int result = fibonacciChain.calculate(argument);
    assertEquals(expectedResult,result);
}



}
