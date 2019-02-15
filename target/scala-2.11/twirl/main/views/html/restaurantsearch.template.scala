
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object restaurantsearch_Scope0 {
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

     object restaurantsearch_Scope1 {
import helper._

class restaurantsearch extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Restaurant],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(searchrestaurantform: Form[Restaurant]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.42*/("""

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
	"""),_display_(/*114.3*/helper/*114.9*/.form(action= routes.RestaurantController.searchRestaurants())/*114.71*/{_display_(Seq[Any](format.raw/*114.72*/("""

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
				<h1>Search Restaurant</h1>
				<hr>
				<h2>Enter city and pincode to look up for restaurant!<br></h2>
				<hr>
				<form>
					<div class="form-group">
					"""),_display_(/*152.7*/inputText(
						searchrestaurantform("city"),
						'_showConstraints -> true,
						'type -> "text",
						'class -> "form-control",
						'id -> "exampleFormControlInput1",
						'placeholder -> "Enter city Location"
					)),format.raw/*159.7*/("""
					"""),format.raw/*160.6*/("""</div>
					<div class="form-group">
					"""),_display_(/*162.7*/inputText(
						searchrestaurantform("pincode"),
						'_showConstraints -> true,
						'type -> "text",
						'class -> "form-control",
						'id -> "exampleFormControlInput1",
						'placeholder -> "Enter pincode"
					)),format.raw/*169.7*/("""
					"""),format.raw/*170.6*/("""</div>
					<button type="submit" class="btn btn-primary btn-block btn-success">Search Restaurant</button>
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
	""")))}),format.raw/*202.3*/("""
	"""),format.raw/*203.2*/("""</body>
</html>

"""))
      }
    }
  }

  def render(searchrestaurantform:Form[Restaurant]): play.twirl.api.HtmlFormat.Appendable = apply(searchrestaurantform)

  def f:((Form[Restaurant]) => play.twirl.api.HtmlFormat.Appendable) = (searchrestaurantform) => apply(searchrestaurantform)

  def ref: this.type = this

}


}
}

/**/
object restaurantsearch extends restaurantsearch_Scope0.restaurantsearch_Scope1.restaurantsearch
              /*
                  -- GENERATED --
                  DATE: Fri Nov 30 20:41:44 EST 2018
                  SOURCE: C:/Users/hiten/OneDrive/Desktop/dATABSE PROJECT 5/Ag 4/RestaurantReview/app/views/restaurantsearch.scala.html
                  HASH: f6711a8bbdba0a2940f56dc88c11c9eb6da983ff
                  MATRIX: 832->23|967->63|995->65|2167->1210|2182->1216|2246->1258|2602->1586|2631->1587|2663->1592|2707->1609|2735->1610|2766->1614|2808->1628|2837->1629|2869->1634|2932->1670|2960->1671|2991->1675|3033->1689|3062->1690|3094->1695|3164->1738|3192->1739|3224->1744|3256->1749|3285->1750|3317->1755|3361->1772|3389->1773|3420->1777|3471->1800|3500->1801|3532->1806|3658->1905|3686->1906|3717->1910|3753->1918|3782->1919|3814->1924|3884->1967|3912->1968|3943->1972|3985->1986|4014->1987|4046->1992|4145->2064|4173->2065|4204->2069|4242->2079|4271->2080|4303->2085|4402->2157|4430->2158|4461->2162|4510->2183|4539->2184|4571->2189|4663->2254|4691->2255|4723->2260|4766->2275|4795->2276|4827->2281|4883->2310|4911->2311|4942->2315|4982->2327|5011->2328|5043->2333|5142->2405|5170->2406|5201->2410|5243->2424|5272->2425|5304->2430|5348->2447|5376->2448|5408->2453|5445->2462|5474->2463|5506->2468|5629->2564|5657->2565|5688->2569|5724->2577|5753->2578|5785->2583|6125->2895|6154->2896|6186->2900|6225->2910|6255->2911|6288->2916|6382->2982|6411->2983|6443->2987|6474->2990|6503->2991|6536->2996|6615->3047|6644->3048|6674->3050|6721->3070|6736->3076|6808->3138|6848->3139|6880->3143|8217->4453|8464->4679|8498->4685|8568->4728|8812->4951|8846->4957|9816->5896|9846->5898
                  LINES: 30->7|35->7|37->9|51->23|51->23|51->23|59->31|59->31|60->32|61->33|61->33|62->34|62->34|62->34|63->35|65->37|65->37|66->38|66->38|66->38|67->39|69->41|69->41|71->43|71->43|71->43|72->44|73->45|73->45|74->46|74->46|74->46|75->47|79->51|79->51|80->52|80->52|80->52|81->53|83->55|83->55|84->56|84->56|84->56|85->57|88->60|88->60|89->61|89->61|89->61|90->62|93->65|93->65|94->66|94->66|94->66|95->67|97->69|97->69|99->71|99->71|99->71|100->72|102->74|102->74|103->75|103->75|103->75|104->76|107->79|107->79|108->80|108->80|108->80|109->81|110->82|110->82|112->84|112->84|112->84|113->85|117->89|117->89|118->90|118->90|118->90|119->91|129->101|129->101|130->102|130->102|130->102|131->103|134->106|134->106|135->107|135->107|135->107|136->108|138->110|138->110|139->111|142->114|142->114|142->114|142->114|144->116|180->152|187->159|188->160|190->162|197->169|198->170|230->202|231->203
                  -- GENERATED --
              */
          