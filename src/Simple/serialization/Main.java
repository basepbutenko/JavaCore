package Simple.serialization;

import java.io.*;

public class Main {
    /**
     * 1 созздаем точку входа
     * 2 создаем объект Student и передаем два параметра
     * 3 создаем файл, копируем адрес в пакете при помощи команды "Copy Path|reference"  вставляем и дописываем
     * \\output.txt
     * 4 обращаемся к objectOutputStream и ObjectInputStream и создаем их объекты
     * 5 применяем try/catch и переносим ObjectOutputStream в круглые скобки () вместо {}
     * 6 с новой строки создаем объект ObjectInputStream  и создаем new FileInputStream(f));
     * 7 создаем метод, который находится в ObjectOutputStream - outputStream.writeObject  и заисываем наш
     * объект - ссылку student
     * УЧТИ!!! Если не реализовать интерфейс implements Serializable
     * 8 необходимо считать файл обращаемся к ссылке student = null и ее обнуляем и в эту сслыку student
     * записываем новое значение, мы обращаемся к inputStream и вызываем метод readObject далее try/catch кнопки
     * option+Enter и на ClassNotFoundException нажим option+shift+enter и выбираем collapse'catch'blocks
     * подчеркнутый student = inputStream.readObject(); кастим до (student)перед inputStream
     * 9 выводим содержимое объекта student при помощи soup -  System.out.println(student);
     */
    public static void main(String[] args) {
        Student student = new Student(25, "Oleksii");
        File f = new File("/Users/oleksijbutenko/IdeaProjects/JavaCore/src/Simple/serialization/output.txt");
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(f));
             ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(f));) {
            outputStream.writeObject(student);
            student = null;
            student = (Student) inputStream.readObject();
            System.out.println(student);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
