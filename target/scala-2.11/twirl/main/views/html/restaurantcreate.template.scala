
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object restaurantcreate_Scope0 {
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

     object restaurantcreate_Scope1 {
import helper._

class restaurantcreate extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[Restaurant],Owner,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(restaurantform: Form[Restaurant], owner: Owner):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.50*/("""

"""),format.raw/*6.1*/("""<html>
	<head>
		<title>Customer Registration</title>

			<!-- BOOTSTRAP CSS/JSS CDN -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/vivus/0.4.3/vivus.js" crossorigin="anonymous"></script>

			<!-- JQUERY AND POPPER CDN -->
		<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>

			<!-- Stylesheets and javascript -->
		<link rel="stylesheet" type='text/css' media="screen" href='"""),_display_(/*20.64*/routes/*20.70*/.Assets.versioned("stylesheets/registration.css")),format.raw/*20.119*/("""'>
		<link href="https://fonts.googleapis.com/css?family=PT+Sans" rel="stylesheet">
		<link href="https://fonts.googleapis.com/css?family=Bitter|Source+Sans+Pro" rel="stylesheet">
		<link rel='stylesheet prefetch' href='http:////netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css'>

	</head>

	<style>
			.nav_text """),format.raw/*28.14*/("""{"""),format.raw/*28.15*/("""
				"""),format.raw/*29.5*/("""color: white;
			"""),format.raw/*30.4*/("""}"""),format.raw/*30.5*/("""
			"""),format.raw/*31.4*/(""".navbar-header"""),format.raw/*31.18*/("""{"""),format.raw/*31.19*/("""
				"""),format.raw/*32.5*/("""margin-left:5px;
				width:100%;
			"""),format.raw/*34.4*/("""}"""),format.raw/*34.5*/("""
			"""),format.raw/*35.4*/(""".navcontainer """),format.raw/*35.18*/("""{"""),format.raw/*35.19*/("""
				"""),format.raw/*36.5*/("""margin-left: 10%;
				margin-right: 5%;
			"""),format.raw/*38.4*/("""}"""),format.raw/*38.5*/("""

			"""),format.raw/*40.4*/("""body """),format.raw/*40.9*/("""{"""),format.raw/*40.10*/("""
				"""),format.raw/*41.5*/("""margin: auto;
			"""),format.raw/*42.4*/("""}"""),format.raw/*42.5*/("""
			"""),format.raw/*43.4*/(""".navbar, .navbar-fixed """),format.raw/*43.27*/("""{"""),format.raw/*43.28*/("""
				"""),format.raw/*44.5*/("""background-color: gray;
				opacity: .90;
				z-index: 99;
				box-shadow: 0 4px 2px -2px gray;
			"""),format.raw/*48.4*/("""}"""),format.raw/*48.5*/("""
			"""),format.raw/*49.4*/("""#navbar """),format.raw/*49.12*/("""{"""),format.raw/*49.13*/("""
				"""),format.raw/*50.5*/("""margin-left: 10%;
				margin-right: 5%;
			"""),format.raw/*52.4*/("""}"""),format.raw/*52.5*/("""
			"""),format.raw/*53.4*/(""".navbar-brand """),format.raw/*53.18*/("""{"""),format.raw/*53.19*/("""
				"""),format.raw/*54.5*/("""font-family: 'Bitter', serif;
				font-size: 22px;
				color: white;
			"""),format.raw/*57.4*/("""}"""),format.raw/*57.5*/("""
			"""),format.raw/*58.4*/(""".nav-link """),format.raw/*58.14*/("""{"""),format.raw/*58.15*/("""
				"""),format.raw/*59.5*/("""font-size: 16px;
				font-family: 'Bitter', serif;
				color: white;
			"""),format.raw/*62.4*/("""}"""),format.raw/*62.5*/("""
			"""),format.raw/*63.4*/("""nav.navbar.fixed-top """),format.raw/*63.25*/("""{"""),format.raw/*63.26*/("""
				"""),format.raw/*64.5*/("""padding: 0em;
				box-shadow: 0 0 4px 1px rgba(0, 0, 0, 0.3);
			"""),format.raw/*66.4*/("""}"""),format.raw/*66.5*/("""

			"""),format.raw/*68.4*/(""".navbar-footer """),format.raw/*68.19*/("""{"""),format.raw/*68.20*/("""
				"""),format.raw/*69.5*/("""background-color: white;

			"""),format.raw/*71.4*/("""}"""),format.raw/*71.5*/("""
			"""),format.raw/*72.4*/("""#footerlink """),format.raw/*72.16*/("""{"""),format.raw/*72.17*/("""
				"""),format.raw/*73.5*/("""font-size: 16px;
				font-family: 'Bitter', serif;
				color: black;
			"""),format.raw/*76.4*/("""}"""),format.raw/*76.5*/("""
			"""),format.raw/*77.4*/("""#bottom-brand """),format.raw/*77.18*/("""{"""),format.raw/*77.19*/("""
				"""),format.raw/*78.5*/("""color: black;
			"""),format.raw/*79.4*/("""}"""),format.raw/*79.5*/("""

			"""),format.raw/*81.4*/(""".formdiv """),format.raw/*81.13*/("""{"""),format.raw/*81.14*/("""
				"""),format.raw/*82.5*/("""padding-top: 5em;
				padding-left: 10em;
				padding-right: 10em;
				padding-bottom: 5em;
			"""),format.raw/*86.4*/("""}"""),format.raw/*86.5*/("""

			"""),format.raw/*88.4*/(""".holder """),format.raw/*88.12*/("""{"""),format.raw/*88.13*/("""
				"""),format.raw/*89.5*/("""background-color: #7F8EBF;
				padding-top: 3em;
				padding-left: 7em;
				padding-right: 7em;
				padding-bottom: 2em;
				border-bottom-left-radius: 3em;
				border-bottom-right-radius: 1em;
				border-top-right-radius: 3em;
				border-top-left-radius: 1em;
				box-shadow: 0 0 4px 1px rgba(0, 0, 0, 0.3);
			"""),format.raw/*99.4*/("""}"""),format.raw/*99.5*/("""
			"""),format.raw/*100.4*/("""label """),format.raw/*100.10*/("""{"""),format.raw/*100.11*/("""
				"""),format.raw/*101.5*/("""color: white;
				font-family: 'Bitter', serif;
			"""),format.raw/*103.4*/("""}"""),format.raw/*103.5*/("""

			"""),format.raw/*105.4*/(""".fg2 """),format.raw/*105.9*/("""{"""),format.raw/*105.10*/("""
				"""),format.raw/*106.5*/("""padding-top: 1em;
			"""),format.raw/*107.4*/("""}"""),format.raw/*107.5*/("""
			"""),format.raw/*108.4*/(""".invalid-feedback """),format.raw/*108.22*/("""{"""),format.raw/*108.23*/("""
				"""),format.raw/*109.5*/("""color: orange;
				font-family: 'Source Sans Pro', sans-serif;
			"""),format.raw/*111.4*/("""}"""),format.raw/*111.5*/("""
	"""),format.raw/*112.2*/("""</style>

	<body>
	"""),_display_(/*115.3*/helper/*115.9*/.form(action= routes.RestaurantController.save())/*115.58*/ {_display_(Seq[Any](format.raw/*115.60*/("""

		"""),format.raw/*117.3*/("""<nav class="navbar fixed-top cnavbar-collapse collapse">
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
		<div class="container formdiv">
			<div class="holder">
				<form id="needs-validation" novalidate>

					<div class="form-row">
						<div class="col fg2">
						"""),_display_(/*150.8*/helper/*150.14*/.select(
							restaurantform("registration.registrationId"),
							options(owner.options),
							'_label -> "Registrations", '_default -> "-- Choose your Registration --",
							'_showConstraints -> false
						)),format.raw/*155.8*/("""
						"""),format.raw/*156.7*/("""</div>
					</div>

					<div class="form-row">
						<div class="col fg2">
							"""),_display_(/*161.9*/inputText(
								restaurantform("city"),
								'_showConstraints -> true,
								'type -> "text",
								'class -> "form-control",
								'id -> "city",
								'placeholder -> "City"
							)),format.raw/*168.9*/("""
							"""),format.raw/*169.8*/("""<div class="invalid-feedback">
								Please fill this field.
							</div>
						</div>
					</div>


					<div class="form-row">
						<div class="col fg2">
							"""),_display_(/*178.9*/inputText(
								restaurantform("pincode"),
								'_showConstraints -> true,
								'type -> "text",
								'class -> "form-control",
								'id -> "pincode",
								'placeholder -> "pincode"
							)),format.raw/*185.9*/("""
							"""),format.raw/*186.8*/("""<div class="invalid-feedback">
								Please fill this field.
							</div>
						</div>
					</div>

					<div class="form-row">
						<div class="col fg2">
							"""),_display_(/*194.9*/inputText(
								restaurantform("cost"),
								'_showConstraints -> true,
								'type -> "text",
								'class -> "form-control",
								'id -> "cost",
								'placeholder -> "Approx cost of Restaurant"
							)),format.raw/*201.9*/("""
							"""),format.raw/*202.8*/("""<div class="invalid-feedback">
								Please fill this field.
							</div>
						</div>
					</div>

					<div class="form-row">
						<div class="col fg2">
							"""),_display_(/*210.9*/inputText(
								restaurantform("name"),
								'_showConstraints -> true,
								'type -> "text",
								'class -> "form-control",
								'id -> "name",
								'placeholder -> "Name of the Restaurant"
							)),format.raw/*217.9*/("""
							"""),format.raw/*218.8*/("""<div class="invalid-feedback">
								Please fill this field.
							</div>
							
						</div>
					</div>

					<button type="submit" class="btn btn-success btn-block">Create Restaurant!</button>



				</form>
			</div>
		</div>
		<script>
				(function() """),format.raw/*233.17*/("""{"""),format.raw/*233.18*/("""
					"""),format.raw/*234.6*/("""'use strict';
					window.addEventListener('load', function() """),format.raw/*235.49*/("""{"""),format.raw/*235.50*/("""
						"""),format.raw/*236.7*/("""var form = document.getElementById('needs-validation');
						form.addEventListener('submit', function(event) """),format.raw/*237.55*/("""{"""),format.raw/*237.56*/("""
							"""),format.raw/*238.8*/("""if (form.checkValidity() === false) """),format.raw/*238.44*/("""{"""),format.raw/*238.45*/("""
								"""),format.raw/*239.9*/("""event.preventDefault();
								event.stopPropagation();
							"""),format.raw/*241.8*/("""}"""),format.raw/*241.9*/("""
							"""),format.raw/*242.8*/("""form.classList.add('was-validated');
						"""),format.raw/*243.7*/("""}"""),format.raw/*243.8*/(""", false);
					"""),format.raw/*244.6*/("""}"""),format.raw/*244.7*/(""", false);
				"""),format.raw/*245.5*/("""}"""),format.raw/*245.6*/(""")();
		</script>
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
	""")))}),format.raw/*270.3*/("""
	"""),format.raw/*271.2*/("""</body>
</html>


"""))
      }
    }
  }

  def render(restaurantform:Form[Restaurant],owner:Owner): play.twirl.api.HtmlFormat.Appendable = apply(restaurantform,owner)

  def f:((Form[Restaurant],Owner) => play.twirl.api.HtmlFormat.Appendable) = (restaurantform,owner) => apply(restaurantform,owner)

  def ref: this.type = this

}


}
}

