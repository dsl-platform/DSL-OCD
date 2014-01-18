package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableArrayOfOneRectangles_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableArrayOfOneRectangles: Option[Array[java.awt.geom.Rectangle2D]],
    private var _calculatedNullableArrayOfOneRectangles: Option[Array[java.awt.geom.Rectangle2D]],
    private var _persistedNullableArrayOfOneRectangles: Option[Array[java.awt.geom.Rectangle2D]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableArrayOfOneRectangles_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableArrayOfOneRectangles_3("+ URI +")"

   def copy(nullableArrayOfOneRectangles: Option[Array[java.awt.geom.Rectangle2D]] = this._nullableArrayOfOneRectangles): NullableArrayOfOneRectangles_3 = {

  require(nullableArrayOfOneRectangles ne null, "Null value was provided for property \"nullableArrayOfOneRectangles\"")
  if(nullableArrayOfOneRectangles.isDefined) require(nullableArrayOfOneRectangles.get ne null, "Null value was provided for property \"nullableArrayOfOneRectangles\"")
  com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneRectangles)
    new NullableArrayOfOneRectangles_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableArrayOfOneRectangles = nullableArrayOfOneRectangles, _calculatedNullableArrayOfOneRectangles = _calculatedNullableArrayOfOneRectangles, _persistedNullableArrayOfOneRectangles = _persistedNullableArrayOfOneRectangles)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfOneRectangles_3): this.type = {
    this._URI = result._URI
    this._nullableArrayOfOneRectangles = result._nullableArrayOfOneRectangles
    this._calculatedNullableArrayOfOneRectangles = result._calculatedNullableArrayOfOneRectangles
    this._persistedNullableArrayOfOneRectangles = result._persistedNullableArrayOfOneRectangles
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfOneRectangles_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneRectangles")
  def nullableArrayOfOneRectangles = {
    _nullableArrayOfOneRectangles
  }

  def nullableArrayOfOneRectangles_= (value: Option[Array[java.awt.geom.Rectangle2D]]) {
    com.dslplatform.api.Guards.checkArrayNulls(value)
    _nullableArrayOfOneRectangles = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfOneRectangles")
  def calculatedNullableArrayOfOneRectangles = {
    _calculatedNullableArrayOfOneRectangles
  }

  def calculatedNullableArrayOfOneRectangles_= (value: Option[Array[java.awt.geom.Rectangle2D]]) {
    _calculatedNullableArrayOfOneRectangles = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfOneRectangles")
  def persistedNullableArrayOfOneRectangles = {
    _persistedNullableArrayOfOneRectangles
  }

  def persistedNullableArrayOfOneRectangles_= (value: Option[Array[java.awt.geom.Rectangle2D]]) {
    _persistedNullableArrayOfOneRectangles = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneRectangles") nullableArrayOfOneRectangles: Option[Array[java.awt.geom.Rectangle2D]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfOneRectangles") calculatedNullableArrayOfOneRectangles: Option[Array[java.awt.geom.Rectangle2D]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfOneRectangles") persistedNullableArrayOfOneRectangles: Option[Array[java.awt.geom.Rectangle2D]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableArrayOfOneRectangles = nullableArrayOfOneRectangles, _calculatedNullableArrayOfOneRectangles = calculatedNullableArrayOfOneRectangles, _persistedNullableArrayOfOneRectangles = persistedNullableArrayOfOneRectangles)

}

object NullableArrayOfOneRectangles_3 extends AggregateRootCompanion[NullableArrayOfOneRectangles_3]{

  def apply(
    nullableArrayOfOneRectangles: Option[Array[java.awt.geom.Rectangle2D]] = None
  ) = {
    com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneRectangles)
    require(nullableArrayOfOneRectangles ne null, "Null value was provided for property \"nullableArrayOfOneRectangles\"")
    if (nullableArrayOfOneRectangles.isDefined) require(nullableArrayOfOneRectangles.get ne null, "Null value was provided for property \"nullableArrayOfOneRectangles\"")
    new NullableArrayOfOneRectangles_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableArrayOfOneRectangles = nullableArrayOfOneRectangles
    , _calculatedNullableArrayOfOneRectangles = None
    , _persistedNullableArrayOfOneRectangles = None)
  }

}
