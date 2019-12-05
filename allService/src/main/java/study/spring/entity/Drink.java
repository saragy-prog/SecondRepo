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
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

//@Entity
@Table(name = "drink")
public class Drink implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "drink_id")
	private Integer drink_id;
	@Column(name = "Name")
	private String name;
	@ManyToMany(fetch = FetchType.EAGER, mappedBy = "barista", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Set<Barista> barista = new HashSet<>();
	//	private Set<User> users = new HashSet<>();

	/*@OneToMany(cascade = CascadeType.ALL, mappedBy = "id", fetch = FetchType.EAGER)
	private Set<Barista> baristaList;*/

//	public Drink(String name, Set<User> users) {
//		super();
//		this.name = name;
//		this.users = users;
//	}

	public Drink(String name, Set<Barista> barista) {
		super();
		this.name = name;
		this.barista = barista;
	}
	
	public Integer getDrink_id() {
		return drink_id;
	}

	
	public void setDrink_id(Integer drink_id) {
		this.drink_id = drink_id;
	}

	
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

//	public Set<User> getUsers() {
//		return users;
//	}

	
//	public void setUsers(Set<User> users) {
//		this.users = users;
//	}
//
//	/**
//	 * @return the baristaList
//	 */
//	public Set<Barista> getBaristaList() {
//		return baristaList;
//	}

	/**
	 * @param baristaList the baristaList to set
	 */
//	public void setBaristaList(Set<Barista> baristaList) {
//		this.baristaList = baristaList;
//	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((barista == null) ? 0 : barista.hashCode());
		result = prime * result + ((drink_id == null) ? 0 : drink_id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		//result = prime * result + ((users == null) ? 0 : users.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Drink other = (Drink) obj;
		if (barista == null) {
			if (other.barista != null)
				return false;
		} else if (!barista.equals(other.barista))
			return false;
		if (drink_id == null) {
			if (other.drink_id != null)
				return false;
		} else if (!drink_id.equals(other.drink_id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
//		if (users == null) {
//			if (other.users != null)
//				return false;
//		} else if (!users.equals(other.users))
//			return false;
		return true;
	}
	
}
