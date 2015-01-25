package com.tigerit.client;

/**
 * Created by forhad on 1/24/15.
 */
import com.tigerit.server.GreetingService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringRemotingRmi {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-client.xml");
        //System.out.println("Hello");
        GreetingService greetingService = (GreetingService)context.getBean("greetingService");
        String greetingMessage = greetingService.getGreeting("Forhad");
        System.out.println("The greeting message is : " + greetingMessage);
    }
}

