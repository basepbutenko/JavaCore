package Lection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {

    private static int i;

    public static void main(String[] args) {
    //    i = 5;
        ArrayList<Integer>arrayList=new ArrayList<>();
        for (i =0; i <15; i++){
            arrayList.add(i);
           // System.out.println(i);
        }
        for(Integer temp : arrayList ){
            System.out.println(temp);
        } 
    }

}
