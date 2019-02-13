import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    Guest guest4;
    Guest guest5;

    @Before
    public void before(){
        diningRoom = new DiningRoom(10);
        guest1 = new Guest("Will Smith");
        guest2 = new Guest("Holly Willoby");
        guest3 = new Guest("Dom Jolly");
        guest4 = new Guest("Amir Khan");
        guest5 = new Guest("Connor McGregor");
    }

    @Test
    public void hasCapacity(){
        assertEquals(10, diningRoom.getCapacity());
    }

    @Test
    public void startsOffEmpty(){
        assertEquals(0, diningRoom.diningRoomCount());
    }

    @Test
    public void canAddGuestToDiningRoom(){
        diningRoom.addGuest(guest1);
        diningRoom.addGuest(guest1);
        diningRoom.addGuest(guest1);
        diningRoom.addGuest(guest1);
        diningRoom.addGuest(guest1);
        diningRoom.addGuest(guest1);
        diningRoom.addGuest(guest1);
        diningRoom.addGuest(guest1);
        diningRoom.addGuest(guest1);
        diningRoom.addGuest(guest1);
        diningRoom.addGuest(guest1);
        diningRoom.addGuest(guest1);
        diningRoom.addGuest(guest1);
        assertEquals(10, diningRoom.diningRoomCount());
    }
    


}
