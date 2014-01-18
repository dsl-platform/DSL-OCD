package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneRectangle_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneRectangle: java.awt.geom.Rectangle2D,
    private var _calculatedOneRectangle: java.awt.geom.Rectangle2D,
    private var _persistedOneRectangle: java.awt.geom.Rectangle2D
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneRectangle_3 => c.URI == URI
    case _ => false
  }

  override def toString = "OneRectangle_3("+ URI +")"

   def copy(oneRectangle: java.awt.geom.Rectangle2D = this._oneRectangle): OneRectangle_3 = {

  require(oneRectangle ne null, "Null value was provided for property \"oneRectangle\"")
    new OneRectangle_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneRectangle = oneRectangle, _calculatedOneRectangle = _calculatedOneRectangle, _persistedOneRectangle = _persistedOneRectangle)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneRectangle_3): this.type = {
    this._URI = result._URI
    this._oneRectangle = result._oneRectangle
    this._calculatedOneRectangle = result._calculatedOneRectangle
    this._persistedOneRectangle = result._persistedOneRectangle
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneRectangle_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneRectangle")
  def oneRectangle = {
    _oneRectangle
  }

  def oneRectangle_= (value: java.awt.geom.Rectangle2D) {
    _oneRectangle = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneRectangle")
  def calculatedOneRectangle = {
    _calculatedOneRectangle
  }

  def calculatedOneRectangle_= (value: java.awt.geom.Rectangle2D) {
    _calculatedOneRectangle = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneRectangle")
  def persistedOneRectangle = {
    _persistedOneRectangle
  }

  def persistedOneRectangle_= (value: java.awt.geom.Rectangle2D) {
    _persistedOneRectangle = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneRectangle") oneRectangle: java.awt.geom.Rectangle2D
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneRectangle") calculatedOneRectangle: java.awt.geom.Rectangle2D
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneRectangle") persistedOneRectangle: java.awt.geom.Rectangle2D
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneRectangle = if (oneRectangle == null) new java.awt.geom.Rectangle2D.Float() else oneRectangle, _calculatedOneRectangle = if (calculatedOneRectangle == null) new java.awt.geom.Rectangle2D.Float() else calculatedOneRectangle, _persistedOneRectangle = if (persistedOneRectangle == null) new java.awt.geom.Rectangle2D.Float() else persistedOneRectangle)

}

object OneRectangle_3 extends AggregateRootCompanion[OneRectangle_3]{

  def apply(
    oneRectangle: java.awt.geom.Rectangle2D = new java.awt.geom.Rectangle2D.Float()
  ) = {
    require(oneRectangle ne null, "Null value was provided for property \"oneRectangle\"")
    new OneRectangle_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneRectangle = oneRectangle
    , _calculatedOneRectangle = new java.awt.geom.Rectangle2D.Float()
    , _persistedOneRectangle = new java.awt.geom.Rectangle2D.Float())
  }

}
