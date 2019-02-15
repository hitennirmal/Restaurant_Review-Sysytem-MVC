package models;

import javax.persistence.*;
import javax.inject.Named;
import com.avaje.ebean.Model;
import com.avaje.ebean.Model.Finder;
import java.util.*;

@Entity
public class Restaurant extends Model {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer restaurantId;

	@Column(nullable = false)
	public String city;

	@Column(nullable = false)
	public String pincode;

	@Column(nullable = false)
	public int cost;

	@Column(nullable = false)
	public String name;

	@ManyToOne(cascade = CascadeType.REMOVE, optional = false)
	public Owner ownerRestaurant;

	@ManyToOne(cascade = CascadeType.REMOVE, optional = false)
	public Registration registration;

	@OneToMany(mappedBy = "restaurantIdAssoc", cascade = CascadeType.ALL)
	public List<Rating> restaurantsCustomerList;

	public static Finder<Integer, Restaurant> find = new Finder<Integer, Restaurant>(Restaurant.class);

}
