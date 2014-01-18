package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfOnePoints_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneArrayOfOnePoints: Array[java.awt.geom.Point2D],
    private var _calculatedOneArrayOfOnePoints: Array[java.awt.geom.Point2D],
    private var _persistedOneArrayOfOnePoints: Array[java.awt.geom.Point2D]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfOnePoints_3 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfOnePoints_3("+ URI +")"

   def copy(oneArrayOfOnePoints: Array[java.awt.geom.Point2D] = this._oneArrayOfOnePoints): OneArrayOfOnePoints_3 = {

  require(oneArrayOfOnePoints ne null, "Null value was provided for property \"oneArrayOfOnePoints\"")
  com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOnePoints)
    new OneArrayOfOnePoints_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneArrayOfOnePoints = oneArrayOfOnePoints, _calculatedOneArrayOfOnePoints = _calculatedOneArrayOfOnePoints, _persistedOneArrayOfOnePoints = _persistedOneArrayOfOnePoints)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfOnePoints_3): this.type = {
    this._URI = result._URI
    this._oneArrayOfOnePoints = result._oneArrayOfOnePoints
    this._calculatedOneArrayOfOnePoints = result._calculatedOneArrayOfOnePoints
    this._persistedOneArrayOfOnePoints = result._persistedOneArrayOfOnePoints
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfOnePoints_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOnePoints")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfOnePoints = {
    _oneArrayOfOnePoints
  }

  def oneArrayOfOnePoints_= (value: Array[java.awt.geom.Point2D]) {
    com.dslplatform.api.Guards.checkArrayNulls(value)
    _oneArrayOfOnePoints = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfOnePoints")
  def calculatedOneArrayOfOnePoints = {
    _calculatedOneArrayOfOnePoints
  }

  def calculatedOneArrayOfOnePoints_= (value: Array[java.awt.geom.Point2D]) {
    _calculatedOneArrayOfOnePoints = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfOnePoints")
  def persistedOneArrayOfOnePoints = {
    _persistedOneArrayOfOnePoints
  }

  def persistedOneArrayOfOnePoints_= (value: Array[java.awt.geom.Point2D]) {
    _persistedOneArrayOfOnePoints = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOnePoints") oneArrayOfOnePoints: Array[java.awt.geom.Point2D]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfOnePoints") calculatedOneArrayOfOnePoints: Array[java.awt.geom.Point2D]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfOnePoints") persistedOneArrayOfOnePoints: Array[java.awt.geom.Point2D]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneArrayOfOnePoints = if (oneArrayOfOnePoints == null) Array.empty else oneArrayOfOnePoints, _calculatedOneArrayOfOnePoints = calculatedOneArrayOfOnePoints, _persistedOneArrayOfOnePoints = persistedOneArrayOfOnePoints)

}

object OneArrayOfOnePoints_3 extends AggregateRootCompanion[OneArrayOfOnePoints_3]{

  def apply(
    oneArrayOfOnePoints: Array[java.awt.geom.Point2D] = Array.empty
  ) = {
    com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOnePoints)
    require(oneArrayOfOnePoints ne null, "Null value was provided for property \"oneArrayOfOnePoints\"")
    new OneArrayOfOnePoints_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneArrayOfOnePoints = oneArrayOfOnePoints
    , _calculatedOneArrayOfOnePoints = Array.empty
    , _persistedOneArrayOfOnePoints = Array.empty)
  }

}
