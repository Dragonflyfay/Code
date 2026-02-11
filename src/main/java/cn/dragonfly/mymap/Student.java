package cn.dragonfly.mymap;

import java.util.Objects;

/**
 * @author 蜻蜓大王
 * @date 2026/2/11 19:10
 * @description 自定义学生类
 */
public class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

   /* @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }*/

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }

    @Override
    public int compareTo(Student o) {
        //按照年龄升序排列，年龄一样，按照姓名的字母排序

        //this: 当前要添加的元素
        //o:已经存在于红黑树的元素
        //返回值：
        //0: 表示两个元素相同，不添加
        //正数：放在右边
        //负数：放在左边
        int i=this.getAge()-o.getAge();
        i=i==0? this.getName().compareTo(o.getName()):i;


        return i;
    }
}
