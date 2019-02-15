package controllers;

import java.util.ArrayList;
import play.api.Logger;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;

import models.*;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;
import views.html.*;

public class RestaurantController extends Controller {

	@Inject
	FormFactory formfactory;

	// for all restaurant
	public Result index(){
		List<Restaurant> restaurant = Restaurant.find.all();
		return ok(restaurantindex.render(restaurant));
	}

	//to create restaurant
	public Result create(){
		Form<Restaurant> restaurantform = formfactory.form(Restaurant.class);
		Integer ownerId = Integer.valueOf(session().get("ownerId"));
		Owner owner = Owner.find.byId(ownerId);
		return ok(restaurantcreate.render(restaurantform, owner));
	}

	//to save restaurant
	public Result save(){
		Form<Restaurant> restaurantform = formfactory.form(Restaurant.class).bindFromRequest();
		Integer ownerId = Integer.valueOf(session().get("ownerId"));
		Restaurant restaurant = restaurantform.get();
		Owner owner = Owner.find.byId(ownerId);
		restaurant.ownerRestaurant = owner;
		restaurant.save();
		return redirect(routes.OwnerController.show(ownerId));
	}

	//to show restaurant
		public Result show(Integer id){
			Restaurant restaurant = Restaurant.find.byId(id);
			if(restaurant == null){
				return notFound("Restaurant Not Found");
			}

			return ok(restaurantshow.render(restaurant));
		}

	//to delete restaurant
	public Result destroy(Integer id){
		Restaurant restaurant = Restaurant.find.byId(id);
		if(restaurant == null){
			return notFound("Restaurant Not Found");
		}
		restaurant.delete();
		return redirect(routes.RestaurantController.index());
	}

	public Result search(){
		Form<Restaurant> searchrestaurantform = formfactory.form(Restaurant.class);
		return ok(restaurantsearch.render(searchrestaurantform));
	}

	public Result searchRestaurants(){

		Form<Restaurant> searchrestaurantform = formfactory.form(Restaurant.class).bindFromRequest();

		Restaurant restaurant = searchrestaurantform.get();
		List<Restaurant> restaurants = Restaurant.find.all();
		//taken help form ankit vaghela for this project
		List<Restaurant> restaurantsToShow = new ArrayList<Restaurant>();
		for(Restaurant r : restaurants){
			int totalcapacity = r.registration.registrationNumber;
			
			if((r.city.equalsIgnoreCase(restaurant.city) && r.pincode.equalsIgnoreCase(restaurant.pincode)))
			{
				int currentCapacity = r.restaurantsCustomerList.size();

			
				if(currentCapacity < totalcapacity)
				{
					restaurantsToShow.add(r);
				}

				
			}
		}
		return ok(restaurantsearchresult.render(restaurantsToShow));
	}
	public Result register(Integer id){
		Restaurant restaurant = Restaurant.find.byId(id);

		Integer customerId = Integer.valueOf(session().get("customerId"));

		Customer customer = Customer.find.byId(customerId);

		Rating rating = new Rating();
		rating.restaurantIdAssoc = restaurant;
		rating.customerIdAssoc = customer;

		rating.save();

		return redirect(routes.CustomerController.show(customerId));
	}

	public Result rate(Integer id){
		Restaurant restaurant = Restaurant.find.byId(id);
		Form<Restaurant> restaurantform = formfactory.form(Restaurant.class);
		Form<Rating> ratingform = formfactory.form(Rating.class);

		session("restaurantId",restaurant.restaurantId.toString());

		if(restaurant == null){
			return notFound("Restaurant Not Found");
		}

		return ok(restaurantshowforrating.render(restaurant, restaurantform, ratingform));
	}

	public Result saveRestaurant(){
		Form<Rating> ratingform = formfactory.form(Rating.class).bindFromRequest();
		Rating rating = ratingform.get();

		Integer restaurantId = Integer.valueOf(session().get("restaurantId"));

		 Restaurant restaurantToSave = Restaurant.find.byId(restaurantId);

		

		System.out.println("Rating feedback"+rating.feedback);

		Integer customerId = Integer.valueOf(session().get("customerId"));

		Customer customer = Customer.find.byId(customerId);

		Rating ratingToSave = Rating.find.where().eq("restaurant_id_assoc_restaurant_id",restaurantToSave.restaurantId).eq("customer_id_assoc_customer_id",customer.customerId).findUnique();
		ratingToSave.rating = rating.rating;
		ratingToSave.feedback = rating.feedback;
		System.out.println(ratingToSave);
		ratingToSave.update();
		
		return redirect(routes.CustomerController.show(customerId));
	}

}
