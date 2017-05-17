package com.java8;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hpadhyar on 5/17/2017.
 */
public class ForEach {

  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();
    map.put("A", 10);
    map.put("B", 20);
    map.put("C", 30);
    map.put("D", 40);
    map.put("E", 50);
    map.put("F", 60);

    map.forEach((k,v) -> System.out.println(k+" -> "+v));

  }

}
