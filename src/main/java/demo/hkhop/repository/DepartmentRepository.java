package demo.hkhop.repository;


import demo.hkhop.domain.Department;
import demo.hkhop.domain.Doctor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class DepartmentRepository {
    @PersistenceContext
    EntityManager em;
    public DepartmentRepository(EntityManager em) {
        this.em = em;
    }

    @Transactional
    public Long save(Department department){
        em.persist(department);
        return department.getId();
    }

    public List<Doctor> findBydepartname(String name){
        return em.createQuery("select d from Doctor d where d.department = :department",Doctor.class)
                .setParameter("department",name)
                .getResultList();
    }

    public Department findById(Long id) {
        return em.find(Department.class, id);
    }

}
