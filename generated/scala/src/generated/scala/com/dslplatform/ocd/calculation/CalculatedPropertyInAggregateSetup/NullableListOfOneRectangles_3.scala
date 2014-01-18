package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableListOfOneRectangles_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableListOfOneRectangles: Option[IndexedSeq[java.awt.geom.Rectangle2D]],
    private var _calculatedNullableListOfOneRectangles: Option[IndexedSeq[java.awt.geom.Rectangle2D]],
    private var _persistedNullableListOfOneRectangles: Option[IndexedSeq[java.awt.geom.Rectangle2D]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableListOfOneRectangles_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableListOfOneRectangles_3("+ URI +")"

   def copy(nullableListOfOneRectangles: Option[IndexedSeq[java.awt.geom.Rectangle2D]] = this._nullableListOfOneRectangles): NullableListOfOneRectangles_3 = {

  require(nullableListOfOneRectangles ne null, "Null value was provided for property \"nullableListOfOneRectangles\"")
  if(nullableListOfOneRectangles.isDefined) require(nullableListOfOneRectangles.get ne null, "Null value was provided for property \"nullableListOfOneRectangles\"")
  com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneRectangles)
    new NullableListOfOneRectangles_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableListOfOneRectangles = nullableListOfOneRectangles, _calculatedNullableListOfOneRectangles = _calculatedNullableListOfOneRectangles, _persistedNullableListOfOneRectangles = _persistedNullableListOfOneRectangles)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfOneRectangles_3): this.type = {
    this._URI = result._URI
    this._nullableListOfOneRectangles = result._nullableListOfOneRectangles
    this._calculatedNullableListOfOneRectangles = result._calculatedNullableListOfOneRectangles
    this._persistedNullableListOfOneRectangles = result._persistedNullableListOfOneRectangles
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfOneRectangles_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneRectangles")
  def nullableListOfOneRectangles = {
    _nullableListOfOneRectangles
  }

  def nullableListOfOneRectangles_= (value: Option[IndexedSeq[java.awt.geom.Rectangle2D]]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _nullableListOfOneRectangles = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfOneRectangles")
  def calculatedNullableListOfOneRectangles = {
    _calculatedNullableListOfOneRectangles
  }

  def calculatedNullableListOfOneRectangles_= (value: Option[IndexedSeq[java.awt.geom.Rectangle2D]]) {
    _calculatedNullableListOfOneRectangles = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfOneRectangles")
  def persistedNullableListOfOneRectangles = {
    _persistedNullableListOfOneRectangles
  }

  def persistedNullableListOfOneRectangles_= (value: Option[IndexedSeq[java.awt.geom.Rectangle2D]]) {
    _persistedNullableListOfOneRectangles = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneRectangles") nullableListOfOneRectangles: Option[IndexedSeq[java.awt.geom.Rectangle2D]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfOneRectangles") calculatedNullableListOfOneRectangles: Option[IndexedSeq[java.awt.geom.Rectangle2D]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfOneRectangles") persistedNullableListOfOneRectangles: Option[IndexedSeq[java.awt.geom.Rectangle2D]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableListOfOneRectangles = nullableListOfOneRectangles, _calculatedNullableListOfOneRectangles = calculatedNullableListOfOneRectangles, _persistedNullableListOfOneRectangles = persistedNullableListOfOneRectangles)

}

object NullableListOfOneRectangles_3 extends AggregateRootCompanion[NullableListOfOneRectangles_3]{

  def apply(
    nullableListOfOneRectangles: Option[IndexedSeq[java.awt.geom.Rectangle2D]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneRectangles)
    require(nullableListOfOneRectangles ne null, "Null value was provided for property \"nullableListOfOneRectangles\"")
    if (nullableListOfOneRectangles.isDefined) require(nullableListOfOneRectangles.get ne null, "Null value was provided for property \"nullableListOfOneRectangles\"")
    new NullableListOfOneRectangles_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableListOfOneRectangles = nullableListOfOneRectangles
    , _calculatedNullableListOfOneRectangles = None
    , _persistedNullableListOfOneRectangles = None)
  }

}
