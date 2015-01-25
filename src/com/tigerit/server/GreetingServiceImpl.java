package com.tigerit.server;

/**
 * Created by forhad on 1/24/15.
 */
public class GreetingServiceImpl implements GreetingService{

    @Override
    public String getGreeting(String name) {
        return "Hello " + name + "!";
    }

}
