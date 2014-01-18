package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneFloat_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneFloat: Float,
    private var _calculatedOneFloat: Float,
    private var _persistedOneFloat: Float
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneFloat_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneFloat_4("+ URI +")"

   def copy(oneFloat: Float = this._oneFloat): OneFloat_4 = {

    new OneFloat_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneFloat = oneFloat, _calculatedOneFloat = _calculatedOneFloat, _persistedOneFloat = _persistedOneFloat)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneFloat_4): this.type = {
    this._URI = result._URI
    this._oneFloat = result._oneFloat
    this._calculatedOneFloat = result._calculatedOneFloat
    this._persistedOneFloat = result._persistedOneFloat
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneFloat_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneFloat")
  def oneFloat = {
    _oneFloat
  }

  def oneFloat_= (value: Float) {
    _oneFloat = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneFloat")
  def calculatedOneFloat = {
    _calculatedOneFloat
  }

  def calculatedOneFloat_= (value: Float) {
    _calculatedOneFloat = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneFloat")
  def persistedOneFloat = {
    _persistedOneFloat
  }

  def persistedOneFloat_= (value: Float) {
    _persistedOneFloat = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneFloat") oneFloat: Float
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneFloat") calculatedOneFloat: Float
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneFloat") persistedOneFloat: Float
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneFloat = oneFloat, _calculatedOneFloat = calculatedOneFloat, _persistedOneFloat = persistedOneFloat)

}

object OneFloat_4 extends AggregateRootCompanion[OneFloat_4]{

  def apply(
    oneFloat: Float = 0.0f
  ) = {
    new OneFloat_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneFloat = oneFloat
    , _calculatedOneFloat = 0.0f
    , _persistedOneFloat = 0.0f)
  }

}
