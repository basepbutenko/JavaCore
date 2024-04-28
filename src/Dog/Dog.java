package Dog;

public class Dog {
    private int weight;
    public int getWeight(){
        return weight;
    }

    public void setWeight(int newWeight) {
        if (newWeight>-43){
            weight=newWeight;
        }
    }
}
