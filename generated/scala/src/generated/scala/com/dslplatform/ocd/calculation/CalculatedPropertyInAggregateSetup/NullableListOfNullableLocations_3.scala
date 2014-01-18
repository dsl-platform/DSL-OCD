package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableListOfNullableLocations_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableListOfNullableLocations: Option[IndexedSeq[Option[java.awt.geom.Point2D]]],
    private var _calculatedNullableListOfNullableLocations: Option[IndexedSeq[Option[java.awt.geom.Point2D]]],
    private var _persistedNullableListOfNullableLocations: Option[IndexedSeq[Option[java.awt.geom.Point2D]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableListOfNullableLocations_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableListOfNullableLocations_3("+ URI +")"

   def copy(nullableListOfNullableLocations: Option[IndexedSeq[Option[java.awt.geom.Point2D]]] = this._nullableListOfNullableLocations): NullableListOfNullableLocations_3 = {

  require(nullableListOfNullableLocations ne null, "Null value was provided for property \"nullableListOfNullableLocations\"")
  if(nullableListOfNullableLocations.isDefined) require(nullableListOfNullableLocations.get ne null, "Null value was provided for property \"nullableListOfNullableLocations\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableLocations)
    new NullableListOfNullableLocations_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableListOfNullableLocations = nullableListOfNullableLocations, _calculatedNullableListOfNullableLocations = _calculatedNullableListOfNullableLocations, _persistedNullableListOfNullableLocations = _persistedNullableListOfNullableLocations)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfNullableLocations_3): this.type = {
    this._URI = result._URI
    this._nullableListOfNullableLocations = result._nullableListOfNullableLocations
    this._calculatedNullableListOfNullableLocations = result._calculatedNullableListOfNullableLocations
    this._persistedNullableListOfNullableLocations = result._persistedNullableListOfNullableLocations
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfNullableLocations_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableLocations")
  def nullableListOfNullableLocations = {
    _nullableListOfNullableLocations
  }

  def nullableListOfNullableLocations_= (value: Option[IndexedSeq[Option[java.awt.geom.Point2D]]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _nullableListOfNullableLocations = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfNullableLocations")
  def calculatedNullableListOfNullableLocations = {
    _calculatedNullableListOfNullableLocations
  }

  def calculatedNullableListOfNullableLocations_= (value: Option[IndexedSeq[Option[java.awt.geom.Point2D]]]) {
    _calculatedNullableListOfNullableLocations = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfNullableLocations")
  def persistedNullableListOfNullableLocations = {
    _persistedNullableListOfNullableLocations
  }

  def persistedNullableListOfNullableLocations_= (value: Option[IndexedSeq[Option[java.awt.geom.Point2D]]]) {
    _persistedNullableListOfNullableLocations = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableLocations") nullableListOfNullableLocations: Option[IndexedSeq[Option[java.awt.geom.Point2D]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfNullableLocations") calculatedNullableListOfNullableLocations: Option[IndexedSeq[Option[java.awt.geom.Point2D]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfNullableLocations") persistedNullableListOfNullableLocations: Option[IndexedSeq[Option[java.awt.geom.Point2D]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableListOfNullableLocations = nullableListOfNullableLocations, _calculatedNullableListOfNullableLocations = calculatedNullableListOfNullableLocations, _persistedNullableListOfNullableLocations = persistedNullableListOfNullableLocations)

}

object NullableListOfNullableLocations_3 extends AggregateRootCompanion[NullableListOfNullableLocations_3]{

  def apply(
    nullableListOfNullableLocations: Option[IndexedSeq[Option[java.awt.geom.Point2D]]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableLocations)
    require(nullableListOfNullableLocations ne null, "Null value was provided for property \"nullableListOfNullableLocations\"")
    if (nullableListOfNullableLocations.isDefined) require(nullableListOfNullableLocations.get ne null, "Null value was provided for property \"nullableListOfNullableLocations\"")
    new NullableListOfNullableLocations_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableListOfNullableLocations = nullableListOfNullableLocations
    , _calculatedNullableListOfNullableLocations = None
    , _persistedNullableListOfNullableLocations = None)
  }

}
