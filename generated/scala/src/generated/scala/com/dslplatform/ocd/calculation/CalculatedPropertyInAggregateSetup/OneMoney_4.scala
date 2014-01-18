package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneMoney_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneMoney: BigDecimal,
    private var _calculatedOneMoney: BigDecimal,
    private var _persistedOneMoney: BigDecimal
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneMoney_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneMoney_4("+ URI +")"

   def copy(oneMoney: BigDecimal = this._oneMoney): OneMoney_4 = {

  require(oneMoney ne null, "Null value was provided for property \"oneMoney\"")
    new OneMoney_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneMoney = oneMoney, _calculatedOneMoney = _calculatedOneMoney, _persistedOneMoney = _persistedOneMoney)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneMoney_4): this.type = {
    this._URI = result._URI
    this._oneMoney = result._oneMoney
    this._calculatedOneMoney = result._calculatedOneMoney
    this._persistedOneMoney = result._persistedOneMoney
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneMoney_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneMoney")
  def oneMoney = {
    _oneMoney
  }

  def oneMoney_= (value: BigDecimal) {
    _oneMoney = value

    _oneMoney = com.dslplatform.api.Guards.setScale(_oneMoney, 2)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneMoney")
  def calculatedOneMoney = {
    _calculatedOneMoney
  }

  def calculatedOneMoney_= (value: BigDecimal) {
    _calculatedOneMoney = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneMoney")
  def persistedOneMoney = {
    _persistedOneMoney
  }

  def persistedOneMoney_= (value: BigDecimal) {
    _persistedOneMoney = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneMoney") oneMoney: BigDecimal
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneMoney") calculatedOneMoney: BigDecimal
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneMoney") persistedOneMoney: BigDecimal
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneMoney = if (oneMoney == null) BigDecimal(0) else oneMoney, _calculatedOneMoney = if (calculatedOneMoney == null) BigDecimal(0) else calculatedOneMoney, _persistedOneMoney = if (persistedOneMoney == null) BigDecimal(0) else persistedOneMoney)

}

object OneMoney_4 extends AggregateRootCompanion[OneMoney_4]{

  def apply(
    oneMoney: BigDecimal = BigDecimal(0)
  ) = {
    require(oneMoney ne null, "Null value was provided for property \"oneMoney\"")
    new OneMoney_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneMoney = oneMoney
    , _calculatedOneMoney = BigDecimal(0)
    , _persistedOneMoney = BigDecimal(0))
  }

}
