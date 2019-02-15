package models;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Id;
import javax.inject.Named;
import com.avaje.ebean.Model;
import com.avaje.ebean.Model.Finder;
import java.util.*;

@Entity
public class Rating extends Model {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
public Integer ratingId;

@Column(nullable = true)
public int rating;

@Column(nullable = true)
public String feedback;

@ManyToOne(cascade = CascadeType.REMOVE, optional = false)
public Restaurant restaurantIdAssoc;

@ManyToOne(cascade = CascadeType.REMOVE, optional = false)
public Customer customerIdAssoc;

public static Finder<Integer, Rating> find = new Finder<Integer, Rating>(Rating.class);

}
