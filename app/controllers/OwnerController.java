package controllers;

import java.util.List;
import org.mindrot.jbcrypt.BCrypt;
import java.util.Set;

import javax.inject.Inject;

import models.*;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;
import views.html.*;

public class OwnerController extends Controller {

	@Inject
	FormFactory formfactory;

	// for all owner
	public Result index(){
		List<Owner> owners = Owner.find.all();
		return ok(ownerindex.render(owners));
	}

	//to create owner
	public Result create(){
		Form<Owner> ownerform = formfactory.form(Owner.class);
		return ok(ownercreate.render(ownerform));
	}

	//to save owner
	public Result save(){
		Form<Owner> ownerform = formfactory.form(Owner.class).bindFromRequest();
		Owner owner = ownerform.get();	
		owner.password = BCrypt.hashpw(owner.password, BCrypt.gensalt());
		owner.save();
		return redirect(routes.OwnerController.login());
	}

	//to show owner
		public Result show(Integer id){
			Owner owner = Owner.find.byId(id);
			session("ownerId",owner.ownerId.toString());
			if(owner == null){
				return notFound("owner Not Found");
			}

			return ok(ownershow.render(owner));
		}

	//to delete owner
	public Result destroy(Integer id){
		Owner owner = Owner.find.byId(id);
		if(owner == null){
			return notFound("Owner Not Found");
		}
		owner.delete();
		return redirect(routes.OwnerController.index());
	}
	
	//Login for Owner
		public Result login(){
			Form<Owner> ownerform = formfactory.form(Owner.class);
			return ok(loginowner.render(ownerform));
		}
	
	//to validate the owner
	public Result validate(){
		Form<Owner> ownerform = formfactory.form(Owner.class).bindFromRequest();
		Owner owner = ownerform.get();	
		Owner ownerfound = Owner.find.where().eq("email", owner.email).findUnique();
		
	
		
		if((ownerfound != null) && BCrypt.checkpw(owner.password, ownerfound.password)){		
		return redirect(routes.OwnerController.show(ownerfound.ownerId));
		}
		else
		{
			return redirect(routes.OwnerController.login());
		}
	}
	
}
