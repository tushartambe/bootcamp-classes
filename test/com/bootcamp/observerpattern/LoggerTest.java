package com.bootcamp.observerpattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LoggerTest {
    @Test
    void shouldLogIntoBothConsoleAndFile() {
        Logger logger = new Logger();
        assertEquals("both", logger.log("Hello"));
    }

    @Test
    void shouldLogIntoConsole() {
        Logger logger = new ConsoleLogger();
        assertEquals("console", logger.log("Hello"));
    }

    @Test
    void shouldLogIntoFile() {
        Logger logger = new FileLogger();
        assertEquals("file", logger.log("Hello"));
    }
}