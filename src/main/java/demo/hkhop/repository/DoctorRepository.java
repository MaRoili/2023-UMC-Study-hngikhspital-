package demo.hkhop.repository;


import demo.hkhop.domain.Doctor;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class DoctorRepository {
    @PersistenceContext
    EntityManager em;

    @Transactional
    public Long save(Doctor doctor){
        em.persist(doctor);
        return doctor.getId();
    }
    public Doctor findById(Long id) {
        return em.find(Doctor.class, id);
    }

    public List<Doctor> findByName(String name){
        return em.createQuery("select d from Doctor d where d.doctname=:name")
                .setParameter("name",name)
                .getResultList();
    }
}
