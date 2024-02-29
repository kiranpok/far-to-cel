import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalTest {
    Cal cal = new Cal();
    @Test
public void testAddMe() {

    assertEquals(5, cal.addMe(2, 3));
    }
    @Test
    public void productMe() {

        assertEquals(6, cal.productMe(2, 3));
    }
}