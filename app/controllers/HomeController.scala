package controllers

import javax.inject.{Inject, _}

import myMongo.MongoHandler
import play.api.mvc.{ControllerComponents, _}


// BSON-JSON conversions/collection
// Reactive Mongo imports
// BSON-JSON conversions/collection
//import play.api.libs.json.{ JsObject, OWrites, Writes }

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc){
  /**
   * Create an Action to render an HTML page with a welcome message.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
    def db = new MongoHandler()
  override lazy val parse: PlayBodyParsers = cc.parsers
  def index = Action {
    Ok(views.html.index("Coupons System", db.getAllDocuments()))
  }
}


