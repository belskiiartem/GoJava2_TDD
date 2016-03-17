package GoJavaTDD.geometricfigure;

import junit.framework.TestCase;
import org.junit.Test;

public class CircleTest extends TestCase {
    Circle circle = new Circle();

    @Test
    public void testGetCircleArea(){
        assertEquals(78.53981633974483,circle.getArea(5));
        assertEquals(201.06192982974676,circle.getArea(8));
        assertEquals(0.0,circle.getArea(0));
    }
}