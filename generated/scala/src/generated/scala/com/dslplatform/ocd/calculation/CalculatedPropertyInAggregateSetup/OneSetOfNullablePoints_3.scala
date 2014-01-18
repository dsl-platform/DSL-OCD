package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfNullablePoints_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneSetOfNullablePoints: Set[Option[java.awt.geom.Point2D]],
    private var _calculatedOneSetOfNullablePoints: Set[Option[java.awt.geom.Point2D]],
    private var _persistedOneSetOfNullablePoints: Set[Option[java.awt.geom.Point2D]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfNullablePoints_3 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfNullablePoints_3("+ URI +")"

   def copy(oneSetOfNullablePoints: Set[Option[java.awt.geom.Point2D]] = this._oneSetOfNullablePoints): OneSetOfNullablePoints_3 = {

  require(oneSetOfNullablePoints ne null, "Null value was provided for property \"oneSetOfNullablePoints\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullablePoints)
    new OneSetOfNullablePoints_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneSetOfNullablePoints = oneSetOfNullablePoints, _calculatedOneSetOfNullablePoints = _calculatedOneSetOfNullablePoints, _persistedOneSetOfNullablePoints = _persistedOneSetOfNullablePoints)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfNullablePoints_3): this.type = {
    this._URI = result._URI
    this._oneSetOfNullablePoints = result._oneSetOfNullablePoints
    this._calculatedOneSetOfNullablePoints = result._calculatedOneSetOfNullablePoints
    this._persistedOneSetOfNullablePoints = result._persistedOneSetOfNullablePoints
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfNullablePoints_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullablePoints")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfNullablePoints = {
    _oneSetOfNullablePoints
  }

  def oneSetOfNullablePoints_= (value: Set[Option[java.awt.geom.Point2D]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _oneSetOfNullablePoints = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullablePoints")
  def calculatedOneSetOfNullablePoints = {
    _calculatedOneSetOfNullablePoints
  }

  def calculatedOneSetOfNullablePoints_= (value: Set[Option[java.awt.geom.Point2D]]) {
    _calculatedOneSetOfNullablePoints = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullablePoints")
  def persistedOneSetOfNullablePoints = {
    _persistedOneSetOfNullablePoints
  }

  def persistedOneSetOfNullablePoints_= (value: Set[Option[java.awt.geom.Point2D]]) {
    _persistedOneSetOfNullablePoints = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullablePoints") oneSetOfNullablePoints: Set[Option[java.awt.geom.Point2D]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullablePoints") calculatedOneSetOfNullablePoints: Set[Option[java.awt.geom.Point2D]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullablePoints") persistedOneSetOfNullablePoints: Set[Option[java.awt.geom.Point2D]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneSetOfNullablePoints = if (oneSetOfNullablePoints == null) Set.empty else oneSetOfNullablePoints, _calculatedOneSetOfNullablePoints = calculatedOneSetOfNullablePoints, _persistedOneSetOfNullablePoints = persistedOneSetOfNullablePoints)

}

object OneSetOfNullablePoints_3 extends AggregateRootCompanion[OneSetOfNullablePoints_3]{

  def apply(
    oneSetOfNullablePoints: Set[Option[java.awt.geom.Point2D]] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullablePoints)
    require(oneSetOfNullablePoints ne null, "Null value was provided for property \"oneSetOfNullablePoints\"")
    new OneSetOfNullablePoints_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneSetOfNullablePoints = oneSetOfNullablePoints
    , _calculatedOneSetOfNullablePoints = Set.empty
    , _persistedOneSetOfNullablePoints = Set.empty)
  }

}
