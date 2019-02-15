
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object logincustomer_Scope0 {
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

     object logincustomer_Scope1 {
import helper._

class logincustomer extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Customer],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(customerform: Form[Customer]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.32*/("""

"""),format.raw/*5.1*/("""<html>
	<head>
		<title>Customer Login</title>

			<!-- BOOTSTRAP CSS/JSS CDN -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/vivus/0.4.3/vivus.js" crossorigin="anonymous"></script>

			<!-- JQUERY AND POPPER CDN -->
		<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>

			<!-- Stylesheets and javascript -->
		<link rel="stylesheet" type='text/css' media="screen" href='"""),_display_(/*19.64*/routes/*19.70*/.Assets.versioned("stylesheets/login.css")),format.raw/*19.112*/("""'>
		<link href="https://fonts.googleapis.com/css?family=PT+Sans" rel="stylesheet">
		<link href="https://fonts.googleapis.com/css?family=Bitter|Source+Sans+Pro" rel="stylesheet">
		<link rel='stylesheet prefetch' href='http:////netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css'>


	</head>
	<style>
			.nav_text """),format.raw/*27.14*/("""{"""),format.raw/*27.15*/("""
				"""),format.raw/*28.5*/("""color: white;
			"""),format.raw/*29.4*/("""}"""),format.raw/*29.5*/("""
			"""),format.raw/*30.4*/(""".navbar-header"""),format.raw/*30.18*/("""{"""),format.raw/*30.19*/("""
				"""),format.raw/*31.5*/("""margin-left:5px;
				width:100%;
			"""),format.raw/*33.4*/("""}"""),format.raw/*33.5*/("""
			"""),format.raw/*34.4*/(""".navcontainer """),format.raw/*34.18*/("""{"""),format.raw/*34.19*/("""
				"""),format.raw/*35.5*/("""margin-left: 10%;
				margin-right: 5%;
			"""),format.raw/*37.4*/("""}"""),format.raw/*37.5*/("""

			"""),format.raw/*39.4*/("""body """),format.raw/*39.9*/("""{"""),format.raw/*39.10*/("""
				"""),format.raw/*40.5*/("""margin: auto;
			"""),format.raw/*41.4*/("""}"""),format.raw/*41.5*/("""
			"""),format.raw/*42.4*/(""".navbar, .navbar-fixed """),format.raw/*42.27*/("""{"""),format.raw/*42.28*/("""
				"""),format.raw/*43.5*/("""background-color: gray;
				opacity: .90;
				z-index: 99;
				box-shadow: 0 4px 2px -2px gray;
			"""),format.raw/*47.4*/("""}"""),format.raw/*47.5*/("""
			"""),format.raw/*48.4*/("""#navbar """),format.raw/*48.12*/("""{"""),format.raw/*48.13*/("""
				"""),format.raw/*49.5*/("""margin-left: 10%;
				margin-right: 5%;
			"""),format.raw/*51.4*/("""}"""),format.raw/*51.5*/("""
			"""),format.raw/*52.4*/(""".navbar-brand """),format.raw/*52.18*/("""{"""),format.raw/*52.19*/("""
				"""),format.raw/*53.5*/("""font-family: 'Bitter', serif;
				font-size: 22px;
				color: white;
			"""),format.raw/*56.4*/("""}"""),format.raw/*56.5*/("""
			"""),format.raw/*57.4*/(""".nav-link """),format.raw/*57.14*/("""{"""),format.raw/*57.15*/("""
				"""),format.raw/*58.5*/("""font-size: 16px;
				font-family: 'Bitter', serif;
				color: white;
			"""),format.raw/*61.4*/("""}"""),format.raw/*61.5*/("""
			"""),format.raw/*62.4*/("""nav.navbar.fixed-top """),format.raw/*62.25*/("""{"""),format.raw/*62.26*/("""
				"""),format.raw/*63.5*/("""padding: 0em;
				box-shadow: 0 0 4px 1px rgba(0, 0, 0, 0.3);
			"""),format.raw/*65.4*/("""}"""),format.raw/*65.5*/("""

			"""),format.raw/*67.4*/(""".navbar-footer """),format.raw/*67.19*/("""{"""),format.raw/*67.20*/("""
				"""),format.raw/*68.5*/("""background-color: white;

			"""),format.raw/*70.4*/("""}"""),format.raw/*70.5*/("""
			"""),format.raw/*71.4*/("""#footerlink """),format.raw/*71.16*/("""{"""),format.raw/*71.17*/("""
				"""),format.raw/*72.5*/("""font-size: 16px;
				font-family: 'Bitter', serif;
				color: black;
			"""),format.raw/*75.4*/("""}"""),format.raw/*75.5*/("""
			"""),format.raw/*76.4*/("""#bottom-brand """),format.raw/*76.18*/("""{"""),format.raw/*76.19*/("""
				"""),format.raw/*77.5*/("""color: black;
			"""),format.raw/*78.4*/("""}"""),format.raw/*78.5*/("""

			"""),format.raw/*80.4*/(""".wrapper """),format.raw/*80.13*/("""{"""),format.raw/*80.14*/("""
				"""),format.raw/*81.5*/("""padding-top: 10em;
				padding-left: 16em;
				padding-right: 16em;
				padding-bottom: 5em;
			"""),format.raw/*85.4*/("""}"""),format.raw/*85.5*/("""
			"""),format.raw/*86.4*/(""".holder """),format.raw/*86.12*/("""{"""),format.raw/*86.13*/("""
				"""),format.raw/*87.5*/("""background-color: #7F8EBF;
				padding-top: 3em;
				padding-left: 9em;
				padding-right: 9em;
				padding-bottom: 2em;
				border-bottom-left-radius: 3em;
				border-bottom-right-radius: 1em;
				border-top-right-radius: 3em;
				border-top-left-radius: 1em;
				box-shadow: 0 0 4px 1px rgba(0, 0, 0, 0.3);
			"""),format.raw/*97.4*/("""}"""),format.raw/*97.5*/("""
			"""),format.raw/*98.4*/("""h2, label """),format.raw/*98.14*/("""{"""),format.raw/*98.15*/("""
				"""),format.raw/*99.5*/("""color: white;
				font-family: 'Source Sans Pro', sans-serif;

			"""),format.raw/*102.4*/("""}"""),format.raw/*102.5*/("""
			"""),format.raw/*103.4*/("""h1 """),format.raw/*103.7*/("""{"""),format.raw/*103.8*/("""
				"""),format.raw/*104.5*/("""color: white;
				font-family: 'Bitter', serif;
			"""),format.raw/*106.4*/("""}"""),format.raw/*106.5*/("""
	"""),format.raw/*107.2*/("""</style>

	<body>
	"""),_display_(/*110.3*/helper/*110.9*/.form(action= routes.CustomerController.validate())/*110.60*/ {_display_(Seq[Any](format.raw/*110.62*/("""

		"""),format.raw/*112.3*/("""<nav class="navbar fixed-top cnavbar-collapse collapse">
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
				<h1>Customer Login</h1>
				<hr>
				<h2>Welcome back! Let's find a restaurant.<br></h2>
				<hr>
				<form>
					<div class="form-group">
					"""),_display_(/*148.7*/inputText(
						customerform("email"),
						'_showConstraints -> true,
						'type -> "email",
						'class -> "form-control",
						'id -> "exampleFormControlInput1",
						'placeholder -> "Enter Email"
					)),format.raw/*155.7*/("""
					"""),format.raw/*156.6*/("""</div>
					<div class="form-group">
					"""),_display_(/*158.7*/inputText(
						customerform("password"),
						'_showConstraints -> true,
						'type -> "password",
						'class -> "form-control",
						'id -> "exampleInputPassword1",
						'placeholder -> "Password"
					)),format.raw/*165.7*/("""
					"""),format.raw/*166.6*/("""</div>
					<button type="submit" class="btn btn-primary btn-block btn-success">Customer Sign In!</button>
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
	""")))}),format.raw/*198.3*/("""
	"""),format.raw/*199.2*/("""</body>
</html>
"""))
      }
    }
  }

  def render(customerform:Form[Customer]): play.twirl.api.HtmlFormat.Appendable = apply(customerform)

  def f:((Form[Customer]) => play.twirl.api.HtmlFormat.Appendable) = (customerform) => apply(customerform)

  def ref: this.type = this

}


}
}

