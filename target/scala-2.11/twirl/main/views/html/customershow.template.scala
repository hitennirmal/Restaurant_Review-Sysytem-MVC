
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object customershow_Scope0 {
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

class customershow extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Customer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(customer: Customer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.22*/("""

"""),format.raw/*4.1*/("""<html>
	<head>
		<title>Customer Profile</title>


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

		.nav_text """),format.raw/*27.13*/("""{"""),format.raw/*27.14*/("""
			"""),format.raw/*28.4*/("""color: white;
		"""),format.raw/*29.3*/("""}"""),format.raw/*29.4*/("""
		"""),format.raw/*30.3*/(""".navbar-header"""),format.raw/*30.17*/("""{"""),format.raw/*30.18*/("""
			"""),format.raw/*31.4*/("""margin-left:5px;
			width:100%;
		"""),format.raw/*33.3*/("""}"""),format.raw/*33.4*/("""
		"""),format.raw/*34.3*/(""".navcontainer """),format.raw/*34.17*/("""{"""),format.raw/*34.18*/("""
			"""),format.raw/*35.4*/("""margin-left: 10%;
			margin-right: 5%;
		"""),format.raw/*37.3*/("""}"""),format.raw/*37.4*/("""

		"""),format.raw/*39.3*/("""body """),format.raw/*39.8*/("""{"""),format.raw/*39.9*/("""
			"""),format.raw/*40.4*/("""margin: auto;
		"""),format.raw/*41.3*/("""}"""),format.raw/*41.4*/("""
		"""),format.raw/*42.3*/(""".navbar, .navbar-fixed """),format.raw/*42.26*/("""{"""),format.raw/*42.27*/("""
			"""),format.raw/*43.4*/("""background-color: gray;
			opacity: .90;
			z-index: 99;
			box-shadow: 0 4px 2px -2px gray;
		"""),format.raw/*47.3*/("""}"""),format.raw/*47.4*/("""
		"""),format.raw/*48.3*/("""#navbar """),format.raw/*48.11*/("""{"""),format.raw/*48.12*/("""
			"""),format.raw/*49.4*/("""margin-left: 10%;
			margin-right: 5%;
		"""),format.raw/*51.3*/("""}"""),format.raw/*51.4*/("""
		"""),format.raw/*52.3*/(""".navbar-brand """),format.raw/*52.17*/("""{"""),format.raw/*52.18*/("""
			"""),format.raw/*53.4*/("""font-family: 'Bitter', serif;
			font-size: 22px;
			color: white;
		"""),format.raw/*56.3*/("""}"""),format.raw/*56.4*/("""
		"""),format.raw/*57.3*/(""".nav-link """),format.raw/*57.13*/("""{"""),format.raw/*57.14*/("""
			"""),format.raw/*58.4*/("""font-size: 16px;
			font-family: 'Bitter', serif;
			color: white;
		"""),format.raw/*61.3*/("""}"""),format.raw/*61.4*/("""
		"""),format.raw/*62.3*/("""nav.navbar.fixed-top """),format.raw/*62.24*/("""{"""),format.raw/*62.25*/("""
			"""),format.raw/*63.4*/("""padding: 0em;
			box-shadow: 0 0 4px 1px rgba(0, 0, 0, 0.3);
		"""),format.raw/*65.3*/("""}"""),format.raw/*65.4*/("""

		"""),format.raw/*67.3*/(""".navbar-footer """),format.raw/*67.18*/("""{"""),format.raw/*67.19*/("""
			"""),format.raw/*68.4*/("""background-color: white;

		"""),format.raw/*70.3*/("""}"""),format.raw/*70.4*/("""
		"""),format.raw/*71.3*/("""#footerlink """),format.raw/*71.15*/("""{"""),format.raw/*71.16*/("""
			"""),format.raw/*72.4*/("""font-size: 16px;
			font-family: 'Bitter', serif;
			color: black;
		"""),format.raw/*75.3*/("""}"""),format.raw/*75.4*/("""
		"""),format.raw/*76.3*/("""#bottom-brand """),format.raw/*76.17*/("""{"""),format.raw/*76.18*/("""
			"""),format.raw/*77.4*/("""color: black;
		"""),format.raw/*78.3*/("""}"""),format.raw/*78.4*/("""


		"""),format.raw/*81.3*/(""".wrapper """),format.raw/*81.12*/("""{"""),format.raw/*81.13*/("""
			"""),format.raw/*82.4*/("""padding-top: 7em;
			padding-left: 16em;
			padding-right: 16em;
			padding-bottom: 5em;
		"""),format.raw/*86.3*/("""}"""),format.raw/*86.4*/("""
		"""),format.raw/*87.3*/(""".holder """),format.raw/*87.11*/("""{"""),format.raw/*87.12*/("""
			"""),format.raw/*88.4*/("""background-color: #7F8EBF;
			padding-top: 3em;
			padding-left: 9em;
			padding-right: 9em;
			padding-bottom: 2em;
			border-bottom-left-radius: 3em;
			border-bottom-right-radius: 1em;
			border-top-right-radius: 3em;
			border-top-left-radius: 1em;
			box-shadow: 0 0 4px 1px rgba(0, 0, 0, 0.3);
		"""),format.raw/*98.3*/("""}"""),format.raw/*98.4*/("""
		"""),format.raw/*99.3*/("""h1 """),format.raw/*99.6*/("""{"""),format.raw/*99.7*/("""
			"""),format.raw/*100.4*/("""color: white;
			font-family: 'Bitter', serif;
		"""),format.raw/*102.3*/("""}"""),format.raw/*102.4*/("""
		"""),format.raw/*103.3*/("""h2 """),format.raw/*103.6*/("""{"""),format.raw/*103.7*/("""
			"""),format.raw/*104.4*/("""color: white;
			font-family: 'Source Sans Pro', sans-serif;
			font-size: 18px;

		"""),format.raw/*108.3*/("""}"""),format.raw/*108.4*/("""
		"""),format.raw/*109.3*/("""h3 """),format.raw/*109.6*/("""{"""),format.raw/*109.7*/("""
			"""),format.raw/*110.4*/("""color: white;
			font-family: 'Bitter', serif;
			font-size: 20px;
		"""),format.raw/*113.3*/("""}"""),format.raw/*113.4*/("""
		"""),format.raw/*114.3*/("""p """),format.raw/*114.5*/("""{"""),format.raw/*114.6*/("""
			"""),format.raw/*115.4*/("""color: white;
			font-family: 'Source Sans Pro', sans-serif;
		"""),format.raw/*117.3*/("""}"""),format.raw/*117.4*/("""
		"""),format.raw/*118.3*/(""".section-header """),format.raw/*118.19*/("""{"""),format.raw/*118.20*/("""
			"""),format.raw/*119.4*/("""font-size: 25px
		"""),format.raw/*120.3*/("""}"""),format.raw/*120.4*/("""
		"""),format.raw/*121.3*/("""a.btn.btn-success.btn-block """),format.raw/*121.31*/("""{"""),format.raw/*121.32*/("""
			"""),format.raw/*122.4*/("""color: white;
		"""),format.raw/*123.3*/("""}"""),format.raw/*123.4*/("""

"""),format.raw/*125.1*/("""</style>

	<body>

		<nav class="navbar fixed-top cnavbar-collapse collapse">
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
			<div class="holder">
				<h1>Welcome, """),_display_(/*161.19*/customer/*161.27*/.firstName),format.raw/*161.37*/("""</h1>
				<hr>
				<h2>From here, you can view your account information and delete your account.</h2>
				<hr>
				<h3>Customer Information</h3>
				<p>Customer Id: """),_display_(/*166.22*/customer/*166.30*/.customerId),format.raw/*166.41*/("""</p>
				<p>Customer First Name: """),_display_(/*167.30*/customer/*167.38*/.firstName),format.raw/*167.48*/("""</p>
				<p>Customer Last Name: """),_display_(/*168.29*/customer/*168.37*/.lastName),format.raw/*168.46*/("""</p>
				<hr>

				<div class="container">
					<a class="btn btn-success btn-block" href=""""),_display_(/*172.50*/routes/*172.56*/.RestaurantController.search()),format.raw/*172.86*/("""">Search Restaurant</a>
				</div></br>

				<div class="container">
					<a class="btn btn-success btn-block" href=""""),_display_(/*176.50*/routes/*176.56*/.CustomerController.showRestaurants(customer.customerId)),format.raw/*176.112*/("""">Show Restaurants</a>
				</div></br>

				<div class="container">
					<a class="btn btn-success btn-block" href=""""),_display_(/*180.50*/routes/*180.56*/.CustomerController.destroy(customer.customerId)),format.raw/*180.104*/("""">Delete Account</a>
				</div></br>
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
	</body>
</html>
"""))
      }
    }
  }

  def render(customer:Customer): play.twirl.api.HtmlFormat.Appendable = apply(customer)

  def f:((Customer) => play.twirl.api.HtmlFormat.Appendable) = (customer) => apply(customer)

  def ref: this.type = this

}


}

