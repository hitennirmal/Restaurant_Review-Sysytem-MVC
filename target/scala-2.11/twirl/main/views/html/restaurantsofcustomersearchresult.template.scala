
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object restaurantsofcustomersearchresult_Scope0 {
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

class restaurantsofcustomersearchresult extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Restaurant],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(restaurantsToShow: List[Restaurant]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.39*/("""

"""),format.raw/*5.1*/("""<html xmlns="http://www.w3.org/1999/html">
	<head>
		<title>Owner Registration</title>

			<!-- BOOTSTRAP CSS/JSS CDN -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/vivus/0.4.3/vivus.js" crossorigin="anonymous"></script>

			<!-- JQUERY AND POPPER CDN -->
		<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>

			<!-- Stylesheets and javascript -->
		<link rel="stylesheet" type='text/css' media="screen" href='"""),_display_(/*19.64*/routes/*19.70*/.Assets.versioned("stylesheets/registration.css")),format.raw/*19.119*/("""'>
		<link href="https://fonts.googleapis.com/css?family=PT+Sans" rel="stylesheet">
		<link href="https://fonts.googleapis.com/css?family=Bitter|City+Sans+Pro" rel="stylesheet">
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

			"""),format.raw/*80.4*/(""".formdiv """),format.raw/*80.13*/("""{"""),format.raw/*80.14*/("""
				"""),format.raw/*81.5*/("""padding-top: 5em;
				padding-left: 10em;
				padding-right: 10em;
				padding-bottom: 5em;
			"""),format.raw/*85.4*/("""}"""),format.raw/*85.5*/("""

			"""),format.raw/*87.4*/(""".holder """),format.raw/*87.12*/("""{"""),format.raw/*87.13*/("""
				"""),format.raw/*88.5*/("""background-color: #7F8EBF;
				padding-top: 3em;
				padding-left: 7em;
				padding-right: 7em;
				padding-bottom: 2em;
				border-bottom-left-radius: 3em;
				border-bottom-right-radius: 1em;
				border-top-right-radius: 3em;
				border-top-left-radius: 1em;
				box-shadow: 0 0 4px 1px rgba(0, 0, 0, 0.3);
			"""),format.raw/*98.4*/("""}"""),format.raw/*98.5*/("""
			"""),format.raw/*99.4*/("""label """),format.raw/*99.10*/("""{"""),format.raw/*99.11*/("""
				"""),format.raw/*100.5*/("""color: white;
				font-family: 'Bitter', serif;
			"""),format.raw/*102.4*/("""}"""),format.raw/*102.5*/("""

			"""),format.raw/*104.4*/(""".fg2 """),format.raw/*104.9*/("""{"""),format.raw/*104.10*/("""
				"""),format.raw/*105.5*/("""padding-top: 1em;
			"""),format.raw/*106.4*/("""}"""),format.raw/*106.5*/("""
			"""),format.raw/*107.4*/(""".invalid-feedback """),format.raw/*107.22*/("""{"""),format.raw/*107.23*/("""
				"""),format.raw/*108.5*/("""color: orange;
				font-family: 'City Sans Pro', sans-serif;
			"""),format.raw/*110.4*/("""}"""),format.raw/*110.5*/("""
	"""),format.raw/*111.2*/("""</style>

	<body>
	"""),_display_(/*114.3*/for(restaurantsToShow <- restaurantsToShow) yield /*114.46*/ {_display_(Seq[Any](format.raw/*114.48*/("""

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
		<div class="container formdiv">
			<div class="holder">
				<form id="needs-validation" novalidate>
					<div class="form-row">
						<p><a href=""""),_display_(/*147.20*/routes/*147.26*/.RestaurantController.rate(restaurantsToShow.restaurantId)),format.raw/*147.84*/("""">Rate this Restaurant</a></p>
					</div>

					<br class="form-row">
						<p>Restaurant City: """),_display_(/*151.28*/restaurantsToShow/*151.45*/.city),format.raw/*151.50*/("""</p></br>
					<p>Restaurant Pincode: """),_display_(/*152.30*/restaurantsToShow/*152.47*/.pincode),format.raw/*152.55*/("""</p></br>
					<p>Restaurant Name: """),_display_(/*153.27*/restaurantsToShow/*153.44*/.name),format.raw/*153.49*/("""</p>
					</div>
				</form>
			</div>
		</div>
		<script>
				(function() """),format.raw/*159.17*/("""{"""),format.raw/*159.18*/("""
					"""),format.raw/*160.6*/("""'use strict';
					window.addEventListener('load', function() """),format.raw/*161.49*/("""{"""),format.raw/*161.50*/("""
						"""),format.raw/*162.7*/("""var form = document.getElementById('needs-validation');
						form.addEventListener('submit', function(event) """),format.raw/*163.55*/("""{"""),format.raw/*163.56*/("""
							"""),format.raw/*164.8*/("""if (form.checkValidity() === false) """),format.raw/*164.44*/("""{"""),format.raw/*164.45*/("""
								"""),format.raw/*165.9*/("""event.preventDefault();
								event.stopPropagation();
							"""),format.raw/*167.8*/("""}"""),format.raw/*167.9*/("""
							"""),format.raw/*168.8*/("""form.classList.add('was-validated');
						"""),format.raw/*169.7*/("""}"""),format.raw/*169.8*/(""", false);
					"""),format.raw/*170.6*/("""}"""),format.raw/*170.7*/(""", false);
				"""),format.raw/*171.5*/("""}"""),format.raw/*171.6*/(""")();
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
	""")))}),format.raw/*196.3*/("""
	"""),format.raw/*197.2*/("""</body>
</html>"""))
      }
    }
  }

  def render(restaurantsToShow:List[Restaurant]): play.twirl.api.HtmlFormat.Appendable = apply(restaurantsToShow)

  def f:((List[Restaurant]) => play.twirl.api.HtmlFormat.Appendable) = (restaurantsToShow) => apply(restaurantsToShow)

  def ref: this.type = this

}


}

