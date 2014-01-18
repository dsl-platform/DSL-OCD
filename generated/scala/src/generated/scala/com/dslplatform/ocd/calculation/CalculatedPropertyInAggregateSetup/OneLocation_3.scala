package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneLocation_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneLocation: java.awt.geom.Point2D,
    private var _calculatedOneLocation: java.awt.geom.Point2D,
    private var _persistedOneLocation: java.awt.geom.Point2D
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneLocation_3 => c.URI == URI
    case _ => false
  }

  override def toString = "OneLocation_3("+ URI +")"

   def copy(oneLocation: java.awt.geom.Point2D = this._oneLocation): OneLocation_3 = {

  require(oneLocation ne null, "Null value was provided for property \"oneLocation\"")
    new OneLocation_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneLocation = oneLocation, _calculatedOneLocation = _calculatedOneLocation, _persistedOneLocation = _persistedOneLocation)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneLocation_3): this.type = {
    this._URI = result._URI
    this._oneLocation = result._oneLocation
    this._calculatedOneLocation = result._calculatedOneLocation
    this._persistedOneLocation = result._persistedOneLocation
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneLocation_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneLocation")
  def oneLocation = {
    _oneLocation
  }

  def oneLocation_= (value: java.awt.geom.Point2D) {
    _oneLocation = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneLocation")
  def calculatedOneLocation = {
    _calculatedOneLocation
  }

  def calculatedOneLocation_= (value: java.awt.geom.Point2D) {
    _calculatedOneLocation = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneLocation")
  def persistedOneLocation = {
    _persistedOneLocation
  }

  def persistedOneLocation_= (value: java.awt.geom.Point2D) {
    _persistedOneLocation = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneLocation") oneLocation: java.awt.geom.Point2D
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneLocation") calculatedOneLocation: java.awt.geom.Point2D
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneLocation") persistedOneLocation: java.awt.geom.Point2D
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneLocation = if (oneLocation == null) new java.awt.geom.Point2D.Float() else oneLocation, _calculatedOneLocation = if (calculatedOneLocation == null) new java.awt.geom.Point2D.Float() else calculatedOneLocation, _persistedOneLocation = if (persistedOneLocation == null) new java.awt.geom.Point2D.Float() else persistedOneLocation)

}

object OneLocation_3 extends AggregateRootCompanion[OneLocation_3]{

  def apply(
    oneLocation: java.awt.geom.Point2D = new java.awt.geom.Point2D.Float()
  ) = {
    require(oneLocation ne null, "Null value was provided for property \"oneLocation\"")
    new OneLocation_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneLocation = oneLocation
    , _calculatedOneLocation = new java.awt.geom.Point2D.Float()
    , _persistedOneLocation = new java.awt.geom.Point2D.Float())
  }

}
