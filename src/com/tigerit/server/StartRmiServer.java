package com.tigerit.server;

/**
 * Created by forhad on 1/24/15.
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartRmiServer {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-server.xml");
        System.out.println("Waiting for Request from Client ...");

    }
}