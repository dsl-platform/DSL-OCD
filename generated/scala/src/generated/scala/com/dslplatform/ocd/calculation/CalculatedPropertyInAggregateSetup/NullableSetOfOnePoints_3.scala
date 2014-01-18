package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableSetOfOnePoints_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableSetOfOnePoints: Option[Set[java.awt.geom.Point2D]],
    private var _calculatedNullableSetOfOnePoints: Option[Set[java.awt.geom.Point2D]],
    private var _persistedNullableSetOfOnePoints: Option[Set[java.awt.geom.Point2D]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableSetOfOnePoints_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableSetOfOnePoints_3("+ URI +")"

   def copy(nullableSetOfOnePoints: Option[Set[java.awt.geom.Point2D]] = this._nullableSetOfOnePoints): NullableSetOfOnePoints_3 = {

  require(nullableSetOfOnePoints ne null, "Null value was provided for property \"nullableSetOfOnePoints\"")
  if(nullableSetOfOnePoints.isDefined) require(nullableSetOfOnePoints.get ne null, "Null value was provided for property \"nullableSetOfOnePoints\"")
  com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOnePoints)
    new NullableSetOfOnePoints_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableSetOfOnePoints = nullableSetOfOnePoints, _calculatedNullableSetOfOnePoints = _calculatedNullableSetOfOnePoints, _persistedNullableSetOfOnePoints = _persistedNullableSetOfOnePoints)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfOnePoints_3): this.type = {
    this._URI = result._URI
    this._nullableSetOfOnePoints = result._nullableSetOfOnePoints
    this._calculatedNullableSetOfOnePoints = result._calculatedNullableSetOfOnePoints
    this._persistedNullableSetOfOnePoints = result._persistedNullableSetOfOnePoints
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfOnePoints_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOnePoints")
  def nullableSetOfOnePoints = {
    _nullableSetOfOnePoints
  }

  def nullableSetOfOnePoints_= (value: Option[Set[java.awt.geom.Point2D]]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _nullableSetOfOnePoints = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfOnePoints")
  def calculatedNullableSetOfOnePoints = {
    _calculatedNullableSetOfOnePoints
  }

  def calculatedNullableSetOfOnePoints_= (value: Option[Set[java.awt.geom.Point2D]]) {
    _calculatedNullableSetOfOnePoints = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfOnePoints")
  def persistedNullableSetOfOnePoints = {
    _persistedNullableSetOfOnePoints
  }

  def persistedNullableSetOfOnePoints_= (value: Option[Set[java.awt.geom.Point2D]]) {
    _persistedNullableSetOfOnePoints = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOnePoints") nullableSetOfOnePoints: Option[Set[java.awt.geom.Point2D]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfOnePoints") calculatedNullableSetOfOnePoints: Option[Set[java.awt.geom.Point2D]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfOnePoints") persistedNullableSetOfOnePoints: Option[Set[java.awt.geom.Point2D]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableSetOfOnePoints = nullableSetOfOnePoints, _calculatedNullableSetOfOnePoints = calculatedNullableSetOfOnePoints, _persistedNullableSetOfOnePoints = persistedNullableSetOfOnePoints)

}

object NullableSetOfOnePoints_3 extends AggregateRootCompanion[NullableSetOfOnePoints_3]{

  def apply(
    nullableSetOfOnePoints: Option[Set[java.awt.geom.Point2D]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOnePoints)
    require(nullableSetOfOnePoints ne null, "Null value was provided for property \"nullableSetOfOnePoints\"")
    if (nullableSetOfOnePoints.isDefined) require(nullableSetOfOnePoints.get ne null, "Null value was provided for property \"nullableSetOfOnePoints\"")
    new NullableSetOfOnePoints_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableSetOfOnePoints = nullableSetOfOnePoints
    , _calculatedNullableSetOfOnePoints = None
    , _persistedNullableSetOfOnePoints = None)
  }

}
