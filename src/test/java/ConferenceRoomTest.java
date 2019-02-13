import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom("Honeycombe Suite", 20);
    }

    @Test
    public void hasName(){
        assertEquals("Honeycombe Suite", conferenceRoom.getName());
    }


}
