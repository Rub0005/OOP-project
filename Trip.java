import java.util.ArrayList;
import java.util.List;

public class Trip {

    private int id;


    private ArrayList<Passenger> passengers;


    private String airplane;


    private String town_from;

    private String town_to;

    private String time_out;

    private String time_in;
    private Company company;

    public Trip(int id, ArrayList<Passenger> passengers, String airplane, String town_from, String town_to, String time_out, String time_in, Company company) {
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

    public void setPassengers(ArrayList<Passenger> passengers) {
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

    @Override
    public String toString() {
        return "Trip{" +
                "id=" + id +
                ", passengers=" + passengers +
                ", airplane='" + airplane + '\'' +
                ", town_from='" + town_from + '\'' +
                ", town_to='" + town_to + '\'' +
                ", time_out='" + time_out + '\'' +
                ", time_in='" + time_in + '\'' +
                ", company=" + company +
                '}';
    }

    public void addPassenger(String name, String surname, String phone, String nation, Gender gender, Address address) {
        Passenger passenger = new Passenger(passengers.size(), name, surname, phone, nation, gender, address);
        passengers.add(passenger);
    }

    public void removePassenger(int id) {
        if (id >= 0 && id < passengers.size()) {
            passengers.remove(id);
        } else {
            System.out.println("wrong id");
        }
    }

    public List<Passenger> searchByName(String name, String surname) {
        ArrayList<Passenger> byName = new ArrayList<>();
        for (Passenger p : passengers) {
            if (p.getName().equals(name) && p.getSurname().equals(surname)) {
                byName.add(p);
            }
        }
        return byName;
    }

    public List<Passenger> searchByNation(String nation) {
        ArrayList<Passenger> byNation = new ArrayList<>();
        for (Passenger p : passengers) {
            if (p.getNation().equals(nation)) {
                byNation.add(p);
            }
        }
        return byNation;
    }

    public List<Passenger> searchByName(String name){
        ArrayList<Passenger> byName = new ArrayList<>();
        for (Passenger p : passengers) {
            if (p.getName().equals(name)) {
                byName.add(p);
            }
        }
        return byName;
    }

    public List<Passenger> searchBySurname(String surname){
        ArrayList<Passenger> bySurname = new ArrayList<>();
        for (Passenger p : passengers) {
            if (p.getSurname().equals(surname)) {
                bySurname.add(p);
            }
        }
        return bySurname;
    }

    public void addPassenger(Passenger passenger) {
    }
}
