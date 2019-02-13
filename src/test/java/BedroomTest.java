import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;


    @Before
    public void before(){
        bedroom = new Bedroom(3, 4, "double");
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(3, bedroom.getRoomNumber());
    }

    @Test
    public void hasCapacity(){
        assertEquals(4, bedroom.getCapacity());
    }

    @Test
    public void hasType(){
        assertEquals("double", bedroom.getRoomType());
    }

}
