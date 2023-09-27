package Course3;



import java.io.*;

public class SimpleStaticSerialization implements Serializable {
    private static int staticNumber;
    private int nonStaticNumber;

    public SimpleStaticSerialization(int nonStaticNumber) {
        this.nonStaticNumber = nonStaticNumber;
        staticNumber=nonStaticNumber;
    }
public static void serializeStatic(ObjectOutputStream oos) throws IOException {
        oos.writeInt(staticNumber);
}
    public static void deserializeStatic(ObjectInputStream oos) throws IOException {
        staticNumber=oos.readInt();
    }
    @Override
    public String  toString() {
        return staticNumber+" "+nonStaticNumber;
    }
    /**
     * как можно изменить значение статического поля? Нам необходимо явно написать методы райдинт и ридинт. Создаем
     * эти методы перед переопределением toString
     */
}
class Dispatcher{
    public static void main(String[] args) {
        SimpleStaticSerialization s = new SimpleStaticSerialization(10);
        File f = new File("/Users/oleksijbutenko/IdeaProjects/JavaCore/src/Course3/test.txt");
        System.out.println( "First values=" +  s);
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(f));
             ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(f));) {

            SimpleStaticSerialization.serializeStatic(outputStream);//1 сериализую единственное статическое поле типа инт
            outputStream.writeObject(s);//2 сериализую все, что я могу

            s = new SimpleStaticSerialization(30);//мы создали новый объект и поменяли значение
            System.out.println("After serialization =" +  s);

            SimpleStaticSerialization.deserializeStatic(inputStream);// 3 я десериализую статическое поле
            s = (SimpleStaticSerialization) inputStream.readObject();//считываем из файла и у нас первое значение 30 потому что статические поля не сериализуются
            System.out.println("After serialization = " +s);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}