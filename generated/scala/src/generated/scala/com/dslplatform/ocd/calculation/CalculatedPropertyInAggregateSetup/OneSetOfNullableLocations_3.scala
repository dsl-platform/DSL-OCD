package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfNullableLocations_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneSetOfNullableLocations: Set[Option[java.awt.geom.Point2D]],
    private var _calculatedOneSetOfNullableLocations: Set[Option[java.awt.geom.Point2D]],
    private var _persistedOneSetOfNullableLocations: Set[Option[java.awt.geom.Point2D]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfNullableLocations_3 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfNullableLocations_3("+ URI +")"

   def copy(oneSetOfNullableLocations: Set[Option[java.awt.geom.Point2D]] = this._oneSetOfNullableLocations): OneSetOfNullableLocations_3 = {

  require(oneSetOfNullableLocations ne null, "Null value was provided for property \"oneSetOfNullableLocations\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableLocations)
    new OneSetOfNullableLocations_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneSetOfNullableLocations = oneSetOfNullableLocations, _calculatedOneSetOfNullableLocations = _calculatedOneSetOfNullableLocations, _persistedOneSetOfNullableLocations = _persistedOneSetOfNullableLocations)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfNullableLocations_3): this.type = {
    this._URI = result._URI
    this._oneSetOfNullableLocations = result._oneSetOfNullableLocations
    this._calculatedOneSetOfNullableLocations = result._calculatedOneSetOfNullableLocations
    this._persistedOneSetOfNullableLocations = result._persistedOneSetOfNullableLocations
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfNullableLocations_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableLocations")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfNullableLocations = {
    _oneSetOfNullableLocations
  }

  def oneSetOfNullableLocations_= (value: Set[Option[java.awt.geom.Point2D]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _oneSetOfNullableLocations = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableLocations")
  def calculatedOneSetOfNullableLocations = {
    _calculatedOneSetOfNullableLocations
  }

  def calculatedOneSetOfNullableLocations_= (value: Set[Option[java.awt.geom.Point2D]]) {
    _calculatedOneSetOfNullableLocations = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableLocations")
  def persistedOneSetOfNullableLocations = {
    _persistedOneSetOfNullableLocations
  }

  def persistedOneSetOfNullableLocations_= (value: Set[Option[java.awt.geom.Point2D]]) {
    _persistedOneSetOfNullableLocations = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableLocations") oneSetOfNullableLocations: Set[Option[java.awt.geom.Point2D]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableLocations") calculatedOneSetOfNullableLocations: Set[Option[java.awt.geom.Point2D]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableLocations") persistedOneSetOfNullableLocations: Set[Option[java.awt.geom.Point2D]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneSetOfNullableLocations = if (oneSetOfNullableLocations == null) Set.empty else oneSetOfNullableLocations, _calculatedOneSetOfNullableLocations = calculatedOneSetOfNullableLocations, _persistedOneSetOfNullableLocations = persistedOneSetOfNullableLocations)

}

object OneSetOfNullableLocations_3 extends AggregateRootCompanion[OneSetOfNullableLocations_3]{

  def apply(
    oneSetOfNullableLocations: Set[Option[java.awt.geom.Point2D]] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableLocations)
    require(oneSetOfNullableLocations ne null, "Null value was provided for property \"oneSetOfNullableLocations\"")
    new OneSetOfNullableLocations_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneSetOfNullableLocations = oneSetOfNullableLocations
    , _calculatedOneSetOfNullableLocations = Set.empty
    , _persistedOneSetOfNullableLocations = Set.empty)
  }

}
