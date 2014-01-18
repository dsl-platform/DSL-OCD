package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OnePoint_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _onePoint: java.awt.geom.Point2D,
    private var _calculatedOnePoint: java.awt.geom.Point2D,
    private var _persistedOnePoint: java.awt.geom.Point2D
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OnePoint_3 => c.URI == URI
    case _ => false
  }

  override def toString = "OnePoint_3("+ URI +")"

   def copy(onePoint: java.awt.geom.Point2D = this._onePoint): OnePoint_3 = {

  require(onePoint ne null, "Null value was provided for property \"onePoint\"")
    new OnePoint_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _onePoint = onePoint, _calculatedOnePoint = _calculatedOnePoint, _persistedOnePoint = _persistedOnePoint)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OnePoint_3): this.type = {
    this._URI = result._URI
    this._onePoint = result._onePoint
    this._calculatedOnePoint = result._calculatedOnePoint
    this._persistedOnePoint = result._persistedOnePoint
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OnePoint_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("onePoint")
  def onePoint = {
    _onePoint
  }

  def onePoint_= (value: java.awt.geom.Point2D) {
    _onePoint = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOnePoint")
  def calculatedOnePoint = {
    _calculatedOnePoint
  }

  def calculatedOnePoint_= (value: java.awt.geom.Point2D) {
    _calculatedOnePoint = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOnePoint")
  def persistedOnePoint = {
    _persistedOnePoint
  }

  def persistedOnePoint_= (value: java.awt.geom.Point2D) {
    _persistedOnePoint = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("onePoint") onePoint: java.awt.geom.Point2D
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOnePoint") calculatedOnePoint: java.awt.geom.Point2D
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOnePoint") persistedOnePoint: java.awt.geom.Point2D
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _onePoint = if (onePoint == null) new java.awt.Point() else onePoint, _calculatedOnePoint = if (calculatedOnePoint == null) new java.awt.Point() else calculatedOnePoint, _persistedOnePoint = if (persistedOnePoint == null) new java.awt.Point() else persistedOnePoint)

}

object OnePoint_3 extends AggregateRootCompanion[OnePoint_3]{

  def apply(
    onePoint: java.awt.geom.Point2D = new java.awt.Point()
  ) = {
    require(onePoint ne null, "Null value was provided for property \"onePoint\"")
    new OnePoint_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _onePoint = onePoint
    , _calculatedOnePoint = new java.awt.Point()
    , _persistedOnePoint = new java.awt.Point())
  }

}
