package cn.dragonfly.mymap;

import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author 蜻蜓大王
 * @date 2026/2/11 21:35
 * @description 统计
 */
public class TreeMapDemo3 {
    public static void main(String[] args) {
        /*需求：按照用户输入的字符串，统计字符串中每个字符出现的次数
        * 输出结果：
        a(5)b(3)....*/
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.nextLine();
        TreeMap<Character,Integer> tm=new TreeMap<>();
        //2.遍历字符串的到里面的每一个字符
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //3.判断这个字符在TreeMap中是否存在
            if(tm.containsKey(c)){
                int count=tm.get(c);
                count++;
                tm.put(c, count);
            }else {
                tm.put(c,1);
            }

        }
        StringBuilder sb=new StringBuilder();
        for (Character key : tm.keySet()) {
            int count = tm.get(key);
            sb.append(key).append("(").append(count).append(")");
        }
        System.out.println(sb);

    }
}
