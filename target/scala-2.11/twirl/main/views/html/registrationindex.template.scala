
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object registrationindex_Scope0 {
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

class registrationindex extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Registration],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(registrations: List[Registration]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.37*/("""

"""),format.raw/*3.1*/("""<html>
<head>
<title>All Registrations</title>
</head>
<body>
<h1>All Registrations</h1>
"""),_display_(/*9.2*/for(registration <- registrations) yield /*9.36*/{_display_(Seq[Any](format.raw/*9.37*/("""
	"""),format.raw/*10.2*/("""<a href=""""),_display_(/*10.12*/routes/*10.18*/.RegistrationController.show(registration.registrationId)),format.raw/*10.75*/("""">"""),_display_(/*10.78*/registration/*10.90*/.registrationId),format.raw/*10.105*/("""</a>
	<p>Registration Name: """),_display_(/*11.25*/registration/*11.37*/.registrationName),format.raw/*11.54*/("""</p>
""")))}),format.raw/*12.2*/("""

"""),format.raw/*14.1*/("""<a href=""""),_display_(/*14.11*/routes/*14.17*/.RegistrationController.create()),format.raw/*14.49*/("""">Create Registration</a>
</body>
</html>"""))
      }
    }
  }

  def render(registrations:List[Registration]): play.twirl.api.HtmlFormat.Appendable = apply(registrations)

  def f:((List[Registration]) => play.twirl.api.HtmlFormat.Appendable) = (registrations) => apply(registrations)

  def ref: this.type = this

}


}

/**/
object registrationindex extends registrationindex_Scope0.registrationindex
              /*
                  -- GENERATED --
                  DATE: Fri Nov 30 20:41:44 EST 2018
                  SOURCE: C:/Users/hiten/OneDrive/Desktop/dATABSE PROJECT 5/Ag 4/RestaurantReview/app/views/registrationindex.scala.html
                  HASH: f8c06ab9559e4cedc58165c42b496c82aecfc64c
                  MATRIX: 781->1|911->36|941->40|1062->136|1111->170|1149->171|1179->174|1216->184|1231->190|1309->247|1339->250|1360->262|1397->277|1454->307|1475->319|1513->336|1550->343|1581->347|1618->357|1633->363|1686->395
                  LINES: 27->1|32->1|34->3|40->9|40->9|40->9|41->10|41->10|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|43->12|45->14|45->14|45->14|45->14
                  -- GENERATED --
              */
          