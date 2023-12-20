package demo.hkhop;

import demo.hkhop.domain.Patient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


@SpringBootApplication
public class HkhopApplication {

	public static void main(String[] args) {
		SpringApplication.run(HkhopApplication.class, args);
	}
	/*
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		Patient patient = new Patient();

		patient.setId(1L);
		patient.setUsername("HelloA");

		em.persist(patient);
		tx.commit();
		em.close();
		emf.close();

	 */
}
