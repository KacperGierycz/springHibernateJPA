package mine.learning.springbootjpaexample;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootjpaexampleApplication {
	
	@PersistenceUnit
	private EntityManagerFactory emf;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootjpaexampleApplication.class, args);
	
	
	}
	
	
	@PostConstruct
	public void start() {
		Employee e = new Employee();
		e.setAge(20);
		e.setDob(new Date());
		e.setName("Fello");
		e.setSsn("12344");
		
		EntityManager entityManager = emf.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(e);
		transaction.commit();
		entityManager.clear();
		
		
	}

}
