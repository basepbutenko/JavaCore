package Objects;
import Objects1.ObjectInPackage2;
import Objects1.Parent;


public class Main {
    public static void main (String[]args){
        ObjectInPackage1 op = new ObjectInPackage1();
        System.out.println( op.item1 );
        System.out.println(op.item2 );
        System.out.println(op.item3 );
        System.out.println(op.getItem4());
        System.out.println("Method 1= " + op.getRun()+ ";");

        ObjectInPackage2 op2 = new ObjectInPackage2();
        System.out.println(op2.item5);
        System.out.println(op2.getItem6());
        System.out.println(op2.getItem7());
        System.out.println(op2.getItem8());
        System.out.println("Method 2= " + op2.getRun()+ ";");

        Parent pr = new Parent();
        System.out.println("Method Parent's class= " + pr.getRun()+";");

    }
}
