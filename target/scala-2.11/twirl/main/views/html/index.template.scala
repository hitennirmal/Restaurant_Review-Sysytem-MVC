
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""
"""),_display_(/*2.2*/main(message)/*2.15*/ {_display_(Seq[Any](format.raw/*2.17*/("""
    """),format.raw/*3.5*/("""<body>
        <nav class="navbar fixed-top cnavbar-collapse collapse">
            <div class="container navcontainer">
                <a class="navbar-brand" href="#">
                    <img src="https://openclipart.org/image/600px/svg_to_png/226091/Restaurant-Sign-Black.png" width="30" height="30" class="d-inline-block align-top" alt="">
                    RestaurantReview</a>
                <ul class="nav">
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" data-toggle="dropdown"
                         role="dropdown-item" aria-haspopup="true" aria-expanded="false">
                            Register</a>
                        <div class="dropdown">
                            <a class="dropdown-item" href=""""),_display_(/*15.61*/routes/*15.67*/.CustomerController.create()),format.raw/*15.95*/("""">Customer</a>
                            <a class="dropdown-item" href=""""),_display_(/*16.61*/routes/*16.67*/.OwnerController.create()),format.raw/*16.92*/("""">Owner</a>
                        </div>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" data-toggle="dropdown"
                        role="dropdown-item" aria-haspopup="true" aria-expanded="false">
                        
						Login</a>
						<div class="dropdown">
                        <div class="nav-item dropdown">
                            <a class="dropdown-item" href=""""),_display_(/*26.61*/routes/*26.67*/.CustomerController.login()),format.raw/*26.94*/("""">Customer</a>
                            <a class="dropdown-item" href=""""),_display_(/*27.61*/routes/*27.67*/.OwnerController.login()),format.raw/*27.91*/("""">Owner</a>
                        </div>
						</div>
                    </li>
                </ul>
            </div>
        </nav>
        <div class="jumbotron">
            <div class="jumbotron-text">
                <div class="row">
                    <div class="col-6">
                        <h1 class="display-3">Welcome to<br>RestaurantReview.</h1>
                        <p class="lead">Search for popular restaurants, check out restaurant reviews and rate restaurants</p>
                        <hr class="my-2">
                        <p class="lead-2">Click the button below to get registered!</p>
                        <p class="lead">
                            <a class="btn btn-primary btn-lg" href='"""),_display_(/*43.70*/routes/*43.76*/.OwnerController.create()),format.raw/*43.101*/("""' role="button">Sign Up!</a>
                        </p>
                    </div>
                </div>
            </div>
        </div>
        <div class="below-jumbo">
            <br>
            <div class="row row11">
                <div class="col-md-3 mid">
                    <img src="https://openclipart.org/image/300px/svg_to_png/123/molumen-couvert.png" alt="handshake">
                    <br>
                    <h2 class="midtext"><br>Let's Dine</h2>
                    <p class="midp">Look up restaurants, read reviews, pick your favorite</p>
                </div>
                <div class="col-md-3 mid">
                    <img src="https://openclipart.org/image/300px/svg_to_png/281555/Sign9.png" alt="piggybank" class="svgimg">
                    <br>
                    <h2 class="midtext"><br>Want a good Meal?</h2>
                    <p class="midp"> Select from our various restaurants</p>
                </div>
                <div class="col-md-3 mid">
                    <img src="https://openclipart.org/image/200px/svg_to_png/205429/world-map.png" alt="piggybank">
                    <h2 class="midtext"><br>Search</h2>
                    <p class="midp">Chose from different locations and find the best rated in every location</p>
                </div>
            </div>
            <div class="bottom-wrapper">
                <div class="holder">
                    <h1 class="bottom-h1">Getting started!</h1>
                    <hr>
                    <h2 class="bottom-h2">Are you a restaurant or business owner or a user/customer<br><br></h2>
                    <div class="row">
                        <div class="container col-md-6">
                            <div class="container loginbox">
                                <div class="card">
                                    <img class="card-img-top" src="https://upload.wikimedia.org/wikipedia/commons/d/d3/Restaurant_La_Tour_d%27Argent_-_Salle_du_restaurant.JPG" alt="Card image cap">
                                    <div class="card-body">
                                        <h4 class="card-title">Sign Up as a member and get regular discounts on your favorite restaurants!</h4>
                                        <p class="card-text">We'll ask you for some basic information and you'll be on your way</p>
                                        <a href='"""),_display_(/*83.51*/routes/*83.57*/.CustomerController.create()),format.raw/*83.85*/("""' class="btn btn-success btn-block">Sign up today!</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="container col-md-6">
                            <div class="container loginbox">
                                <div class="card" >
                                    <img class="card-img-top" src="http://media.openclipart.org/people/j4p4n/500px-CDC-outtoeat.png" alt="Card image cap" >
                                    <div class="card-body">
                                        <h4 class="card-title">Sign up to be a Owner!</h4>
                                        <p class="card-text">We'll ask you for some basic information as well as details about the car you plan to use.</p>
                                        <a href='"""),_display_(/*95.51*/routes/*95.57*/.OwnerController.create()),format.raw/*95.82*/("""' class="btn btn-success btn-block">Sign up today!</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <nav class="navbar cnavbar-collapse collapse navbar-footer">
            <div class="container navcontainer">
                <a class="navbar-brand" id="bottom-brand" href="#">
                    RestaurantReview</a>
                <ul class="nav">
                    <li class="nav-item-bottom">
                        <a class="nav-link" id="footerlink" href="#">Terms</a>
                    </li>
                    <li class="nav-item-bottom">
                        <a class="nav-link" id="footerlink" href="#">Services</a>
                    </li>
                    <li class="nav-item-bottom">
                        <a class="nav-link" id="footerlink" href="#">Financial</a>
                    </li>
                    <li class="nav-item-bottom">
                        <a class="nav-link" id="footerlink" href="#">Security</a>
                    </li>
                    <li class="nav-item-bottom">
                        <a class="nav-link" id="footerlink" href="#">Social Media</a>
                    </li>
                </ul>
            </div>
        </nav>
    </body>
""")))}),format.raw/*129.2*/("""

"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Fri Nov 30 20:41:44 EST 2018
                  SOURCE: C:/Users/hiten/OneDrive/Desktop/dATABSE PROJECT 5/Ag 4/RestaurantReview/app/views/index.scala.html
                  HASH: 97dc244dc299d2cc3182e1660f57e24533a4ef70
                  MATRIX: 745->1|857->18|884->20|905->33|944->35|975->40|1794->832|1809->838|1858->866|1960->941|1975->947|2021->972|2526->1450|2541->1456|2589->1483|2691->1558|2706->1564|2751->1588|3512->2322|3527->2328|3574->2353|5997->4749|6012->4755|6061->4783|6974->5669|6989->5675|7035->5700|8470->7104
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|46->15|46->15|46->15|47->16|47->16|47->16|57->26|57->26|57->26|58->27|58->27|58->27|74->43|74->43|74->43|114->83|114->83|114->83|126->95|126->95|126->95|160->129
                  -- GENERATED --
              */
          