package cn.dragonfly.mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * @author 蜻蜓大王
 * @date 2026/2/11 17:20
 * @description Lambda表达式遍历Map
 */
public class mymap4 {
    public static void main(String[] args) {
        Map<String, String> m=new HashMap<>();
        m.put("曹操","不可能绝对不可能");
        m.put("刘备","接着奏乐接着舞");
        m.put("狼因","开花结果你还记得吗");
        //底层：
        //foreach方法就是利用增强for方式进行遍历，一次的到每一个键和值
        //m.forEach(( key,  value)-> System.out.println(key+"="+value ));
        m.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key+"="+value);
            }
        });

    }
}