/**/
object restaurantsofcustomersearchresult extends restaurantsofcustomersearchresult_Scope0.restaurantsofcustomersearchresult
              /*
                  -- GENERATED --
                  DATE: Fri Nov 30 20:41:44 EST 2018
                  SOURCE: C:/Users/hiten/OneDrive/Desktop/dATABSE PROJECT 5/Ag 4/RestaurantReview/app/views/restaurantsofcustomersearchresult.scala.html
                  HASH: bd1da55da00cf50ecc3860e1c9ce8f3b1a344b6a
                  MATRIX: 811->3|943->40|971->42|2186->1230|2201->1236|2272->1285|2626->1611|2655->1612|2687->1617|2731->1634|2759->1635|2790->1639|2832->1653|2861->1654|2893->1659|2956->1695|2984->1696|3015->1700|3057->1714|3086->1715|3118->1720|3188->1763|3216->1764|3248->1769|3280->1774|3309->1775|3341->1780|3385->1797|3413->1798|3444->1802|3495->1825|3524->1826|3556->1831|3682->1930|3710->1931|3741->1935|3777->1943|3806->1944|3838->1949|3908->1992|3936->1993|3967->1997|4009->2011|4038->2012|4070->2017|4169->2089|4197->2090|4228->2094|4266->2104|4295->2105|4327->2110|4426->2182|4454->2183|4485->2187|4534->2208|4563->2209|4595->2214|4687->2279|4715->2280|4747->2285|4790->2300|4819->2301|4851->2306|4907->2335|4935->2336|4966->2340|5006->2352|5035->2353|5067->2358|5166->2430|5194->2431|5225->2435|5267->2449|5296->2450|5328->2455|5372->2472|5400->2473|5432->2478|5469->2487|5498->2488|5530->2493|5652->2588|5680->2589|5712->2594|5748->2602|5777->2603|5809->2608|6148->2920|6176->2921|6207->2925|6241->2931|6270->2932|6303->2937|6382->2988|6411->2989|6444->2994|6477->2999|6507->3000|6540->3005|6589->3026|6618->3027|6650->3031|6697->3049|6727->3050|6760->3055|6852->3119|6881->3120|6911->3122|6958->3142|7018->3185|7059->3187|7091->3191|8356->4428|8372->4434|8452->4492|8578->4590|8605->4607|8632->4612|8699->4651|8726->4668|8756->4676|8820->4712|8847->4729|8874->4734|8978->4809|9008->4810|9042->4816|9133->4878|9163->4879|9198->4886|9337->4996|9367->4997|9403->5005|9468->5041|9498->5042|9535->5051|9627->5115|9656->5116|9692->5124|9763->5167|9792->5168|9835->5183|9864->5184|9906->5198|9935->5199|10780->6013|10810->6015
                  LINES: 27->3|32->3|34->5|48->19|48->19|48->19|56->27|56->27|57->28|58->29|58->29|59->30|59->30|59->30|60->31|62->33|62->33|63->34|63->34|63->34|64->35|66->37|66->37|68->39|68->39|68->39|69->40|70->41|70->41|71->42|71->42|71->42|72->43|76->47|76->47|77->48|77->48|77->48|78->49|80->51|80->51|81->52|81->52|81->52|82->53|85->56|85->56|86->57|86->57|86->57|87->58|90->61|90->61|91->62|91->62|91->62|92->63|94->65|94->65|96->67|96->67|96->67|97->68|99->70|99->70|100->71|100->71|100->71|101->72|104->75|104->75|105->76|105->76|105->76|106->77|107->78|107->78|109->80|109->80|109->80|110->81|114->85|114->85|116->87|116->87|116->87|117->88|127->98|127->98|128->99|128->99|128->99|129->100|131->102|131->102|133->104|133->104|133->104|134->105|135->106|135->106|136->107|136->107|136->107|137->108|139->110|139->110|140->111|143->114|143->114|143->114|145->116|176->147|176->147|176->147|180->151|180->151|180->151|181->152|181->152|181->152|182->153|182->153|182->153|188->159|188->159|189->160|190->161|190->161|191->162|192->163|192->163|193->164|193->164|193->164|194->165|196->167|196->167|197->168|198->169|198->169|199->170|199->170|200->171|200->171|225->196|226->197
                  -- GENERATED --
              */
          