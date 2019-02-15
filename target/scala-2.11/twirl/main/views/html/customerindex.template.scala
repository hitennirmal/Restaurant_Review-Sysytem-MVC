
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object customerindex_Scope0 {
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

class customerindex extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Customer],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customers: List[Customer]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.29*/("""

"""),format.raw/*3.1*/("""<html>
<head>
<title>All Customers</title>
</head>
<body>
<h1>All Customers</h1>
"""),_display_(/*9.2*/for(customer <- customers) yield /*9.28*/{_display_(Seq[Any](format.raw/*9.29*/("""
	"""),format.raw/*10.2*/("""<a href=""""),_display_(/*10.12*/routes/*10.18*/.CustomerController.show(customer.customerId)),format.raw/*10.63*/("""">"""),_display_(/*10.66*/customer/*10.74*/.customerId),format.raw/*10.85*/("""</a>
	<p>Customer Name: """),_display_(/*11.21*/customer/*11.29*/.firstName),format.raw/*11.39*/("""</p>
""")))}),format.raw/*12.2*/("""

"""),format.raw/*14.1*/("""<a href=""""),_display_(/*14.11*/routes/*14.17*/.CustomerController.create()),format.raw/*14.45*/("""">Create Customer</a>
</body>
</html>
"""))
      }
    }
  }

  def render(customers:List[Customer]): play.twirl.api.HtmlFormat.Appendable = apply(customers)

  def f:((List[Customer]) => play.twirl.api.HtmlFormat.Appendable) = (customers) => apply(customers)

  def ref: this.type = this

}


}

/**/
object customerindex extends customerindex_Scope0.customerindex
              /*
                  -- GENERATED --
                  DATE: Fri Nov 30 20:41:44 EST 2018
                  SOURCE: C:/Users/hiten/OneDrive/Desktop/dATABSE PROJECT 5/Ag 4/RestaurantReview/app/views/customerindex.scala.html
                  HASH: 9c6a559e5c58fb56bbd70d35b33d14adb2fe367d
                  MATRIX: 769->1|891->28|921->32|1034->120|1075->146|1113->147|1143->150|1180->160|1195->166|1261->211|1291->214|1308->222|1340->233|1393->259|1410->267|1441->277|1478->284|1509->288|1546->298|1561->304|1610->332
                  LINES: 27->1|32->1|34->3|40->9|40->9|40->9|41->10|41->10|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|43->12|45->14|45->14|45->14|45->14
                  -- GENERATED --
              */
          