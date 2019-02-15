package controllers;

import java.util.*;
import org.mindrot.jbcrypt.BCrypt;
import java.util.Set;

import javax.inject.Inject;

import models.*;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;
import views.html.*;

public class CustomerController extends Controller {

	@Inject
	FormFactory formfactory;

	// for all restaurant
	public Result index(){
		List<Customer> customers = Customer.find.all();
		return ok(customerindex.render(customers));
	}

	//to create restaurant
	public Result create(){
		Form<Customer> customerform = formfactory.form(Customer.class);
		return ok(customercreate.render(customerform));
	}

	//to save restaurant
	public Result save(){
		Form<Customer> customerform = formfactory.form(Customer.class).bindFromRequest();
		Customer customer = customerform.get();
		customer.password = BCrypt.hashpw(customer.password, BCrypt.gensalt());
		customer.save();
		return redirect(routes.CustomerController.login());
	}

	//to show restaurant
		public Result show(Integer id){
			Customer customer = Customer.find.byId(id);
			session("customerId",customer.customerId.toString());
			if(customer == null){
				return notFound("Customer Not Found");
			}

			return ok(customershow.render(customer));
		}

	//to delete restaurant
	public Result destroy(Integer id){
		Customer customer = Customer.find.byId(id);
		if(customer == null){
			return notFound("Customer Not Found");
		}
		customer.delete();
		return redirect(routes.CustomerController.index());
	}

	//to login customer
	public Result login(){
		Form<Customer> customerform = formfactory.form(Customer.class);
		return ok(logincustomer.render(customerform));
	}

//to validate the customer
	public Result validate(){
		Form<Customer> customerform = formfactory.form(Customer.class).bindFromRequest();
		Customer customer = customerform.get();
		//owner.password = BCrypt.hashpw(owner.password, BCrypt.gensalt());
		Customer customerfound = Customer.find.where().eq("email", customer.email).findUnique();
		if((customerfound != null) && BCrypt.checkpw(customer.password, customerfound.password)){

			//TO BE CHANGED!
			return redirect(routes.CustomerController.show(customerfound.customerId));
		}
		else
		{
			return redirect(routes.CustomerController.login());
		}
	}

	public Result showRestaurants(Integer id){



		Customer customer = Customer.find.byId(id);

		List<Rating> restaurantsOfCustomer = customer.customerRestaurantsList;
		List<Restaurant> restaurantsToShow = new ArrayList<Restaurant>();

		for(Rating r : restaurantsOfCustomer){
			Restaurant restaurant = Restaurant.find.byId(r.restaurantIdAssoc.restaurantId);
			restaurantsToShow.add(restaurant);
		}

		return ok(restaurantsofcustomersearchresult.render(restaurantsToShow));
	}

}
