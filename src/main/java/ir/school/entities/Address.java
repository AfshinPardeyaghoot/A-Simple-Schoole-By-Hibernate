package ir.school.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;

    @Column(name = "number",nullable = false,unique = true,length = 15)
    private String number ;

    @Column(name = "state")
    private String state ;

    @Column(name = "city")
    private String city ;

    @Column(name = "postal_code")
    private String postalCode ;

    @Column(name = "postal_address")
    private String postalAddress ;

    @ManyToMany(mappedBy = "teachers")
    private Set<Student> students ;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }
}
