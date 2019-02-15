
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/hiten/OneDrive/Desktop/dATABSE PROJECT 5/Ag 4/RestaurantReview/conf/routes
// @DATE:Fri Nov 30 20:41:43 EST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_2: controllers.HomeController,
  // @LINE:8
  CountController_1: controllers.CountController,
  // @LINE:10
  AsyncController_3: controllers.AsyncController,
  // @LINE:12
  OwnerController_0: controllers.OwnerController,
  // @LINE:20
  RegistrationController_7: controllers.RegistrationController,
  // @LINE:26
  CustomerController_6: controllers.CustomerController,
  // @LINE:34
  RestaurantController_4: controllers.RestaurantController,
  // @LINE:48
  Assets_5: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_2: controllers.HomeController,
    // @LINE:8
    CountController_1: controllers.CountController,
    // @LINE:10
    AsyncController_3: controllers.AsyncController,
    // @LINE:12
    OwnerController_0: controllers.OwnerController,
    // @LINE:20
    RegistrationController_7: controllers.RegistrationController,
    // @LINE:26
    CustomerController_6: controllers.CustomerController,
    // @LINE:34
    RestaurantController_4: controllers.RestaurantController,
    // @LINE:48
    Assets_5: controllers.Assets
  ) = this(errorHandler, HomeController_2, CountController_1, AsyncController_3, OwnerController_0, RegistrationController_7, CustomerController_6, RestaurantController_4, Assets_5, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, CountController_1, AsyncController_3, OwnerController_0, RegistrationController_7, CustomerController_6, RestaurantController_4, Assets_5, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """owners""", """controllers.OwnerController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """owners/create""", """controllers.OwnerController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """owners/""" + "$" + """id<[^/]+>""", """controllers.OwnerController.show(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """owners/create""", """controllers.OwnerController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """owners/delete/""" + "$" + """id<[^/]+>""", """controllers.OwnerController.destroy(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginowner""", """controllers.OwnerController.login()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """validateowner""", """controllers.OwnerController.validate()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """registrations""", """controllers.RegistrationController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """registrations/create""", """controllers.RegistrationController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """registrations/""" + "$" + """id<[^/]+>""", """controllers.RegistrationController.show(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """registrations/create""", """controllers.RegistrationController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """registrations/delete/""" + "$" + """id<[^/]+>""", """controllers.RegistrationController.destroy(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """customers""", """controllers.CustomerController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """customers/create""", """controllers.CustomerController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """customers/""" + "$" + """id<[^/]+>""", """controllers.CustomerController.show(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """customers/create""", """controllers.CustomerController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """customers/delete/""" + "$" + """id<[^/]+>""", """controllers.CustomerController.destroy(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logincustomer""", """controllers.CustomerController.login()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """validatecustomer""", """controllers.CustomerController.validate()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """searchcustomer""", """controllers.RestaurantController.search()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """registercustomer""", """controllers.RestaurantController.register(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """customersearchrestaurants""", """controllers.RestaurantController.searchRestaurants()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """customershowrestaurants""", """controllers.CustomerController.showRestaurants(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """customerraterestaurants""", """controllers.RestaurantController.rate(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """savecustomerrating""", """controllers.RestaurantController.saveRestaurant()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurant""", """controllers.RestaurantController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurant/create""", """controllers.RestaurantController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurant/""" + "$" + """id<[^/]+>""", """controllers.RestaurantController.show(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurant/create""", """controllers.RestaurantController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurant/delete/""" + "$" + """id<[^/]+>""", """controllers.RestaurantController.destroy(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_2.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_CountController_count1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count1_invoker = createInvoker(
    CountController_1.count,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      """ An example controller showing how to use dependency injection""",
      this.prefix + """count"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_AsyncController_message2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message2_invoker = createInvoker(
    AsyncController_3.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """message"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_OwnerController_index3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("owners")))
  )
  private[this] lazy val controllers_OwnerController_index3_invoker = createInvoker(
    OwnerController_0.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OwnerController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """owners"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_OwnerController_create4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("owners/create")))
  )
  private[this] lazy val controllers_OwnerController_create4_invoker = createInvoker(
    OwnerController_0.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OwnerController",
      "create",
      Nil,
      "GET",
      """""",
      this.prefix + """owners/create"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_OwnerController_show5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("owners/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_OwnerController_show5_invoker = createInvoker(
    OwnerController_0.show(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OwnerController",
      "show",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """owners/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_OwnerController_save6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("owners/create")))
  )
  private[this] lazy val controllers_OwnerController_save6_invoker = createInvoker(
    OwnerController_0.save(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OwnerController",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """owners/create"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_OwnerController_destroy7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("owners/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_OwnerController_destroy7_invoker = createInvoker(
    OwnerController_0.destroy(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OwnerController",
      "destroy",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """owners/delete/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_OwnerController_login8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginowner")))
  )
  private[this] lazy val controllers_OwnerController_login8_invoker = createInvoker(
    OwnerController_0.login(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OwnerController",
      "login",
      Nil,
      "GET",
      """""",
      this.prefix + """loginowner"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_OwnerController_validate9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("validateowner")))
  )
  private[this] lazy val controllers_OwnerController_validate9_invoker = createInvoker(
    OwnerController_0.validate(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OwnerController",
      "validate",
      Nil,
      "GET",
      """""",
      this.prefix + """validateowner"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_RegistrationController_index10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("registrations")))
  )
  private[this] lazy val controllers_RegistrationController_index10_invoker = createInvoker(
    RegistrationController_7.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RegistrationController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """registrations"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_RegistrationController_create11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("registrations/create")))
  )
  private[this] lazy val controllers_RegistrationController_create11_invoker = createInvoker(
    RegistrationController_7.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RegistrationController",
      "create",
      Nil,
      "GET",
      """""",
      this.prefix + """registrations/create"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_RegistrationController_show12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("registrations/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RegistrationController_show12_invoker = createInvoker(
    RegistrationController_7.show(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RegistrationController",
      "show",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """registrations/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_RegistrationController_save13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("registrations/create")))
  )
  private[this] lazy val controllers_RegistrationController_save13_invoker = createInvoker(
    RegistrationController_7.save(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RegistrationController",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """registrations/create"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_RegistrationController_destroy14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("registrations/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RegistrationController_destroy14_invoker = createInvoker(
    RegistrationController_7.destroy(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RegistrationController",
      "destroy",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """registrations/delete/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_CustomerController_index15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("customers")))
  )
  private[this] lazy val controllers_CustomerController_index15_invoker = createInvoker(
    CustomerController_6.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """customers"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_CustomerController_create16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("customers/create")))
  )
  private[this] lazy val controllers_CustomerController_create16_invoker = createInvoker(
    CustomerController_6.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerController",
      "create",
      Nil,
      "GET",
      """""",
      this.prefix + """customers/create"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_CustomerController_show17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("customers/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CustomerController_show17_invoker = createInvoker(
    CustomerController_6.show(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerController",
      "show",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """customers/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_CustomerController_save18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("customers/create")))
  )
  private[this] lazy val controllers_CustomerController_save18_invoker = createInvoker(
    CustomerController_6.save(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerController",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """customers/create"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_CustomerController_destroy19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("customers/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CustomerController_destroy19_invoker = createInvoker(
    CustomerController_6.destroy(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerController",
      "destroy",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """customers/delete/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_CustomerController_login20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logincustomer")))
  )
  private[this] lazy val controllers_CustomerController_login20_invoker = createInvoker(
    CustomerController_6.login(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerController",
      "login",
      Nil,
      "GET",
      """""",
      this.prefix + """logincustomer"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_CustomerController_validate21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("validatecustomer")))
  )
  private[this] lazy val controllers_CustomerController_validate21_invoker = createInvoker(
    CustomerController_6.validate(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerController",
      "validate",
      Nil,
      "GET",
      """""",
      this.prefix + """validatecustomer"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_RestaurantController_search22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("searchcustomer")))
  )
  private[this] lazy val controllers_RestaurantController_search22_invoker = createInvoker(
    RestaurantController_4.search(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "search",
      Nil,
      "GET",
      """""",
      this.prefix + """searchcustomer"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_RestaurantController_register23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("registercustomer")))
  )
  private[this] lazy val controllers_RestaurantController_register23_invoker = createInvoker(
    RestaurantController_4.register(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "register",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """registercustomer"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_RestaurantController_searchRestaurants24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("customersearchrestaurants")))
  )
  private[this] lazy val controllers_RestaurantController_searchRestaurants24_invoker = createInvoker(
    RestaurantController_4.searchRestaurants(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "searchRestaurants",
      Nil,
      "GET",
      """""",
      this.prefix + """customersearchrestaurants"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_CustomerController_showRestaurants25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("customershowrestaurants")))
  )
  private[this] lazy val controllers_CustomerController_showRestaurants25_invoker = createInvoker(
    CustomerController_6.showRestaurants(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerController",
      "showRestaurants",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """customershowrestaurants"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_RestaurantController_rate26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("customerraterestaurants")))
  )
  private[this] lazy val controllers_RestaurantController_rate26_invoker = createInvoker(
    RestaurantController_4.rate(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "rate",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """customerraterestaurants"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_RestaurantController_saveRestaurant27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("savecustomerrating")))
  )
  private[this] lazy val controllers_RestaurantController_saveRestaurant27_invoker = createInvoker(
    RestaurantController_4.saveRestaurant(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "saveRestaurant",
      Nil,
      "GET",
      """""",
      this.prefix + """savecustomerrating"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_RestaurantController_index28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurant")))
  )
  private[this] lazy val controllers_RestaurantController_index28_invoker = createInvoker(
    RestaurantController_4.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """restaurant"""
    )
  )

  // @LINE:42
  private[this] lazy val controllers_RestaurantController_create29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurant/create")))
  )
  private[this] lazy val controllers_RestaurantController_create29_invoker = createInvoker(
    RestaurantController_4.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "create",
      Nil,
      "GET",
      """""",
      this.prefix + """restaurant/create"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_RestaurantController_show30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurant/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_show30_invoker = createInvoker(
    RestaurantController_4.show(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "show",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """restaurant/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:44
  private[this] lazy val controllers_RestaurantController_save31_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurant/create")))
  )
  private[this] lazy val controllers_RestaurantController_save31_invoker = createInvoker(
    RestaurantController_4.save(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """restaurant/create"""
    )
  )

  // @LINE:45
  private[this] lazy val controllers_RestaurantController_destroy32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurant/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_destroy32_invoker = createInvoker(
    RestaurantController_4.destroy(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "destroy",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """restaurant/delete/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:48
  private[this] lazy val controllers_Assets_versioned33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned33_invoker = createInvoker(
    Assets_5.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_2.index)
      }
  
    // @LINE:8
    case controllers_CountController_count1_route(params) =>
      call { 
        controllers_CountController_count1_invoker.call(CountController_1.count)
      }
  
    // @LINE:10
    case controllers_AsyncController_message2_route(params) =>
      call { 
        controllers_AsyncController_message2_invoker.call(AsyncController_3.message)
      }
  
    // @LINE:12
    case controllers_OwnerController_index3_route(params) =>
      call { 
        controllers_OwnerController_index3_invoker.call(OwnerController_0.index())
      }
  
    // @LINE:13
    case controllers_OwnerController_create4_route(params) =>
      call { 
        controllers_OwnerController_create4_invoker.call(OwnerController_0.create())
      }
  
    // @LINE:14
    case controllers_OwnerController_show5_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_OwnerController_show5_invoker.call(OwnerController_0.show(id))
      }
  
    // @LINE:15
    case controllers_OwnerController_save6_route(params) =>
      call { 
        controllers_OwnerController_save6_invoker.call(OwnerController_0.save())
      }
  
    // @LINE:16
    case controllers_OwnerController_destroy7_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_OwnerController_destroy7_invoker.call(OwnerController_0.destroy(id))
      }
  
    // @LINE:17
    case controllers_OwnerController_login8_route(params) =>
      call { 
        controllers_OwnerController_login8_invoker.call(OwnerController_0.login())
      }
  
    // @LINE:18
    case controllers_OwnerController_validate9_route(params) =>
      call { 
        controllers_OwnerController_validate9_invoker.call(OwnerController_0.validate())
      }
  
    // @LINE:20
    case controllers_RegistrationController_index10_route(params) =>
      call { 
        controllers_RegistrationController_index10_invoker.call(RegistrationController_7.index())
      }
  
    // @LINE:21
    case controllers_RegistrationController_create11_route(params) =>
      call { 
        controllers_RegistrationController_create11_invoker.call(RegistrationController_7.create())
      }
  
    // @LINE:22
    case controllers_RegistrationController_show12_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_RegistrationController_show12_invoker.call(RegistrationController_7.show(id))
      }
  
    // @LINE:23
    case controllers_RegistrationController_save13_route(params) =>
      call { 
        controllers_RegistrationController_save13_invoker.call(RegistrationController_7.save())
      }
  
    // @LINE:24
    case controllers_RegistrationController_destroy14_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_RegistrationController_destroy14_invoker.call(RegistrationController_7.destroy(id))
      }
  
    // @LINE:26
    case controllers_CustomerController_index15_route(params) =>
      call { 
        controllers_CustomerController_index15_invoker.call(CustomerController_6.index())
      }
  
    // @LINE:27
    case controllers_CustomerController_create16_route(params) =>
      call { 
        controllers_CustomerController_create16_invoker.call(CustomerController_6.create())
      }
  
    // @LINE:28
    case controllers_CustomerController_show17_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_CustomerController_show17_invoker.call(CustomerController_6.show(id))
      }
  
    // @LINE:29
    case controllers_CustomerController_save18_route(params) =>
      call { 
        controllers_CustomerController_save18_invoker.call(CustomerController_6.save())
      }
  
    // @LINE:30
    case controllers_CustomerController_destroy19_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_CustomerController_destroy19_invoker.call(CustomerController_6.destroy(id))
      }
  
    // @LINE:31
    case controllers_CustomerController_login20_route(params) =>
      call { 
        controllers_CustomerController_login20_invoker.call(CustomerController_6.login())
      }
  
    // @LINE:32
    case controllers_CustomerController_validate21_route(params) =>
      call { 
        controllers_CustomerController_validate21_invoker.call(CustomerController_6.validate())
      }
  
    // @LINE:34
    case controllers_RestaurantController_search22_route(params) =>
      call { 
        controllers_RestaurantController_search22_invoker.call(RestaurantController_4.search())
      }
  
    // @LINE:35
    case controllers_RestaurantController_register23_route(params) =>
      call(params.fromQuery[Integer]("id", None)) { (id) =>
        controllers_RestaurantController_register23_invoker.call(RestaurantController_4.register(id))
      }
  
    // @LINE:36
    case controllers_RestaurantController_searchRestaurants24_route(params) =>
      call { 
        controllers_RestaurantController_searchRestaurants24_invoker.call(RestaurantController_4.searchRestaurants())
      }
  
    // @LINE:37
    case controllers_CustomerController_showRestaurants25_route(params) =>
      call(params.fromQuery[Integer]("id", None)) { (id) =>
        controllers_CustomerController_showRestaurants25_invoker.call(CustomerController_6.showRestaurants(id))
      }
  
    // @LINE:38
    case controllers_RestaurantController_rate26_route(params) =>
      call(params.fromQuery[Integer]("id", None)) { (id) =>
        controllers_RestaurantController_rate26_invoker.call(RestaurantController_4.rate(id))
      }
  
    // @LINE:39
    case controllers_RestaurantController_saveRestaurant27_route(params) =>
      call { 
        controllers_RestaurantController_saveRestaurant27_invoker.call(RestaurantController_4.saveRestaurant())
      }
  
    // @LINE:41
    case controllers_RestaurantController_index28_route(params) =>
      call { 
        controllers_RestaurantController_index28_invoker.call(RestaurantController_4.index())
      }
  
    // @LINE:42
    case controllers_RestaurantController_create29_route(params) =>
      call { 
        controllers_RestaurantController_create29_invoker.call(RestaurantController_4.create())
      }
  
    // @LINE:43
    case controllers_RestaurantController_show30_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_RestaurantController_show30_invoker.call(RestaurantController_4.show(id))
      }
  
    // @LINE:44
    case controllers_RestaurantController_save31_route(params) =>
      call { 
        controllers_RestaurantController_save31_invoker.call(RestaurantController_4.save())
      }
  
    // @LINE:45
    case controllers_RestaurantController_destroy32_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_RestaurantController_destroy32_invoker.call(RestaurantController_4.destroy(id))
      }
  
    // @LINE:48
    case controllers_Assets_versioned33_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned33_invoker.call(Assets_5.versioned(path, file))
      }
  }
}
