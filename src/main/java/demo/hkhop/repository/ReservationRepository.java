package demo.hkhop.repository;

import demo.hkhop.domain.Reservation;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
public class ReservationRepository {

    @PersistenceContext
    EntityManager em;

    @Transactional
    public Long save(Reservation reserve) {
        em.persist(reserve);
        return reserve.getId();
    }
    public Reservation findById(Long id) {
        return em.find(Reservation.class, id);
    }
}
