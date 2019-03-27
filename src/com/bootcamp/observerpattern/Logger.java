package com.bootcamp.observerpattern;

class Logger {
    String log(String message) {
        System.out.println("Printing in Console : " + message);
        System.out.println("Printing in file : " + message);
        return "both";
    }
}