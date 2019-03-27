package com.bootcamp.compositedesignpattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BodyTest {
    @Test
    void shouldRefreshTheBodyAndAllChildNodes() {
        Body body = new Body();
        Content content = new Content();

        content.add(new Text());
        body.add(content);

        String actual = body.refresh();
        String expected = "BodyContentText";
        assertEquals(expected, actual);
    }
}