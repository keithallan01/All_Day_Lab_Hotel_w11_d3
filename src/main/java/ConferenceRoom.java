import java.util.ArrayList;

public class ConferenceRoom {

    private String name;
    private int capacity;
    private ArrayList<Guest> guests;

    public ConferenceRoom(String name, Integer capacity){
        this.name = name;
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int conferenceRoomCount(){
        return this.guests.size();
    }

    public void checkInGuest(Guest guest) {
        if (conferenceRoomCount() < this.capacity) {
            this.guests.add(guest);
        }

    }

    public void checkOutGuest(){
        this.guests.remove(0);
    }





}
