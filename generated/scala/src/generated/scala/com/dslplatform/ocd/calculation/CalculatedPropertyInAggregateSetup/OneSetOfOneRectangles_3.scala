package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfOneRectangles_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneSetOfOneRectangles: Set[java.awt.geom.Rectangle2D],
    private var _calculatedOneSetOfOneRectangles: Set[java.awt.geom.Rectangle2D],
    private var _persistedOneSetOfOneRectangles: Set[java.awt.geom.Rectangle2D]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfOneRectangles_3 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfOneRectangles_3("+ URI +")"

   def copy(oneSetOfOneRectangles: Set[java.awt.geom.Rectangle2D] = this._oneSetOfOneRectangles): OneSetOfOneRectangles_3 = {

  require(oneSetOfOneRectangles ne null, "Null value was provided for property \"oneSetOfOneRectangles\"")
  com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneRectangles)
    new OneSetOfOneRectangles_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneSetOfOneRectangles = oneSetOfOneRectangles, _calculatedOneSetOfOneRectangles = _calculatedOneSetOfOneRectangles, _persistedOneSetOfOneRectangles = _persistedOneSetOfOneRectangles)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfOneRectangles_3): this.type = {
    this._URI = result._URI
    this._oneSetOfOneRectangles = result._oneSetOfOneRectangles
    this._calculatedOneSetOfOneRectangles = result._calculatedOneSetOfOneRectangles
    this._persistedOneSetOfOneRectangles = result._persistedOneSetOfOneRectangles
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfOneRectangles_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneRectangles")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfOneRectangles = {
    _oneSetOfOneRectangles
  }

  def oneSetOfOneRectangles_= (value: Set[java.awt.geom.Rectangle2D]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _oneSetOfOneRectangles = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfOneRectangles")
  def calculatedOneSetOfOneRectangles = {
    _calculatedOneSetOfOneRectangles
  }

  def calculatedOneSetOfOneRectangles_= (value: Set[java.awt.geom.Rectangle2D]) {
    _calculatedOneSetOfOneRectangles = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfOneRectangles")
  def persistedOneSetOfOneRectangles = {
    _persistedOneSetOfOneRectangles
  }

  def persistedOneSetOfOneRectangles_= (value: Set[java.awt.geom.Rectangle2D]) {
    _persistedOneSetOfOneRectangles = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneRectangles") oneSetOfOneRectangles: Set[java.awt.geom.Rectangle2D]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfOneRectangles") calculatedOneSetOfOneRectangles: Set[java.awt.geom.Rectangle2D]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfOneRectangles") persistedOneSetOfOneRectangles: Set[java.awt.geom.Rectangle2D]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneSetOfOneRectangles = if (oneSetOfOneRectangles == null) Set.empty else oneSetOfOneRectangles, _calculatedOneSetOfOneRectangles = calculatedOneSetOfOneRectangles, _persistedOneSetOfOneRectangles = persistedOneSetOfOneRectangles)

}

object OneSetOfOneRectangles_3 extends AggregateRootCompanion[OneSetOfOneRectangles_3]{

  def apply(
    oneSetOfOneRectangles: Set[java.awt.geom.Rectangle2D] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneRectangles)
    require(oneSetOfOneRectangles ne null, "Null value was provided for property \"oneSetOfOneRectangles\"")
    new OneSetOfOneRectangles_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneSetOfOneRectangles = oneSetOfOneRectangles
    , _calculatedOneSetOfOneRectangles = Set.empty
    , _persistedOneSetOfOneRectangles = Set.empty)
  }

}
