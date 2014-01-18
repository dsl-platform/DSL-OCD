package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfNullableRectangles_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneSetOfNullableRectangles: Set[Option[java.awt.geom.Rectangle2D]],
    private var _calculatedOneSetOfNullableRectangles: Set[Option[java.awt.geom.Rectangle2D]],
    private var _persistedOneSetOfNullableRectangles: Set[Option[java.awt.geom.Rectangle2D]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfNullableRectangles_3 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfNullableRectangles_3("+ URI +")"

   def copy(oneSetOfNullableRectangles: Set[Option[java.awt.geom.Rectangle2D]] = this._oneSetOfNullableRectangles): OneSetOfNullableRectangles_3 = {

  require(oneSetOfNullableRectangles ne null, "Null value was provided for property \"oneSetOfNullableRectangles\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableRectangles)
    new OneSetOfNullableRectangles_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneSetOfNullableRectangles = oneSetOfNullableRectangles, _calculatedOneSetOfNullableRectangles = _calculatedOneSetOfNullableRectangles, _persistedOneSetOfNullableRectangles = _persistedOneSetOfNullableRectangles)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfNullableRectangles_3): this.type = {
    this._URI = result._URI
    this._oneSetOfNullableRectangles = result._oneSetOfNullableRectangles
    this._calculatedOneSetOfNullableRectangles = result._calculatedOneSetOfNullableRectangles
    this._persistedOneSetOfNullableRectangles = result._persistedOneSetOfNullableRectangles
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfNullableRectangles_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableRectangles")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfNullableRectangles = {
    _oneSetOfNullableRectangles
  }

  def oneSetOfNullableRectangles_= (value: Set[Option[java.awt.geom.Rectangle2D]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _oneSetOfNullableRectangles = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableRectangles")
  def calculatedOneSetOfNullableRectangles = {
    _calculatedOneSetOfNullableRectangles
  }

  def calculatedOneSetOfNullableRectangles_= (value: Set[Option[java.awt.geom.Rectangle2D]]) {
    _calculatedOneSetOfNullableRectangles = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableRectangles")
  def persistedOneSetOfNullableRectangles = {
    _persistedOneSetOfNullableRectangles
  }

  def persistedOneSetOfNullableRectangles_= (value: Set[Option[java.awt.geom.Rectangle2D]]) {
    _persistedOneSetOfNullableRectangles = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableRectangles") oneSetOfNullableRectangles: Set[Option[java.awt.geom.Rectangle2D]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableRectangles") calculatedOneSetOfNullableRectangles: Set[Option[java.awt.geom.Rectangle2D]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableRectangles") persistedOneSetOfNullableRectangles: Set[Option[java.awt.geom.Rectangle2D]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneSetOfNullableRectangles = if (oneSetOfNullableRectangles == null) Set.empty else oneSetOfNullableRectangles, _calculatedOneSetOfNullableRectangles = calculatedOneSetOfNullableRectangles, _persistedOneSetOfNullableRectangles = persistedOneSetOfNullableRectangles)

}

object OneSetOfNullableRectangles_3 extends AggregateRootCompanion[OneSetOfNullableRectangles_3]{

  def apply(
    oneSetOfNullableRectangles: Set[Option[java.awt.geom.Rectangle2D]] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableRectangles)
    require(oneSetOfNullableRectangles ne null, "Null value was provided for property \"oneSetOfNullableRectangles\"")
    new OneSetOfNullableRectangles_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneSetOfNullableRectangles = oneSetOfNullableRectangles
    , _calculatedOneSetOfNullableRectangles = Set.empty
    , _persistedOneSetOfNullableRectangles = Set.empty)
  }

}
