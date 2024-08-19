package Objects1;

import Objects.ObjectInPackage1;

public class ObjectInPackage2 extends ObjectInPackage1 {
    public ObjectInPackage2(){
    }
    public int item5 = 4;
    int item6 = 2;
    protected int item7 = 60;
    private int item8 = 90;
    private String run = "I can fly and run";

    public int getItem6() {
        return item6;
    }

    public int getItem7() {
        return item7;
    }
    public int getItem8(){
        return item8;
    }

    @Override
    public String getRun() {
        return run;
    }
}
