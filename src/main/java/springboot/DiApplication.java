package springboot;

import guru.springframework.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("guru.springframework")
public class DiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx =SpringApplication.run(DiApplication.class, args);
        GreetingController greetingController = (GreetingController) ctx.getBean("greetingController");

        greetingController.sayHello();    }

}
