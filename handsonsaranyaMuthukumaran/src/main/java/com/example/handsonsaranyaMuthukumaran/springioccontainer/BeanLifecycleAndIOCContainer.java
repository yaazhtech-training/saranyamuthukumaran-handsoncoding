package com.example.handsonsaranyaMuthukumaran.springioccontainer;
/*IoC Container: This is responsible for managing the lifecycle of beans (objects managed by Spring) and wiring them together.
It reduces the effort in application development by managing the objects themselves.
 The IoC container implements DI to manage dependencies between objects.
 _____________
 Dependency Injection (DI): It is a design pattern used to implement IoC where components receive their dependencies from an external source rather than creating them internally.
 Spring provides DI through constructor injection, setter injection, and field injection.

Constructor Injection: Dependencies are provided through the constructor of a class.

Setter Injection: Dependencies are set via setter methods.

Field Injection: Dependencies are directly injected into fields.

    ________________________________
    Bean Life Cycle Phases
The lifecycle of a Spring bean consists of the following phases, which are listed below

Container Started: The Spring IoC container is initialized.
Bean Instantiated: The container creates an instance of the bean.
Dependencies Injected: The container injects the dependencies into the bean.
Custom init() method: If the bean implements InitializingBean or has a custom initialization method specified via @PostConstruct or init-method.
Bean is Ready: The bean is now fully initialized and ready to be used.
Custom utility method: This could be any custom method you have defined in your bean.
Custom destroy() method: If the bean implements DisposableBean or has a custom destruction method specified via @PreDestroy or destroy-method, it is called when the container is shutting down.

 */
public class BeanLifecycleAndIOCContainer
{
}
