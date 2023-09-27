package Simple.serialization;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable {
    private int id;
    private String name;


    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (id != student.id) return false;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setGroup(Group group) {
    }
}
/**
 * 1 создаем два поля :  private int id; private String name;
 * 2 создаем конструктор с параметрами при помощи сочетания клавиш command + N
 * 3 создаем конструктор без параметров при помощи сочетания клавиш command + N
 * 4 создаем toString
 * 5 создаем геттеры и сеттеры с тем же сочетанием клавишь
 * 6 создаем equals and HashCode
 * 7 далее переходим в класс Main
 * 8 УЧТИ!!! Если не реализовать интерфейс implements Serializable будет ошибка
 */