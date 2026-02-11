package cn.dragonfly.mymap;

import java.util.TreeMap;

/**
 * @author 蜻蜓大王
 * @date 2026/2/11 21:18
 * @description 自定义对象键
 */
public class TreeMapDemo2 {
    public static void main(String[] args) {
        /*
        TreeMap集合：基本应用
                需求1
                键：学生对象
                值：籍贯
                要求：按照学生年龄升序进行排序，年龄一样，按照姓名的字母排序，同姓名年龄视为同一个人

               */
        //1.创建集合对象
        TreeMap<Student, String> tm=new TreeMap<>();
        //2.创建3个学生对象
        Student s1=new Student("王五",18);
        Student s2=new Student("小可心",19);
        Student s3=new Student("小朱",10);
//3.添加元素
        tm.put(s1,"湖南");
        tm.put(s2,"湖北");
        tm.put(s3,"湖南");
        System.out.println(tm);
    }
}
