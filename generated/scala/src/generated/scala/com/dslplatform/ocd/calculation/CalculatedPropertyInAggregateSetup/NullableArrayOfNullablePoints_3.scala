package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableArrayOfNullablePoints_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableArrayOfNullablePoints: Option[Array[Option[java.awt.geom.Point2D]]],
    private var _calculatedNullableArrayOfNullablePoints: Option[Array[Option[java.awt.geom.Point2D]]],
    private var _persistedNullableArrayOfNullablePoints: Option[Array[Option[java.awt.geom.Point2D]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableArrayOfNullablePoints_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableArrayOfNullablePoints_3("+ URI +")"

   def copy(nullableArrayOfNullablePoints: Option[Array[Option[java.awt.geom.Point2D]]] = this._nullableArrayOfNullablePoints): NullableArrayOfNullablePoints_3 = {

  require(nullableArrayOfNullablePoints ne null, "Null value was provided for property \"nullableArrayOfNullablePoints\"")
  if(nullableArrayOfNullablePoints.isDefined) require(nullableArrayOfNullablePoints.get ne null, "Null value was provided for property \"nullableArrayOfNullablePoints\"")
  com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullablePoints)
    new NullableArrayOfNullablePoints_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableArrayOfNullablePoints = nullableArrayOfNullablePoints, _calculatedNullableArrayOfNullablePoints = _calculatedNullableArrayOfNullablePoints, _persistedNullableArrayOfNullablePoints = _persistedNullableArrayOfNullablePoints)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfNullablePoints_3): this.type = {
    this._URI = result._URI
    this._nullableArrayOfNullablePoints = result._nullableArrayOfNullablePoints
    this._calculatedNullableArrayOfNullablePoints = result._calculatedNullableArrayOfNullablePoints
    this._persistedNullableArrayOfNullablePoints = result._persistedNullableArrayOfNullablePoints
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfNullablePoints_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullablePoints")
  def nullableArrayOfNullablePoints = {
    _nullableArrayOfNullablePoints
  }

  def nullableArrayOfNullablePoints_= (value: Option[Array[Option[java.awt.geom.Point2D]]]) {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(value)
    _nullableArrayOfNullablePoints = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfNullablePoints")
  def calculatedNullableArrayOfNullablePoints = {
    _calculatedNullableArrayOfNullablePoints
  }

  def calculatedNullableArrayOfNullablePoints_= (value: Option[Array[Option[java.awt.geom.Point2D]]]) {
    _calculatedNullableArrayOfNullablePoints = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfNullablePoints")
  def persistedNullableArrayOfNullablePoints = {
    _persistedNullableArrayOfNullablePoints
  }

  def persistedNullableArrayOfNullablePoints_= (value: Option[Array[Option[java.awt.geom.Point2D]]]) {
    _persistedNullableArrayOfNullablePoints = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullablePoints") nullableArrayOfNullablePoints: Option[Array[Option[java.awt.geom.Point2D]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfNullablePoints") calculatedNullableArrayOfNullablePoints: Option[Array[Option[java.awt.geom.Point2D]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfNullablePoints") persistedNullableArrayOfNullablePoints: Option[Array[Option[java.awt.geom.Point2D]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableArrayOfNullablePoints = nullableArrayOfNullablePoints, _calculatedNullableArrayOfNullablePoints = calculatedNullableArrayOfNullablePoints, _persistedNullableArrayOfNullablePoints = persistedNullableArrayOfNullablePoints)

}

object NullableArrayOfNullablePoints_3 extends AggregateRootCompanion[NullableArrayOfNullablePoints_3]{

  def apply(
    nullableArrayOfNullablePoints: Option[Array[Option[java.awt.geom.Point2D]]] = None
  ) = {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullablePoints)
    require(nullableArrayOfNullablePoints ne null, "Null value was provided for property \"nullableArrayOfNullablePoints\"")
    if (nullableArrayOfNullablePoints.isDefined) require(nullableArrayOfNullablePoints.get ne null, "Null value was provided for property \"nullableArrayOfNullablePoints\"")
    new NullableArrayOfNullablePoints_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableArrayOfNullablePoints = nullableArrayOfNullablePoints
    , _calculatedNullableArrayOfNullablePoints = None
    , _persistedNullableArrayOfNullablePoints = None)
  }

}
