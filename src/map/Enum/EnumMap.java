package map.Enum;

import java.util.Map;
import java.util.Set;

public class EnumMap {
    public static void main(String[] args) {
        Map<Animal, String> enumMap = new java.util.EnumMap<Animal, String>(Animal.class);
        enumMap.put(Animal.CAT, "murik");
        enumMap.put(Animal.DOG, "NIKA");
        enumMap.put(Animal.BIRD, "Kesha");

        Set set = enumMap.entrySet();
        for (Object o : set) {
            Map.Entry m = (Map.Entry) o;
            System.out.println(m.getKey() + " - " + m.getValue() + ";");

        }
    }
}

enum Animal {
    CAT, DOG, BIRD
}