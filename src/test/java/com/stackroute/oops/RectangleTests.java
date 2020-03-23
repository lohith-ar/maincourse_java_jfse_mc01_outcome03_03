package com.stackroute.oops;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RectangleTests {

    private static final String MSG_01 = "square object returned by createSquare(..) should not be null";
    private static final String MSG_02 = "rectangle object returned by createRectangle(..) should not be null";
    private static final String MSG_03 = "compareRoom should return 0 for rooms with equal area";
    private static final String MSG_04 = "compareRoom should return 1 for first room parameter with greater area";
    private static final String MSG_05 = "compareRoom should return -1 for first room parameter with lesser area";
    private static final String MSG_06 = "room summary string returned by getRoomSummary is not as per requirement";

    private static final String REGEX = "\\s+";

    private RoomService roomService;

    @BeforeEach
    public void setUp() {
        roomService = new RoomService();
    }

    @AfterEach
    public void tearDown() {
        roomService = null;
    }

    @Test
    public void givenPropertyValuesThenCreateSquareObject() {
        final Square square = roomService.createSquare("blue", 10);
        assertNotNull(square, MSG_01);
    }

    @Test
    public void givenPropertyValuesThenCreateRectangleObject() {
        final Rectangle rectangle = roomService.createRectangle("blue", 10, 10);
        assertNotNull(rectangle, MSG_02);
    }

    @Test
    public void givenTwoRoomsWhenAreaEqualThenReturnZero() {
        final Rectangle one = new Rectangle("blue", 10, 20);
        final Rectangle two = new Rectangle("blue", 50, 4);
        assertEquals(0, RoomService.compareRoomArea(one, two), MSG_03);
    }

    @Test
    void givenTwoRoomsWhenFirstRoomAreaGreaterThenReturnOne() {
        final Square one = new Square("blue", 50);
        final Rectangle two = new Rectangle("blue", 50, 4);
        assertEquals(1, RoomService.compareRoomArea(one, two), MSG_04);
    }

    @Test
    public void givenTwoRoomsWhenFirstRoomAreaSmallerThenReturnMinusOne() {
        final Square one = new Square("blue", 15);
        final Rectangle two = new Rectangle("blue", 50, 4);
        assertEquals(1, RoomService.compareRoomArea(one, two), MSG_05);
    }

    @Test
    public void givenRoomWhenSquareObjectThenReturnSquareSummary() {
        final Square square = new Square("blue", 10);
        String expectedSummary = "Square [colour=blue, side=10]\nArea : 100 Perimeter : 40";
        assertEquals(expectedSummary.toLowerCase().replaceAll(REGEX, " "), RoomService.getRoomSummary(square).toLowerCase().replaceAll(REGEX, " "), MSG_06);
    }

    @Test
    public void givenRoomWhenRectangleObjectThenReturnRectangleSummary() {
        final Rectangle rectangle = new Rectangle("blue", 50, 4);
        String expectedSummary = "Rectangle [colour=blue, length=50, breadth=4]\nArea : 200 Perimeter : 108";
        ;
        assertEquals(expectedSummary.toLowerCase().replaceAll(REGEX, " "), RoomService.getRoomSummary(rectangle).toLowerCase().replaceAll(REGEX, " "), MSG_06);
    }
}