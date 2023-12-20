package demo.hkhop.repository;


import demo.hkhop.domain.Hospital;
import demo.hkhop.domain.Patient;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
public class HospitalRepository {

    @PersistenceContext
    EntityManager em;

    @Transactional
    public Long save(Hospital hospital) {
        em.persist(hospital);
        return hospital.getId();
    }
    public Patient findById(Long id) {
        return em.find(Patient.class, id);
    }
}
