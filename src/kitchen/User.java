package kitchen;

public class User {
    String name;
    Lucent camera;

    public User(String name) {
        this.name = name;
    }

    public User(Lucent camera) {
        this.camera = camera;
    }


    // принцип подстановки Лисков! /
    // функции, которые используют базовый тип,
    // должны иметь возможность использовать подтипы базового типа не зная об этом
//    @electricAppliance
    void doWork(ElectricAppliance electricAppliance){

    }


    void doCook(Cooker cooker){
        camera.light();
        cooker.cook();
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
