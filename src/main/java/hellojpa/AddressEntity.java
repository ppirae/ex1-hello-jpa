package hellojpa;

import javax.persistence.Embeddable;
import javax.persistence.Table;

@Embeddable
@Table(name = "ADDRESS")
public class AddressEntity {

    private String city;
    private String street;
    private String zipcode;

    public AddressEntity() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
