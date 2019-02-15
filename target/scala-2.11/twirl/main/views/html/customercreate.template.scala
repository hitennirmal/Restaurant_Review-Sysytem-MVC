
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object customercreate_Scope0 {
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

     object customercreate_Scope1 {
import helper._

class customercreate extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Customer],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(customerform: Form[Customer]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.32*/("""

"""),format.raw/*5.1*/("""<html>
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
		<link href="https://fonts.googleapis.com/css?family=Bitter|Source+Sans+Pro" rel="stylesheet">
		<link rel='stylesheet prefetch' href='http:////netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css'>

	</head>

	<style>
            .nav_text """),format.raw/*27.23*/("""{"""),format.raw/*27.24*/("""
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
				font-family: 'Source Sans Pro', sans-serif;
			"""),format.raw/*110.4*/("""}"""),format.raw/*110.5*/("""
    """),format.raw/*111.5*/("""</style>

	<body>

	"""),_display_(/*115.3*/helper/*115.9*/.form(action= routes.CustomerController.save())/*115.56*/ {_display_(Seq[Any](format.raw/*115.58*/("""



		"""),format.raw/*119.3*/("""<nav class="navbar fixed-top cnavbar-collapse collapse">
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
						<a class="nav-link dropdown-toggle" data-toggle="dropdown"
						href=""""),_display_(/*137.14*/routes/*137.20*/.OwnerController.login()),format.raw/*137.44*/("""" role="button" aria-haspopup="true" aria-expanded="false">
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
								<!--                        <label for="firstname">First Name</label>    -->
							"""),_display_(/*153.9*/inputText(
								customerform("firstName"),
								'_showConstraints -> true,
								'type -> "text",
								'class -> "form-control",
								'id -> "firstName",
								'placeholder -> "First Name"
							)),format.raw/*160.9*/("""
							"""),format.raw/*161.8*/("""<div class="invalid-feedback">
								Please fill this field.
							</div>
						</div>
						<div class="col fg2">
								<!--                        <label for="lastname">Last Name</label>     -->
							"""),_display_(/*167.9*/inputText(
								customerform("lastName"),
								'_showConstraints -> true,
								'type -> "text",
								'class -> "form-control",
								'id -> "lastName",
								'placeholder -> "Last Name"
							)),format.raw/*174.9*/("""
							"""),format.raw/*175.8*/("""<div class="invalid-feedback">
								Please fill this field.
							</div>
						</div>
					</div>
					<div class="form-check form-check-inline">
						<label class="form-check-label">
						"""),_display_(/*182.8*/inputRadioGroup(
							customerform("gender"),
							options = Seq("M"->"Male","F"->"Female"),
							'_label -> "Gender",
							'_error -> customerform("gender").error.map(_.withMessage("select gender"))
						)),format.raw/*187.8*/("""
						"""),format.raw/*188.7*/("""</label>
					</div>
					<div class="form-group">
							<!--                        <label for="exampleFormControlInput1">Email address</label> -->
						"""),_display_(/*192.8*/inputText(
							customerform("email"),
							'_showConstraints -> true,
							'type -> "email",
							'class -> "form-control",
							'id -> "exampleFormControlInput1",
							'placeholder -> "name [at] example.com"
						)),format.raw/*199.8*/("""
						"""),format.raw/*200.7*/("""<div class="invalid-feedback">
							Please provide a valid email.
						</div>
					</div>
					<div class="form-group">
							<!--                    <label for="password">Password</label>      -->
						"""),_display_(/*206.8*/inputText(
							customerform("password"),
							'_showConstraints -> false,
							'label -> "",
							'type -> "password",
							'class -> "form-control",
							'id -> "password",
							'placeholder -> "abc123"
						)),format.raw/*214.8*/("""

						"""),format.raw/*216.7*/("""<div class="invalid-feedback">
							Please fill this field.
						</div>
					</div>
					<div class="form-group">
							<!--                   <label for="phonenumber">Phone Number</label>    -->
						"""),_display_(/*222.8*/inputText(
							customerform("phoneNumber"),
							'_showConstraints -> false,
							'type -> "phonenumber",
							'class -> "form-control",
							'id -> "phonenumber",
							'placeholder -> "(123)-456-7890"
						)),format.raw/*229.8*/("""

						"""),format.raw/*231.7*/("""<div class="invalid-feedback">
							Please provide a valid phone number.
						</div>
					</div>

					<button type="submit" class="btn btn-success btn-block">Insert Customer!</button>
				</form>
			</div>
		</div>
		<script>
				(function() """),format.raw/*241.17*/("""{"""),format.raw/*241.18*/("""
					"""),format.raw/*242.6*/("""'use strict';
					window.addEventListener('load', function() """),format.raw/*243.49*/("""{"""),format.raw/*243.50*/("""
						"""),format.raw/*244.7*/("""var form = document.getElementById('needs-validation');
						form.addEventListener('submit', function(event) """),format.raw/*245.55*/("""{"""),format.raw/*245.56*/("""
							"""),format.raw/*246.8*/("""if (form.checkValidity() === false) """),format.raw/*246.44*/("""{"""),format.raw/*246.45*/("""
								"""),format.raw/*247.9*/("""event.preventDefault();
								event.stopPropagation();
							"""),format.raw/*249.8*/("""}"""),format.raw/*249.9*/("""
							"""),format.raw/*250.8*/("""form.classList.add('was-validated');
						"""),format.raw/*251.7*/("""}"""),format.raw/*251.8*/(""", false);
					"""),format.raw/*252.6*/("""}"""),format.raw/*252.7*/(""", false);
				"""),format.raw/*253.5*/("""}"""),format.raw/*253.6*/(""")();
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
	""")))}),format.raw/*278.3*/("""
	"""),format.raw/*279.2*/("""</body>
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
object customercreate extends customercreate_Scope0.customercreate_Scope1.customercreate
              /*
                  -- GENERATED --
                  DATE: Fri Nov 30 20:41:44 EST 2018
                  SOURCE: C:/Users/hiten/OneDrive/Desktop/dATABSE PROJECT 5/Ag 4/RestaurantReview/app/views/customercreate.scala.html
                  HASH: 69c91cfb49d13a0962e25ea96ad6b848c7c2e1e4
                  MATRIX: 824->21|949->51|979->55|2172->1221|2187->1227|2258->1276|2631->1621|2660->1622|2693->1628|2738->1646|2766->1647|2798->1652|2840->1666|2869->1667|2902->1673|2967->1711|2995->1712|3027->1717|3069->1731|3098->1732|3131->1738|3203->1783|3231->1784|3265->1791|3297->1796|3326->1797|3359->1803|3404->1821|3432->1822|3464->1827|3515->1850|3544->1851|3577->1857|3707->1960|3735->1961|3767->1966|3803->1974|3832->1975|3865->1981|3937->2026|3965->2027|3997->2032|4039->2046|4068->2047|4101->2053|4203->2128|4231->2129|4263->2134|4301->2144|4330->2145|4363->2151|4465->2226|4493->2227|4525->2232|4574->2253|4603->2254|4636->2260|4730->2327|4758->2328|4792->2335|4835->2350|4864->2351|4897->2357|4955->2388|4983->2389|5015->2394|5055->2406|5084->2407|5117->2413|5219->2488|5247->2489|5279->2494|5321->2508|5350->2509|5383->2515|5428->2533|5456->2534|5490->2541|5527->2550|5556->2551|5589->2557|5715->2656|5743->2657|5777->2664|5813->2672|5842->2673|5875->2679|6224->3001|6252->3002|6284->3007|6318->3013|6347->3014|6381->3020|6462->3073|6491->3074|6526->3081|6559->3086|6589->3087|6623->3093|6673->3115|6702->3116|6735->3121|6782->3139|6812->3140|6846->3146|6942->3214|6971->3215|7005->3221|7057->3246|7072->3252|7129->3299|7170->3301|7208->3311|8135->4210|8151->4216|8197->4240|8762->4778|9003->4998|9040->5007|9283->5223|9521->5440|9558->5449|9788->5652|10029->5872|10065->5880|10253->6041|10510->6277|10546->6285|10788->6500|11043->6734|11081->6744|11321->6957|11571->7186|11609->7196|11894->7452|11924->7453|11959->7460|12051->7523|12081->7524|12117->7532|12257->7643|12287->7644|12324->7653|12389->7689|12419->7690|12457->7700|12551->7766|12580->7767|12617->7776|12689->7820|12718->7821|12762->7837|12791->7838|12834->7853|12863->7854|13733->8693|13764->8696
                  LINES: 30->3|35->3|37->5|51->19|51->19|51->19|59->27|59->27|60->28|61->29|61->29|62->30|62->30|62->30|63->31|65->33|65->33|66->34|66->34|66->34|67->35|69->37|69->37|71->39|71->39|71->39|72->40|73->41|73->41|74->42|74->42|74->42|75->43|79->47|79->47|80->48|80->48|80->48|81->49|83->51|83->51|84->52|84->52|84->52|85->53|88->56|88->56|89->57|89->57|89->57|90->58|93->61|93->61|94->62|94->62|94->62|95->63|97->65|97->65|99->67|99->67|99->67|100->68|102->70|102->70|103->71|103->71|103->71|104->72|107->75|107->75|108->76|108->76|108->76|109->77|110->78|110->78|112->80|112->80|112->80|113->81|117->85|117->85|119->87|119->87|119->87|120->88|130->98|130->98|131->99|131->99|131->99|132->100|134->102|134->102|136->104|136->104|136->104|137->105|138->106|138->106|139->107|139->107|139->107|140->108|142->110|142->110|143->111|147->115|147->115|147->115|147->115|151->119|169->137|169->137|169->137|185->153|192->160|193->161|199->167|206->174|207->175|214->182|219->187|220->188|224->192|231->199|232->200|238->206|246->214|248->216|254->222|261->229|263->231|273->241|273->241|274->242|275->243|275->243|276->244|277->245|277->245|278->246|278->246|278->246|279->247|281->249|281->249|282->250|283->251|283->251|284->252|284->252|285->253|285->253|310->278|311->279
                  -- GENERATED --
              */
          