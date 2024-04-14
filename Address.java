public class Address {
    private int postalCode;
    private String country;
    private String city;

    public Address(int postalCode, String country, String city) {
        this.postalCode = postalCode;
        this.country = country;
        this.city = city;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
