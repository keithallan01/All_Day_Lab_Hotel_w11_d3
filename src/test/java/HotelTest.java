import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Guest guest;
    Bedroom bedroom;
    ConferenceRoom conferenceRoom;
    DiningRoom diningRoom;


    @Before
    public void before(){
        hotel = new Hotel("Hotel Hotel");
        bedroom = new Bedroom(3, 4, "double");
        guest = new Guest("Will Smith");
        conferenceRoom = new ConferenceRoom("Honeycombe Suite", 20);
        diningRoom = new DiningRoom(10);
    }

    @Test
    public void hasName(){
        assertEquals( "Hotel Hotel", hotel.getName());
    }
}
