package models;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Id;

import com.avaje.ebean.Model;
import com.avaje.ebean.Model.Finder;
import java.util.*;

@Entity
public class Owner extends Model {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer ownerId;
	@Column(nullable = false)
	public String firstName;
	@Column(nullable = false)
	public String lastName;
	@Column(nullable = false)
	public char gender;
	@Column(nullable = false)
	public String city;
	@Column(nullable = false)
	public String password;
	@Column(nullable = false)
	public String email;
	@Column(nullable = false)
	public String phoneNumber;
	
	@OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
	public List<Registration> registrations;
	
	@OneToMany(mappedBy = "ownerRestaurant", cascade = CascadeType.ALL)
	public List<Restaurant> restaurants;
	
	public static Finder<Integer, Owner> find = new Finder<Integer, Owner>(Owner.class);
	
	public Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(Registration r: registrations) {
            options.put(r.registrationId.toString(), r.registrationName);
        }
        return options;
    }

	

}
