
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object registrationcreate_Scope0 {
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

     object registrationcreate_Scope1 {
import helper._

class registrationcreate extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Registration],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(registrationform: Form[Registration]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.40*/("""

"""),format.raw/*7.1*/("""<html>
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
        <link rel="stylesheet" type='text/css' media="screen" href='"""),_display_(/*21.70*/routes/*21.76*/.Assets.versioned("stylesheets/registration.css")),format.raw/*21.125*/("""'>
        <link href="https://fonts.googleapis.com/css?family=PT+Sans" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Bitter|Source+Sans+Pro" rel="stylesheet">
        <link rel='stylesheet prefetch' href='http:////netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css'>

    </head>

    <style>
            .nav_text """),format.raw/*29.23*/("""{"""),format.raw/*29.24*/("""
                """),format.raw/*30.17*/("""color: white;
            """),format.raw/*31.13*/("""}"""),format.raw/*31.14*/("""
            """),format.raw/*32.13*/(""".navbar-header"""),format.raw/*32.27*/("""{"""),format.raw/*32.28*/("""
                """),format.raw/*33.17*/("""margin-left:5px;
                width:100%;
            """),format.raw/*35.13*/("""}"""),format.raw/*35.14*/("""
            """),format.raw/*36.13*/(""".navcontainer """),format.raw/*36.27*/("""{"""),format.raw/*36.28*/("""
                """),format.raw/*37.17*/("""margin-left: 10%;
                margin-right: 5%;
            """),format.raw/*39.13*/("""}"""),format.raw/*39.14*/("""

            """),format.raw/*41.13*/("""body """),format.raw/*41.18*/("""{"""),format.raw/*41.19*/("""
                """),format.raw/*42.17*/("""margin: auto;
            """),format.raw/*43.13*/("""}"""),format.raw/*43.14*/("""
            """),format.raw/*44.13*/(""".navbar, .navbar-fixed """),format.raw/*44.36*/("""{"""),format.raw/*44.37*/("""
                """),format.raw/*45.17*/("""background-color: gray;
                opacity: .90;
                z-index: 99;
                box-shadow: 0 4px 2px -2px gray;
            """),format.raw/*49.13*/("""}"""),format.raw/*49.14*/("""
            """),format.raw/*50.13*/("""#navbar """),format.raw/*50.21*/("""{"""),format.raw/*50.22*/("""
                """),format.raw/*51.17*/("""margin-left: 10%;
                margin-right: 5%;
            """),format.raw/*53.13*/("""}"""),format.raw/*53.14*/("""
            """),format.raw/*54.13*/(""".navbar-brand """),format.raw/*54.27*/("""{"""),format.raw/*54.28*/("""
                """),format.raw/*55.17*/("""font-family: 'Bitter', serif;
                font-size: 22px;
                color: white;
            """),format.raw/*58.13*/("""}"""),format.raw/*58.14*/("""
            """),format.raw/*59.13*/(""".nav-link """),format.raw/*59.23*/("""{"""),format.raw/*59.24*/("""
                """),format.raw/*60.17*/("""font-size: 16px;
                font-family: 'Bitter', serif;
                color: white;
            """),format.raw/*63.13*/("""}"""),format.raw/*63.14*/("""
            """),format.raw/*64.13*/("""nav.navbar.fixed-top """),format.raw/*64.34*/("""{"""),format.raw/*64.35*/("""
                """),format.raw/*65.17*/("""padding: 0em;
                box-shadow: 0 0 4px 1px rgba(0, 0, 0, 0.3);
            """),format.raw/*67.13*/("""}"""),format.raw/*67.14*/("""

            """),format.raw/*69.13*/(""".navbar-footer """),format.raw/*69.28*/("""{"""),format.raw/*69.29*/("""
                """),format.raw/*70.17*/("""background-color: white;

            """),format.raw/*72.13*/("""}"""),format.raw/*72.14*/("""
            """),format.raw/*73.13*/("""#footerlink """),format.raw/*73.25*/("""{"""),format.raw/*73.26*/("""
                """),format.raw/*74.17*/("""font-size: 16px;
                font-family: 'Bitter', serif;
                color: black;
            """),format.raw/*77.13*/("""}"""),format.raw/*77.14*/("""
            """),format.raw/*78.13*/("""#bottom-brand """),format.raw/*78.27*/("""{"""),format.raw/*78.28*/("""
                """),format.raw/*79.17*/("""color: black;
            """),format.raw/*80.13*/("""}"""),format.raw/*80.14*/("""

            """),format.raw/*82.13*/(""".formdiv """),format.raw/*82.22*/("""{"""),format.raw/*82.23*/("""
                """),format.raw/*83.17*/("""padding-top: 5em;
                padding-left: 10em;
                padding-right: 10em;
                padding-bottom: 5em;
            """),format.raw/*87.13*/("""}"""),format.raw/*87.14*/("""

            """),format.raw/*89.13*/(""".holder """),format.raw/*89.21*/("""{"""),format.raw/*89.22*/("""
                """),format.raw/*90.17*/("""background-color: #7F8EBF;
                padding-top: 3em;
                padding-left: 7em;
                padding-right: 7em;
                padding-bottom: 2em;
                border-bottom-left-radius: 3em;
                border-bottom-right-radius: 1em;
                border-top-right-radius: 3em;
                border-top-left-radius: 1em;
                box-shadow: 0 0 4px 1px rgba(0, 0, 0, 0.3);
            """),format.raw/*100.13*/("""}"""),format.raw/*100.14*/("""
            """),format.raw/*101.13*/("""label """),format.raw/*101.19*/("""{"""),format.raw/*101.20*/("""
                """),format.raw/*102.17*/("""color: white;
                font-family: 'Bitter', serif;
            """),format.raw/*104.13*/("""}"""),format.raw/*104.14*/("""

            """),format.raw/*106.13*/(""".fg2 """),format.raw/*106.18*/("""{"""),format.raw/*106.19*/("""
                """),format.raw/*107.17*/("""padding-top: 1em;
            """),format.raw/*108.13*/("""}"""),format.raw/*108.14*/("""
            """),format.raw/*109.13*/(""".invalid-feedback """),format.raw/*109.31*/("""{"""),format.raw/*109.32*/("""
                """),format.raw/*110.17*/("""color: orange;
                font-family: 'Source Sans Pro', sans-serif;
            """),format.raw/*112.13*/("""}"""),format.raw/*112.14*/("""
    """),format.raw/*113.5*/("""</style>

    <body>
    """),_display_(/*116.6*/helper/*116.12*/.form(action= routes.RegistrationController.save())/*116.63*/ {_display_(Seq[Any](format.raw/*116.65*/("""

        """),format.raw/*118.9*/("""<nav class="navbar fixed-top cnavbar-collapse collapse">
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
                            """),_display_(/*150.30*/inputText(
                                registrationform("registrationName"),
                                '_showConstraints -> true,
                                'type -> "text",
                                'class -> "form-control",
                                'id -> "registrationName",
                                'placeholder -> "Enter the Restaurant name here"
                            )),format.raw/*157.30*/("""
                            """),format.raw/*158.29*/("""<div class="invalid-feedback">
                                Please fill this field.
                            </div>
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="col fg2">
                            """),_display_(/*165.30*/inputText(
                                registrationform("registrationType"),
                                '_showConstraints -> true,
                                'type -> "text",
                                'class -> "form-control",
                                'id -> "registrationType",
                                'placeholder -> "Type of cuisine offered"
                            )),format.raw/*172.30*/("""
                            """),format.raw/*173.29*/("""<div class="invalid-feedback">
                                Please fill this field.
                            </div>
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="col fg2">
                            """),_display_(/*180.30*/inputText(
                                registrationform("registrationNumber"),
                                '_showConstraints -> true,
                                'type -> "text",
                                'class -> "form-control",
                                'id -> "registrationNumber",
                                'placeholder -> "Enter the number on which your restaurant is registered"
                            )),format.raw/*187.30*/("""
                            """),format.raw/*188.29*/("""<div class="invalid-feedback">
                                Please fill this field.
                            </div>
                        </div>
                    </div>
                    <button type="submit" class="btn btn-success btn-block">Create Registration!</button>
                </form>
            </div>
        </div>
        <script>
				(function() """),format.raw/*198.17*/("""{"""),format.raw/*198.18*/("""
                    """),format.raw/*199.21*/("""'use strict';
                    window.addEventListener('load', function() """),format.raw/*200.64*/("""{"""),format.raw/*200.65*/("""
                        """),format.raw/*201.25*/("""var form = document.getElementById('needs-validation');
                        form.addEventListener('submit', function(event) """),format.raw/*202.73*/("""{"""),format.raw/*202.74*/("""
                            """),format.raw/*203.29*/("""if (form.checkValidity() === false) """),format.raw/*203.65*/("""{"""),format.raw/*203.66*/("""
                                """),format.raw/*204.33*/("""event.preventDefault();
                                event.stopPropagation();
                            """),format.raw/*206.29*/("""}"""),format.raw/*206.30*/("""
                            """),format.raw/*207.29*/("""form.classList.add('was-validated');
                        """),format.raw/*208.25*/("""}"""),format.raw/*208.26*/(""", false);
                    """),format.raw/*209.21*/("""}"""),format.raw/*209.22*/(""", false);
                """),format.raw/*210.17*/("""}"""),format.raw/*210.18*/(""")();
		</script>
        <nav class="navbar cnavbar-collapse collapse fixed-bottom navbar-footer">
            <div class="container navcontainer">
                <a class="navbar-brand" id="bottom-brand" href="#">
					ResturantReview</a>
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
    """)))}),format.raw/*235.6*/("""
    """),format.raw/*236.5*/("""</body>
</html>


"""))
      }
    }
  }

  def render(registrationform:Form[Registration]): play.twirl.api.HtmlFormat.Appendable = apply(registrationform)

  def f:((Form[Registration]) => play.twirl.api.HtmlFormat.Appendable) = (registrationform) => apply(registrationform)

  def ref: this.type = this

}


}
}

