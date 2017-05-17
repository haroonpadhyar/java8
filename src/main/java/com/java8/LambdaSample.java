package com.java8;

import java.util.Arrays;
import java.util.List;

/**
 * Created by hpadhyar on 5/16/2017.
 */
public class LambdaSample {

  public static void main(String[] args) {

    //List Sort and print
    List<String> strList = Arrays.asList("Apple", "Banana", "Guava", "Pear", "Plum");
    strList.sort((s1, s2)-> s1.compareTo(s2));
    strList.forEach(s -> System.out.println(s));
    strList.forEach(System.out::println);

    // Multi statement in Lambda expression
    System.out.println("\nMulti Statement");
    strList.forEach(s -> {
      if (s.startsWith("A"))
        System.out.println(s);
    });


    // Calling method with Lambda
    System.out.println("\nCalling method");
    CalculatorImp cal = new CalculatorImp();
    int cal1 = cal.doCal((a, b) -> a * b);
    System.out.println(cal1);

  }

  public static class CalculatorImp{
    int a = 1, b= 2;
    public int doCal(Calculator calculator){
      return calculator.cal(a, b);
    }
  }

  @FunctionalInterface // make sure only one abstract method otherwise compile time error.
  //As long as Interface has only one abstract method, any arbitrary interface can be used as Lambda expression.
  public interface Calculator {
    public int cal(int a, int b);
  }
}
