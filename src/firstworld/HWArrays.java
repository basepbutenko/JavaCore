package firstworld;

import java.util.*;

public class HWArrays {
    static String []array = new String[]{"Hello", "I promise to be perfect developer", "World"};



    public static void main(String[] args) {
        System.out.println("Number of array elements: "+ array.length);
        System.out.println("My adress is: "+array.toString());
        System.out.println( Arrays.toString(array));
        System.out.println(array[0] +" "+ array[2]+"!!!");

    }

}
class ArrayListHelloWorld{
    public static void main(String[] args) {
        ArrayList<String>arrayList=new ArrayList<>();
        arrayList.add("Hello ");
        arrayList.add("My program");
        arrayList.add("Owersome");
        arrayList.add("World!");
        System.out.println(arrayList.size());
        arrayList.remove(1);
        arrayList.hashCode();
        System.out.println(arrayList.hashCode());
      //  arrayList.add(0, "My friend");
        System.out.println(arrayList);
        arrayList.remove(0);
       // arrayList.remove(2);
        System.out.println(arrayList);
        arrayList.add(0, "Hello ");
        System.out.println(arrayList);
        arrayList.remove(1);
//        System.out.print(arrayList);
        System.out.println(arrayList.get(1));
        System.out.print(arrayList.get(0));
        System.out.print(arrayList.get(1));
        System.out.println(arrayList);
        System.out.print(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        System.out.println(arrayList.hashCode());
        System.out.println(arrayList.isEmpty());// check for emptiness
        System.out.println(arrayList.indexOf("World!"));

        System.out.println(arrayList.lastIndexOf("Hello"));//get the object index from the end
    }
}
 class SimpleIterator{
    public SimpleIterator(){}

     public static void main(String[] args) {
         ArrayList<Integer> arrayList=new ArrayList<>();
         arrayList.add(7);
         arrayList.add(8);
         arrayList.add(9);
         System.out.println("size is:"+ arrayList.size());

         Iterator<Integer> iterator= arrayList.iterator();
         while (iterator.hasNext()){
             Integer integer=iterator.next();
             System.out.print(integer);
         }
     ListIterator<Integer> listiterator= arrayList.listIterator();// more advanced version of iterator. It's bi-directional
         while (listiterator.hasNext()){
             Integer integer= listiterator.next();
             System.out.println(" ");
             System.out.println(integer);
         }
//         while (listiterator.hasPrevious()){
//             Integer integer1=listiterator.next();
//             System.out.println(integer1);
//         }

}}

 class ExpansionOfTheArrayList{
    public ExpansionOfTheArrayList(){};

     public static void main(String[] args) {
    ArrayList<Integer> arrayList=new ArrayList<>();
    for (int i=0; i<15; i++) {
        arrayList.add(i);
    }
    // there is the following formula for encreasing or expanding an arrayList: (n x 3)/2+1= 10x3/2+1=16
    for(Integer temp:arrayList){
        System.out.print(temp);
    }
     }
 }