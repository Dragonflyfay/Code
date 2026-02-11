package cn.dragonfly.mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

/**
 * @author 蜻蜓大王
 * @date 2026/2/11 19:10
 * @description 存储学生对象
 */
public class HashMapdemo1 {
    public static void main(String[] args) {
        //如果自定义对象存在键，要重写hashCode()和equals()方法
        //定义一个HashMap,键是Student对象，值是籍贯（String）
        //1.创建HashMap对象
        HashMap<Student, String> m=new HashMap<>();
        //2.创建Student对象
        Student s1=new Student("小可心",18);
        Student s2=new Student("wangwu",80);
        Student s3=new Student("lisi",20);
        Student s4=new Student("lisi",20);
        //3.把Student对象作为键，籍贯作为值存储到HashMap中
        m.put(s1,"湖南");
        m.put(s2,"湖北");
        m.put(s3,"上海");
        m.put(s4,"湖南");
        //增强for循环遍历
        //键找值方法
        Set<Student> keys = m.keySet();
        for (Student key : keys){
            String value = m.get(key);
            System.out.println(key+"="+value);
        }
        //键值对遍历方法
        System.out.println("====================");
        Set<Map.Entry<Student, String>> entries = m.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"="+value);

        }
        //Lambda遍历
        System.out.println("====================");
        //m.forEach((key,value)-> System.out.println(key+"="+value));
        m.forEach(new BiConsumer<Student, String>() {
            @Override
            public void accept(Student key, String value) {
                System.out.println(key+"="+value);
            }
        });
    }
}
