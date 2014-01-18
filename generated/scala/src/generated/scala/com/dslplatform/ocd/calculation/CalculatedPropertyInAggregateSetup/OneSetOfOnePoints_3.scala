package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfOnePoints_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneSetOfOnePoints: Set[java.awt.geom.Point2D],
    private var _calculatedOneSetOfOnePoints: Set[java.awt.geom.Point2D],
    private var _persistedOneSetOfOnePoints: Set[java.awt.geom.Point2D]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfOnePoints_3 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfOnePoints_3("+ URI +")"

   def copy(oneSetOfOnePoints: Set[java.awt.geom.Point2D] = this._oneSetOfOnePoints): OneSetOfOnePoints_3 = {

  require(oneSetOfOnePoints ne null, "Null value was provided for property \"oneSetOfOnePoints\"")
  com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOnePoints)
    new OneSetOfOnePoints_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneSetOfOnePoints = oneSetOfOnePoints, _calculatedOneSetOfOnePoints = _calculatedOneSetOfOnePoints, _persistedOneSetOfOnePoints = _persistedOneSetOfOnePoints)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("ID")
  def ID = {
    _ID
  }

  private def ID_= (value: Int) {
    _ID = value

  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfOnePoints_3): this.type = {
    this._URI = result._URI
    this._oneSetOfOnePoints = result._oneSetOfOnePoints
    this._calculatedOneSetOfOnePoints = result._calculatedOneSetOfOnePoints
    this._persistedOneSetOfOnePoints = result._persistedOneSetOfOnePoints
    this._ID = result._ID
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfOnePoints_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOnePoints")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfOnePoints = {
    _oneSetOfOnePoints
  }

  def oneSetOfOnePoints_= (value: Set[java.awt.geom.Point2D]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _oneSetOfOnePoints = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfOnePoints")
  def calculatedOneSetOfOnePoints = {
    _calculatedOneSetOfOnePoints
  }

  def calculatedOneSetOfOnePoints_= (value: Set[java.awt.geom.Point2D]) {
    _calculatedOneSetOfOnePoints = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfOnePoints")
  def persistedOneSetOfOnePoints = {
    _persistedOneSetOfOnePoints
  }

  def persistedOneSetOfOnePoints_= (value: Set[java.awt.geom.Point2D]) {
    _persistedOneSetOfOnePoints = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOnePoints") oneSetOfOnePoints: Set[java.awt.geom.Point2D]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfOnePoints") calculatedOneSetOfOnePoints: Set[java.awt.geom.Point2D]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfOnePoints") persistedOneSetOfOnePoints: Set[java.awt.geom.Point2D]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneSetOfOnePoints = if (oneSetOfOnePoints == null) Set.empty else oneSetOfOnePoints, _calculatedOneSetOfOnePoints = calculatedOneSetOfOnePoints, _persistedOneSetOfOnePoints = persistedOneSetOfOnePoints)

}

object OneSetOfOnePoints_3 extends AggregateRootCompanion[OneSetOfOnePoints_3]{

  def apply(
    oneSetOfOnePoints: Set[java.awt.geom.Point2D] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOnePoints)
    require(oneSetOfOnePoints ne null, "Null value was provided for property \"oneSetOfOnePoints\"")
    new OneSetOfOnePoints_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneSetOfOnePoints = oneSetOfOnePoints
    , _calculatedOneSetOfOnePoints = Set.empty
    , _persistedOneSetOfOnePoints = Set.empty)
  }

}
