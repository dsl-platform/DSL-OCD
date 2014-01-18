package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneBoolean_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneBoolean: Boolean,
    private var _calculatedOneBoolean: Boolean,
    private var _persistedOneBoolean: Boolean
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneBoolean_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneBoolean_4("+ URI +")"

   def copy(oneBoolean: Boolean = this._oneBoolean): OneBoolean_4 = {

    new OneBoolean_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneBoolean = oneBoolean, _calculatedOneBoolean = _calculatedOneBoolean, _persistedOneBoolean = _persistedOneBoolean)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneBoolean_4): this.type = {
    this._URI = result._URI
    this._oneBoolean = result._oneBoolean
    this._calculatedOneBoolean = result._calculatedOneBoolean
    this._persistedOneBoolean = result._persistedOneBoolean
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneBoolean_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneBoolean")
  def oneBoolean = {
    _oneBoolean
  }

  def oneBoolean_= (value: Boolean) {
    _oneBoolean = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneBoolean")
  def calculatedOneBoolean = {
    _calculatedOneBoolean
  }

  def calculatedOneBoolean_= (value: Boolean) {
    _calculatedOneBoolean = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneBoolean")
  def persistedOneBoolean = {
    _persistedOneBoolean
  }

  def persistedOneBoolean_= (value: Boolean) {
    _persistedOneBoolean = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneBoolean") oneBoolean: Boolean
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneBoolean") calculatedOneBoolean: Boolean
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneBoolean") persistedOneBoolean: Boolean
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneBoolean = oneBoolean, _calculatedOneBoolean = calculatedOneBoolean, _persistedOneBoolean = persistedOneBoolean)

}

object OneBoolean_4 extends AggregateRootCompanion[OneBoolean_4]{

  def apply(
    oneBoolean: Boolean = false
  ) = {
    new OneBoolean_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneBoolean = oneBoolean
    , _calculatedOneBoolean = false
    , _persistedOneBoolean = false)
  }

}
