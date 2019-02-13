import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    Guest guest4;
    Guest guest5;



    @Before
    public void before(){
        bedroom = new Bedroom(3, 4, "double");
        guest1 = new Guest("Will Smith");
        guest2 = new Guest("Holly Willoby");
        guest3 = new Guest("Dom Jolly");
        guest4 = new Guest("Amir Khan");
        guest5 = new Guest("Connor McGregor");
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

    @Test
    public void canAddGuestToBedroom(){
        bedroom.addGuest(guest1);
        bedroom.addGuest(guest2);
        bedroom.addGuest(guest3);
        bedroom.addGuest(guest4);
        bedroom.addGuest(guest5);
        assertEquals(4, bedroom.bedroomCount());
    }

}
