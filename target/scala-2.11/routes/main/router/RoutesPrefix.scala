
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/hiten/OneDrive/Desktop/dATABSE PROJECT 5/Ag 4/RestaurantReview/conf/routes
// @DATE:Fri Nov 30 20:41:43 EST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
