package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableListOfOneLocations_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableListOfOneLocations: Option[IndexedSeq[java.awt.geom.Point2D]],
    private var _calculatedNullableListOfOneLocations: Option[IndexedSeq[java.awt.geom.Point2D]],
    private var _persistedNullableListOfOneLocations: Option[IndexedSeq[java.awt.geom.Point2D]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableListOfOneLocations_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableListOfOneLocations_3("+ URI +")"

   def copy(nullableListOfOneLocations: Option[IndexedSeq[java.awt.geom.Point2D]] = this._nullableListOfOneLocations): NullableListOfOneLocations_3 = {

  require(nullableListOfOneLocations ne null, "Null value was provided for property \"nullableListOfOneLocations\"")
  if(nullableListOfOneLocations.isDefined) require(nullableListOfOneLocations.get ne null, "Null value was provided for property \"nullableListOfOneLocations\"")
  com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneLocations)
    new NullableListOfOneLocations_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableListOfOneLocations = nullableListOfOneLocations, _calculatedNullableListOfOneLocations = _calculatedNullableListOfOneLocations, _persistedNullableListOfOneLocations = _persistedNullableListOfOneLocations)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfOneLocations_3): this.type = {
    this._URI = result._URI
    this._nullableListOfOneLocations = result._nullableListOfOneLocations
    this._calculatedNullableListOfOneLocations = result._calculatedNullableListOfOneLocations
    this._persistedNullableListOfOneLocations = result._persistedNullableListOfOneLocations
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfOneLocations_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneLocations")
  def nullableListOfOneLocations = {
    _nullableListOfOneLocations
  }

  def nullableListOfOneLocations_= (value: Option[IndexedSeq[java.awt.geom.Point2D]]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _nullableListOfOneLocations = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfOneLocations")
  def calculatedNullableListOfOneLocations = {
    _calculatedNullableListOfOneLocations
  }

  def calculatedNullableListOfOneLocations_= (value: Option[IndexedSeq[java.awt.geom.Point2D]]) {
    _calculatedNullableListOfOneLocations = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfOneLocations")
  def persistedNullableListOfOneLocations = {
    _persistedNullableListOfOneLocations
  }

  def persistedNullableListOfOneLocations_= (value: Option[IndexedSeq[java.awt.geom.Point2D]]) {
    _persistedNullableListOfOneLocations = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneLocations") nullableListOfOneLocations: Option[IndexedSeq[java.awt.geom.Point2D]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfOneLocations") calculatedNullableListOfOneLocations: Option[IndexedSeq[java.awt.geom.Point2D]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfOneLocations") persistedNullableListOfOneLocations: Option[IndexedSeq[java.awt.geom.Point2D]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableListOfOneLocations = nullableListOfOneLocations, _calculatedNullableListOfOneLocations = calculatedNullableListOfOneLocations, _persistedNullableListOfOneLocations = persistedNullableListOfOneLocations)

}

object NullableListOfOneLocations_3 extends AggregateRootCompanion[NullableListOfOneLocations_3]{

  def apply(
    nullableListOfOneLocations: Option[IndexedSeq[java.awt.geom.Point2D]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneLocations)
    require(nullableListOfOneLocations ne null, "Null value was provided for property \"nullableListOfOneLocations\"")
    if (nullableListOfOneLocations.isDefined) require(nullableListOfOneLocations.get ne null, "Null value was provided for property \"nullableListOfOneLocations\"")
    new NullableListOfOneLocations_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableListOfOneLocations = nullableListOfOneLocations
    , _calculatedNullableListOfOneLocations = None
    , _persistedNullableListOfOneLocations = None)
  }

}
