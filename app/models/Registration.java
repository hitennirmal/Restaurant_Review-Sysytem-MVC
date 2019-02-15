package models;

import javax.persistence.*;

import java.util.List;

import javax.inject.Named;
import com.avaje.ebean.Model;
import com.avaje.ebean.Model.Finder;

@Entity
public class Registration extends Model {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer registrationId;
	@Column(nullable = false)
	public int registrationNumber;
	@Column(nullable = false)
	public String registrationName;
	@Column(nullable = false)
	public String registrationType;
	
	@OneToMany(mappedBy = "registration", cascade = CascadeType.ALL)
	public List<Restaurant> resturants;
	
	@ManyToOne(cascade = CascadeType.REMOVE, optional = false)
	public Owner owner;
	
	public static Finder<Integer, Registration> find = new Finder<Integer, Registration>(Registration.class);

}
