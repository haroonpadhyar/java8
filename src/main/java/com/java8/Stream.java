package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by hpadhyar on 5/17/2017.
 */
public class Stream {
  public static void main(String[] args) {
    System.out.println("\nSequential Stream");
    List<String> strList = Arrays.asList("Apple", "Banana", "Biscuit", "Guava", "Pear", "Plum");
    long startTime = System.currentTimeMillis();
    strList.stream()
           .filter(s -> s.startsWith("B"))
           .map(String::toUpperCase)
           .sorted()
           .forEach(System.out::println);
    long endTime = System.currentTimeMillis();
    System.out.println("Time taken : "+ TimeUnit.NANOSECONDS.toNanos(endTime - startTime));

    System.out.println("\nParallel Stream");
    startTime = System.currentTimeMillis();
    strList.parallelStream()
            .filter(s -> s.startsWith("B"))
            .map(String::toUpperCase)
            .sorted()
            .forEach(System.out::println);
    endTime = System.currentTimeMillis();
    System.out.println("Time taken : "+ TimeUnit.NANOSECONDS.toNanos(endTime - startTime));
  }
}
