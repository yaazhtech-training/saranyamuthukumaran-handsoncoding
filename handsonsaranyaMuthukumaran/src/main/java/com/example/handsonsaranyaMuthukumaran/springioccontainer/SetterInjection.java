package com.example.handsonsaranyaMuthukumaran.springioccontainer;
/*In Setter Injection, dependencies are injected via setter methods.

Example:*/
public class SetterInjection {
    /*import org.springframework.stereotype.Component;

    @Component
    public class Engine {
        public void start() {
            System.out.println("Engine started...");
        }
    }
    ---------------------------------


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private Engine engine;

    public Car() {
    }

    @Autowired  // Setter Injection
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        engine.start();
        System.out.println("Car is running...");
    }
}

     */
}
