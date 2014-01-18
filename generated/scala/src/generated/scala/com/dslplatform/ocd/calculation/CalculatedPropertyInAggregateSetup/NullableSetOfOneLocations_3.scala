package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableSetOfOneLocations_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableSetOfOneLocations: Option[Set[java.awt.geom.Point2D]],
    private var _calculatedNullableSetOfOneLocations: Option[Set[java.awt.geom.Point2D]],
    private var _persistedNullableSetOfOneLocations: Option[Set[java.awt.geom.Point2D]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableSetOfOneLocations_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableSetOfOneLocations_3("+ URI +")"

   def copy(nullableSetOfOneLocations: Option[Set[java.awt.geom.Point2D]] = this._nullableSetOfOneLocations): NullableSetOfOneLocations_3 = {

  require(nullableSetOfOneLocations ne null, "Null value was provided for property \"nullableSetOfOneLocations\"")
  if(nullableSetOfOneLocations.isDefined) require(nullableSetOfOneLocations.get ne null, "Null value was provided for property \"nullableSetOfOneLocations\"")
  com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneLocations)
    new NullableSetOfOneLocations_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableSetOfOneLocations = nullableSetOfOneLocations, _calculatedNullableSetOfOneLocations = _calculatedNullableSetOfOneLocations, _persistedNullableSetOfOneLocations = _persistedNullableSetOfOneLocations)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfOneLocations_3): this.type = {
    this._URI = result._URI
    this._nullableSetOfOneLocations = result._nullableSetOfOneLocations
    this._calculatedNullableSetOfOneLocations = result._calculatedNullableSetOfOneLocations
    this._persistedNullableSetOfOneLocations = result._persistedNullableSetOfOneLocations
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfOneLocations_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneLocations")
  def nullableSetOfOneLocations = {
    _nullableSetOfOneLocations
  }

  def nullableSetOfOneLocations_= (value: Option[Set[java.awt.geom.Point2D]]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _nullableSetOfOneLocations = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfOneLocations")
  def calculatedNullableSetOfOneLocations = {
    _calculatedNullableSetOfOneLocations
  }

  def calculatedNullableSetOfOneLocations_= (value: Option[Set[java.awt.geom.Point2D]]) {
    _calculatedNullableSetOfOneLocations = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfOneLocations")
  def persistedNullableSetOfOneLocations = {
    _persistedNullableSetOfOneLocations
  }

  def persistedNullableSetOfOneLocations_= (value: Option[Set[java.awt.geom.Point2D]]) {
    _persistedNullableSetOfOneLocations = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneLocations") nullableSetOfOneLocations: Option[Set[java.awt.geom.Point2D]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfOneLocations") calculatedNullableSetOfOneLocations: Option[Set[java.awt.geom.Point2D]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfOneLocations") persistedNullableSetOfOneLocations: Option[Set[java.awt.geom.Point2D]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableSetOfOneLocations = nullableSetOfOneLocations, _calculatedNullableSetOfOneLocations = calculatedNullableSetOfOneLocations, _persistedNullableSetOfOneLocations = persistedNullableSetOfOneLocations)

}

object NullableSetOfOneLocations_3 extends AggregateRootCompanion[NullableSetOfOneLocations_3]{

  def apply(
    nullableSetOfOneLocations: Option[Set[java.awt.geom.Point2D]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneLocations)
    require(nullableSetOfOneLocations ne null, "Null value was provided for property \"nullableSetOfOneLocations\"")
    if (nullableSetOfOneLocations.isDefined) require(nullableSetOfOneLocations.get ne null, "Null value was provided for property \"nullableSetOfOneLocations\"")
    new NullableSetOfOneLocations_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableSetOfOneLocations = nullableSetOfOneLocations
    , _calculatedNullableSetOfOneLocations = None
    , _persistedNullableSetOfOneLocations = None)
  }

}
