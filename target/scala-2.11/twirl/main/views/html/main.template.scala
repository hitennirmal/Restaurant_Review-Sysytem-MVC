
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
* This template is called from the `index` template. This template
* handles the rendering of the page header and body tags. It takes
* two arguments, a `String` for the title of the page and an `Html`
* object to insert into the body of the page.
*/
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
    """),format.raw/*13.5*/("""<title>"""),_display_(/*13.13*/title),format.raw/*13.18*/("""</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*14.50*/routes/*14.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*14.97*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*15.55*/routes/*15.61*/.Assets.versioned("images/favicon.png")),format.raw/*15.100*/("""">
    <script src=""""),_display_(/*16.19*/routes/*16.25*/.Assets.versioned("javascripts/hello.js")),format.raw/*16.66*/("""" type="text/javascript"></script>

        <!-- BOOTSTRAP CSS/JSS CDN -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/vivus/0.4.3/vivus.js" crossorigin="anonymous"></script>

        <!-- JQUERY AND POPPER CDN -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>

        <!-- Stylesheets and javascript -->
    <link rel="stylesheet" type='text/css' media="screen" href='"""),_display_(/*28.66*/routes/*28.72*/.Assets.versioned("stylesheets/index.css")),format.raw/*28.114*/("""'>
    <link href="https://fonts.googleapis.com/css?family=PT+Sans" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Bitter|Source+Sans+Pro" rel="stylesheet">
    <link rel='stylesheet prefetch' href='http:////netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css'>

    </head>
    <style>
            html """),format.raw/*35.18*/("""{"""),format.raw/*35.19*/("""
                """),format.raw/*36.17*/("""font-family: 'PT Sans', sans-serif;
            """),format.raw/*37.13*/("""}"""),format.raw/*37.14*/("""
            """),format.raw/*38.13*/("""body """),format.raw/*38.18*/("""{"""),format.raw/*38.19*/("""
                """),format.raw/*39.17*/("""margin: auto;
            """),format.raw/*40.13*/("""}"""),format.raw/*40.14*/("""
            """),format.raw/*41.13*/(""".nav_text """),format.raw/*41.23*/("""{"""),format.raw/*41.24*/("""
                """),format.raw/*42.17*/("""color: white;
            """),format.raw/*43.13*/("""}"""),format.raw/*43.14*/("""
            """),format.raw/*44.13*/(""".navbar-header"""),format.raw/*44.27*/("""{"""),format.raw/*44.28*/("""
                """),format.raw/*45.17*/("""margin-left:5px;
                width:100%;
            """),format.raw/*47.13*/("""}"""),format.raw/*47.14*/("""
            """),format.raw/*48.13*/(""".navcontainer """),format.raw/*48.27*/("""{"""),format.raw/*48.28*/("""
                """),format.raw/*49.17*/("""margin-left: 10%;
                margin-right: 5%;
            """),format.raw/*51.13*/("""}"""),format.raw/*51.14*/("""
            """),format.raw/*52.13*/("""body """),format.raw/*52.18*/("""{"""),format.raw/*52.19*/("""
                """),format.raw/*53.17*/("""margin: auto;
            """),format.raw/*54.13*/("""}"""),format.raw/*54.14*/("""
            """),format.raw/*55.13*/(""".navbar, .navbar-fixed """),format.raw/*55.36*/("""{"""),format.raw/*55.37*/("""
                """),format.raw/*56.17*/("""background-color: gray;
                opacity: .90;
                z-index: 99;
            """),format.raw/*59.13*/("""}"""),format.raw/*59.14*/("""
            """),format.raw/*60.13*/("""#navbar """),format.raw/*60.21*/("""{"""),format.raw/*60.22*/("""
                """),format.raw/*61.17*/("""margin-left: 10%;
                margin-right: 5%;
            """),format.raw/*63.13*/("""}"""),format.raw/*63.14*/("""
            """),format.raw/*64.13*/(""".navbar-brand """),format.raw/*64.27*/("""{"""),format.raw/*64.28*/("""
                """),format.raw/*65.17*/("""font-family: 'Bitter', serif;
                font-size: 22px;
                color: white;
            """),format.raw/*68.13*/("""}"""),format.raw/*68.14*/("""
            """),format.raw/*69.13*/(""".nav-link """),format.raw/*69.23*/("""{"""),format.raw/*69.24*/("""
                """),format.raw/*70.17*/("""font-size: 16px;
                font-family: 'Bitter', serif;
                color: white;
            """),format.raw/*73.13*/("""}"""),format.raw/*73.14*/("""
            """),format.raw/*74.13*/("""nav.navbar.fixed-top """),format.raw/*74.34*/("""{"""),format.raw/*74.35*/("""
                """),format.raw/*75.17*/("""padding: 0em;
                box-shadow: 0 0 4px 1px rgba(0, 0, 0, 0.3);
            """),format.raw/*77.13*/("""}"""),format.raw/*77.14*/("""
            """),format.raw/*78.13*/(""".jumbotron """),format.raw/*78.24*/("""{"""),format.raw/*78.25*/("""
                """),format.raw/*79.17*/("""background-image: url("https://images.pexels.com/photos/1237073/pexels-photo-1237073.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260");
                background-position: left;
                padding-bottom: 6em;
                padding-top: 3em;
                border-radius: 0px;
                margin-bottom: 0px;
                z-index: 3;
            """),format.raw/*86.13*/("""}"""),format.raw/*86.14*/("""
            """),format.raw/*87.13*/(""".jumbotron-text """),format.raw/*87.29*/("""{"""),format.raw/*87.30*/("""
                """),format.raw/*88.17*/("""margin-left: 10%;
            """),format.raw/*89.13*/("""}"""),format.raw/*89.14*/("""
            """),format.raw/*90.13*/(""".display-3 """),format.raw/*90.24*/("""{"""),format.raw/*90.25*/("""
                """),format.raw/*91.17*/("""font-family: 'Bitter', serif;
                font-weight: 700;
                color: #C5D0F2;
                padding-top: 1em;
            """),format.raw/*95.13*/("""}"""),format.raw/*95.14*/("""
            """),format.raw/*96.13*/(""".lead, .lead-2 """),format.raw/*96.28*/("""{"""),format.raw/*96.29*/("""
                """),format.raw/*97.17*/("""color: white;
                font-family: 'Source Sans Pro', sans-serif;
            """),format.raw/*99.13*/("""}"""),format.raw/*99.14*/("""
            """),format.raw/*100.13*/(""".below-jumbo"""),format.raw/*100.25*/("""{"""),format.raw/*100.26*/("""
                """),format.raw/*101.17*/("""margin-left: 7%;
                margin-right: 7%;
                padding-bottom: 3em;
                padding-top: 4em;
                background-color: white;
                z-index: 2;
            """),format.raw/*107.13*/("""}"""),format.raw/*107.14*/("""
            """),format.raw/*108.13*/(""".mid """),format.raw/*108.18*/("""{"""),format.raw/*108.19*/("""
                """),format.raw/*109.17*/("""text-align: center;
            """),format.raw/*110.13*/("""}"""),format.raw/*110.14*/("""
            """),format.raw/*111.13*/(""".row1 """),format.raw/*111.19*/("""{"""),format.raw/*111.20*/("""
                """),format.raw/*112.17*/("""margin-left: 10%;
            """),format.raw/*113.13*/("""}"""),format.raw/*113.14*/("""
            """),format.raw/*114.13*/(""".midtext """),format.raw/*114.22*/("""{"""),format.raw/*114.23*/("""
                """),format.raw/*115.17*/("""font-size: 18px;
                color: black;
                font-family: 'Bitter', serif;
            """),format.raw/*118.13*/("""}"""),format.raw/*118.14*/("""
            """),format.raw/*119.13*/(""".longmid """),format.raw/*119.22*/("""{"""),format.raw/*119.23*/("""
                """),format.raw/*120.17*/("""margin-left: 10%;
                margin-right: 10%;
            """),format.raw/*122.13*/("""}"""),format.raw/*122.14*/("""
            """),format.raw/*123.13*/(""".midp """),format.raw/*123.19*/("""{"""),format.raw/*123.20*/("""
                """),format.raw/*124.17*/("""margin: inherit;
                color: black;
                margin: 1.5em;
            """),format.raw/*127.13*/("""}"""),format.raw/*127.14*/("""
            """),format.raw/*128.13*/(""".my-2 """),format.raw/*128.19*/("""{"""),format.raw/*128.20*/("""
                """),format.raw/*129.17*/("""display: block;
                height: 1px;
                border: 0;
                border-top: 1px solid #ccc;
                margin: 1em 0;
                padding: 0;
            """),format.raw/*135.13*/("""}"""),format.raw/*135.14*/("""
            """),format.raw/*136.13*/(""".bottom-wrapper """),format.raw/*136.29*/("""{"""),format.raw/*136.30*/("""
                """),format.raw/*137.17*/("""padding-top: 4em;
                margin-top: 4em;
                background-color: #7F8EBF;
                padding-bottom: 3em;
                box-shadow: 0 0 4px 1px rgba(0, 0, 0, 0.3);
                border-bottom-left-radius: 3em;
                border-bottom-right-radius: 1em;
                border-top-right-radius: 3em;
                border-top-left-radius: 1em;
            """),format.raw/*146.13*/("""}"""),format.raw/*146.14*/("""
            """),format.raw/*147.13*/(""".holder """),format.raw/*147.21*/("""{"""),format.raw/*147.22*/("""
                """),format.raw/*148.17*/("""background-color: #7F8EBF;
                margin-left: 10%;
                margin-right: 10%;

            """),format.raw/*152.13*/("""}"""),format.raw/*152.14*/("""
            """),format.raw/*153.13*/(""".card """),format.raw/*153.19*/("""{"""),format.raw/*153.20*/("""
                """),format.raw/*154.17*/("""margin: 0 auto;
                float: none;
                margin-bottom: 10px;
                width: 90%;
                box-shadow: 0 0 4px 1px rgba(0, 0, 0, 0.3);
                border: 0px;
            """),format.raw/*160.13*/("""}"""),format.raw/*160.14*/("""
            """),format.raw/*161.13*/(""".card-title """),format.raw/*161.25*/("""{"""),format.raw/*161.26*/("""
                """),format.raw/*162.17*/("""font-family: 'Bitter', serif;
            """),format.raw/*163.13*/("""}"""),format.raw/*163.14*/("""
            """),format.raw/*164.13*/(""".card-text """),format.raw/*164.24*/("""{"""),format.raw/*164.25*/("""
                """),format.raw/*165.17*/("""font-family: 'Source Sans Pro', sans-serif;
            """),format.raw/*166.13*/("""}"""),format.raw/*166.14*/("""
            """),format.raw/*167.13*/(""".bottom-h1 """),format.raw/*167.24*/("""{"""),format.raw/*167.25*/("""
                """),format.raw/*168.17*/("""margin-left: 10%;
                font-family: 'Bitter', serif;
                font-size: 35px;
                color: white;
            """),format.raw/*172.13*/("""}"""),format.raw/*172.14*/("""
            """),format.raw/*173.13*/(""".bottom-h2 """),format.raw/*173.24*/("""{"""),format.raw/*173.25*/("""
                """),format.raw/*174.17*/("""margin-left: 10%;
                margin-right: 15%;
                font-family: 'Source Sans Pro', sans-serif;
                font-size: 22px;
                color: white;
            """),format.raw/*179.13*/("""}"""),format.raw/*179.14*/("""
            """),format.raw/*180.13*/(""".navbar-footer """),format.raw/*180.28*/("""{"""),format.raw/*180.29*/("""
                """),format.raw/*181.17*/("""background-color: white;
            """),format.raw/*182.13*/("""}"""),format.raw/*182.14*/("""
            """),format.raw/*183.13*/("""#footerlink """),format.raw/*183.25*/("""{"""),format.raw/*183.26*/("""
                """),format.raw/*184.17*/("""font-size: 16px;
                font-family: 'Bitter', serif;
                color: black;
            """),format.raw/*187.13*/("""}"""),format.raw/*187.14*/("""
            """),format.raw/*188.13*/("""#bottom-brand """),format.raw/*188.27*/("""{"""),format.raw/*188.28*/("""
                """),format.raw/*189.17*/("""color: black;
            """),format.raw/*190.13*/("""}"""),format.raw/*190.14*/("""
    """),format.raw/*191.5*/("""</style>

    <body>
        """),format.raw/*195.31*/("""
        """),_display_(/*196.10*/content),format.raw/*196.17*/("""
    """),format.raw/*197.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/*
* This template is called from the `index` template. This template
* handles the rendering of the page header and body tags. It takes
* two arguments, a `String` for the title of the page and an `Html`
* object to insert into the body of the page.
*/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Fri Nov 30 20:41:44 EST 2018
                  SOURCE: C:/Users/hiten/OneDrive/Desktop/dATABSE PROJECT 5/Ag 4/RestaurantReview/app/views/main.scala.html
                  HASH: 2fae2c44b13bdd62baba5f7f0cf290cdb6494775
                  MATRIX: 997->255|1122->285|1150->287|1230->392|1262->397|1297->405|1323->410|1408->468|1423->474|1485->515|1569->572|1584->578|1645->617|1693->638|1708->644|1770->685|2960->1848|2975->1854|3039->1896|3410->2239|3439->2240|3484->2257|3560->2305|3589->2306|3630->2319|3663->2324|3692->2325|3737->2342|3791->2368|3820->2369|3861->2382|3899->2392|3928->2393|3973->2410|4027->2436|4056->2437|4097->2450|4139->2464|4168->2465|4213->2482|4298->2539|4327->2540|4368->2553|4410->2567|4439->2568|4484->2585|4576->2649|4605->2650|4646->2663|4679->2668|4708->2669|4753->2686|4807->2712|4836->2713|4877->2726|4928->2749|4957->2750|5002->2767|5125->2862|5154->2863|5195->2876|5231->2884|5260->2885|5305->2902|5397->2966|5426->2967|5467->2980|5509->2994|5538->2995|5583->3012|5716->3117|5745->3118|5786->3131|5824->3141|5853->3142|5898->3159|6031->3264|6060->3265|6101->3278|6150->3299|6179->3300|6224->3317|6338->3403|6367->3404|6408->3417|6447->3428|6476->3429|6521->3446|6913->3810|6942->3811|6983->3824|7027->3840|7056->3841|7101->3858|7159->3888|7188->3889|7229->3902|7268->3913|7297->3914|7342->3931|7512->4073|7541->4074|7582->4087|7625->4102|7654->4103|7699->4120|7813->4206|7842->4207|7884->4220|7925->4232|7955->4233|8001->4250|8233->4453|8263->4454|8305->4467|8339->4472|8369->4473|8415->4490|8476->4522|8506->4523|8548->4536|8583->4542|8613->4543|8659->4560|8718->4590|8748->4591|8790->4604|8828->4613|8858->4614|8904->4631|9038->4736|9068->4737|9110->4750|9148->4759|9178->4760|9224->4777|9318->4842|9348->4843|9390->4856|9425->4862|9455->4863|9501->4880|9620->4970|9650->4971|9692->4984|9727->4990|9757->4991|9803->5008|10019->5195|10049->5196|10091->5209|10136->5225|10166->5226|10212->5243|10632->5634|10662->5635|10704->5648|10741->5656|10771->5657|10817->5674|10955->5783|10985->5784|11027->5797|11062->5803|11092->5804|11138->5821|11378->6032|11408->6033|11450->6046|11491->6058|11521->6059|11567->6076|11638->6118|11668->6119|11710->6132|11750->6143|11780->6144|11826->6161|11911->6217|11941->6218|11983->6231|12023->6242|12053->6243|12099->6260|12267->6399|12297->6400|12339->6413|12379->6424|12409->6425|12455->6442|12672->6630|12702->6631|12744->6644|12788->6659|12818->6660|12864->6677|12930->6714|12960->6715|13002->6728|13043->6740|13073->6741|13119->6758|13253->6863|13283->6864|13325->6877|13368->6891|13398->6892|13444->6909|13499->6935|13529->6936|13562->6941|13620->7059|13658->7069|13687->7076|13720->7081
                  LINES: 32->7|37->7|39->9|42->12|43->13|43->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|58->28|58->28|58->28|65->35|65->35|66->36|67->37|67->37|68->38|68->38|68->38|69->39|70->40|70->40|71->41|71->41|71->41|72->42|73->43|73->43|74->44|74->44|74->44|75->45|77->47|77->47|78->48|78->48|78->48|79->49|81->51|81->51|82->52|82->52|82->52|83->53|84->54|84->54|85->55|85->55|85->55|86->56|89->59|89->59|90->60|90->60|90->60|91->61|93->63|93->63|94->64|94->64|94->64|95->65|98->68|98->68|99->69|99->69|99->69|100->70|103->73|103->73|104->74|104->74|104->74|105->75|107->77|107->77|108->78|108->78|108->78|109->79|116->86|116->86|117->87|117->87|117->87|118->88|119->89|119->89|120->90|120->90|120->90|121->91|125->95|125->95|126->96|126->96|126->96|127->97|129->99|129->99|130->100|130->100|130->100|131->101|137->107|137->107|138->108|138->108|138->108|139->109|140->110|140->110|141->111|141->111|141->111|142->112|143->113|143->113|144->114|144->114|144->114|145->115|148->118|148->118|149->119|149->119|149->119|150->120|152->122|152->122|153->123|153->123|153->123|154->124|157->127|157->127|158->128|158->128|158->128|159->129|165->135|165->135|166->136|166->136|166->136|167->137|176->146|176->146|177->147|177->147|177->147|178->148|182->152|182->152|183->153|183->153|183->153|184->154|190->160|190->160|191->161|191->161|191->161|192->162|193->163|193->163|194->164|194->164|194->164|195->165|196->166|196->166|197->167|197->167|197->167|198->168|202->172|202->172|203->173|203->173|203->173|204->174|209->179|209->179|210->180|210->180|210->180|211->181|212->182|212->182|213->183|213->183|213->183|214->184|217->187|217->187|218->188|218->188|218->188|219->189|220->190|220->190|221->191|224->195|225->196|225->196|226->197
                  -- GENERATED --
              */
          