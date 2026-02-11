package cn.dragonfly.mymap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 蜻蜓大王
 * @date 2026/2/11 1:23
 * @description map学习
 */
public class mapDemo1 {
    public static void main(String[] args) {
        //创建Map实现类对象
        Map<String, String> m=new HashMap<>();
        m.put("小蜻蜓","18");
        m.put("小可心","16");
        m.put("海艳","18");
        //String value = m.put("小可心", "18");
        //System.out.println(value);
        boolean keycontains = m.containsKey("小可心");
        boolean valuecontains = m.containsValue("18");
        //m.clear();
        m.isEmpty();
        System.out.println(m);
    }
}
