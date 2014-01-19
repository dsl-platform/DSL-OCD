package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableListOfNullableRectangles_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableListOfNullableRectangles: Option[IndexedSeq[Option[java.awt.geom.Rectangle2D]]],
    private var _calculatedNullableListOfNullableRectangles: Option[IndexedSeq[Option[java.awt.geom.Rectangle2D]]],
    private var _persistedNullableListOfNullableRectangles: Option[IndexedSeq[Option[java.awt.geom.Rectangle2D]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableListOfNullableRectangles_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableListOfNullableRectangles_3("+ URI +")"

   def copy(nullableListOfNullableRectangles: Option[IndexedSeq[Option[java.awt.geom.Rectangle2D]]] = this._nullableListOfNullableRectangles): NullableListOfNullableRectangles_3 = {

  require(nullableListOfNullableRectangles ne null, "Null value was provided for property \"nullableListOfNullableRectangles\"")
  if(nullableListOfNullableRectangles.isDefined) require(nullableListOfNullableRectangles.get ne null, "Null value was provided for property \"nullableListOfNullableRectangles\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableRectangles)
    new NullableListOfNullableRectangles_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableListOfNullableRectangles = nullableListOfNullableRectangles, _calculatedNullableListOfNullableRectangles = _calculatedNullableListOfNullableRectangles, _persistedNullableListOfNullableRectangles = _persistedNullableListOfNullableRectangles)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfNullableRectangles_3): this.type = {
    this._URI = result._URI
    this._nullableListOfNullableRectangles = result._nullableListOfNullableRectangles
    this._calculatedNullableListOfNullableRectangles = result._calculatedNullableListOfNullableRectangles
    this._persistedNullableListOfNullableRectangles = result._persistedNullableListOfNullableRectangles
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfNullableRectangles_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableRectangles")
  def nullableListOfNullableRectangles = {
    _nullableListOfNullableRectangles
  }

  def nullableListOfNullableRectangles_= (value: Option[IndexedSeq[Option[java.awt.geom.Rectangle2D]]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _nullableListOfNullableRectangles = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfNullableRectangles")
  def calculatedNullableListOfNullableRectangles = {
    _calculatedNullableListOfNullableRectangles
  }

  def calculatedNullableListOfNullableRectangles_= (value: Option[IndexedSeq[Option[java.awt.geom.Rectangle2D]]]) {
    _calculatedNullableListOfNullableRectangles = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfNullableRectangles")
  def persistedNullableListOfNullableRectangles = {
    _persistedNullableListOfNullableRectangles
  }

  def persistedNullableListOfNullableRectangles_= (value: Option[IndexedSeq[Option[java.awt.geom.Rectangle2D]]]) {
    _persistedNullableListOfNullableRectangles = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableRectangles") nullableListOfNullableRectangles: Option[IndexedSeq[Option[java.awt.geom.Rectangle2D]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfNullableRectangles") calculatedNullableListOfNullableRectangles: Option[IndexedSeq[Option[java.awt.geom.Rectangle2D]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfNullableRectangles") persistedNullableListOfNullableRectangles: Option[IndexedSeq[Option[java.awt.geom.Rectangle2D]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableListOfNullableRectangles = nullableListOfNullableRectangles, _calculatedNullableListOfNullableRectangles = calculatedNullableListOfNullableRectangles, _persistedNullableListOfNullableRectangles = persistedNullableListOfNullableRectangles)

}

object NullableListOfNullableRectangles_3 extends AggregateRootCompanion[NullableListOfNullableRectangles_3]{

  def apply(
    nullableListOfNullableRectangles: Option[IndexedSeq[Option[java.awt.geom.Rectangle2D]]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableRectangles)
    require(nullableListOfNullableRectangles ne null, "Null value was provided for property \"nullableListOfNullableRectangles\"")
    if (nullableListOfNullableRectangles.isDefined) require(nullableListOfNullableRectangles.get ne null, "Null value was provided for property \"nullableListOfNullableRectangles\"")
    new NullableListOfNullableRectangles_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableListOfNullableRectangles = nullableListOfNullableRectangles
    , _calculatedNullableListOfNullableRectangles = None
    , _persistedNullableListOfNullableRectangles = None)
  }

}