package SimpleExternalizable;

import java.io.*;

public class Student implements Externalizable {
    private int id;
     private transient  String username;// transient or static означает, что его нельзя сериализовать
     public Student() {//конструктор должен быть обязательно публичным, без этого ошибка
    }

    public Student(int id, String username) {
        this.id = id;
        this.username = username;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
         out.writeInt(id);
        out.writeObject(username) ;

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
         id=in.readInt();
         username=(String) in.readObject();

    }
}
class Main{
    public static void main(String[] args) {
        Student student = new Student(12, "Oleksii");
        File f = new File("/Users/oleksijbutenko/IdeaProjects/JavaCore/src/SimpleExternalizable/external.txt");
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(f));
             ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(f));) {
            outputStream.writeObject(student);
            student = (Student) inputStream.readObject();
            System.out.println(student);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}