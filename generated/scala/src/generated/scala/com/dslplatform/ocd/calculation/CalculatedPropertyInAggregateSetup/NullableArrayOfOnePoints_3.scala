package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableArrayOfOnePoints_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableArrayOfOnePoints: Option[Array[java.awt.geom.Point2D]],
    private var _calculatedNullableArrayOfOnePoints: Option[Array[java.awt.geom.Point2D]],
    private var _persistedNullableArrayOfOnePoints: Option[Array[java.awt.geom.Point2D]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableArrayOfOnePoints_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableArrayOfOnePoints_3("+ URI +")"

   def copy(nullableArrayOfOnePoints: Option[Array[java.awt.geom.Point2D]] = this._nullableArrayOfOnePoints): NullableArrayOfOnePoints_3 = {

  require(nullableArrayOfOnePoints ne null, "Null value was provided for property \"nullableArrayOfOnePoints\"")
  if(nullableArrayOfOnePoints.isDefined) require(nullableArrayOfOnePoints.get ne null, "Null value was provided for property \"nullableArrayOfOnePoints\"")
  com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOnePoints)
    new NullableArrayOfOnePoints_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableArrayOfOnePoints = nullableArrayOfOnePoints, _calculatedNullableArrayOfOnePoints = _calculatedNullableArrayOfOnePoints, _persistedNullableArrayOfOnePoints = _persistedNullableArrayOfOnePoints)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfOnePoints_3): this.type = {
    this._URI = result._URI
    this._nullableArrayOfOnePoints = result._nullableArrayOfOnePoints
    this._calculatedNullableArrayOfOnePoints = result._calculatedNullableArrayOfOnePoints
    this._persistedNullableArrayOfOnePoints = result._persistedNullableArrayOfOnePoints
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfOnePoints_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOnePoints")
  def nullableArrayOfOnePoints = {
    _nullableArrayOfOnePoints
  }

  def nullableArrayOfOnePoints_= (value: Option[Array[java.awt.geom.Point2D]]) {
    com.dslplatform.api.Guards.checkArrayNulls(value)
    _nullableArrayOfOnePoints = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfOnePoints")
  def calculatedNullableArrayOfOnePoints = {
    _calculatedNullableArrayOfOnePoints
  }

  def calculatedNullableArrayOfOnePoints_= (value: Option[Array[java.awt.geom.Point2D]]) {
    _calculatedNullableArrayOfOnePoints = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfOnePoints")
  def persistedNullableArrayOfOnePoints = {
    _persistedNullableArrayOfOnePoints
  }

  def persistedNullableArrayOfOnePoints_= (value: Option[Array[java.awt.geom.Point2D]]) {
    _persistedNullableArrayOfOnePoints = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOnePoints") nullableArrayOfOnePoints: Option[Array[java.awt.geom.Point2D]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfOnePoints") calculatedNullableArrayOfOnePoints: Option[Array[java.awt.geom.Point2D]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfOnePoints") persistedNullableArrayOfOnePoints: Option[Array[java.awt.geom.Point2D]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableArrayOfOnePoints = nullableArrayOfOnePoints, _calculatedNullableArrayOfOnePoints = calculatedNullableArrayOfOnePoints, _persistedNullableArrayOfOnePoints = persistedNullableArrayOfOnePoints)

}

object NullableArrayOfOnePoints_3 extends AggregateRootCompanion[NullableArrayOfOnePoints_3]{

  def apply(
    nullableArrayOfOnePoints: Option[Array[java.awt.geom.Point2D]] = None
  ) = {
    com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOnePoints)
    require(nullableArrayOfOnePoints ne null, "Null value was provided for property \"nullableArrayOfOnePoints\"")
    if (nullableArrayOfOnePoints.isDefined) require(nullableArrayOfOnePoints.get ne null, "Null value was provided for property \"nullableArrayOfOnePoints\"")
    new NullableArrayOfOnePoints_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableArrayOfOnePoints = nullableArrayOfOnePoints
    , _calculatedNullableArrayOfOnePoints = None
    , _persistedNullableArrayOfOnePoints = None)
  }

}
