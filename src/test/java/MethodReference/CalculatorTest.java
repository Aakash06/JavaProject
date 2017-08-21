package MethodReference;

import org.junit.Test;

import java.util.function.BiFunction;
import java.util.function.Predicate;
import static org.junit.Assert.*;

public class CalculatorTest {


   private BiFunction<Integer, Integer, Integer> addition = Calculator::add;
   private BiFunction<Integer, Integer, Integer> subtraction = Calculator::subtract;
   private BiFunction<Integer, Integer, Integer> multiplication = Calculator:: product;
   private Predicate<Integer> isEven = Calculator :: isEven;
   private Predicate<Integer> isOdd = Calculator :: isOdd;
   private Predicate<Integer> isPositive = Calculator :: isPositive;

   @Test
   public void add(){
       assertEquals(addition.apply(10, 20),30,0);
   }

    @Test
    public void subtract(){
        assertEquals(subtraction.apply(10, 20),-10,0);
    }

    @Test
    public void product(){
        assertEquals(multiplication.apply(10, 20),200,0);
    }

    @Test
    public void IsOdd(){
        assertTrue(isOdd.test(21));
    }

    @Test
    public void IsEven(){
        assertTrue(isEven.test(98));
    }

    @Test
    public void IsPositive(){
        assertTrue(isPositive.test(30));
    }

}