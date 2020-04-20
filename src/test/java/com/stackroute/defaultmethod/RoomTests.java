package com.stackroute.defaultmethod;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RoomTests {

    private static final String MSG_01 = "area/perimeter returned not calculated correctly for given room object";

    private Room squareRoom;
    private Room rectangleRoom;

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
    public void givenRoomWhenSquareThenShouldCalculateAreaPerimeterOfSquare() {
        assertEquals(100, squareRoom.getArea(), 0.01, MSG_01);
        assertEquals(40, squareRoom.getPerimeter(), 0.01, MSG_01);
    }

    @Test
    public void givenRoomWhenRectangleThenShouldCalculateAreaPerimeterOfRectangle() {
        assertEquals(75, rectangleRoom.getArea(), 0.01, MSG_01);
        assertEquals(40, rectangleRoom.getPerimeter(), 0.01, MSG_01);
    }
}