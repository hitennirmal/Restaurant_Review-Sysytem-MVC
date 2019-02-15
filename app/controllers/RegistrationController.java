package controllers;

import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import models.*;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;
import views.html.*;

public class RegistrationController extends Controller {

	@Inject
	FormFactory formfactory;

	// for all registration
	public Result index(){
		List<Registration> registrations = Registration.find.all();
		return ok(registrationindex.render(registrations));
	}

	//to create Registration
	public Result create(){
		Form<Registration> registrationform = formfactory.form(Registration.class);
		return ok(registrationcreate.render(registrationform));
	}

	//to save Registration
	public Result save(){
		Form<Registration> registrationform = formfactory.form(Registration.class).bindFromRequest();
		Integer ownerId = Integer.valueOf(session().get("ownerId"));
		Registration registration = registrationform.get();
		Owner owner = Owner.find.byId(ownerId);
		registration.owner = owner;
		registration.save();
		return redirect(routes.OwnerController.show(ownerId));
	}

	//to show Registration
		public Result show(Integer id){
			Registration registration = Registration.find.byId(id);
			if(registration == null){
				return notFound("Registration Not Found");
			}

			return ok(registrationshow.render(registration));
		}

	//to delete Registration
	public Result destroy(Integer id){
		Registration registration = Registration.find.byId(id);
		if(registration == null){
			return notFound("Registration Not Found");
		}
		registration.delete();
		return redirect(routes.RegistrationController.index());
	}
}