package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneDouble_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneDouble: Double,
    private var _calculatedOneDouble: Double,
    private var _persistedOneDouble: Double
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneDouble_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneDouble_4("+ URI +")"

   def copy(oneDouble: Double = this._oneDouble): OneDouble_4 = {

    new OneDouble_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneDouble = oneDouble, _calculatedOneDouble = _calculatedOneDouble, _persistedOneDouble = _persistedOneDouble)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneDouble_4): this.type = {
    this._URI = result._URI
    this._oneDouble = result._oneDouble
    this._calculatedOneDouble = result._calculatedOneDouble
    this._persistedOneDouble = result._persistedOneDouble
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneDouble_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneDouble")
  def oneDouble = {
    _oneDouble
  }

  def oneDouble_= (value: Double) {
    _oneDouble = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneDouble")
  def calculatedOneDouble = {
    _calculatedOneDouble
  }

  def calculatedOneDouble_= (value: Double) {
    _calculatedOneDouble = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneDouble")
  def persistedOneDouble = {
    _persistedOneDouble
  }

  def persistedOneDouble_= (value: Double) {
    _persistedOneDouble = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneDouble") oneDouble: Double
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneDouble") calculatedOneDouble: Double
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneDouble") persistedOneDouble: Double
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneDouble = oneDouble, _calculatedOneDouble = calculatedOneDouble, _persistedOneDouble = persistedOneDouble)

}

object OneDouble_4 extends AggregateRootCompanion[OneDouble_4]{

  def apply(
    oneDouble: Double = 0
  ) = {
    new OneDouble_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneDouble = oneDouble
    , _calculatedOneDouble = 0
    , _persistedOneDouble = 0)
  }

}
