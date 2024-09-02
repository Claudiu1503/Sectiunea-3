package guru.springframework;

import guru.springframework.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Sec3Application {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(Sec3Application.class, args);

        MyController controller = ctx.getBean(MyController.class);
//        MyController controller = new MyController();

        System.out.println("In Main Method");

        System.out.println(controller.sayHello());
    }

}
