public class Main {

    public static void main(String[] args) {
        new Main().divide(0,3);
    }
    public void divide ( int a, int b){
        try {
            int c = a / b;
        } catch (Exception e) {
            System.out.print("Exception ");
        } finally {
            System.out.println("Finally");
        }
    }
}
//public class Main {
//        {
//            System.out.println("one");
//        }
//
//        public static void main(String[] args) {
//        System.out.println("two");
//    }
//
//        static {
//        System.out.println("three");
//    }
//    }
//class A {
//    {
//        System.out.print("5");
//    }
//
//    static {
//        System.out.print("3");
//    }
//
//    public A() {
//        System.out.print("4");
//    }
//}
//
//class B extends A {
//    {
//        System.out.print("2");
//    }
//
//    static {
//        System.out.print("6");
//    }
//
//    public B() {
//        System.out.print("1");
//    }
//
//    public static void main(String[] args) {
//        new B();
//    }
//}
//System.out.println("Hello");
       // while(1)
       // {System.out.println("World");
       //     break;
   // }}}
        // float real=0.0f/0.0f;
        // if (real==real)
        // System.out.println("Equal");
  /*      else
            System.out.println("Not Equal");
    }}
class String_demo
{public static void main(String[] args){
    int ascii[]={65,66,67,68};
    String s=new String(ascii, 1, 3);
    System.out.println(s);
}}

*/