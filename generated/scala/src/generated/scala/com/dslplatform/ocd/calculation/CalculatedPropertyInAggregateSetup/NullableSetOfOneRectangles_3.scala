package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableSetOfOneRectangles_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableSetOfOneRectangles: Option[Set[java.awt.geom.Rectangle2D]],
    private var _calculatedNullableSetOfOneRectangles: Option[Set[java.awt.geom.Rectangle2D]],
    private var _persistedNullableSetOfOneRectangles: Option[Set[java.awt.geom.Rectangle2D]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableSetOfOneRectangles_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableSetOfOneRectangles_3("+ URI +")"

   def copy(nullableSetOfOneRectangles: Option[Set[java.awt.geom.Rectangle2D]] = this._nullableSetOfOneRectangles): NullableSetOfOneRectangles_3 = {

  require(nullableSetOfOneRectangles ne null, "Null value was provided for property \"nullableSetOfOneRectangles\"")
  if(nullableSetOfOneRectangles.isDefined) require(nullableSetOfOneRectangles.get ne null, "Null value was provided for property \"nullableSetOfOneRectangles\"")
  com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneRectangles)
    new NullableSetOfOneRectangles_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableSetOfOneRectangles = nullableSetOfOneRectangles, _calculatedNullableSetOfOneRectangles = _calculatedNullableSetOfOneRectangles, _persistedNullableSetOfOneRectangles = _persistedNullableSetOfOneRectangles)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfOneRectangles_3): this.type = {
    this._URI = result._URI
    this._nullableSetOfOneRectangles = result._nullableSetOfOneRectangles
    this._calculatedNullableSetOfOneRectangles = result._calculatedNullableSetOfOneRectangles
    this._persistedNullableSetOfOneRectangles = result._persistedNullableSetOfOneRectangles
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfOneRectangles_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneRectangles")
  def nullableSetOfOneRectangles = {
    _nullableSetOfOneRectangles
  }

  def nullableSetOfOneRectangles_= (value: Option[Set[java.awt.geom.Rectangle2D]]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _nullableSetOfOneRectangles = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfOneRectangles")
  def calculatedNullableSetOfOneRectangles = {
    _calculatedNullableSetOfOneRectangles
  }

  def calculatedNullableSetOfOneRectangles_= (value: Option[Set[java.awt.geom.Rectangle2D]]) {
    _calculatedNullableSetOfOneRectangles = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfOneRectangles")
  def persistedNullableSetOfOneRectangles = {
    _persistedNullableSetOfOneRectangles
  }

  def persistedNullableSetOfOneRectangles_= (value: Option[Set[java.awt.geom.Rectangle2D]]) {
    _persistedNullableSetOfOneRectangles = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneRectangles") nullableSetOfOneRectangles: Option[Set[java.awt.geom.Rectangle2D]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfOneRectangles") calculatedNullableSetOfOneRectangles: Option[Set[java.awt.geom.Rectangle2D]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfOneRectangles") persistedNullableSetOfOneRectangles: Option[Set[java.awt.geom.Rectangle2D]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableSetOfOneRectangles = nullableSetOfOneRectangles, _calculatedNullableSetOfOneRectangles = calculatedNullableSetOfOneRectangles, _persistedNullableSetOfOneRectangles = persistedNullableSetOfOneRectangles)

}

object NullableSetOfOneRectangles_3 extends AggregateRootCompanion[NullableSetOfOneRectangles_3]{

  def apply(
    nullableSetOfOneRectangles: Option[Set[java.awt.geom.Rectangle2D]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneRectangles)
    require(nullableSetOfOneRectangles ne null, "Null value was provided for property \"nullableSetOfOneRectangles\"")
    if (nullableSetOfOneRectangles.isDefined) require(nullableSetOfOneRectangles.get ne null, "Null value was provided for property \"nullableSetOfOneRectangles\"")
    new NullableSetOfOneRectangles_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableSetOfOneRectangles = nullableSetOfOneRectangles
    , _calculatedNullableSetOfOneRectangles = None
    , _persistedNullableSetOfOneRectangles = None)
  }

}
