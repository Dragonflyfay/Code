package cn.dragonfly.mymap;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * @author 蜻蜓大王
 * @date 2026/2/11 20:55
 * @description LinkedHashMap学习
 */
public class LinkedHashMapdemo1 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lm=new LinkedHashMap<>();
        lm.put("b",18);
        lm.put("a",26);
        lm.put("c",18);
        lm.put("a",16);

        System.out.println(lm);
    }
}
