package Exercise;

public class Method2HelloWorld {
    public void firstWord(String wrd){
        System.out.print("Hello ");
        secondWord("World");

    }
    public void secondWord(String str){
        System.out.println(str);
    }
    public static void main(String[] args) {
        Method2HelloWorld mtd = new Method2HelloWorld();
        mtd.firstWord("Helli");

    }
}
