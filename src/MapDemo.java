import kitchen.Camera;
import kitchen.CounterImpl;
import kitchen.User;

import java.util.HashMap;
import java.util.Map;

class MapDemo {
    public static void main(String[] args) {

        Map<String, User> map  = new HashMap<>(); // ключ String, User - значение  только ссылочные типы данных
       map.put("S", new User("S1"));
       map.put("A", new User("A1"));
       map.put("U", new User("U1"));

        for (String s : map.keySet()) {
            System.out.println(s);
        }

        map.remove ("A");//убрали А
        System.out.println("-----------------");

        for (String s : map.keySet()) {
            System.out.println(s);
        }

        System.out.println("-----------------");
        System.out.println(map.get("U"));



        System.out.println("---->>>>>-------------" + map.size());

        for (Map.Entry<String,User> s: map.entrySet()) {
            System.out.println(s.getValue());// getValue возвращает User
        }

        /*int x;
        x = 9;

        Integer xx = Integer.parseInt("1");
        String xxstr = String.valueOf(5);
        String uu = "5";*/


    }


}