/**/
object logincustomer extends logincustomer_Scope0.logincustomer_Scope1.logincustomer
              /*
                  -- GENERATED --
                  DATE: Fri Nov 30 20:41:44 EST 2018
                  SOURCE: C:/Users/hiten/OneDrive/Desktop/dATABSE PROJECT 5/Ag 4/RestaurantReview/app/views/logincustomer.scala.html
                  HASH: 3b6fe7cfc2c49cad7b15c72de43b5192a8dbe765
                  MATRIX: 821->21|946->51|976->55|2165->1217|2180->1223|2244->1265|2608->1601|2637->1602|2670->1608|2715->1626|2743->1627|2775->1632|2817->1646|2846->1647|2879->1653|2944->1691|2972->1692|3004->1697|3046->1711|3075->1712|3108->1718|3180->1763|3208->1764|3242->1771|3274->1776|3303->1777|3336->1783|3381->1801|3409->1802|3441->1807|3492->1830|3521->1831|3554->1837|3684->1940|3712->1941|3744->1946|3780->1954|3809->1955|3842->1961|3914->2006|3942->2007|3974->2012|4016->2026|4045->2027|4078->2033|4180->2108|4208->2109|4240->2114|4278->2124|4307->2125|4340->2131|4442->2206|4470->2207|4502->2212|4551->2233|4580->2234|4613->2240|4707->2307|4735->2308|4769->2315|4812->2330|4841->2331|4874->2337|4932->2368|4960->2369|4992->2374|5032->2386|5061->2387|5094->2393|5196->2468|5224->2469|5256->2474|5298->2488|5327->2489|5360->2495|5405->2513|5433->2514|5467->2521|5504->2530|5533->2531|5566->2537|5693->2637|5721->2638|5753->2643|5789->2651|5818->2652|5851->2658|6200->2980|6228->2981|6260->2986|6298->2996|6327->2997|6360->3003|6457->3072|6486->3073|6519->3078|6550->3081|6579->3082|6613->3088|6694->3141|6723->3142|6754->3145|6804->3168|6819->3174|6880->3225|6921->3227|6955->3233|8314->4565|8554->4784|8589->4791|8661->4836|8901->5055|8936->5062|9938->6033|9969->6036
                  LINES: 30->3|35->3|37->5|51->19|51->19|51->19|59->27|59->27|60->28|61->29|61->29|62->30|62->30|62->30|63->31|65->33|65->33|66->34|66->34|66->34|67->35|69->37|69->37|71->39|71->39|71->39|72->40|73->41|73->41|74->42|74->42|74->42|75->43|79->47|79->47|80->48|80->48|80->48|81->49|83->51|83->51|84->52|84->52|84->52|85->53|88->56|88->56|89->57|89->57|89->57|90->58|93->61|93->61|94->62|94->62|94->62|95->63|97->65|97->65|99->67|99->67|99->67|100->68|102->70|102->70|103->71|103->71|103->71|104->72|107->75|107->75|108->76|108->76|108->76|109->77|110->78|110->78|112->80|112->80|112->80|113->81|117->85|117->85|118->86|118->86|118->86|119->87|129->97|129->97|130->98|130->98|130->98|131->99|134->102|134->102|135->103|135->103|135->103|136->104|138->106|138->106|139->107|142->110|142->110|142->110|142->110|144->112|180->148|187->155|188->156|190->158|197->165|198->166|230->198|231->199
                  -- GENERATED --
              */
          