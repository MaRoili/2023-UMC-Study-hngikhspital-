package demo.hkhop.domain;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Hospital {

    @Id
    @GeneratedValue
    @Column(name="HOSPITAL_ID")
    private Long id;
    @Column(name="HOS_NAME")
    private String hosptname;
    @Embedded
    private Address address;

    @OneToMany(mappedBy = "hospital")
    private List<Department>departmentList = new ArrayList<>();

    @OneToMany(mappedBy = "hospital")
    private List<Reservation> reservationList = new ArrayList<>();

    public Hospital(String hosptname, Address address) {
        this.hosptname = hosptname;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHosptname() {
        return hosptname;
    }

    public void setHosptname(String hosptname) {
        this.hosptname = hosptname;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
