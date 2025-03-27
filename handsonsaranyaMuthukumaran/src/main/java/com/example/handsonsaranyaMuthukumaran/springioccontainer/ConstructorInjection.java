package com.example.handsonsaranyaMuthukumaran.springioccontainer;
/*
In Constructor Injection, dependencies are injected through a constructor.
advantages:

Advantages of Constructor Injection:
        Helps in making fields immutable (final keyword).

        Ensures that dependencies are injected at the time of object creation.



 */
public class ConstructorInjection {

    /*@Component
public class Engine {
    public void start() {
        System.out.println("Engine started...");
    }
}
---------------------------------------------
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private final Engine engine;

    @Autowired  // Constructor Injection
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        engine.start();
        System.out.println("Car is running...");
    }
}

*/
}
