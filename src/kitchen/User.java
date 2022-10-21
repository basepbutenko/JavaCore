package kitchen;

public class User {

    Lucent camera;

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
}
