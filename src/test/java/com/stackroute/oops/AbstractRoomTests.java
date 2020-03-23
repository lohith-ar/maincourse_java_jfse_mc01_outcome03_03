package com.stackroute.oops;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AbstractRoomTests {
    private static final String MSG_01 = "class AbstractRoom should implement Room interface";
    private static final String MSG_02 = "class AbstractRoom should have colour property";

    private AbstractRoom squareRoom;
    private AbstractRoom rectangleRoom;

    @BeforeEach
    public void setUp() {
        squareRoom = new Square("brown", 10);
        rectangleRoom = new Rectangle("green", 15, 5);
    }

    @AfterEach
    public void tearDown() {
        squareRoom = null;
        rectangleRoom = null;
    }

    @Test
    public void givenAbstractRoomClassThenShouldBeOfRoomType() {
        assertTrue(Room.class.isAssignableFrom(AbstractRoom.class), MSG_01);
    }

    @Test
    public void givenAbstractRoomObjectWhenSquareThenShouldSetColor() {
        assertEquals("brown", squareRoom.getColour(), MSG_02);
    }
    @Test
    public void givenAbstractRoomObjectWhenRectangleThenShouldSetColor() {
        assertEquals("green", rectangleRoom.getColour(), MSG_02);
    }

}