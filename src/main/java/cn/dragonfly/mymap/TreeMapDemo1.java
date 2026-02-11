package cn.dragonfly.mymap;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author 蜻蜓大王
 * @date 2026/2/11 21:00
 * @description TreeMap学习
 */
public class TreeMapDemo1 {
    public static void main(String[] args) {
        /*
        TreeMap集合：基本应用
                需求1
                键：整数id
                值：字符串表示商品名称
                要求：按照id的升序进行排序，按照id的降序进行排序
               */
        //1.创建集合对象
        //Integer, Double默认情况下都是按照升序排列
        //String按照字母在ASCII码表中的顺序进行排序 abcdf...
        TreeMap<Integer, String> tm=new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //o1:当前要添加的元素
                //o2:已经存在于红黑树的元素
                //return o1-o2;升序
                return o2-o1;//降序
            }
        });
        //2.添加元素
        tm.put(1,"奥利奥");
        tm.put(3,"可口可乐");
        tm.put(4,"橙汁");
        tm.put(2,"养乐多");
        tm.put(3,"AD钙");

        System.out.println(tm);//默认按照升序

    }
}
