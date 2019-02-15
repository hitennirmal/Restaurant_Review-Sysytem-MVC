
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object restaurantshow_Scope0 {
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

class restaurantshow extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Restaurant,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(restaurant: Restaurant):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.26*/("""

"""),format.raw/*3.1*/("""<html>
<head>
<title>"""),_display_(/*5.9*/restaurant/*5.19*/.restaurantId),format.raw/*5.32*/("""</title>
</head>
<body>
<h1>"""),_display_(/*8.6*/restaurant/*8.16*/.restaurantId),format.raw/*8.29*/("""</h1>
	<p>Restaurant City: """),_display_(/*9.23*/restaurant/*9.33*/.city),format.raw/*9.38*/("""</p>
	<p>Restaurant Pincode: """),_display_(/*10.26*/restaurant/*10.36*/.pincode),format.raw/*10.44*/("""</p>
	<p>Restaurant Name: """),_display_(/*11.23*/restaurant/*11.33*/.name),format.raw/*11.38*/("""</p>

	<a href=""""),_display_(/*13.12*/routes/*13.18*/.RestaurantController.destroy(restaurant.restaurantId)),format.raw/*13.72*/("""">Delete</a>
</body>
</html>
"""))
      }
    }
  }

  def render(restaurant:Restaurant): play.twirl.api.HtmlFormat.Appendable = apply(restaurant)

  def f:((Restaurant) => play.twirl.api.HtmlFormat.Appendable) = (restaurant) => apply(restaurant)

  def ref: this.type = this

}


}

/**/
object restaurantshow extends restaurantshow_Scope0.restaurantshow
              /*
                  -- GENERATED --
                  DATE: Fri Nov 30 20:41:44 EST 2018
                  SOURCE: C:/Users/hiten/OneDrive/Desktop/dATABSE PROJECT 5/Ag 4/RestaurantReview/app/views/restaurantshow.scala.html
                  HASH: 31f6e800e4204b00bace4968f5c4e8fbf85312dc
                  MATRIX: 767->1|886->25|916->29|965->53|983->63|1016->76|1073->108|1091->118|1124->131|1179->160|1197->170|1222->175|1280->206|1299->216|1328->224|1383->252|1402->262|1428->267|1474->286|1489->292|1564->346
                  LINES: 27->1|32->1|34->3|36->5|36->5|36->5|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|44->13|44->13|44->13
                  -- GENERATED --
              */
          