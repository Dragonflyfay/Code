package cn.dragonfly.mymap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author 蜻蜓大王
 * @date 2026/2/11 16:15
 * @description 键找值
 */
public class mapdemo2 {
    public static void main(String[] args) {
       Map<String,String> m=new HashMap<>();
        m.put("佟毓婉","周庭琛");
        m.put("林周京","韩书俊");
        m.put("果郡王","嬛嬛");
        //获取所有的键的集合
        Set<String> keys = m.keySet();
        //增强for循环方式遍历
        System.out.println("=======增强for循环=======");
        for (String key : keys) {
            System.out.println(key);
            String value = m.get(key);
            System.out.println(key+"="+value);
        }
        //迭代器方式遍历
        System.out.println("=======迭代器=======");
        Iterator<String> it=keys.iterator();
        while(it.hasNext()){
            String key=it.next();
            String value = m.get(key);
            System.out.println(key+"="+ value);
        }
        //Lambda表达式方式遍历
        System.out.println("=======Lambda表达式=======");
        keys.forEach( s ->{
                String value = m.get(s);
                System.out.println(s+"="+value);
        });

    }
}
