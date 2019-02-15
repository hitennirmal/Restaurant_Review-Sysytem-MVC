
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object ownercreate_Scope0 {
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

     object ownercreate_Scope1 {
import helper._

class ownercreate extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Owner],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(ownerform: Form[Owner]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.26*/("""

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
        <link rel="stylesheet" type='text/css' media="screen" href='"""),_display_(/*19.70*/routes/*19.76*/.Assets.versioned("stylesheets/registration.css")),format.raw/*19.125*/("""'>
        <link href="https://fonts.googleapis.com/css?family=PT+Sans" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Bitter|Source+Sans+Pro" rel="stylesheet">
        <link rel='stylesheet prefetch' href='http:////netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css'>

    </head>

    <style>
            .nav_text """),format.raw/*27.23*/("""{"""),format.raw/*27.24*/("""
                """),format.raw/*28.17*/("""color: white;
            """),format.raw/*29.13*/("""}"""),format.raw/*29.14*/("""
            """),format.raw/*30.13*/(""".navbar-header"""),format.raw/*30.27*/("""{"""),format.raw/*30.28*/("""
                """),format.raw/*31.17*/("""margin-left:5px;
                width:100%;
            """),format.raw/*33.13*/("""}"""),format.raw/*33.14*/("""
            """),format.raw/*34.13*/(""".navcontainer """),format.raw/*34.27*/("""{"""),format.raw/*34.28*/("""
                """),format.raw/*35.17*/("""margin-left: 10%;
                margin-right: 5%;
            """),format.raw/*37.13*/("""}"""),format.raw/*37.14*/("""

            """),format.raw/*39.13*/("""body """),format.raw/*39.18*/("""{"""),format.raw/*39.19*/("""
                """),format.raw/*40.17*/("""margin: auto;
            """),format.raw/*41.13*/("""}"""),format.raw/*41.14*/("""
            """),format.raw/*42.13*/(""".navbar, .navbar-fixed """),format.raw/*42.36*/("""{"""),format.raw/*42.37*/("""
                """),format.raw/*43.17*/("""background-color: gray;
                opacity: .90;
                z-index: 99;
                box-shadow: 0 4px 2px -2px gray;
            """),format.raw/*47.13*/("""}"""),format.raw/*47.14*/("""
            """),format.raw/*48.13*/("""#navbar """),format.raw/*48.21*/("""{"""),format.raw/*48.22*/("""
                """),format.raw/*49.17*/("""margin-left: 10%;
                margin-right: 5%;
            """),format.raw/*51.13*/("""}"""),format.raw/*51.14*/("""
            """),format.raw/*52.13*/(""".navbar-brand """),format.raw/*52.27*/("""{"""),format.raw/*52.28*/("""
                """),format.raw/*53.17*/("""font-family: 'Bitter', serif;
                font-size: 22px;
                color: white;
            """),format.raw/*56.13*/("""}"""),format.raw/*56.14*/("""
            """),format.raw/*57.13*/(""".nav-link """),format.raw/*57.23*/("""{"""),format.raw/*57.24*/("""
                """),format.raw/*58.17*/("""font-size: 16px;
                font-family: 'Bitter', serif;
                color: white;
            """),format.raw/*61.13*/("""}"""),format.raw/*61.14*/("""
            """),format.raw/*62.13*/("""nav.navbar.fixed-top """),format.raw/*62.34*/("""{"""),format.raw/*62.35*/("""
                """),format.raw/*63.17*/("""padding: 0em;
                box-shadow: 0 0 4px 1px rgba(0, 0, 0, 0.3);
            """),format.raw/*65.13*/("""}"""),format.raw/*65.14*/("""

            """),format.raw/*67.13*/(""".navbar-footer """),format.raw/*67.28*/("""{"""),format.raw/*67.29*/("""
                """),format.raw/*68.17*/("""background-color: white;

            """),format.raw/*70.13*/("""}"""),format.raw/*70.14*/("""
            """),format.raw/*71.13*/("""#footerlink """),format.raw/*71.25*/("""{"""),format.raw/*71.26*/("""
                """),format.raw/*72.17*/("""font-size: 16px;
                font-family: 'Bitter', serif;
                color: black;
            """),format.raw/*75.13*/("""}"""),format.raw/*75.14*/("""
            """),format.raw/*76.13*/("""#bottom-brand """),format.raw/*76.27*/("""{"""),format.raw/*76.28*/("""
                """),format.raw/*77.17*/("""color: black;
            """),format.raw/*78.13*/("""}"""),format.raw/*78.14*/("""

            """),format.raw/*80.13*/(""".formdiv """),format.raw/*80.22*/("""{"""),format.raw/*80.23*/("""
                """),format.raw/*81.17*/("""padding-top: 5em;
                padding-left: 10em;
                padding-right: 10em;
                padding-bottom: 5em;
            """),format.raw/*85.13*/("""}"""),format.raw/*85.14*/("""

            """),format.raw/*87.13*/(""".holder """),format.raw/*87.21*/("""{"""),format.raw/*87.22*/("""
                """),format.raw/*88.17*/("""background-color: #7F8EBF;
                padding-top: 3em;
                padding-left: 7em;
                padding-right: 7em;
                padding-bottom: 2em;
                border-bottom-left-radius: 3em;
                border-bottom-right-radius: 1em;
                border-top-right-radius: 3em;
                border-top-left-radius: 1em;
                box-shadow: 0 0 4px 1px rgba(0, 0, 0, 0.3);
            """),format.raw/*98.13*/("""}"""),format.raw/*98.14*/("""
            """),format.raw/*99.13*/("""label """),format.raw/*99.19*/("""{"""),format.raw/*99.20*/("""
                """),format.raw/*100.17*/("""color: white;
                font-family: 'Bitter', serif;
            """),format.raw/*102.13*/("""}"""),format.raw/*102.14*/("""

            """),format.raw/*104.13*/(""".fg2 """),format.raw/*104.18*/("""{"""),format.raw/*104.19*/("""
                """),format.raw/*105.17*/("""padding-top: 1em;
            """),format.raw/*106.13*/("""}"""),format.raw/*106.14*/("""
            """),format.raw/*107.13*/(""".invalid-feedback """),format.raw/*107.31*/("""{"""),format.raw/*107.32*/("""
                """),format.raw/*108.17*/("""color: orange;
                font-family: 'Source Sans Pro', sans-serif;
            """),format.raw/*110.13*/("""}"""),format.raw/*110.14*/("""
    """),format.raw/*111.5*/("""</style>

    <body>
        """),_display_(/*114.10*/helper/*114.16*/.form(action= routes.OwnerController.save())/*114.60*/ {_display_(Seq[Any](format.raw/*114.62*/("""



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
                        <a class="nav-link dropdown-toggle" data-toggle="dropdown"
                        href=""""),_display_(/*136.32*/routes/*136.38*/.OwnerController.login()),format.raw/*136.62*/("""" role="button" aria-haspopup="true" aria-expanded="false">
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
                            """),_display_(/*152.30*/inputText(
                                ownerform("firstName"),
                                '_showConstraints -> true,
                                'type -> "text",
                                'class -> "form-control",
                                'id -> "firstName",
                                'placeholder -> "First Name"
                            )),format.raw/*159.30*/("""
                            """),format.raw/*160.29*/("""<div class="invalid-feedback">
                                Please fill this field.
                            </div>
                        </div>
                        <div class="col fg2">
<!--                        <label for="lastname">Last Name</label>     -->
                            """),_display_(/*166.30*/inputText(
                                ownerform("lastName"),
                                '_showConstraints -> true,
                                'type -> "text",
                                'class -> "form-control",
                                'id -> "lastName",
                                'placeholder -> "Last Name"
                            )),format.raw/*173.30*/("""
                            """),format.raw/*174.29*/("""<div class="invalid-feedback">
                                Please fill this field.
                            </div>
                        </div>
                    </div>
                    <div class="form-check form-check-inline">
                        <label class="form-check-label">
                            """),_display_(/*181.30*/inputRadioGroup(
                                ownerform("gender"),
                                options = Seq("M"->"Male","F"->"Female"),
                                '_label -> "Gender",
                                '_error -> ownerform("gender").error.map(_.withMessage("select gender"))
                            )),format.raw/*186.30*/("""
                        """),format.raw/*187.25*/("""</label>
                    </div>
                    <div class="form-group">
                            <!--                        <label for="exampleFormControlInput1">Email address</label> -->
                        """),_display_(/*191.26*/inputText(
                            ownerform("email"),
                            '_showConstraints -> true,
                            'type -> "email",
                            'class -> "form-control",
                            'id -> "exampleFormControlInput1",
                            'placeholder -> "name [at] example.com"
                        )),format.raw/*198.26*/("""
                        """),format.raw/*199.25*/("""<div class="invalid-feedback">
                            Please provide a valid email.
                        </div>
                    </div>
                    <div class="form-group">
<!--                    <label for="password">Password</label>      -->
                        """),_display_(/*205.26*/inputText(
                            ownerform("password"),
                            '_showConstraints -> false,
                            'label -> "",
                            'type -> "password",
                            'class -> "form-control",
                            'id -> "password",
                            'placeholder -> "abc123"
                        )),format.raw/*213.26*/("""

                        """),format.raw/*215.25*/("""<div class="invalid-feedback">
                            Please fill this field.
                        </div>
                    </div>
                    <div class="form-group">
<!--                   <label for="phonenumber">Phone Number</label>    -->
                        """),_display_(/*221.26*/inputText(
                            ownerform("phoneNumber"),
                            '_showConstraints -> false,
                            'type -> "phonenumber",
                            'class -> "form-control",
                            'id -> "phonenumber",
                            'placeholder -> "(123)-456-7890"
                        )),format.raw/*228.26*/("""

                        """),format.raw/*230.25*/("""<div class="invalid-feedback">
                            Please provide a valid phone number.
                        </div>
                    </div>
                    <div class="form-group">
<!--                    <label for="">City</label>   -->
                        """),_display_(/*236.26*/inputText(
                            ownerform("city"),
                            '_showConstraints -> true,
                            'type -> "text",
                            'class -> "form-control",
                            'id -> "dLnumber",
                            'placeholder -> "abcdefg123456"
                        )),format.raw/*243.26*/("""
                        """),format.raw/*244.25*/("""<div class="invalid-feedback">
                            Please provide a valid city name.
                        </div>
                    </div>
                    <button type="submit" class="btn btn-success btn-block">Register</button>
                </form>
            </div>
        </div>
        <script>
                (function() """),format.raw/*253.29*/("""{"""),format.raw/*253.30*/("""
                    """),format.raw/*254.21*/("""'use strict';
                    window.addEventListener('load', function() """),format.raw/*255.64*/("""{"""),format.raw/*255.65*/("""
                        """),format.raw/*256.25*/("""var form = document.getElementById('needs-validation');
                        form.addEventListener('submit', function(event) """),format.raw/*257.73*/("""{"""),format.raw/*257.74*/("""
                            """),format.raw/*258.29*/("""if (form.checkValidity() === false) """),format.raw/*258.65*/("""{"""),format.raw/*258.66*/("""
                                """),format.raw/*259.33*/("""event.preventDefault();
                                event.stopPropagation();
                            """),format.raw/*261.29*/("""}"""),format.raw/*261.30*/("""
                            """),format.raw/*262.29*/("""form.classList.add('was-validated');
                        """),format.raw/*263.25*/("""}"""),format.raw/*263.26*/(""", false);
                    """),format.raw/*264.21*/("""}"""),format.raw/*264.22*/(""", false);
                """),format.raw/*265.17*/("""}"""),format.raw/*265.18*/(""")();
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
        """)))}),format.raw/*290.10*/("""
    """),format.raw/*291.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(ownerform:Form[Owner]): play.twirl.api.HtmlFormat.Appendable = apply(ownerform)

  def f:((Form[Owner]) => play.twirl.api.HtmlFormat.Appendable) = (ownerform) => apply(ownerform)

  def ref: this.type = this

}


}
}

/**/
object ownercreate extends ownercreate_Scope0.ownercreate_Scope1.ownercreate
              /*
                  -- GENERATED --
                  DATE: Fri Nov 30 20:41:44 EST 2018
                  SOURCE: C:/Users/hiten/OneDrive/Desktop/dATABSE PROJECT 5/Ag 4/RestaurantReview/app/views/ownercreate.scala.html
                  HASH: a3a611ab68361b2a8636cdb6b4986a873d4952d8
                  MATRIX: 812->19|931->43|959->45|2210->1269|2225->1275|2296->1324|2685->1685|2714->1686|2759->1703|2813->1729|2842->1730|2883->1743|2925->1757|2954->1758|2999->1775|3084->1832|3113->1833|3154->1846|3196->1860|3225->1861|3270->1878|3362->1942|3391->1943|3433->1957|3466->1962|3495->1963|3540->1980|3594->2006|3623->2007|3664->2020|3715->2043|3744->2044|3789->2061|3961->2205|3990->2206|4031->2219|4067->2227|4096->2228|4141->2245|4233->2309|4262->2310|4303->2323|4345->2337|4374->2338|4419->2355|4552->2460|4581->2461|4622->2474|4660->2484|4689->2485|4734->2502|4867->2607|4896->2608|4937->2621|4986->2642|5015->2643|5060->2660|5174->2746|5203->2747|5245->2761|5288->2776|5317->2777|5362->2794|5428->2832|5457->2833|5498->2846|5538->2858|5567->2859|5612->2876|5745->2981|5774->2982|5815->2995|5857->3009|5886->3010|5931->3027|5985->3053|6014->3054|6056->3068|6093->3077|6122->3078|6167->3095|6335->3235|6364->3236|6406->3250|6442->3258|6471->3259|6516->3276|6973->3705|7002->3706|7043->3719|7077->3725|7106->3726|7152->3743|7253->3815|7283->3816|7326->3830|7360->3835|7390->3836|7436->3853|7495->3883|7525->3884|7567->3897|7614->3915|7644->3916|7690->3933|7806->4020|7836->4021|7869->4026|7927->4056|7943->4062|7997->4106|8038->4108|8078->4120|9284->5298|9300->5304|9346->5328|10110->6064|10507->6439|10565->6468|10897->6772|11291->7144|11349->7173|11706->7502|12059->7833|12113->7858|12367->8084|12759->8454|12813->8479|13130->8768|13540->9156|13595->9182|13910->9469|14295->9832|14350->9858|14659->10139|15025->10483|15079->10508|15456->10856|15486->10857|15536->10878|15642->10955|15672->10956|15726->10981|15883->11109|15913->11110|15971->11139|16036->11175|16066->11176|16128->11209|16266->11318|16296->11319|16354->11348|16444->11409|16474->11410|16533->11440|16563->11441|16618->11467|16648->11468|17828->12616|17861->12621
                  LINES: 30->3|35->3|37->5|51->19|51->19|51->19|59->27|59->27|60->28|61->29|61->29|62->30|62->30|62->30|63->31|65->33|65->33|66->34|66->34|66->34|67->35|69->37|69->37|71->39|71->39|71->39|72->40|73->41|73->41|74->42|74->42|74->42|75->43|79->47|79->47|80->48|80->48|80->48|81->49|83->51|83->51|84->52|84->52|84->52|85->53|88->56|88->56|89->57|89->57|89->57|90->58|93->61|93->61|94->62|94->62|94->62|95->63|97->65|97->65|99->67|99->67|99->67|100->68|102->70|102->70|103->71|103->71|103->71|104->72|107->75|107->75|108->76|108->76|108->76|109->77|110->78|110->78|112->80|112->80|112->80|113->81|117->85|117->85|119->87|119->87|119->87|120->88|130->98|130->98|131->99|131->99|131->99|132->100|134->102|134->102|136->104|136->104|136->104|137->105|138->106|138->106|139->107|139->107|139->107|140->108|142->110|142->110|143->111|146->114|146->114|146->114|146->114|150->118|168->136|168->136|168->136|184->152|191->159|192->160|198->166|205->173|206->174|213->181|218->186|219->187|223->191|230->198|231->199|237->205|245->213|247->215|253->221|260->228|262->230|268->236|275->243|276->244|285->253|285->253|286->254|287->255|287->255|288->256|289->257|289->257|290->258|290->258|290->258|291->259|293->261|293->261|294->262|295->263|295->263|296->264|296->264|297->265|297->265|322->290|323->291
                  -- GENERATED --
              */
          