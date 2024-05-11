import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Company {

    private String name;

    private ArrayList<Trip> trips;

    public ArrayList<Trip> getTrips() {
        return trips;
    }

    public void setTrips(ArrayList<Trip> trips) {
        this.trips = trips;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company(String name, ArrayList<Trip> trips) {

        this.name = name;
        this.trips = trips;
    }

    void addTrip(String airplane, String town_from, String town_to, String time_out, String time_in, Company company){
        int length = trips.size();
        ArrayList<Passenger> myPassengers= new ArrayList<>();
        Trip newTrip = new Trip(length, myPassengers, airplane, town_from, town_to, time_out, time_in, company);
        trips.add(newTrip);
    }
    Trip getById(int id) {
        return trips.get(id);
    }

    void getAll() {
        for (Trip myTrip : trips) {
            System.out.println(myTrip.toString());
        }
    }

    /**
     * receives ID and checks if ID exist or not
     * @param id
     */
    void delete(int id) {
        if (id >= 0 && id < trips.size()) {
            trips.remove(id);
        } else {
            System.out.println("wrong id");
        }
    }

    List<Trip> getTripsFrom(String place) {
        ArrayList<Trip> tripList = new ArrayList<>();
        for (Trip myTrip : trips) {
            if (myTrip.getTown_from().equalsIgnoreCase(place)) {
                tripList.add(myTrip);
            }
        }
        return tripList;
    }

    List<Trip> getTripsTo(String destination) {
        ArrayList<Trip> tripList = new ArrayList<>();
        for (Trip myTrip : trips) {
            if (myTrip.getTown_to().equalsIgnoreCase(destination)) {
                tripList.add(myTrip);
            }
        }
        return tripList;
    }

    List<Trip> getTripsFrom2Locations(String place, String destination){
        ArrayList<Trip> tripList = new ArrayList<>();
        for (Trip myTrip : trips) {
            if (myTrip.getTown_to().equalsIgnoreCase(destination) &&
                    myTrip.getTown_from().equalsIgnoreCase(place)) {
                tripList.add(myTrip);
            }
        }
        return tripList;
    }

    public void delayTrip(int tripId, int delayDays) {
    }

    public Trip addTrip(String airplane, String from, String to, Date departureDate, Date arrivalDate) {
        return null;
    }

    public void deleteTrip(int tripId) {
    }
}
