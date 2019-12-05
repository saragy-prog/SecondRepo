package study.spring.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

//@Entity
@Table(name = "barista")
public class Barista implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "barista_id")
	private Integer barista_id;
	@Column(name = "Login")
	private String login;
	@Column(name = "Password")
	private String password;
	@Column(name = "FirstName")
	private String firstName;
	@Column(name = "LastName")
	private String lastName;
	@Column(name = "WorkDays")
	private String workDays;
	@Column(name = "MakesWell")
	private String makesWell;
	@Column(name = "Brand")
	@ManyToMany(fetch=FetchType.EAGER,  cascade = {
	        CascadeType.PERSIST,
	        CascadeType.MERGE
	    })    
	@JoinTable(name = "drinkBarista", joinColumns = { @JoinColumn(name = "barista_id") }, 
	inverseJoinColumns = {@JoinColumn(name = "drink_id") })
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Set<Drink> drinks = new HashSet<>();
	@JoinColumn(name = "barista_id", referencedColumnName = "drink_id")
	
	private Drink brand;
	@ManyToOne(fetch=FetchType.EAGER, cascade = {
	        CascadeType.PERSIST,
	        CascadeType.MERGE
	    })    
	@JoinTable(name = "placeBarista", joinColumns = { @JoinColumn(name = "BaristaId") }, 
	inverseJoinColumns = {@JoinColumn(name = "PlaceId") })
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Set<Place> places = new HashSet<>();
		
	public Barista() {
	}

	public Barista(Integer barista_id) {
		this.barista_id = barista_id;
	}

	public Barista(String Login, String Password, String FirstName, String LastName) {
		this.login = Login;
        this.password = Password;
        this.firstName = FirstName;
        this.lastName = LastName;
    }

	public String getFirstName() {
		return firstName;
	}
	
	public Integer getId() {
		return barista_id;
	}

	
	public void setId(Integer barista_id) {
		this.barista_id = barista_id;
	}

	
	public String getLogin() {
		return login;
	}

	
	public void setLogin(String login) {
		this.login = login;
	}

	
	public String getPassword() {
		return password;
	}

	
	public void setPassword(String password) {
		this.password = password;
	}

	
	public String getWorkDays() {
		return workDays;
	}

	
	public void setWorkDays(String workDays) {
		this.workDays = workDays;
	}

	public String getMakesWell() {
		return makesWell;
	}

	
	public void setMakesWell(String makesWell) {
		this.makesWell = makesWell;
	}

	
	public Set<Drink> getDrinks() {
		return drinks;
	}

	
	public void setDrinks(Set<Drink> drinks) {
		this.drinks = drinks;
	}

	
	public Drink getBrand() {
		return brand;
	}

	
	public void setBrand(Drink brand) {
		this.brand = brand;
	}

	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((barista_id == null) ? 0 : barista_id.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Barista other = (Barista) obj;
		if (barista_id == null) {
			if (other.barista_id != null)
				return false;
		} else if (!barista_id.equals(other.barista_id))
			return false;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (drinks == null) {
			if (other.drinks != null)
				return false;
		} else if (!drinks.equals(other.drinks))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (makesWell == null) {
			if (other.makesWell != null)
				return false;
		} else if (!makesWell.equals(other.makesWell))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (workDays == null) {
			if (other.workDays != null)
				return false;
		} else if (!workDays.equals(other.workDays))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "study.spring.entity.Barista[ BaristaId=" + barista_id + " ]";
	}
}