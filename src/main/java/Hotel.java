import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hotel {

    private ArrayList<Guest> guests;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private String name;

    public Hotel(String name){
        this.name = name;
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
        this.guests = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public int bedroomCount(){
        return bedrooms.size();
    }

    public void addBedroom(Bedroom bedroom){
        this.bedrooms.add(bedroom);
    }

    public int conferenceRoomCount(){
        return this.conferenceRooms.size();
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom){
        this.conferenceRooms.add(conferenceRoom);
    }


    public void checkInGuestIntoBedroom(Guest guest, int roomNumber){

        for (Bedroom bedroom : this.bedrooms) {
            if (roomNumber == bedroom.getRoomNumber()){
                bedroom.checkInGuest(guest);
            }
        }
    }


}
