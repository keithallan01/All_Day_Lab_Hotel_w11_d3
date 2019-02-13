import java.util.ArrayList;

public class Bedroom {

    private ArrayList<Guest> guests;
    private int roomNumber;
    private int capacity;
    private String roomType;

    public Bedroom(Integer roomNumber, Integer capacity, String roomType){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.roomType = roomType;
        this.guests = new ArrayList<>();
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public String getRoomType(){
        return this.roomType;
    }

    public int bedroomCount(){
        return guests.size();
    }

    public void addGuest(Guest guest){
        if (bedroomCount() < this.capacity) {
            this.guests.add(guest);
        }
    }








}
