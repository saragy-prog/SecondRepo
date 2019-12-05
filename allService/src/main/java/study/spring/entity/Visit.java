package study.spring.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;


//@Entity
@Table(name = "visits")

public class Visit implements Serializable {
	 private static final long serialVersionUID = 1L;
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "visit_id", nullable = false)
	    private Integer visit_id;

	    @Column(name = "PlaceName")
	    private String placeName;
	    @Column(name = "Checked")
	    private boolean checked;
	    @Column(name = "date")
	    private String date;
	    @Column(name = "barista_id")
	    private Integer barista_id;
	    @Column(name = "user_id")
	    private Integer user_id;
	    	    
	    @OneToMany(fetch = FetchType.EAGER, cascade = {
				  CascadeType.PERSIST,
				  CascadeType.MERGE
				  }) 
	   @JoinTable(name = "user", 
		  joinColumns = { @JoinColumn(name = "visit_id") }, 
		  inverseJoinColumns = { @JoinColumn(name = "barista_id") })
		    @OnDelete(action = OnDeleteAction.CASCADE)
		    private Set<User> user = new HashSet<>();


	  @OneToMany(fetch = FetchType.EAGER, cascade = {
			  CascadeType.PERSIST,
			  CascadeType.MERGE
			  })  
	  @JoinTable(name = "barista", 
	  joinColumns = { @JoinColumn(name = "visit_id") }, 
	  inverseJoinColumns = { @JoinColumn(name = "barista_id") })
	    @OnDelete(action = OnDeleteAction.CASCADE)
	    private Set<Barista> barista = new HashSet<>(); 
	   
	public Visit() {
		super();
	}


	public Visit(Integer visit_id) {
		super();
		this.visit_id = visit_id;
	}


	public Visit(String placeName, boolean checked, Set<Barista> barista) {
		super();
		this.placeName = placeName;
		this.checked = checked;
		this.barista = barista;
	}


	public Integer getVisit_id() {
		return visit_id;
	}
	

	public void setVisit_id(Integer visit_id) {
		this.visit_id = visit_id;
	}

	public Integer getBarista_id() {
		return barista_id;
	}

	public void setBarista_id(Integer barista_id) {
		this.barista_id = barista_id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public Set<Barista> getBarista() {
		return barista;
	}

	public void setBarista(Set<Barista> barista) {
		this.barista = barista;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((placeName == null) ? 0 : placeName.hashCode());
		result = prime * result + ((user_id == null) ? 0 : user_id.hashCode());
		result = prime * result + ((visit_id == null) ? 0 : visit_id.hashCode());
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
		Visit other = (Visit) obj;
		if (placeName == null) {
			if (other.placeName != null)
				return false;
		} else if (!placeName.equals(other.placeName))
			return false;
		if (user_id == null) {
			if (other.user_id != null)
				return false;
		} else if (!user_id.equals(other.user_id))
			return false;
		if (visit_id == null) {
			if (other.visit_id != null)
				return false;
		} else if (!visit_id.equals(other.visit_id))
			return false;
		return true;
	}


	public void setVisitDate(String date) {
		this.date = date;
		
	}


	public void setUser(Set<User> user) {
		this.user = user;
	}



	    
	    
}
