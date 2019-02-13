import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;

    @Before
    public void before(){
        hotel = new Hotel("Hotel Hotel");
    }

    @Test
    public void hasName(){
        assertEquals( "Hotel Hotel", hotel.getName());
    }
}
