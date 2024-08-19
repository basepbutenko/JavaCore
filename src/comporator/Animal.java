package comporator;

import java.util.Comparator;

public class Animal implements Comparable {
    int weight;
    String name;
    String breed;
    int price;

    public Animal(int weight, String name, String breed, int price){
        this.weight=weight;
        this.name=name;
        this.breed=breed;
        this.price=price;
    }

    @Override
    public String toString() {
        return this.weight+", "+this.name+", "+this.breed+", "+this.price;
    }
    public int compareTo(Object o){
        int tmp=this.weight-((Animal)o).weight;
        if(tmp==0){
            return this.price-((Animal)o).price;
        }else {
            return tmp;
        }
    }
}
