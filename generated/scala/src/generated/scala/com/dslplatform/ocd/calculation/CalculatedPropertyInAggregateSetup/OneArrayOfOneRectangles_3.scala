package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfOneRectangles_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneArrayOfOneRectangles: Array[java.awt.geom.Rectangle2D],
    private var _calculatedOneArrayOfOneRectangles: Array[java.awt.geom.Rectangle2D],
    private var _persistedOneArrayOfOneRectangles: Array[java.awt.geom.Rectangle2D]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfOneRectangles_3 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfOneRectangles_3("+ URI +")"

   def copy(oneArrayOfOneRectangles: Array[java.awt.geom.Rectangle2D] = this._oneArrayOfOneRectangles): OneArrayOfOneRectangles_3 = {

  require(oneArrayOfOneRectangles ne null, "Null value was provided for property \"oneArrayOfOneRectangles\"")
  com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneRectangles)
    new OneArrayOfOneRectangles_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneArrayOfOneRectangles = oneArrayOfOneRectangles, _calculatedOneArrayOfOneRectangles = _calculatedOneArrayOfOneRectangles, _persistedOneArrayOfOneRectangles = _persistedOneArrayOfOneRectangles)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfOneRectangles_3): this.type = {
    this._URI = result._URI
    this._oneArrayOfOneRectangles = result._oneArrayOfOneRectangles
    this._calculatedOneArrayOfOneRectangles = result._calculatedOneArrayOfOneRectangles
    this._persistedOneArrayOfOneRectangles = result._persistedOneArrayOfOneRectangles
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfOneRectangles_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneRectangles")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfOneRectangles = {
    _oneArrayOfOneRectangles
  }

  def oneArrayOfOneRectangles_= (value: Array[java.awt.geom.Rectangle2D]) {
    com.dslplatform.api.Guards.checkArrayNulls(value)
    _oneArrayOfOneRectangles = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfOneRectangles")
  def calculatedOneArrayOfOneRectangles = {
    _calculatedOneArrayOfOneRectangles
  }

  def calculatedOneArrayOfOneRectangles_= (value: Array[java.awt.geom.Rectangle2D]) {
    _calculatedOneArrayOfOneRectangles = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfOneRectangles")
  def persistedOneArrayOfOneRectangles = {
    _persistedOneArrayOfOneRectangles
  }

  def persistedOneArrayOfOneRectangles_= (value: Array[java.awt.geom.Rectangle2D]) {
    _persistedOneArrayOfOneRectangles = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneRectangles") oneArrayOfOneRectangles: Array[java.awt.geom.Rectangle2D]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfOneRectangles") calculatedOneArrayOfOneRectangles: Array[java.awt.geom.Rectangle2D]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfOneRectangles") persistedOneArrayOfOneRectangles: Array[java.awt.geom.Rectangle2D]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneArrayOfOneRectangles = if (oneArrayOfOneRectangles == null) Array.empty else oneArrayOfOneRectangles, _calculatedOneArrayOfOneRectangles = calculatedOneArrayOfOneRectangles, _persistedOneArrayOfOneRectangles = persistedOneArrayOfOneRectangles)

}

object OneArrayOfOneRectangles_3 extends AggregateRootCompanion[OneArrayOfOneRectangles_3]{

  def apply(
    oneArrayOfOneRectangles: Array[java.awt.geom.Rectangle2D] = Array.empty
  ) = {
    com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneRectangles)
    require(oneArrayOfOneRectangles ne null, "Null value was provided for property \"oneArrayOfOneRectangles\"")
    new OneArrayOfOneRectangles_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneArrayOfOneRectangles = oneArrayOfOneRectangles
    , _calculatedOneArrayOfOneRectangles = Array.empty
    , _persistedOneArrayOfOneRectangles = Array.empty)
  }

}
