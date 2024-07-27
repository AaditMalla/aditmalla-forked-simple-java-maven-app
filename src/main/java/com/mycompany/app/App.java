package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{
    //made a change in below code and added a comment
    private final String message = "Hello This is a Jenkins CI/CD assignment";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
