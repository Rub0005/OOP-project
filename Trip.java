import java.util.List;

public class Trip {

    private int id;


    private List<Passenger> passengers;


    private String airplane;


    private String town_from;

    private String town_to;

    private String time_out;

    private String time_in;
    private Company company;

    public Trip(int id, List<Passenger> passengers, String airplane, String town_from, String town_to, String time_out, String time_in, Company company) {
        this.id = id;
        this.passengers = passengers;
        this.airplane = airplane;
        this.town_from = town_from;
        this.town_to = town_to;
        this.time_out = time_out;
        this.time_in = time_in;
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public String getAirplane() {
        return airplane;
    }

    public void setAirplane(String airplane) {
        this.airplane = airplane;
    }

    public String getTown_from() {
        return town_from;
    }

    public void setTown_from(String town_from) {
        this.town_from = town_from;
    }

    public String getTown_to() {
        return town_to;
    }

    public void setTown_to(String town_to) {
        this.town_to = town_to;
    }

    public String getTime_out() {
        return time_out;
    }

    public void setTime_out(String time_out) {
        this.time_out = time_out;
    }

    public String getTime_in() {
        return time_in;
    }

    public void setTime_in(String time_in) {
        this.time_in = time_in;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    Trip getById(int id){}//retrieves trip by id
    List<Trip> getAll() {}//outputs all trips
    void delete(int tripId){}deletes trip by its id
    List<Trip> getTripsFrom(String place){} returns trips flying from a given place
    List<Trip> getTripsTo(String place){} returns trips flying to a given place

}
