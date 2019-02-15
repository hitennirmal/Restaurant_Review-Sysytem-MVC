
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object ownershow_Scope0 {
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

class ownershow extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Owner,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(owner: Owner):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.16*/("""

"""),format.raw/*3.1*/("""<html>
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
		<link rel="stylesheet" type='text/css' media="screen" href='"""),_display_(/*18.64*/routes/*18.70*/.Assets.versioned("stylesheets/profile.css")),format.raw/*18.114*/("""'>
		<link href="https://fonts.googleapis.com/css?family=PT+Sans" rel="stylesheet">
		<link href="https://fonts.googleapis.com/css?family=Bitter|Source+Sans+Pro" rel="stylesheet">
		<link rel='stylesheet prefetch' href='http:////netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css'>

	</head>
	<style>

			.nav_text """),format.raw/*26.14*/("""{"""),format.raw/*26.15*/("""
				"""),format.raw/*27.5*/("""color: white;
			"""),format.raw/*28.4*/("""}"""),format.raw/*28.5*/("""
			"""),format.raw/*29.4*/(""".navbar-header"""),format.raw/*29.18*/("""{"""),format.raw/*29.19*/("""
				"""),format.raw/*30.5*/("""margin-left:5px;
				width:100%;
			"""),format.raw/*32.4*/("""}"""),format.raw/*32.5*/("""
			"""),format.raw/*33.4*/(""".navcontainer """),format.raw/*33.18*/("""{"""),format.raw/*33.19*/("""
				"""),format.raw/*34.5*/("""margin-left: 10%;
				margin-right: 5%;
			"""),format.raw/*36.4*/("""}"""),format.raw/*36.5*/("""

			"""),format.raw/*38.4*/("""body """),format.raw/*38.9*/("""{"""),format.raw/*38.10*/("""
				"""),format.raw/*39.5*/("""margin: auto;
			"""),format.raw/*40.4*/("""}"""),format.raw/*40.5*/("""
			"""),format.raw/*41.4*/(""".navbar, .navbar-fixed """),format.raw/*41.27*/("""{"""),format.raw/*41.28*/("""
				"""),format.raw/*42.5*/("""background-color: gray;
				opacity: .90;
				z-index: 99;
				box-shadow: 0 4px 2px -2px gray;
			"""),format.raw/*46.4*/("""}"""),format.raw/*46.5*/("""
			"""),format.raw/*47.4*/("""#navbar """),format.raw/*47.12*/("""{"""),format.raw/*47.13*/("""
				"""),format.raw/*48.5*/("""margin-left: 10%;
				margin-right: 5%;
			"""),format.raw/*50.4*/("""}"""),format.raw/*50.5*/("""
			"""),format.raw/*51.4*/(""".navbar-brand """),format.raw/*51.18*/("""{"""),format.raw/*51.19*/("""
				"""),format.raw/*52.5*/("""font-family: 'Bitter', serif;
				font-size: 22px;
				color: white;
			"""),format.raw/*55.4*/("""}"""),format.raw/*55.5*/("""
			"""),format.raw/*56.4*/(""".nav-link """),format.raw/*56.14*/("""{"""),format.raw/*56.15*/("""
				"""),format.raw/*57.5*/("""font-size: 16px;
				font-family: 'Bitter', serif;
				color: white;
			"""),format.raw/*60.4*/("""}"""),format.raw/*60.5*/("""
			"""),format.raw/*61.4*/("""nav.navbar.fixed-top """),format.raw/*61.25*/("""{"""),format.raw/*61.26*/("""
				"""),format.raw/*62.5*/("""padding: 0em;
				box-shadow: 0 0 4px 1px rgba(0, 0, 0, 0.3);
			"""),format.raw/*64.4*/("""}"""),format.raw/*64.5*/("""

			"""),format.raw/*66.4*/(""".navbar-footer """),format.raw/*66.19*/("""{"""),format.raw/*66.20*/("""
				"""),format.raw/*67.5*/("""background-color: white;

			"""),format.raw/*69.4*/("""}"""),format.raw/*69.5*/("""
			"""),format.raw/*70.4*/("""#footerlink """),format.raw/*70.16*/("""{"""),format.raw/*70.17*/("""
				"""),format.raw/*71.5*/("""font-size: 16px;
				font-family: 'Bitter', serif;
				color: black;
			"""),format.raw/*74.4*/("""}"""),format.raw/*74.5*/("""
			"""),format.raw/*75.4*/("""#bottom-brand """),format.raw/*75.18*/("""{"""),format.raw/*75.19*/("""
				"""),format.raw/*76.5*/("""color: black;
			"""),format.raw/*77.4*/("""}"""),format.raw/*77.5*/("""


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
				border-bottom-right-radius: 1em;
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
				<h1>Welcome, """),_display_(/*159.19*/owner/*159.24*/.firstName),format.raw/*159.34*/("""</h1>
				<hr>
				<h2>From here, you can add registration, create restaurant, and delete your account!</h2>
				<hr>
				<h3>Owner Information</h3>
				<p>Owner Id: """),_display_(/*164.19*/owner/*164.24*/.ownerId),format.raw/*164.32*/("""</p>
				<p>Owner First Name: """),_display_(/*165.27*/owner/*165.32*/.firstName),format.raw/*165.42*/("""</p>
				<p>Owner Last Name: """),_display_(/*166.26*/owner/*166.31*/.lastName),format.raw/*166.40*/("""</p>
				<hr>
				<div class="container">
					<a class="btn btn-success btn-block" href=""""),_display_(/*169.50*/routes/*169.56*/.RegistrationController.create()),format.raw/*169.88*/("""">Create a Registartion</a>
				</div>
				<hr>
				<div class="container">
					<a class="btn btn-success btn-block" href=""""),_display_(/*173.50*/routes/*173.56*/.RestaurantController.create()),format.raw/*173.86*/("""">Create a Restaurant</a>
				</div>
				<hr>
				<div class="container">
					<a class="btn btn-success btn-block" href=""""),_display_(/*177.50*/routes/*177.56*/.OwnerController.destroy(owner.ownerId)),format.raw/*177.95*/("""">Delete Account</a>
				</div>
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

  def render(owner:Owner): play.twirl.api.HtmlFormat.Appendable = apply(owner)

  def f:((Owner) => play.twirl.api.HtmlFormat.Appendable) = (owner) => apply(owner)

  def ref: this.type = this

}


}

/**/
object ownershow extends ownershow_Scope0.ownershow
              /*
                  -- GENERATED --
                  DATE: Fri Nov 30 20:41:44 EST 2018
                  SOURCE: C:/Users/hiten/OneDrive/Desktop/dATABSE PROJECT 5/Ag 4/RestaurantReview/app/views/ownershow.scala.html
                  HASH: 98148f7fb9c776783afe1264d182c9c629740bc5
                  MATRIX: 752->1|861->15|889->17|2064->1165|2079->1171|2145->1215|2501->1543|2530->1544|2562->1549|2606->1566|2634->1567|2665->1571|2707->1585|2736->1586|2768->1591|2831->1627|2859->1628|2890->1632|2932->1646|2961->1647|2993->1652|3063->1695|3091->1696|3123->1701|3155->1706|3184->1707|3216->1712|3260->1729|3288->1730|3319->1734|3370->1757|3399->1758|3431->1763|3557->1862|3585->1863|3616->1867|3652->1875|3681->1876|3713->1881|3783->1924|3811->1925|3842->1929|3884->1943|3913->1944|3945->1949|4044->2021|4072->2022|4103->2026|4141->2036|4170->2037|4202->2042|4301->2114|4329->2115|4360->2119|4409->2140|4438->2141|4470->2146|4562->2211|4590->2212|4622->2217|4665->2232|4694->2233|4726->2238|4782->2267|4810->2268|4841->2272|4881->2284|4910->2285|4942->2290|5041->2362|5069->2363|5100->2367|5142->2381|5171->2382|5203->2387|5247->2404|5275->2405|5308->2411|5345->2420|5374->2421|5406->2426|5528->2521|5556->2522|5587->2526|5623->2534|5652->2535|5684->2540|6023->2852|6051->2853|6082->2857|6112->2860|6140->2861|6172->2866|6251->2917|6280->2918|6312->2922|6343->2925|6372->2926|6405->2931|6520->3018|6549->3019|6581->3023|6612->3026|6641->3027|6674->3032|6774->3104|6803->3105|6835->3109|6865->3111|6894->3112|6927->3117|7020->3182|7049->3183|7081->3187|7126->3203|7156->3204|7189->3209|7236->3228|7265->3229|7297->3233|7354->3261|7384->3262|7417->3267|7462->3284|7491->3285|7522->3288|8728->4466|8743->4471|8775->4481|8970->4648|8985->4653|9015->4661|9074->4692|9089->4697|9121->4707|9179->4737|9194->4742|9225->4751|9344->4842|9360->4848|9414->4880|9567->5005|9583->5011|9635->5041|9786->5164|9802->5170|9863->5209
                  LINES: 27->1|32->1|34->3|49->18|49->18|49->18|57->26|57->26|58->27|59->28|59->28|60->29|60->29|60->29|61->30|63->32|63->32|64->33|64->33|64->33|65->34|67->36|67->36|69->38|69->38|69->38|70->39|71->40|71->40|72->41|72->41|72->41|73->42|77->46|77->46|78->47|78->47|78->47|79->48|81->50|81->50|82->51|82->51|82->51|83->52|86->55|86->55|87->56|87->56|87->56|88->57|91->60|91->60|92->61|92->61|92->61|93->62|95->64|95->64|97->66|97->66|97->66|98->67|100->69|100->69|101->70|101->70|101->70|102->71|105->74|105->74|106->75|106->75|106->75|107->76|108->77|108->77|111->80|111->80|111->80|112->81|116->85|116->85|117->86|117->86|117->86|118->87|128->97|128->97|129->98|129->98|129->98|130->99|132->101|132->101|133->102|133->102|133->102|134->103|138->107|138->107|139->108|139->108|139->108|140->109|143->112|143->112|144->113|144->113|144->113|145->114|147->116|147->116|148->117|148->117|148->117|149->118|150->119|150->119|151->120|151->120|151->120|152->121|153->122|153->122|155->124|190->159|190->159|190->159|195->164|195->164|195->164|196->165|196->165|196->165|197->166|197->166|197->166|200->169|200->169|200->169|204->173|204->173|204->173|208->177|208->177|208->177
                  -- GENERATED --
              */
          