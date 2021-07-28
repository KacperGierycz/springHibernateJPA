package mine.learning.springbootjpaexample;

import java.util.Date;
import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import mine.learning.springbootjpaexample.models.EmployeeLimited;
import mine.learning.springbootjpaexample.repository.EmployeeRepository;

@SpringBootApplication
public class SpringbootjpaexampleApplication {
	
//	@PersistenceUnit
//	private EntityManagerFactory emf;

//	@PersistenceContext
//	private EntityManager entityManager;
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootjpaexampleApplication.class, args);
	
	
	}
	
	
	@PostConstruct
	public void start() {
		EmployeeLimited e = new EmployeeLimited();
		e.setAge(20);
		e.setDob(new Date());
		e.setName("Fello");
		e.setSsn("12344");

		Optional<EmployeeLimited> empl1 = employeeRepository.findById(1);
		if (empl1.isPresent()) {
		System.out.println(empl1.get());
		}
		
		
		
		//EntityManager entityManager = emf.createEntityManager();
//		EntityTransaction transaction = entityManager.getTransaction();
//		transaction.begin();
//		entityManager.persist(e);
//		transaction.commit();
//		entityManager.clear();
		
//		EmployeeLimited employee = entityManager.find(EmployeeLimited.class, 1);
//		System.out.println(employee);
		
	}

}
