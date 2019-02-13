import java.util.ArrayList;

public class DiningRoom {

    private int capacity;
    private ArrayList<Guest> guests;

    public DiningRoom(Integer capacity){
        this.capacity = 10;
        this.guests = new ArrayList<>();
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int diningRoomCount(){
        return this.guests.size();
    }

    public void checkInGuest(Guest guest){
        if (diningRoomCount() < this.capacity) {
            this.guests.add(guest);
        }
    }

    public void checkOutGuest(){
        this.guests.remove(0);
    }


}
