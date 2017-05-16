package com.java8.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Created by hpadhyar on 5/16/2017.
 */
public class LambdaSample {

  public static void main(String[] args) {
    List<String> strList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
    strList.sort((s1, s2)-> s1.compareTo(s2));
    strList.forEach(s -> System.out.println(s));
    strList.forEach(System.out::println);

    System.out.println("\n Multi Statement");
    strList.forEach(s -> {
      if (s.startsWith("a"))
        System.out.println(s);
    });


    System.out.println("Calling method");
//    int a=1,b=2;
    CalculatorImp cal = new CalculatorImp();
    int cal1 = cal.cal((a, b) -> a * b);
    System.out.println(cal1);

  }

  public static class CalculatorImp{
    int a = 1, b= 2;
    public int cal(Calculator calculator){
      return calculator.cal(a, b);
    }
  }

//  @FunctionalInterface
  public interface Calculator {
    public int cal(int a, int b);
  }
}
