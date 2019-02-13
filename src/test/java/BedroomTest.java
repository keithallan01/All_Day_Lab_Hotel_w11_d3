import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest1;
    Guest guest2;
    Guest guest3;



    @Before
    public void before(){
        bedroom = new Bedroom(3, 4, "double");
        guest1 = new Guest("Will Smith");
        guest2 = new Guest("Holly Willoby");
        guest3 = new Guest("Dom Jolly");

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

    @Test
    public void roomStartsEmpty(){
        assertEquals(0, bedroom.bedroomCount());
    }

}