/**/
object restaurantcreate extends restaurantcreate_Scope0.restaurantcreate_Scope1.restaurantcreate
              /*
                  -- GENERATED --
                  DATE: Fri Nov 30 20:41:44 EST 2018
                  SOURCE: C:/Users/hiten/OneDrive/Desktop/dATABSE PROJECT 5/Ag 4/RestaurantReview/app/views/restaurantcreate.scala.html
                  HASH: 4f214f609cc92077174439642db4ee8bd3539020
                  MATRIX: 838->23|981->71|1011->75|2207->1244|2222->1250|2293->1299|2657->1635|2686->1636|2719->1642|2764->1660|2792->1661|2824->1666|2866->1680|2895->1681|2928->1687|2993->1725|3021->1726|3053->1731|3095->1745|3124->1746|3157->1752|3229->1797|3257->1798|3291->1805|3323->1810|3352->1811|3385->1817|3430->1835|3458->1836|3490->1841|3541->1864|3570->1865|3603->1871|3733->1974|3761->1975|3793->1980|3829->1988|3858->1989|3891->1995|3963->2040|3991->2041|4023->2046|4065->2060|4094->2061|4127->2067|4229->2142|4257->2143|4289->2148|4327->2158|4356->2159|4389->2165|4491->2240|4519->2241|4551->2246|4600->2267|4629->2268|4662->2274|4756->2341|4784->2342|4818->2349|4861->2364|4890->2365|4923->2371|4981->2402|5009->2403|5041->2408|5081->2420|5110->2421|5143->2427|5245->2502|5273->2503|5305->2508|5347->2522|5376->2523|5409->2529|5454->2547|5482->2548|5516->2555|5553->2564|5582->2565|5615->2571|5741->2670|5769->2671|5803->2678|5839->2686|5868->2687|5901->2693|6250->3015|6278->3016|6311->3021|6346->3027|6376->3028|6410->3034|6491->3087|6520->3088|6555->3095|6588->3100|6618->3101|6652->3107|6702->3129|6731->3130|6764->3135|6811->3153|6841->3154|6875->3160|6971->3228|7000->3229|7031->3232|7081->3255|7096->3261|7155->3310|7196->3312|7230->3318|8544->4605|8560->4611|8803->4833|8839->4841|8955->4930|9182->5136|9219->5145|9423->5322|9659->5537|9696->5546|9898->5721|10146->5948|10183->5957|10385->6132|10630->6356|10667->6365|10972->6641|11002->6642|11037->6649|11129->6712|11159->6713|11195->6721|11335->6832|11365->6833|11402->6842|11467->6878|11497->6879|11535->6889|11629->6955|11658->6956|11695->6965|11767->7009|11796->7010|11840->7026|11869->7027|11912->7042|11941->7043|12811->7882|12842->7885
                  LINES: 30->4|35->4|37->6|51->20|51->20|51->20|59->28|59->28|60->29|61->30|61->30|62->31|62->31|62->31|63->32|65->34|65->34|66->35|66->35|66->35|67->36|69->38|69->38|71->40|71->40|71->40|72->41|73->42|73->42|74->43|74->43|74->43|75->44|79->48|79->48|80->49|80->49|80->49|81->50|83->52|83->52|84->53|84->53|84->53|85->54|88->57|88->57|89->58|89->58|89->58|90->59|93->62|93->62|94->63|94->63|94->63|95->64|97->66|97->66|99->68|99->68|99->68|100->69|102->71|102->71|103->72|103->72|103->72|104->73|107->76|107->76|108->77|108->77|108->77|109->78|110->79|110->79|112->81|112->81|112->81|113->82|117->86|117->86|119->88|119->88|119->88|120->89|130->99|130->99|131->100|131->100|131->100|132->101|134->103|134->103|136->105|136->105|136->105|137->106|138->107|138->107|139->108|139->108|139->108|140->109|142->111|142->111|143->112|146->115|146->115|146->115|146->115|148->117|181->150|181->150|186->155|187->156|192->161|199->168|200->169|209->178|216->185|217->186|225->194|232->201|233->202|241->210|248->217|249->218|264->233|264->233|265->234|266->235|266->235|267->236|268->237|268->237|269->238|269->238|269->238|270->239|272->241|272->241|273->242|274->243|274->243|275->244|275->244|276->245|276->245|301->270|302->271
                  -- GENERATED --
              */
          