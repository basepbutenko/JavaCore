package Courses;

public class SimpleMethodsOfString {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "Developer";
        Long l1 = System.nanoTime();
        String str = str1.concat(str2).concat(str3);
        Long l2 = System.nanoTime();
        System.out.println(l2 - l1);
        System.out.println(str3.length());
        System.out.println(str1.length());
        System.out.println(str1.indexOf("l"));
        System.out.println(str1.substring(0,2));
        System.out.println(str1.replace("l", "K"));

        System.out.println(str1.toLowerCase());

        System.out.println(str1.toUpperCase());


        Long l3 = System.nanoTime();
        String str4 = str1+str2+str3;
        Long l4 = System.nanoTime();
        System.out.println(l4 - l3);

        Long l5 = System.nanoTime();
        String str7 =new StringBuilder().append(str1).append(str2).append(str3).toString();
        Long l6 = System.nanoTime();
        System.out.println(l6 - l5);
        Integer i1 = 55;
        System.out.println(i1.toString());

    }
}
