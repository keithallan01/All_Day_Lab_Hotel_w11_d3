import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;

    @Before
    public void before(){
        diningRoom = new DiningRoom(10);
    }

    @Test
    public void hasCapacity(){
        assertEquals(10, diningRoom.getCapacity());
    }


}
