package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneMap_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneMap: Map[String, String]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneMap_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneMap_2("+ URI +")"

   def copy(oneMap: Map[String, String] = this._oneMap): OneMap_2 = {

  require(oneMap ne null, "Null value was provided for property \"oneMap\"")
    new OneMap_2(_URI = this.URI, __locator = this.__locator, _oneMap = oneMap)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneMap_2): this.type = {
    this._URI = result._URI
    this._oneMap = result._oneMap
    this
  }

  def create()(implicit locator: ServiceLocator, ec: ExecutionContext, duration: Duration): this.type = {
    __locator = Some(Option(locator).getOrElse(Bootstrap.getLocator))
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).create(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def update()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).update(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def delete()(implicit ec: ExecutionContext, duration: Duration) = {
    if (__locator.isEmpty) throw new IllegalArgumentException("Can't delete aggregate before it's saved")
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneMap_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneMap")
  def oneMap = {
    _oneMap
  }

  def oneMap_= (value: Map[String, String]) {
    _oneMap = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneMap") oneMap: Map[String, String]
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneMap = if (oneMap == null) Map.empty[String, String] else oneMap)

}

object OneMap_2 extends AggregateRootCompanion[OneMap_2]{

  def apply(
    oneMap: Map[String, String] = Map.empty[String, String]
  ) = {
    require(oneMap ne null, "Null value was provided for property \"oneMap\"")
    new OneMap_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneMap = oneMap)
  }

}
