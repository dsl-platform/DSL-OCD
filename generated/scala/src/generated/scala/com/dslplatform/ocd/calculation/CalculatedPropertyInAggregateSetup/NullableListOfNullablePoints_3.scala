package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableListOfNullablePoints_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableListOfNullablePoints: Option[IndexedSeq[Option[java.awt.geom.Point2D]]],
    private var _calculatedNullableListOfNullablePoints: Option[IndexedSeq[Option[java.awt.geom.Point2D]]],
    private var _persistedNullableListOfNullablePoints: Option[IndexedSeq[Option[java.awt.geom.Point2D]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableListOfNullablePoints_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableListOfNullablePoints_3("+ URI +")"

   def copy(nullableListOfNullablePoints: Option[IndexedSeq[Option[java.awt.geom.Point2D]]] = this._nullableListOfNullablePoints): NullableListOfNullablePoints_3 = {

  require(nullableListOfNullablePoints ne null, "Null value was provided for property \"nullableListOfNullablePoints\"")
  if(nullableListOfNullablePoints.isDefined) require(nullableListOfNullablePoints.get ne null, "Null value was provided for property \"nullableListOfNullablePoints\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullablePoints)
    new NullableListOfNullablePoints_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableListOfNullablePoints = nullableListOfNullablePoints, _calculatedNullableListOfNullablePoints = _calculatedNullableListOfNullablePoints, _persistedNullableListOfNullablePoints = _persistedNullableListOfNullablePoints)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfNullablePoints_3): this.type = {
    this._URI = result._URI
    this._nullableListOfNullablePoints = result._nullableListOfNullablePoints
    this._calculatedNullableListOfNullablePoints = result._calculatedNullableListOfNullablePoints
    this._persistedNullableListOfNullablePoints = result._persistedNullableListOfNullablePoints
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfNullablePoints_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullablePoints")
  def nullableListOfNullablePoints = {
    _nullableListOfNullablePoints
  }

  def nullableListOfNullablePoints_= (value: Option[IndexedSeq[Option[java.awt.geom.Point2D]]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _nullableListOfNullablePoints = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfNullablePoints")
  def calculatedNullableListOfNullablePoints = {
    _calculatedNullableListOfNullablePoints
  }

  def calculatedNullableListOfNullablePoints_= (value: Option[IndexedSeq[Option[java.awt.geom.Point2D]]]) {
    _calculatedNullableListOfNullablePoints = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfNullablePoints")
  def persistedNullableListOfNullablePoints = {
    _persistedNullableListOfNullablePoints
  }

  def persistedNullableListOfNullablePoints_= (value: Option[IndexedSeq[Option[java.awt.geom.Point2D]]]) {
    _persistedNullableListOfNullablePoints = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullablePoints") nullableListOfNullablePoints: Option[IndexedSeq[Option[java.awt.geom.Point2D]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfNullablePoints") calculatedNullableListOfNullablePoints: Option[IndexedSeq[Option[java.awt.geom.Point2D]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfNullablePoints") persistedNullableListOfNullablePoints: Option[IndexedSeq[Option[java.awt.geom.Point2D]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableListOfNullablePoints = nullableListOfNullablePoints, _calculatedNullableListOfNullablePoints = calculatedNullableListOfNullablePoints, _persistedNullableListOfNullablePoints = persistedNullableListOfNullablePoints)

}

object NullableListOfNullablePoints_3 extends AggregateRootCompanion[NullableListOfNullablePoints_3]{

  def apply(
    nullableListOfNullablePoints: Option[IndexedSeq[Option[java.awt.geom.Point2D]]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullablePoints)
    require(nullableListOfNullablePoints ne null, "Null value was provided for property \"nullableListOfNullablePoints\"")
    if (nullableListOfNullablePoints.isDefined) require(nullableListOfNullablePoints.get ne null, "Null value was provided for property \"nullableListOfNullablePoints\"")
    new NullableListOfNullablePoints_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableListOfNullablePoints = nullableListOfNullablePoints
    , _calculatedNullableListOfNullablePoints = None
    , _persistedNullableListOfNullablePoints = None)
  }

}
