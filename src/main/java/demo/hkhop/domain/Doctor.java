package demo.hkhop.domain;

import org.hibernate.spi.TreatedNavigablePath;

import javax.persistence.*;

import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.FetchType.LAZY;


@Entity
public class Doctor {

    @Id
    @GeneratedValue
    @Column(name = "DOCTOR_ID")
    private Long id;
    @Column(name = "DOCTORNAME")
    private String doctname;

    private String phonenum;

    private int career;

    @ManyToOne(fetch = LAZY, cascade =  CascadeType.ALL)
    @JoinColumn(name = "DEPARTMENT_ID")
    private Department department;

    @OneToMany(mappedBy = "doctor")
    private List<Treatment> treatementList = new ArrayList<>();

    public Doctor(String doctname, String phonenum, int career, Department department) {
        this.doctname = doctname;
        this.phonenum = phonenum;
        this.career = career;
        this.department = department;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDoctname() {
        return doctname;
    }

    public void setDoctname(String doctname) {
        this.doctname = doctname;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public int getCareer() {
        return career;
    }

    public void setCareer(int career) {
        this.career = career;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Treatment> getTreatementList() {
        return treatementList;
    }

    public void setTreatementList(List<Treatment> treatementList) {
        this.treatementList = treatementList;
    }
}
