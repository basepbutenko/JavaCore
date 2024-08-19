package firstworld;

public class HelloWorldMethod {
public String h = "Hello";
public String w = "World";

    public void method (){
        System.out.println( h + w);
    }

    public HelloWorldMethod() {
    }

    public static void main(String[] args) {
        HelloWorldMethod helloWorldMethod=new HelloWorldMethod();
        helloWorldMethod.method();


    }
}
