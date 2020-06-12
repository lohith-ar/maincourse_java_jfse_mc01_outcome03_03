## Problem Statement: Interface with default methods

This exercise should be completed using Test Driven Development Technique.

  - Write Test classes in TDD approach 
  - Functionality of methods should be completed, such that all the test cases pass 
  - Some requirements/hints are mentioned below

        Room is an Interface having default methods, AbstractRoom is an abstract class of type Room, Square and Rectangle class inherit AbstractRoom
        
        Square class toString() format for sample data
            Square [colour=brown, side=10]
        	
        Rectangle class toString() format for sample data
            Rectangle [colour=brown, length=10, breadth=20]
            
            
  Class AbstractRoom must be implemented using TDD for the following methods
        
        + getColour(): String
        + setColour(String colour): void
  
  Class Rectangle must be implemented using TDD for the following methods
  
        + getBreadth(): int
        + setBreadth(int breadth): void
        + getLength(): int
        + setLength(int length): void
        @Override
             + getArea(): double
                return area of rectangle
             + getPerimeter(): double
                return perimeter of rectangle
  
  Interface Room must be implemented using TDD for the following methods
  
        + getArea(): double   
        + getPerimeter(): double

  Class RoomService must be implemented using TDD for the following methods
       
       + compareRoomArea(Room one, Room two): int
   
  Class Square must be implemented using TDD for the following methods
       
       + getSide(): int
       + setSide(int side): void
        @Override
            + getArea(): double
                return area of square
            + getPerimeter(): double
                return perimeter of square
                
            
## Instructions
- Take care of whitespace/trailing whitespace
- Do not change the provided class/method names unless instructed
- Ensure your code compiles without any errors/warning/deprecations 
- Follow best practices while coding