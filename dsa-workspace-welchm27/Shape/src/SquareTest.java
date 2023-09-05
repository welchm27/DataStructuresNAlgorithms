import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {
    Square SQ1;

    @Before
    public void setUp() throws Exception {
        SQ1 = new Square(4);
    }

    @org.junit.Test
    public void sides() {
//        Square SQ1 = new Square(4);
        assertEquals(4, SQ1.sides(), .0001);
    }

    @org.junit.Test
    public void area() {
//        Square SQ1 = new Square(4);
        assertEquals(16, SQ1.area(), .0001);
    }

    @org.junit.Test
    public void perimeter() {
//        Square SQ1 = new Square(4);
        assertEquals(16, SQ1.perimeter(), .0001);
    }
}