import java.util.ArrayList;

class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>(); // можно хранить только ссылочные типы данных
        arrayList.add("tests");
        arrayList.add("tests");
        arrayList.add("tests");
        arrayList.add("tests");
        arrayList.add("tests");
        arrayList.add(1, "111111111");
        arrayList.add("tests");
        arrayList.add("tests");
        arrayList.set(0, "00000000");
        arrayList.add("tests");

        for (String s : arrayList) {
            System.out.println(s);
        }

        arrayList.remove(1);
        System.out.println("-----------------");

        for (String s : arrayList) {
            System.out.println(s);
        }

        System.out.println("-----------------");
        System.out.println(arrayList.get(1));


        arrayList.clear();
        System.out.println("---->>>>>-------------" + arrayList.size());

        for (String s : arrayList) {
            System.out.println(s);
        }

        int x;
        x = 9;

        Integer xx = Integer.parseInt("1");
        String xxstr = String.valueOf(5);
        String uu = "5";


    }


}


