
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object registrationshow_Scope0 {
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

class registrationshow extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Registration,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(registration: Registration):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.30*/("""

"""),format.raw/*3.1*/("""<html>
<head>
<title>"""),_display_(/*5.9*/registration/*5.21*/.registrationId),format.raw/*5.36*/("""</title>
</head>
<body>
<h1>"""),_display_(/*8.6*/registration/*8.18*/.registrationId),format.raw/*8.33*/("""</h1>
	<p>Registration Id: """),_display_(/*9.23*/registration/*9.35*/.registrationId),format.raw/*9.50*/("""</p>
	<p>Registration Name: """),_display_(/*10.25*/registration/*10.37*/.registrationName),format.raw/*10.54*/("""</p>


	<a href=""""),_display_(/*13.12*/routes/*13.18*/.RegistrationController.destroy(registration.registrationId)),format.raw/*13.78*/("""">Delete</a>
</body>
</html>"""))
      }
    }
  }

  def render(registration:Registration): play.twirl.api.HtmlFormat.Appendable = apply(registration)

  def f:((Registration) => play.twirl.api.HtmlFormat.Appendable) = (registration) => apply(registration)

  def ref: this.type = this

}


}

/**/
object registrationshow extends registrationshow_Scope0.registrationshow
              /*
                  -- GENERATED --
                  DATE: Fri Nov 30 20:41:44 EST 2018
                  SOURCE: C:/Users/hiten/OneDrive/Desktop/dATABSE PROJECT 5/Ag 4/RestaurantReview/app/views/registrationshow.scala.html
                  HASH: 8a6ef5695e77f2464b10114760e3eece984d53a1
                  MATRIX: 773->1|896->29|926->33|975->57|995->69|1030->84|1087->116|1107->128|1142->143|1197->172|1217->184|1252->199|1309->229|1330->241|1368->258|1416->279|1431->285|1512->345
                  LINES: 27->1|32->1|34->3|36->5|36->5|36->5|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|44->13|44->13|44->13
                  -- GENERATED --
              */
          