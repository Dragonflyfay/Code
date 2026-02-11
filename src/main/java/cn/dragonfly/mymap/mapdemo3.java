package cn.dragonfly.mymap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

/**
 * @author 蜻蜓大王
 * @date 2026/2/11 16:58
 * @description 键值对遍历方式
 */
public class mapdemo3 {
    public static void main(String[] args) {
        Map<String,String> m=new HashMap<>();
        m.put("牧首","艾因");
        m.put("星之提督","路辰");
        m.put("执行官","罗夏");

        //键值对遍历方式
        //3.1通过entryset方法获取键值对集合
        Set<Map.Entry<String, String>> entries = m.entrySet();
        //3.2遍历entries集合，去得到里面的每一个键值对对象
        //增强for循环方式遍历
        System.out.println("=======增强for循环=======");
        for(Map.Entry<String, String>entry:entries){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"="+value);
        }
        //迭代器方式遍历
        System.out.println("=======迭代器=======");
        Iterator<Map.Entry<String, String>> it= entries.iterator();
        while(it.hasNext()){
            Map.Entry<String, String> entry = it.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"="+value);
        }
        //Lambda表达式方式遍历
        System.out.println("=======Lambda表达式=======");
        entries.forEach( entry-> {
                String  key = entry.getKey();
                String value = entry.getValue();
                System.out.println(key+"="+value);

        });
    }
}
