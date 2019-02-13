import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Guest guest;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;
    DiningRoom diningRoom;


    @Before
    public void before(){
        hotel = new Hotel("Hotel Hotel");
        bedroom1 = new Bedroom(3, 4, "double");
        bedroom2 = new Bedroom(2, 2, "double");
        bedroom3 = new Bedroom(1, 1, "single");

        guest = new Guest("Will Smith");
        conferenceRoom1 = new ConferenceRoom("Honeycombe Suite", 20);
        conferenceRoom2 = new ConferenceRoom("Berkley Suite", 10);

        diningRoom = new DiningRoom(10);
    }

    @Test
    public void hasName(){
        assertEquals( "Hotel Hotel", hotel.getName());
    }


    @Test
    public void hasNoBedrooms(){
        assertEquals(0, hotel.bedroomCount());
    }

    @Test
    public void canAddBedrooms(){
        hotel.addBedroom(bedroom1);
        hotel.addBedroom(bedroom2);
        hotel.addBedroom(bedroom3);
        assertEquals(3, hotel.bedroomCount());
    }

    @Test
    public void startsWithNoConferenceRooms(){
        assertEquals(0, hotel.conferenceRoomCount());
    }

    @Test
    public void hasConferenceRooms(){
        hotel.addConferenceRoom(conferenceRoom1);
        hotel.addConferenceRoom(conferenceRoom2);
        assertEquals(2, hotel.conferenceRoomCount());
    }

    @Test
    public void canCheckInSingleGuestToBedroom(){
        hotel.addBedroom(bedroom3);
        assertEquals(0, bedroom3.bedroomCount());
        hotel.checkInGuestIntoBedroom(guest, 1);
        assertEquals(1, bedroom3.bedroomCount());
    }
}
