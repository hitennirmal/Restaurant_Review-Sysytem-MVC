
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object restaurantindex_Scope0 {
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

class restaurantindex extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Restaurant],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(restaurant: List[Restaurant]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<html>
<head>
<title>All Restaurant</title>
</head>
<body>
<h1>All Restaurant</h1>
"""),_display_(/*9.2*/for(restaurant <- restaurant) yield /*9.31*/{_display_(Seq[Any](format.raw/*9.32*/("""
	"""),format.raw/*10.2*/("""<a href=""""),_display_(/*10.12*/routes/*10.18*/.RestaurantController.show(restaurant.restaurantId)),format.raw/*10.69*/("""">"""),_display_(/*10.72*/restaurant/*10.82*/.restaurantId),format.raw/*10.95*/("""</a>
	<p>Restaurant City: """),_display_(/*11.23*/restaurant/*11.33*/.city),format.raw/*11.38*/("""</p>
	<p>Restaurant pincode: """),_display_(/*12.26*/restaurant/*12.36*/.pincode),format.raw/*12.44*/("""</p>
	<p>Restaurant name: """),_display_(/*13.23*/restaurant/*13.33*/.name),format.raw/*13.38*/("""</p>
""")))}),format.raw/*14.2*/("""

"""),format.raw/*16.1*/("""<a href=""""),_display_(/*16.11*/routes/*16.17*/.RestaurantController.create()),format.raw/*16.47*/("""">Create Restaurant</a>
</body>
</html>
"""))
      }
    }
  }

  def render(restaurant:List[Restaurant]): play.twirl.api.HtmlFormat.Appendable = apply(restaurant)

  def f:((List[Restaurant]) => play.twirl.api.HtmlFormat.Appendable) = (restaurant) => apply(restaurant)

  def ref: this.type = this

}


}

/**/
object restaurantindex extends restaurantindex_Scope0.restaurantindex
              /*
                  -- GENERATED --
                  DATE: Fri Nov 30 20:41:44 EST 2018
                  SOURCE: C:/Users/hiten/OneDrive/Desktop/dATABSE PROJECT 5/Ag 4/RestaurantReview/app/views/restaurantindex.scala.html
                  HASH: 595a41775abed63bcb315229defd08ea496e97e5
                  MATRIX: 775->1|900->31|930->35|1045->125|1089->154|1127->155|1157->158|1194->168|1209->174|1281->225|1311->228|1330->238|1364->251|1419->279|1438->289|1464->294|1522->325|1541->335|1570->343|1625->371|1644->381|1670->386|1707->393|1738->397|1775->407|1790->413|1841->443
                  LINES: 27->1|32->1|34->3|40->9|40->9|40->9|41->10|41->10|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|47->16|47->16|47->16|47->16
                  -- GENERATED --
              */
          