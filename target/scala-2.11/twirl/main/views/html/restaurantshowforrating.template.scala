
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object restaurantshowforrating_Scope0 {
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

     object restaurantshowforrating_Scope1 {
import helper._

class restaurantshowforrating extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Restaurant,Form[Restaurant],Form[Rating],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(restaurant: Restaurant, restaurantform: Form[Restaurant], ratingform: Form[Rating]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.86*/("""

"""),format.raw/*9.1*/("""<html>
	<head>
		<title>Owner Login</title>

			<!-- BOOTSTRAP CSS/JSS CDN -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/vivus/0.4.3/vivus.js" crossorigin="anonymous"></script>

			<!-- JQUERY AND POPPER CDN -->
		<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>

			<!-- Stylesheets and javascript -->
		<link rel="stylesheet" type='text/css' media="screen" href='"""),_display_(/*23.64*/routes/*23.70*/.Assets.versioned("stylesheets/login.css")),format.raw/*23.112*/("""'>
		<link href="https://fonts.googleapis.com/css?family=PT+Sans" rel="stylesheet">
		<link href="https://fonts.googleapis.com/css?family=Bitter|Source+Sans+Pro" rel="stylesheet">
		<link rel='stylesheet prefetch' href='http:////netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css'>


	</head>
	<style>
			.nav_text """),format.raw/*31.14*/("""{"""),format.raw/*31.15*/("""
				"""),format.raw/*32.5*/("""color: white;
			"""),format.raw/*33.4*/("""}"""),format.raw/*33.5*/("""
			"""),format.raw/*34.4*/(""".navbar-header"""),format.raw/*34.18*/("""{"""),format.raw/*34.19*/("""
				"""),format.raw/*35.5*/("""margin-left:5px;
				width:100%;
			"""),format.raw/*37.4*/("""}"""),format.raw/*37.5*/("""
			"""),format.raw/*38.4*/(""".navcontainer """),format.raw/*38.18*/("""{"""),format.raw/*38.19*/("""
				"""),format.raw/*39.5*/("""margin-left: 10%;
				margin-right: 5%;
			"""),format.raw/*41.4*/("""}"""),format.raw/*41.5*/("""

			"""),format.raw/*43.4*/("""body """),format.raw/*43.9*/("""{"""),format.raw/*43.10*/("""
				"""),format.raw/*44.5*/("""margin: auto;
			"""),format.raw/*45.4*/("""}"""),format.raw/*45.5*/("""
			"""),format.raw/*46.4*/(""".navbar, .navbar-fixed """),format.raw/*46.27*/("""{"""),format.raw/*46.28*/("""
				"""),format.raw/*47.5*/("""background-color: gray;
				opacity: .90;
				z-index: 99;
				box-shadow: 0 4px 2px -2px gray;
			"""),format.raw/*51.4*/("""}"""),format.raw/*51.5*/("""
			"""),format.raw/*52.4*/("""#navbar """),format.raw/*52.12*/("""{"""),format.raw/*52.13*/("""
				"""),format.raw/*53.5*/("""margin-left: 10%;
				margin-right: 5%;
			"""),format.raw/*55.4*/("""}"""),format.raw/*55.5*/("""
			"""),format.raw/*56.4*/(""".navbar-brand """),format.raw/*56.18*/("""{"""),format.raw/*56.19*/("""
				"""),format.raw/*57.5*/("""font-family: 'Bitter', serif;
				font-size: 22px;
				color: white;
			"""),format.raw/*60.4*/("""}"""),format.raw/*60.5*/("""
			"""),format.raw/*61.4*/(""".nav-link """),format.raw/*61.14*/("""{"""),format.raw/*61.15*/("""
				"""),format.raw/*62.5*/("""font-size: 16px;
				font-family: 'Bitter', serif;
				color: white;
			"""),format.raw/*65.4*/("""}"""),format.raw/*65.5*/("""
			"""),format.raw/*66.4*/("""nav.navbar.fixed-top """),format.raw/*66.25*/("""{"""),format.raw/*66.26*/("""
				"""),format.raw/*67.5*/("""padding: 0em;
				box-shadow: 0 0 4px 1px rgba(0, 0, 0, 0.3);
			"""),format.raw/*69.4*/("""}"""),format.raw/*69.5*/("""

			"""),format.raw/*71.4*/(""".navbar-footer """),format.raw/*71.19*/("""{"""),format.raw/*71.20*/("""
				"""),format.raw/*72.5*/("""background-color: white;

			"""),format.raw/*74.4*/("""}"""),format.raw/*74.5*/("""
			"""),format.raw/*75.4*/("""#footerlink """),format.raw/*75.16*/("""{"""),format.raw/*75.17*/("""
				"""),format.raw/*76.5*/("""font-size: 16px;
				font-family: 'Bitter', serif;
				color: black;
			"""),format.raw/*79.4*/("""}"""),format.raw/*79.5*/("""
			"""),format.raw/*80.4*/("""#bottom-brand """),format.raw/*80.18*/("""{"""),format.raw/*80.19*/("""
				"""),format.raw/*81.5*/("""color: black;
			"""),format.raw/*82.4*/("""}"""),format.raw/*82.5*/("""

			"""),format.raw/*84.4*/(""".wrapper """),format.raw/*84.13*/("""{"""),format.raw/*84.14*/("""
				"""),format.raw/*85.5*/("""padding-top: 10em;
				padding-left: 16em;
				padding-right: 16em;
				padding-bottom: 5em;
			"""),format.raw/*89.4*/("""}"""),format.raw/*89.5*/("""
			"""),format.raw/*90.4*/(""".holder """),format.raw/*90.12*/("""{"""),format.raw/*90.13*/("""
				"""),format.raw/*91.5*/("""background-color: #7F8EBF;
				padding-top: 3em;
				padding-left: 9em;
				padding-right: 9em;
				padding-bottom: 2em;
				border-bottom-left-radius: 3em;
				border-bottom-right-radius: 1em;
				border-top-right-radius: 3em;
				border-top-left-radius: 1em;
				box-shadow: 0 0 4px 1px rgba(0, 0, 0, 0.3);
			"""),format.raw/*101.4*/("""}"""),format.raw/*101.5*/("""
			"""),format.raw/*102.4*/("""h2, label """),format.raw/*102.14*/("""{"""),format.raw/*102.15*/("""
				"""),format.raw/*103.5*/("""color: white;
				font-family: 'Source Sans Pro', sans-serif;

			"""),format.raw/*106.4*/("""}"""),format.raw/*106.5*/("""
			"""),format.raw/*107.4*/("""h1 """),format.raw/*107.7*/("""{"""),format.raw/*107.8*/("""
				"""),format.raw/*108.5*/("""color: white;
				font-family: 'Bitter', serif;
			"""),format.raw/*110.4*/("""}"""),format.raw/*110.5*/("""
	"""),format.raw/*111.2*/("""</style>

	<body>
	"""),_display_(/*114.3*/helper/*114.9*/.form(action= routes.RestaurantController.saveRestaurant())/*114.68*/ {_display_(Seq[Any](format.raw/*114.70*/("""

		"""),format.raw/*116.3*/("""<nav class="navbar fixed-top cnavbar-collapse collapse">
			<div class="container navcontainer">
				<a class="navbar-brand" href="#">
					<img src="https://openclipart.org/image/600px/svg_to_png/226091/Restaurant-Sign-Black.png" width="30" height="30" class="d-inline-block align-top" alt="">
					RestaurantReview</a>
				<ul class="nav">
					<li class="nav-item dropdown">
						<a class="nav-link dropdown-toggle" data-toggle="dropdown"
						href="#!" role="button" aria-haspopup="true" aria-expanded="false">
							Register</a>
						<div class="dropdown-menu">
							<a class="dropdown-item" href="#!">Customer</a>
							<a class="dropdown-item" href="#!">Owner</a>
						</div>
					</li>
					<li class="nav-item dropdown">
						<a class="nav-link dropdown-toggle" data-toggle="dropdown"
						href="#!" role="button" aria-haspopup="true" aria-expanded="false">
							Login</a>
						<div class="dropdown-menu">
							<a class="dropdown-item" href="#!">Customer</a>
							<a class="dropdown-item" href="#!">Owner</a>
						</div>
					</li>
				</ul>
			</div>
		</nav>

		<div class="wrapper">
			<div class="container holder">
				<form>
					<div class="form-group">
						<p>Restaurant City: """),_display_(/*148.28*/restaurant/*148.38*/.city),format.raw/*148.43*/("""</p>
						<p>Restaurant Pincode: """),_display_(/*149.31*/restaurant/*149.41*/.pincode),format.raw/*149.49*/("""</p>
						<p>Restaurant Name: """),_display_(/*150.28*/restaurant/*150.38*/.name),format.raw/*150.43*/("""</p>
					</div>


					"""),_display_(/*154.7*/inputText(
						ratingform("rating"),
						'_showConstraints -> true,
						'type -> "text",
						'class -> "form-control",
						'id -> "Rating",
						'placeholder -> "Rating"
					)),format.raw/*161.7*/("""
					"""),format.raw/*162.6*/("""<div class="invalid-feedback">
						Please fill this field.
					</div>

					"""),_display_(/*166.7*/inputText(
						ratingform("feedback"),
						'_showConstraints -> true,
						'type -> "text",
						'class -> "form-control",
						'id -> "Feedback",
						'placeholder -> "Feedback"
					)),format.raw/*173.7*/("""
					"""),format.raw/*174.6*/("""<div class="invalid-feedback">
						Please fill this field.
					</div>

					<input type="submit" value="Rate Restaurant">
				</form>
			</div>
		</div>




		<nav class="navbar cnavbar-collapse collapse fixed-bottom navbar-footer">
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
	""")))}),format.raw/*209.3*/("""
	"""),format.raw/*210.2*/("""</body>
</html>
"""))
      }
    }
  }

  def render(restaurant:Restaurant,restaurantform:Form[Restaurant],ratingform:Form[Rating]): play.twirl.api.HtmlFormat.Appendable = apply(restaurant,restaurantform,ratingform)

  def f:((Restaurant,Form[Restaurant],Form[Rating]) => play.twirl.api.HtmlFormat.Appendable) = (restaurant,restaurantform,ratingform) => apply(restaurant,restaurantform,ratingform)

  def ref: this.type = this

}


}
}

