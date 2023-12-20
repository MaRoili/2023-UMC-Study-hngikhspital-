package demo.hkhop.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

import static javax.persistence.FetchType.LAZY;

public class Reservation {

    @Id
    @GeneratedValue
    @Column(name="RESERVE_ID")
    private Long id;


    @OneToMany(mappedBy = "")
    @JoinColumn(name = "PATIENT_ID")
    private Long patientid;

    @Column(name = "DOCTOR_ID")
    private String doctorid;
    @Column(name = "DEPARTMENT")
    private String departname;
    @Column(name="HOSPITAL")
    private String hosptname;
    @Column(name="RESERVE_TIME")
    private LocalDateTime time;

    @ManyToOne(fetch = LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="patient_id")
    private Patient patient;

    @ManyToOne(fetch = LAZY,cascade =  CascadeType.ALL)
    @JoinColumn(name = "hospital_id")
    private Hospital hospital;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPatientid() {
        return patientid;
    }

    public void setPatientid(Long patientid) {
        this.patientid = patientid;
    }

    public String getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(String doctorid) {
        this.doctorid = doctorid;
    }

    public String getDepartname() {
        return departname;
    }

    public void setDepartname(String departname) {
        this.departname = departname;
    }

    public String getHosptname() {
        return hosptname;
    }

    public void setHosptname(String hosptname) {
        this.hosptname = hosptname;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
}
