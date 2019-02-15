
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object restaurantsearchresult_Scope0 {
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

class restaurantsearchresult extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Restaurant],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(restaurantsToShow: List[Restaurant]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.39*/("""

"""),format.raw/*4.1*/("""<html>
	<head>
		<title>Owner Profile</title>


			<!-- BOOTSTRAP CSS/JSS CDN -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/vivus/0.4.3/vivus.js" crossorigin="anonymous"></script>

			<!-- JQUERY AND POPPER CDN -->
		<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>

			<!-- Stylesheets and javascript -->
		<link rel="stylesheet" type='text/css' media="screen" href='"""),_display_(/*19.64*/routes/*19.70*/.Assets.versioned("stylesheets/profile.css")),format.raw/*19.114*/("""'>
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
				"""),format.raw/*81.5*/("""padding-top: 2em;
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
				border-bottom-right-radius: 3em;
				border-top-right-radius: 3em;
				border-top-left-radius: 1em;
				box-shadow: 0 0 4px 1px rgba(0, 0, 0, 0.3);
			"""),format.raw/*97.4*/("""}"""),format.raw/*97.5*/("""
			"""),format.raw/*98.4*/("""h1 """),format.raw/*98.7*/("""{"""),format.raw/*98.8*/("""
				"""),format.raw/*99.5*/("""color: white;
				font-family: 'Bitter', serif;
			"""),format.raw/*101.4*/("""}"""),format.raw/*101.5*/("""
			"""),format.raw/*102.4*/("""h2 """),format.raw/*102.7*/("""{"""),format.raw/*102.8*/("""
				"""),format.raw/*103.5*/("""color: white;
				font-family: 'Source Sans Pro', sans-serif;
				font-size: 18px;

			"""),format.raw/*107.4*/("""}"""),format.raw/*107.5*/("""
			"""),format.raw/*108.4*/("""h3 """),format.raw/*108.7*/("""{"""),format.raw/*108.8*/("""
				"""),format.raw/*109.5*/("""color: white;
				font-family: 'Bitter', serif;
				font-size: 20px;
			"""),format.raw/*112.4*/("""}"""),format.raw/*112.5*/("""
			"""),format.raw/*113.4*/("""p """),format.raw/*113.6*/("""{"""),format.raw/*113.7*/("""
				"""),format.raw/*114.5*/("""color: white;
				font-family: 'Source Sans Pro', sans-serif;
			"""),format.raw/*116.4*/("""}"""),format.raw/*116.5*/("""
			"""),format.raw/*117.4*/(""".section-header """),format.raw/*117.20*/("""{"""),format.raw/*117.21*/("""
				"""),format.raw/*118.5*/("""font-size: 25px
			"""),format.raw/*119.4*/("""}"""),format.raw/*119.5*/("""
			"""),format.raw/*120.4*/("""a.btn.btn-success.btn-block """),format.raw/*120.32*/("""{"""),format.raw/*120.33*/("""
				"""),format.raw/*121.5*/("""color: white;
			"""),format.raw/*122.4*/("""}"""),format.raw/*122.5*/("""

	"""),format.raw/*124.2*/("""</style>

	<body>
		<nav class="navbar fixed-top cnavbar-collapse collapse">
			<div class="container navcontainer">
				<a class="navbar-brand" href="#!">
					<img src="https://openclipart.org/image/600px/svg_to_png/226091/Restaurant-Sign-Black.png" width="30" height="30" class="d-inline-block align-top" alt="">
					RestaurantReview</a>
				<ul class="nav">
					<li class="nav-item dropdown">
						<a class="nav-link dropdown-toggle" data-toggle="dropdown"
						href="#!" role="button" aria-haspopup="true" aria-expanded="false">
							Register</a>
						<div class="dropdown-menu">
							<a class="dropdown-item" href="#!">Owner</a>
							<a class="dropdown-item" href="#!">Customer</a>
						</div>
					</li>
					<li class="nav-item dropdown">
						<a class="nav-link dropdown-toggle" data-toggle="dropdown"
						href="#!" role="button" aria-haspopup="true" aria-expanded="false">
							Login</a>
						<div class="dropdown-menu">
							<a class="dropdown-item" href="#!">Owner</a>
							<a class="dropdown-item" href="#!">Customer</a>
						</div>
					</li>
				</ul>
			</div>
		</nav>




		<div class="wrapper">
			<div class="holder">
				<h1>Filtered restaurants</h1>
				"""),_display_(/*161.6*/for(restaurantsToShow <- restaurantsToShow) yield /*161.49*/{_display_(Seq[Any](format.raw/*161.50*/("""
					"""),format.raw/*162.6*/("""<p><a href=""""),_display_(/*162.19*/routes/*162.25*/.RestaurantController.register(restaurantsToShow.restaurantId)),format.raw/*162.87*/("""">Select this restaurant</a></p>
					<p>Restaurant City: """),_display_(/*163.27*/restaurantsToShow/*163.44*/.city),format.raw/*163.49*/("""</p>
					<p>Restaurant Pincode: """),_display_(/*164.30*/restaurantsToShow/*164.47*/.pincode),format.raw/*164.55*/("""</p>
					<p>Restaurant Name: """),_display_(/*165.27*/restaurantsToShow/*165.44*/.name),format.raw/*165.49*/("""</p>
					<p>Restaurant Cost: """),_display_(/*166.27*/restaurantsToShow/*166.44*/.cost),format.raw/*166.49*/("""</p>
					""")))}),format.raw/*167.7*/("""
			"""),format.raw/*168.4*/("""</div>
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
	</body>
</html>

"""))
      }
    }
  }

  def render(restaurantsToShow:List[Restaurant]): play.twirl.api.HtmlFormat.Appendable = apply(restaurantsToShow)

  def f:((List[Restaurant]) => play.twirl.api.HtmlFormat.Appendable) = (restaurantsToShow) => apply(restaurantsToShow)

  def ref: this.type = this

}


}