/**/
object restaurantshowforrating extends restaurantshowforrating_Scope0.restaurantshowforrating_Scope1.restaurantshowforrating
              /*
                  -- GENERATED --
                  DATE: Fri Nov 30 20:41:44 EST 2018
                  SOURCE: C:/Users/hiten/OneDrive/Desktop/dATABSE PROJECT 5/Ag 4/RestaurantReview/app/views/restaurantshowforrating.scala.html
                  HASH: 5e898fb50233368d29dfc47d133abcc0b4734e17
                  MATRIX: 877->29|1056->113|1086->117|2272->1276|2287->1282|2351->1324|2715->1660|2744->1661|2777->1667|2822->1685|2850->1686|2882->1691|2924->1705|2953->1706|2986->1712|3051->1750|3079->1751|3111->1756|3153->1770|3182->1771|3215->1777|3287->1822|3315->1823|3349->1830|3381->1835|3410->1836|3443->1842|3488->1860|3516->1861|3548->1866|3599->1889|3628->1890|3661->1896|3791->1999|3819->2000|3851->2005|3887->2013|3916->2014|3949->2020|4021->2065|4049->2066|4081->2071|4123->2085|4152->2086|4185->2092|4287->2167|4315->2168|4347->2173|4385->2183|4414->2184|4447->2190|4549->2265|4577->2266|4609->2271|4658->2292|4687->2293|4720->2299|4814->2366|4842->2367|4876->2374|4919->2389|4948->2390|4981->2396|5039->2427|5067->2428|5099->2433|5139->2445|5168->2446|5201->2452|5303->2527|5331->2528|5363->2533|5405->2547|5434->2548|5467->2554|5512->2572|5540->2573|5574->2580|5611->2589|5640->2590|5673->2596|5800->2696|5828->2697|5860->2702|5896->2710|5925->2711|5958->2717|6308->3039|6337->3040|6370->3045|6409->3055|6439->3056|6473->3062|6570->3131|6599->3132|6632->3137|6663->3140|6692->3141|6726->3147|6807->3200|6836->3201|6867->3204|6917->3227|6932->3233|7001->3292|7042->3294|7076->3300|8351->4547|8371->4557|8398->4562|8462->4598|8482->4608|8512->4616|8573->4649|8593->4659|8620->4664|8676->4693|8891->4887|8926->4894|9037->4978|9258->5178|9293->5185|10316->6177|10347->6180
                  LINES: 30->7|35->7|37->9|51->23|51->23|51->23|59->31|59->31|60->32|61->33|61->33|62->34|62->34|62->34|63->35|65->37|65->37|66->38|66->38|66->38|67->39|69->41|69->41|71->43|71->43|71->43|72->44|73->45|73->45|74->46|74->46|74->46|75->47|79->51|79->51|80->52|80->52|80->52|81->53|83->55|83->55|84->56|84->56|84->56|85->57|88->60|88->60|89->61|89->61|89->61|90->62|93->65|93->65|94->66|94->66|94->66|95->67|97->69|97->69|99->71|99->71|99->71|100->72|102->74|102->74|103->75|103->75|103->75|104->76|107->79|107->79|108->80|108->80|108->80|109->81|110->82|110->82|112->84|112->84|112->84|113->85|117->89|117->89|118->90|118->90|118->90|119->91|129->101|129->101|130->102|130->102|130->102|131->103|134->106|134->106|135->107|135->107|135->107|136->108|138->110|138->110|139->111|142->114|142->114|142->114|142->114|144->116|176->148|176->148|176->148|177->149|177->149|177->149|178->150|178->150|178->150|182->154|189->161|190->162|194->166|201->173|202->174|237->209|238->210
                  -- GENERATED --
              */
          