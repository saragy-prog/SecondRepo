package study.spring.entity;


import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
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
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

//@Entity
@Table(name = "places")
public class Place implements Serializable {
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "place_id", nullable = false)
    private Integer place_id;
    @Column(name = "name", nullable = false, length = 30)
    private String name;
    
    @ManyToMany(fetch=FetchType.EAGER, cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
        })    
        @JoinTable(name = "placeBarista", 
              joinColumns = { @JoinColumn(name = "place_id") }, 
              inverseJoinColumns = { @JoinColumn(name = "barista_id") })
        @OnDelete(action = OnDeleteAction.CASCADE)
        private Set<Place> places = new HashSet<>();
    
	public Place(Integer place_id) {
		super();
		this.place_id = place_id;
	}

	public Place(String name, Set<Place> places) {
		super();
		this.name = name;
		this.places = places;
	}

	public Integer getPlace_id() {
		return place_id;
	}

	public void setPlace_id(Integer place_id) {
		this.place_id = place_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Place> getPlaces() {
		return places;
	}

	public void setPlaces(Set<Place> places) {
		this.places = places;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((place_id == null) ? 0 : place_id.hashCode());
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
		Place other = (Place) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (place_id == null) {
			if (other.place_id != null)
				return false;
		} else if (!place_id.equals(other.place_id))
			return false;
		return true;
	}
            
}
