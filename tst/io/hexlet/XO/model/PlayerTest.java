package io.hexlet.XO.model;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @org.junit.jupiter.api.Test
    public void testGetName() throws Exception {
        final String inputValue = "Arcady";
        final String expectedValue = inputValue;

        final Player player = new Player(inputValue, null);
        final String actualValue = player.getName();

        assertEquals(expectedValue, actualValue);
    }

    @org.junit.jupiter.api.Test
    public void testGetFigure() throws Exception {
        final Figure inputValue = Figure.X;
        final Figure expectedValue = inputValue;

        final Player player = new Player(null, inputValue);
        final Figure actualValue = player.getFigure();

        assertEquals(expectedValue, actualValue);
    }
}