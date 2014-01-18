package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneUrl_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneUrl: java.net.URI,
    private var _calculatedOneUrl: java.net.URI,
    private var _persistedOneUrl: java.net.URI
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneUrl_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneUrl_4("+ URI +")"

   def copy(oneUrl: java.net.URI = this._oneUrl): OneUrl_4 = {

  require(oneUrl ne null, "Null value was provided for property \"oneUrl\"")
    new OneUrl_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneUrl = oneUrl, _calculatedOneUrl = _calculatedOneUrl, _persistedOneUrl = _persistedOneUrl)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneUrl_4): this.type = {
    this._URI = result._URI
    this._oneUrl = result._oneUrl
    this._calculatedOneUrl = result._calculatedOneUrl
    this._persistedOneUrl = result._persistedOneUrl
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneUrl_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneUrl")
  def oneUrl = {
    _oneUrl
  }

  def oneUrl_= (value: java.net.URI) {
    _oneUrl = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneUrl")
  def calculatedOneUrl = {
    _calculatedOneUrl
  }

  def calculatedOneUrl_= (value: java.net.URI) {
    _calculatedOneUrl = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneUrl")
  def persistedOneUrl = {
    _persistedOneUrl
  }

  def persistedOneUrl_= (value: java.net.URI) {
    _persistedOneUrl = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneUrl") oneUrl: java.net.URI
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneUrl") calculatedOneUrl: java.net.URI
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneUrl") persistedOneUrl: java.net.URI
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneUrl = if (oneUrl == null) ??? else oneUrl, _calculatedOneUrl = if (calculatedOneUrl == null) ??? else calculatedOneUrl, _persistedOneUrl = if (persistedOneUrl == null) ??? else persistedOneUrl)

}

object OneUrl_4 extends AggregateRootCompanion[OneUrl_4]{

  def apply(
    oneUrl: java.net.URI = ???
  ) = {
    require(oneUrl ne null, "Null value was provided for property \"oneUrl\"")
    new OneUrl_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneUrl = oneUrl
    , _calculatedOneUrl = ???
    , _persistedOneUrl = ???)
  }

}
