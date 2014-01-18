package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneDecimal_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneDecimal: BigDecimal,
    private var _calculatedOneDecimal: BigDecimal,
    private var _persistedOneDecimal: BigDecimal
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneDecimal_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneDecimal_4("+ URI +")"

   def copy(oneDecimal: BigDecimal = this._oneDecimal): OneDecimal_4 = {

  require(oneDecimal ne null, "Null value was provided for property \"oneDecimal\"")
    new OneDecimal_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneDecimal = oneDecimal, _calculatedOneDecimal = _calculatedOneDecimal, _persistedOneDecimal = _persistedOneDecimal)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneDecimal_4): this.type = {
    this._URI = result._URI
    this._oneDecimal = result._oneDecimal
    this._calculatedOneDecimal = result._calculatedOneDecimal
    this._persistedOneDecimal = result._persistedOneDecimal
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneDecimal_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneDecimal")
  def oneDecimal = {
    _oneDecimal
  }

  def oneDecimal_= (value: BigDecimal) {
    _oneDecimal = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneDecimal")
  def calculatedOneDecimal = {
    _calculatedOneDecimal
  }

  def calculatedOneDecimal_= (value: BigDecimal) {
    _calculatedOneDecimal = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneDecimal")
  def persistedOneDecimal = {
    _persistedOneDecimal
  }

  def persistedOneDecimal_= (value: BigDecimal) {
    _persistedOneDecimal = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneDecimal") oneDecimal: BigDecimal
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneDecimal") calculatedOneDecimal: BigDecimal
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneDecimal") persistedOneDecimal: BigDecimal
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneDecimal = if (oneDecimal == null) _root_.scala.math.BigDecimal(0) else oneDecimal, _calculatedOneDecimal = if (calculatedOneDecimal == null) _root_.scala.math.BigDecimal(0) else calculatedOneDecimal, _persistedOneDecimal = if (persistedOneDecimal == null) _root_.scala.math.BigDecimal(0) else persistedOneDecimal)

}

object OneDecimal_4 extends AggregateRootCompanion[OneDecimal_4]{

  def apply(
    oneDecimal: BigDecimal = _root_.scala.math.BigDecimal(0)
  ) = {
    require(oneDecimal ne null, "Null value was provided for property \"oneDecimal\"")
    new OneDecimal_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneDecimal = oneDecimal
    , _calculatedOneDecimal = _root_.scala.math.BigDecimal(0)
    , _persistedOneDecimal = _root_.scala.math.BigDecimal(0))
  }

}
