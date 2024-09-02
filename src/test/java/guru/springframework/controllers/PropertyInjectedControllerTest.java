package guru.springframework.controllers;

import guru.springframework.services.GreetingSericeImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PropertyInjectedControllerTest {


    @Autowired
    PropertyInjectedController propertyInjectedController;


//    @BeforeEach
//    void setUp(){
//        propertyInjectedController = new PropertyInjectedController();
//        propertyInjectedController.greetingSerice = new GreetingSericeImpl();
//    }

    @Test
    void sayHello() {
        System.out.println(propertyInjectedController.sayHello());
    }
}