package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableSetOfNullablePoints_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableSetOfNullablePoints: Option[Set[Option[java.awt.geom.Point2D]]],
    private var _calculatedNullableSetOfNullablePoints: Option[Set[Option[java.awt.geom.Point2D]]],
    private var _persistedNullableSetOfNullablePoints: Option[Set[Option[java.awt.geom.Point2D]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableSetOfNullablePoints_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableSetOfNullablePoints_3("+ URI +")"

   def copy(nullableSetOfNullablePoints: Option[Set[Option[java.awt.geom.Point2D]]] = this._nullableSetOfNullablePoints): NullableSetOfNullablePoints_3 = {

  require(nullableSetOfNullablePoints ne null, "Null value was provided for property \"nullableSetOfNullablePoints\"")
  if(nullableSetOfNullablePoints.isDefined) require(nullableSetOfNullablePoints.get ne null, "Null value was provided for property \"nullableSetOfNullablePoints\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullablePoints)
    new NullableSetOfNullablePoints_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableSetOfNullablePoints = nullableSetOfNullablePoints, _calculatedNullableSetOfNullablePoints = _calculatedNullableSetOfNullablePoints, _persistedNullableSetOfNullablePoints = _persistedNullableSetOfNullablePoints)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfNullablePoints_3): this.type = {
    this._URI = result._URI
    this._nullableSetOfNullablePoints = result._nullableSetOfNullablePoints
    this._calculatedNullableSetOfNullablePoints = result._calculatedNullableSetOfNullablePoints
    this._persistedNullableSetOfNullablePoints = result._persistedNullableSetOfNullablePoints
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfNullablePoints_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullablePoints")
  def nullableSetOfNullablePoints = {
    _nullableSetOfNullablePoints
  }

  def nullableSetOfNullablePoints_= (value: Option[Set[Option[java.awt.geom.Point2D]]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _nullableSetOfNullablePoints = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfNullablePoints")
  def calculatedNullableSetOfNullablePoints = {
    _calculatedNullableSetOfNullablePoints
  }

  def calculatedNullableSetOfNullablePoints_= (value: Option[Set[Option[java.awt.geom.Point2D]]]) {
    _calculatedNullableSetOfNullablePoints = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfNullablePoints")
  def persistedNullableSetOfNullablePoints = {
    _persistedNullableSetOfNullablePoints
  }

  def persistedNullableSetOfNullablePoints_= (value: Option[Set[Option[java.awt.geom.Point2D]]]) {
    _persistedNullableSetOfNullablePoints = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullablePoints") nullableSetOfNullablePoints: Option[Set[Option[java.awt.geom.Point2D]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfNullablePoints") calculatedNullableSetOfNullablePoints: Option[Set[Option[java.awt.geom.Point2D]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfNullablePoints") persistedNullableSetOfNullablePoints: Option[Set[Option[java.awt.geom.Point2D]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableSetOfNullablePoints = nullableSetOfNullablePoints, _calculatedNullableSetOfNullablePoints = calculatedNullableSetOfNullablePoints, _persistedNullableSetOfNullablePoints = persistedNullableSetOfNullablePoints)

}

object NullableSetOfNullablePoints_3 extends AggregateRootCompanion[NullableSetOfNullablePoints_3]{

  def apply(
    nullableSetOfNullablePoints: Option[Set[Option[java.awt.geom.Point2D]]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullablePoints)
    require(nullableSetOfNullablePoints ne null, "Null value was provided for property \"nullableSetOfNullablePoints\"")
    if (nullableSetOfNullablePoints.isDefined) require(nullableSetOfNullablePoints.get ne null, "Null value was provided for property \"nullableSetOfNullablePoints\"")
    new NullableSetOfNullablePoints_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableSetOfNullablePoints = nullableSetOfNullablePoints
    , _calculatedNullableSetOfNullablePoints = None
    , _persistedNullableSetOfNullablePoints = None)
  }

}
