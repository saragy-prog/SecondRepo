package study.spring.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.OnDeleteAction;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "users")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    private Integer user_id;
    @Column(name = "Login", nullable = false, length = 30)
    private String login;
    @Column(name = "Password", nullable = false, length = 30)
    private String password;
    @Column(name = "FirstName", nullable = false, length = 30)
    private String firstName;
    @Column(name = "LastName", nullable = false, length = 30)
    private String lastName;
   @Temporal(TemporalType.DATE)
   @DateTimeFormat(pattern="yyyy-MM-dd")
    @Column(name = "DateOfRegistration", nullable = false, length = 30)
   private java.util.Date dateOfRegistration;
    @Column(name = "Email", nullable = false, length = 30)
    private String email;
    @Column(name = "NumberOfVisits", nullable = false, length = 30)
    private int numberOfVisits;
    @Column(name = "Role", nullable = false, length = 30)
    private String role;
//    private Set<Visit> visits = new HashSet<>();
//    @OneToMany(mappedBy="user",fetch=FetchType.LAZY)  
//    public Set<Visit> getVisits(){
//    	return visits;
//    }
//    public void setVisits(Set<Visit> visits) {
//    	this.visits = visits;
//    }
    
    
    
//    @JoinTable(name = "visits", 
//    joinColumns = { @JoinColumn(name = "user_id") }, 
//    inverseJoinColumns = { @JoinColumn(name = "visit_id") })
//    @org.hibernate.annotations.OnDelete(action = OnDeleteAction.CASCADE)
//    private Set<Visit> visits = new HashSet<>();
//    
//    /**
//	 * @return the visits
//	 */
//	public Set<Visit> getVisits() {
//		return visits;
//	}

	/**
	 * @param visits the visits to set
	 */
//	public void setVisits(Set<Visit> visits) {
//		this.visits = visits;
//	}

	public User() {
    }

    public User(Integer user_id) {
        this.user_id = user_id;
    }

    public User(String login, String password, String firstName, String lastName, Date dateOfRegistration,
			String email, int numberOfVisits, String role) {
		super();
		this.login = login;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfRegistration = dateOfRegistration;
		this.email = email;
		this.numberOfVisits = numberOfVisits;
		this.role = role;
	}

	public Integer getUserId() {
        return user_id;
    }

    public void setuserId(Integer userId) {
        this.user_id = userId;
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
    
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
       
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
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
		User other = (User) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}

    @Override
    public String toString() {
        return "study.spring.entity.User[ userId=" + user_id + " ]";
    }

	public void addVisit(Integer visit_id) {
		// TODO Auto-generated method stub
		
	}
}