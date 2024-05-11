import java.util.Date;
import java.util.List;

public class Passenger {

    private int id;

    private String name;
    private String surname;
    private String phone;
    private String nation;
    private Gender gender;
    private Address address;

    public Passenger(int id, String name, String surname, String phone, String nation, Gender gender, Address address) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.nation = nation;
        this.gender = gender;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setBirthDate(Date passengerBirthDate) {
    }

    public Date getBirthDate() {
        return null;
    }
}

