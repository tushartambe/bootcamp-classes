package com.bootcamp.observerpattern;

class ConsoleLogger extends Logger {
    @Override
    String log(String message) {
        System.out.println("Printing in Console : " + message);
        return "console";
    }
}
