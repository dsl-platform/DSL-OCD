package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullablePoint_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullablePoint: Option[java.awt.geom.Point2D],
    private var _calculatedNullablePoint: Option[java.awt.geom.Point2D],
    private var _persistedNullablePoint: Option[java.awt.geom.Point2D]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullablePoint_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullablePoint_3("+ URI +")"

   def copy(nullablePoint: Option[java.awt.geom.Point2D] = this._nullablePoint): NullablePoint_3 = {

  require(nullablePoint ne null, "Null value was provided for property \"nullablePoint\"")
  if(nullablePoint.isDefined) require(nullablePoint.get ne null, "Null value was provided for property \"nullablePoint\"")
    new NullablePoint_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullablePoint = nullablePoint, _calculatedNullablePoint = _calculatedNullablePoint, _persistedNullablePoint = _persistedNullablePoint)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullablePoint_3): this.type = {
    this._URI = result._URI
    this._nullablePoint = result._nullablePoint
    this._calculatedNullablePoint = result._calculatedNullablePoint
    this._persistedNullablePoint = result._persistedNullablePoint
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullablePoint_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullablePoint")
  def nullablePoint = {
    _nullablePoint
  }

  def nullablePoint_= (value: Option[java.awt.geom.Point2D]) {
    _nullablePoint = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullablePoint")
  def calculatedNullablePoint = {
    _calculatedNullablePoint
  }

  def calculatedNullablePoint_= (value: Option[java.awt.geom.Point2D]) {
    _calculatedNullablePoint = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullablePoint")
  def persistedNullablePoint = {
    _persistedNullablePoint
  }

  def persistedNullablePoint_= (value: Option[java.awt.geom.Point2D]) {
    _persistedNullablePoint = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullablePoint") nullablePoint: Option[java.awt.geom.Point2D]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullablePoint") calculatedNullablePoint: Option[java.awt.geom.Point2D]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullablePoint") persistedNullablePoint: Option[java.awt.geom.Point2D]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullablePoint = nullablePoint, _calculatedNullablePoint = calculatedNullablePoint, _persistedNullablePoint = persistedNullablePoint)

}

object NullablePoint_3 extends AggregateRootCompanion[NullablePoint_3]{

  def apply(
    nullablePoint: Option[java.awt.geom.Point2D] = None
  ) = {
    require(nullablePoint ne null, "Null value was provided for property \"nullablePoint\"")
    if (nullablePoint.isDefined) require(nullablePoint.get ne null, "Null value was provided for property \"nullablePoint\"")
    new NullablePoint_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullablePoint = nullablePoint
    , _calculatedNullablePoint = None
    , _persistedNullablePoint = None)
  }

}
