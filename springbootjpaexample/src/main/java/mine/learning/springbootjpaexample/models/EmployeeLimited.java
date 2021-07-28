package mine.learning.springbootjpaexample.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
public class EmployeeLimited {

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="EMPLOYEE_NAME")
	private String name;
	
	private int age;
	
	@Column(unique=true, length=10, nullable=false, updatable=false)
	private String ssn;
	

	@Temporal(TemporalType.DATE)
	private Date dob;
	
	@Transient
	private String debug;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "EmployeeLimited [id=" + id + ", name=" + name + ", age=" + age + ", ssn=" + ssn + ", dob=" + dob + "]";
	}
	
	
	
	
	
}
