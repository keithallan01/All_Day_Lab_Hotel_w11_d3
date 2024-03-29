import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    Guest guest4;
    Guest guest5;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom("Honeycombe Suite", 4);
        guest1 = new Guest("Will Smith");
        guest2 = new Guest("Holly Willoby");
        guest3 = new Guest("Dom Jolly");
        guest4 = new Guest("Amir Khan");
        guest5 = new Guest("Connor McGregor");
    }

    @Test
    public void hasName() {
        assertEquals("Honeycombe Suite", conferenceRoom.getName());
    }

    @Test
    public void hasCapacity() {
        assertEquals(4, conferenceRoom.getCapacity());
    }

    @Test
    public void ConferenceRoomStartsEmpty() {
        assertEquals(0, conferenceRoom.conferenceRoomCount());
    }

    @Test
    public void canAddGuestToConferenceRoom() {
        conferenceRoom.checkInGuest(guest1);
        conferenceRoom.checkInGuest(guest2);
        conferenceRoom.checkInGuest(guest3);
        conferenceRoom.checkInGuest(guest4);
        conferenceRoom.checkInGuest(guest5);
        assertEquals(4, conferenceRoom.conferenceRoomCount());
    }

    @Test
    public void canRemoveGuest() {
        conferenceRoom.checkInGuest(guest1);
        assertEquals(1, conferenceRoom.conferenceRoomCount());
        conferenceRoom.checkOutGuest();
        assertEquals(0, conferenceRoom.conferenceRoomCount());
    }
}