/**/
object restaurantsearchresult extends restaurantsearchresult_Scope0.restaurantsearchresult
              /*
                  -- GENERATED --
                  DATE: Fri Nov 30 20:41:44 EST 2018
                  SOURCE: C:/Users/hiten/OneDrive/Desktop/dATABSE PROJECT 5/Ag 4/RestaurantReview/app/views/restaurantsearchresult.scala.html
                  HASH: a78b7f9101d342eb95bfba497244967f6e813f46
                  MATRIX: 789->2|921->39|949->41|2124->1189|2139->1195|2205->1239|2561->1567|2590->1568|2622->1573|2666->1590|2694->1591|2725->1595|2767->1609|2796->1610|2828->1615|2891->1651|2919->1652|2950->1656|2992->1670|3021->1671|3053->1676|3123->1719|3151->1720|3183->1725|3215->1730|3244->1731|3276->1736|3320->1753|3348->1754|3379->1758|3430->1781|3459->1782|3491->1787|3617->1886|3645->1887|3676->1891|3712->1899|3741->1900|3773->1905|3843->1948|3871->1949|3902->1953|3944->1967|3973->1968|4005->1973|4104->2045|4132->2046|4163->2050|4201->2060|4230->2061|4262->2066|4361->2138|4389->2139|4420->2143|4469->2164|4498->2165|4530->2170|4622->2235|4650->2236|4682->2241|4725->2256|4754->2257|4786->2262|4842->2291|4870->2292|4901->2296|4941->2308|4970->2309|5002->2314|5101->2386|5129->2387|5160->2391|5202->2405|5231->2406|5263->2411|5307->2428|5335->2429|5367->2434|5404->2443|5433->2444|5465->2449|5587->2544|5615->2545|5646->2549|5682->2557|5711->2558|5743->2563|6082->2875|6110->2876|6141->2880|6171->2883|6199->2884|6231->2889|6310->2940|6339->2941|6371->2945|6402->2948|6431->2949|6464->2954|6579->3041|6608->3042|6640->3046|6671->3049|6700->3050|6733->3055|6833->3127|6862->3128|6894->3132|6924->3134|6953->3135|6986->3140|7079->3205|7108->3206|7140->3210|7185->3226|7215->3227|7248->3232|7295->3251|7324->3252|7356->3256|7413->3284|7443->3285|7476->3290|7521->3307|7550->3308|7581->3311|8808->4511|8868->4554|8908->4555|8942->4561|8983->4574|8999->4580|9083->4642|9170->4701|9197->4718|9224->4723|9286->4757|9313->4774|9343->4782|9402->4813|9429->4830|9456->4835|9515->4866|9542->4883|9569->4888|9611->4899|9643->4903
                  LINES: 27->2|32->2|34->4|49->19|49->19|49->19|57->27|57->27|58->28|59->29|59->29|60->30|60->30|60->30|61->31|63->33|63->33|64->34|64->34|64->34|65->35|67->37|67->37|69->39|69->39|69->39|70->40|71->41|71->41|72->42|72->42|72->42|73->43|77->47|77->47|78->48|78->48|78->48|79->49|81->51|81->51|82->52|82->52|82->52|83->53|86->56|86->56|87->57|87->57|87->57|88->58|91->61|91->61|92->62|92->62|92->62|93->63|95->65|95->65|97->67|97->67|97->67|98->68|100->70|100->70|101->71|101->71|101->71|102->72|105->75|105->75|106->76|106->76|106->76|107->77|108->78|108->78|110->80|110->80|110->80|111->81|115->85|115->85|116->86|116->86|116->86|117->87|127->97|127->97|128->98|128->98|128->98|129->99|131->101|131->101|132->102|132->102|132->102|133->103|137->107|137->107|138->108|138->108|138->108|139->109|142->112|142->112|143->113|143->113|143->113|144->114|146->116|146->116|147->117|147->117|147->117|148->118|149->119|149->119|150->120|150->120|150->120|151->121|152->122|152->122|154->124|191->161|191->161|191->161|192->162|192->162|192->162|192->162|193->163|193->163|193->163|194->164|194->164|194->164|195->165|195->165|195->165|196->166|196->166|196->166|197->167|198->168
                  -- GENERATED --
              */
          