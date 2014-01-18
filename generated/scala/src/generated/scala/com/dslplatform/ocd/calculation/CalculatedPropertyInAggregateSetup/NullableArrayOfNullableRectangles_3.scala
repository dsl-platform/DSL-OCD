package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableArrayOfNullableRectangles_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableArrayOfNullableRectangles: Option[Array[Option[java.awt.geom.Rectangle2D]]],
    private var _calculatedNullableArrayOfNullableRectangles: Option[Array[Option[java.awt.geom.Rectangle2D]]],
    private var _persistedNullableArrayOfNullableRectangles: Option[Array[Option[java.awt.geom.Rectangle2D]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableArrayOfNullableRectangles_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableArrayOfNullableRectangles_3("+ URI +")"

   def copy(nullableArrayOfNullableRectangles: Option[Array[Option[java.awt.geom.Rectangle2D]]] = this._nullableArrayOfNullableRectangles): NullableArrayOfNullableRectangles_3 = {

  require(nullableArrayOfNullableRectangles ne null, "Null value was provided for property \"nullableArrayOfNullableRectangles\"")
  if(nullableArrayOfNullableRectangles.isDefined) require(nullableArrayOfNullableRectangles.get ne null, "Null value was provided for property \"nullableArrayOfNullableRectangles\"")
  com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableRectangles)
    new NullableArrayOfNullableRectangles_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableArrayOfNullableRectangles = nullableArrayOfNullableRectangles, _calculatedNullableArrayOfNullableRectangles = _calculatedNullableArrayOfNullableRectangles, _persistedNullableArrayOfNullableRectangles = _persistedNullableArrayOfNullableRectangles)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfNullableRectangles_3): this.type = {
    this._URI = result._URI
    this._nullableArrayOfNullableRectangles = result._nullableArrayOfNullableRectangles
    this._calculatedNullableArrayOfNullableRectangles = result._calculatedNullableArrayOfNullableRectangles
    this._persistedNullableArrayOfNullableRectangles = result._persistedNullableArrayOfNullableRectangles
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfNullableRectangles_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableRectangles")
  def nullableArrayOfNullableRectangles = {
    _nullableArrayOfNullableRectangles
  }

  def nullableArrayOfNullableRectangles_= (value: Option[Array[Option[java.awt.geom.Rectangle2D]]]) {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(value)
    _nullableArrayOfNullableRectangles = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfNullableRectangles")
  def calculatedNullableArrayOfNullableRectangles = {
    _calculatedNullableArrayOfNullableRectangles
  }

  def calculatedNullableArrayOfNullableRectangles_= (value: Option[Array[Option[java.awt.geom.Rectangle2D]]]) {
    _calculatedNullableArrayOfNullableRectangles = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfNullableRectangles")
  def persistedNullableArrayOfNullableRectangles = {
    _persistedNullableArrayOfNullableRectangles
  }

  def persistedNullableArrayOfNullableRectangles_= (value: Option[Array[Option[java.awt.geom.Rectangle2D]]]) {
    _persistedNullableArrayOfNullableRectangles = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableRectangles") nullableArrayOfNullableRectangles: Option[Array[Option[java.awt.geom.Rectangle2D]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfNullableRectangles") calculatedNullableArrayOfNullableRectangles: Option[Array[Option[java.awt.geom.Rectangle2D]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfNullableRectangles") persistedNullableArrayOfNullableRectangles: Option[Array[Option[java.awt.geom.Rectangle2D]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableArrayOfNullableRectangles = nullableArrayOfNullableRectangles, _calculatedNullableArrayOfNullableRectangles = calculatedNullableArrayOfNullableRectangles, _persistedNullableArrayOfNullableRectangles = persistedNullableArrayOfNullableRectangles)

}

object NullableArrayOfNullableRectangles_3 extends AggregateRootCompanion[NullableArrayOfNullableRectangles_3]{

  def apply(
    nullableArrayOfNullableRectangles: Option[Array[Option[java.awt.geom.Rectangle2D]]] = None
  ) = {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableRectangles)
    require(nullableArrayOfNullableRectangles ne null, "Null value was provided for property \"nullableArrayOfNullableRectangles\"")
    if (nullableArrayOfNullableRectangles.isDefined) require(nullableArrayOfNullableRectangles.get ne null, "Null value was provided for property \"nullableArrayOfNullableRectangles\"")
    new NullableArrayOfNullableRectangles_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableArrayOfNullableRectangles = nullableArrayOfNullableRectangles
    , _calculatedNullableArrayOfNullableRectangles = None
    , _persistedNullableArrayOfNullableRectangles = None)
  }

}
