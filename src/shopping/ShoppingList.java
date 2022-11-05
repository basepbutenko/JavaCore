package shopping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ShoppingList {
    Map<String, Integer> items = new HashMap<>();


    public void add(String item, Integer count) {
        this.items.put(item, count);
    }

    public void delete(String index) {
        this.items.remove(index);

    }

    public void display() {
        for (Map.Entry <String, Integer> s : items.entrySet()) {
            System.out.println(s.getKey() + " "+ s.getValue());
        }
    }
}