/**/
object registrationcreate extends registrationcreate_Scope0.registrationcreate_Scope1.registrationcreate
              /*
                  -- GENERATED --
                  DATE: Fri Nov 30 20:41:44 EST 2018
                  SOURCE: C:/Users/hiten/OneDrive/Desktop/dATABSE PROJECT 5/Ag 4/RestaurantReview/app/views/registrationcreate.scala.html
                  HASH: 010ccdab09b25d82ab96ea09e3302975b5226fdd
                  MATRIX: 840->25|973->63|1003->67|2268->1305|2283->1311|2354->1360|2751->1729|2780->1730|2826->1748|2881->1775|2910->1776|2952->1790|2994->1804|3023->1805|3069->1823|3156->1882|3185->1883|3227->1897|3269->1911|3298->1912|3344->1930|3438->1996|3467->1997|3511->2013|3544->2018|3573->2019|3619->2037|3674->2064|3703->2065|3745->2079|3796->2102|3825->2103|3871->2121|4047->2269|4076->2270|4118->2284|4154->2292|4183->2293|4229->2311|4323->2377|4352->2378|4394->2392|4436->2406|4465->2407|4511->2425|4647->2533|4676->2534|4718->2548|4756->2558|4785->2559|4831->2577|4967->2685|4996->2686|5038->2700|5087->2721|5116->2722|5162->2740|5278->2828|5307->2829|5351->2845|5394->2860|5423->2861|5469->2879|5537->2919|5566->2920|5608->2934|5648->2946|5677->2947|5723->2965|5859->3073|5888->3074|5930->3088|5972->3102|6001->3103|6047->3121|6102->3148|6131->3149|6175->3165|6212->3174|6241->3175|6287->3193|6459->3337|6488->3338|6532->3354|6568->3362|6597->3363|6643->3381|7111->3820|7141->3821|7184->3835|7219->3841|7249->3842|7296->3860|7399->3934|7429->3935|7474->3951|7508->3956|7538->3957|7585->3975|7645->4006|7675->4007|7718->4021|7765->4039|7795->4040|7842->4058|7960->4147|7990->4148|8024->4154|8080->4183|8096->4189|8157->4240|8198->4242|8238->4254|10011->5999|10456->6422|10515->6452|10848->6757|11286->7173|11345->7203|11678->7508|12152->7960|12211->7990|12627->8377|12657->8378|12708->8400|12815->8478|12845->8479|12900->8505|13058->8634|13088->8635|13147->8665|13212->8701|13242->8702|13305->8736|13445->8847|13475->8848|13534->8878|13625->8940|13655->8941|13715->8972|13745->8973|13801->9000|13831->9001|15009->10148|15043->10154
                  LINES: 30->5|35->5|37->7|51->21|51->21|51->21|59->29|59->29|60->30|61->31|61->31|62->32|62->32|62->32|63->33|65->35|65->35|66->36|66->36|66->36|67->37|69->39|69->39|71->41|71->41|71->41|72->42|73->43|73->43|74->44|74->44|74->44|75->45|79->49|79->49|80->50|80->50|80->50|81->51|83->53|83->53|84->54|84->54|84->54|85->55|88->58|88->58|89->59|89->59|89->59|90->60|93->63|93->63|94->64|94->64|94->64|95->65|97->67|97->67|99->69|99->69|99->69|100->70|102->72|102->72|103->73|103->73|103->73|104->74|107->77|107->77|108->78|108->78|108->78|109->79|110->80|110->80|112->82|112->82|112->82|113->83|117->87|117->87|119->89|119->89|119->89|120->90|130->100|130->100|131->101|131->101|131->101|132->102|134->104|134->104|136->106|136->106|136->106|137->107|138->108|138->108|139->109|139->109|139->109|140->110|142->112|142->112|143->113|146->116|146->116|146->116|146->116|148->118|180->150|187->157|188->158|195->165|202->172|203->173|210->180|217->187|218->188|228->198|228->198|229->199|230->200|230->200|231->201|232->202|232->202|233->203|233->203|233->203|234->204|236->206|236->206|237->207|238->208|238->208|239->209|239->209|240->210|240->210|265->235|266->236
                  -- GENERATED --
              */
          