/**/
object customershow extends customershow_Scope0.customershow
              /*
                  -- GENERATED --
                  DATE: Fri Nov 30 20:41:44 EST 2018
                  SOURCE: C:/Users/hiten/OneDrive/Desktop/dATABSE PROJECT 5/Ag 4/RestaurantReview/app/views/customershow.scala.html
                  HASH: 4d79d8cf0767fa9dafad2f1a8f02793461f285be
                  MATRIX: 761->3|876->23|906->27|2099->1193|2114->1199|2180->1243|2543->1578|2572->1579|2604->1584|2648->1601|2676->1602|2707->1606|2749->1620|2778->1621|2810->1626|2873->1662|2901->1663|2932->1667|2974->1681|3003->1682|3035->1687|3105->1730|3133->1731|3166->1737|3198->1742|3226->1743|3258->1748|3302->1765|3330->1766|3361->1770|3412->1793|3441->1794|3473->1799|3599->1898|3627->1899|3658->1903|3694->1911|3723->1912|3755->1917|3825->1960|3853->1961|3884->1965|3926->1979|3955->1980|3987->1985|4086->2057|4114->2058|4145->2062|4183->2072|4212->2073|4244->2078|4343->2150|4371->2151|4402->2155|4451->2176|4480->2177|4512->2182|4604->2247|4632->2248|4665->2254|4708->2269|4737->2270|4769->2275|4826->2305|4854->2306|4885->2310|4925->2322|4954->2323|4986->2328|5085->2400|5113->2401|5144->2405|5186->2419|5215->2420|5247->2425|5291->2442|5319->2443|5354->2451|5391->2460|5420->2461|5452->2466|5574->2561|5602->2562|5633->2566|5669->2574|5698->2575|5730->2580|6069->2892|6097->2893|6128->2897|6158->2900|6186->2901|6219->2906|6298->2957|6327->2958|6359->2962|6390->2965|6419->2966|6452->2971|6568->3059|6597->3060|6629->3064|6660->3067|6689->3068|6722->3073|6822->3145|6851->3146|6883->3150|6913->3152|6942->3153|6975->3158|7068->3223|7097->3224|7129->3228|7174->3244|7204->3245|7237->3250|7284->3269|7313->3270|7345->3274|7402->3302|7432->3303|7465->3308|7510->3325|7539->3326|7571->3330|8811->4542|8829->4550|8861->4560|9060->4731|9078->4739|9111->4750|9174->4785|9192->4793|9224->4803|9286->4837|9304->4845|9335->4854|9459->4950|9475->4956|9527->4986|9677->5108|9693->5114|9772->5170|9921->5291|9937->5297|10008->5345
                  LINES: 27->2|32->2|34->4|49->19|49->19|49->19|57->27|57->27|58->28|59->29|59->29|60->30|60->30|60->30|61->31|63->33|63->33|64->34|64->34|64->34|65->35|67->37|67->37|69->39|69->39|69->39|70->40|71->41|71->41|72->42|72->42|72->42|73->43|77->47|77->47|78->48|78->48|78->48|79->49|81->51|81->51|82->52|82->52|82->52|83->53|86->56|86->56|87->57|87->57|87->57|88->58|91->61|91->61|92->62|92->62|92->62|93->63|95->65|95->65|97->67|97->67|97->67|98->68|100->70|100->70|101->71|101->71|101->71|102->72|105->75|105->75|106->76|106->76|106->76|107->77|108->78|108->78|111->81|111->81|111->81|112->82|116->86|116->86|117->87|117->87|117->87|118->88|128->98|128->98|129->99|129->99|129->99|130->100|132->102|132->102|133->103|133->103|133->103|134->104|138->108|138->108|139->109|139->109|139->109|140->110|143->113|143->113|144->114|144->114|144->114|145->115|147->117|147->117|148->118|148->118|148->118|149->119|150->120|150->120|151->121|151->121|151->121|152->122|153->123|153->123|155->125|191->161|191->161|191->161|196->166|196->166|196->166|197->167|197->167|197->167|198->168|198->168|198->168|202->172|202->172|202->172|206->176|206->176|206->176|210->180|210->180|210->180
                  -- GENERATED --
              */
          