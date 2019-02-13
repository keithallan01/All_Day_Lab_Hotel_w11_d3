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
    public void canCheckInGuestToBedroom(){
        bedroom.checkInGuest(guest1);
        bedroom.checkInGuest(guest2);
        bedroom.checkInGuest(guest3);
        bedroom.checkInGuest(guest4);
        bedroom.checkInGuest(guest5);
        assertEquals(4, bedroom.bedroomCount());
    }

    @Test
    public void canCheckOutOfBedroom(){
        bedroom.checkInGuest(guest1);
        assertEquals(1, bedroom. bedroomCount());
        bedroom.checkOutGuest();
        assertEquals(0, bedroom.bedroomCount());

    }

}
