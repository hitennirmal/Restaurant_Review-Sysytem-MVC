package models;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Id;

import com.avaje.ebean.Model;
import com.avaje.ebean.Model.Finder;
import java.util.*;

@Entity
public class Customer extends Model {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer customerId;
	@Column(nullable = false)
	public String firstName;
	@Column(nullable = false)
	public String lastName;
	@Column(nullable = false)
	public char gender;
	@Column(nullable = false)
	public String password;
	@Column(nullable = false)
	public String email;
	@Column(nullable = false)
	public String phoneNumber;

	@OneToMany(mappedBy = "customerIdAssoc", cascade = CascadeType.ALL)
	public List<Rating> customerRestaurantsList;

public static Finder<Integer, Customer> find = new Finder<Integer, Customer>(Customer.class);

}
