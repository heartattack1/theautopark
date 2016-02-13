package autopark.domain;

/**
 * Created by smuksinov on 13.02.16.
 */
public class Organization {
    private String name;//название организации
    private String address;//адрес организации
    private String phone;//телефон организации

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}
