package cn.dragonfly.mymap;

import java.util.*;

/**
 * @author 蜻蜓大王
 * @date 2026/2/11 20:10
 * @description 应用举例
 */
public class HashNapdemo2 {
    public static void main(String[] args) {
        /*
        总计80个人，选择从ABCD四个景点选一个，统计每个景点的选择人数
        每个人只能选一个，找出出最多选择的景点

         */
        //定义数组，存储四个景点
        String[] arr={"A","B","C","D"};
        Random r=new Random();
        ArrayList<String> list=new ArrayList<>();
        for (int i = 0; i < 80; i++) {
            list.add(arr[r.nextInt(arr.length)]);
        }
        HashMap<String,Integer> m=new HashMap<>();
        for (String name : list) {
            if(m.containsKey(name)){
                Integer count = m.get(name);
                count++;
                m.put(name, count);
            }else{
                m.put(name, 1);
            }
        }
        System.out.println(m);//统计完
        int max=0;
        //用键值对遍历
        Set<Map.Entry<String, Integer>> entries = m.entrySet();

        for (Map.Entry<String, Integer> entry : entries) {
            int count=entry.getValue();
            if(count>max){
                max=count;
            }

        }
        System.out.println(max);
        for (Map.Entry<String, Integer> entry : entries) {
            int count=entry.getValue();
            if(count==max){
                System.out.println(entry.getKey());
            }
        }


    }
}
