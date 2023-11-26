package Another;

class ObjectsMain {
    public static void main(String[] args) {


        String a = "1";// ссылочная переменная
        System.out.println(a);

        a = new String("2");// 2-йтвариант ссылочной переменной
        System.out.println(a);




        int c = 5;
        int v = 5;
        System.out.println(c == v);


        Object obj1 = new Object();
        Object obj2 = obj1;

        System.out.println(obj1 == obj2);

        DemoObject demoObject1 = new DemoObject(1);
        DemoObject demoObject2 = new DemoObject(2);

        System.out.println(demoObject1.equals(demoObject2));


    }


}


