package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneInteger_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneInteger: Int,
    private var _calculatedOneInteger: Int,
    private var _persistedOneInteger: Int
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneInteger_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneInteger_4("+ URI +")"

   def copy(oneInteger: Int = this._oneInteger): OneInteger_4 = {

    new OneInteger_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneInteger = oneInteger, _calculatedOneInteger = _calculatedOneInteger, _persistedOneInteger = _persistedOneInteger)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneInteger_4): this.type = {
    this._URI = result._URI
    this._oneInteger = result._oneInteger
    this._calculatedOneInteger = result._calculatedOneInteger
    this._persistedOneInteger = result._persistedOneInteger
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneInteger_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneInteger")
  def oneInteger = {
    _oneInteger
  }

  def oneInteger_= (value: Int) {
    _oneInteger = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneInteger")
  def calculatedOneInteger = {
    _calculatedOneInteger
  }

  def calculatedOneInteger_= (value: Int) {
    _calculatedOneInteger = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneInteger")
  def persistedOneInteger = {
    _persistedOneInteger
  }

  def persistedOneInteger_= (value: Int) {
    _persistedOneInteger = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneInteger") oneInteger: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneInteger") calculatedOneInteger: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneInteger") persistedOneInteger: Int
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneInteger = oneInteger, _calculatedOneInteger = calculatedOneInteger, _persistedOneInteger = persistedOneInteger)

}

object OneInteger_4 extends AggregateRootCompanion[OneInteger_4]{

  def apply(
    oneInteger: Int = 0
  ) = {
    new OneInteger_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneInteger = oneInteger
    , _calculatedOneInteger = 0
    , _persistedOneInteger = 0)
  }

}