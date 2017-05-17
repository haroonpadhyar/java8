package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

/**
 * Created by hpadhyar on 5/17/2017.
 */
public class MethodReference {
  public static void main(String[] args) {

    ClassA classA = new ClassA();
    Consumer<String> consumer = classA::doPrint;

    List<String> strList = Arrays.asList("Apple", "Banana", "Guava", "Pear", "Plum");
    strList.forEach(consumer);

  }

  public static class ClassA{
    public void doPrint(String s){
      System.out.println(s);
    }

    public Optional doOption(String s){
      System.out.println(s);
      return Optional.empty();
    }
  }
}
