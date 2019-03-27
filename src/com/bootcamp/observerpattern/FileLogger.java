package com.bootcamp.observerpattern;

class FileLogger extends Logger{
    @Override
    String log(String message) {
        System.out.println("Printing in File : " + message);
        return "file";
    }
}
