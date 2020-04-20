package com.stackroute.defaultmethod;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RoomTests {

    private static final String MSG_01 = "square object should be of type AbstractRoom and Room";
    private static final String MSG_02 = "square properties not set properly by constructor";
    private static final String MSG_03 = "square area/perimeter returned are not correct";
    private static final String MSG_04 = "square details returned by toString are not as per requirement";

    private Square square;

    @BeforeEach
    public void setUp() {
        square = new Square("brown", 10);
    }

    @AfterEach
    public void tearDown() {
        square = null;
    }

    @Test
    public void givenSquareClassThenShouldBeOfRoomType() {
        assertTrue(Room.class.isAssignableFrom(Square.class), MSG_01);
    }

    @Test
    public void givenSquareClassThenShouldBeOfAbstractRoomType() {
        assertTrue(AbstractRoom.class.isAssignableFrom(Square.class), MSG_01);
    }

    @Test
    public void givenSquareObjectThenPropertiesAreSet() {
        assertEquals(square.getColour(), "brown", MSG_02);
        assertEquals(square.getSide(), 10, MSG_02);
    }

    @Test
    public void givenSquareObjectThenGetSquareDetails() {
        String expected = "Square [colour=brown, side=10]";
        assertEquals(square.toString().toLowerCase(), expected.toLowerCase(), MSG_04);
    }

    @Test
    public void givenSquareObjectThenGetArea() {
        assertEquals(100, square.getArea(), 0.01, MSG_03);
    }

    @Test
    public void givenSquareObjectThenGetPerimeter() {
        assertEquals(40, square.getPerimeter(), 0.01, MSG_03);
    }
}