package Simple.serialization;

import java.io.Serializable;

public class Group implements Serializable {
    private String name;
    private Student student;


    public  Group(String java) {
    }


    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", student=" + student +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
