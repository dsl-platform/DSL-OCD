package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfOneUrls_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneArrayOfOneUrls: Array[java.net.URI],
    private var _calculatedOneArrayOfOneUrls: Array[java.net.URI],
    private var _persistedOneArrayOfOneUrls: Array[java.net.URI]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfOneUrls_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfOneUrls_4("+ URI +")"

   def copy(oneArrayOfOneUrls: Array[java.net.URI] = this._oneArrayOfOneUrls): OneArrayOfOneUrls_4 = {

  require(oneArrayOfOneUrls ne null, "Null value was provided for property \"oneArrayOfOneUrls\"")
  com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneUrls)
    new OneArrayOfOneUrls_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneArrayOfOneUrls = oneArrayOfOneUrls, _calculatedOneArrayOfOneUrls = _calculatedOneArrayOfOneUrls, _persistedOneArrayOfOneUrls = _persistedOneArrayOfOneUrls)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfOneUrls_4): this.type = {
    this._URI = result._URI
    this._oneArrayOfOneUrls = result._oneArrayOfOneUrls
    this._calculatedOneArrayOfOneUrls = result._calculatedOneArrayOfOneUrls
    this._persistedOneArrayOfOneUrls = result._persistedOneArrayOfOneUrls
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfOneUrls_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneUrls")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfOneUrls = {
    _oneArrayOfOneUrls
  }

  def oneArrayOfOneUrls_= (value: Array[java.net.URI]) {
    com.dslplatform.api.Guards.checkArrayNulls(value)
    _oneArrayOfOneUrls = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfOneUrls")
  def calculatedOneArrayOfOneUrls = {
    _calculatedOneArrayOfOneUrls
  }

  def calculatedOneArrayOfOneUrls_= (value: Array[java.net.URI]) {
    _calculatedOneArrayOfOneUrls = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfOneUrls")
  def persistedOneArrayOfOneUrls = {
    _persistedOneArrayOfOneUrls
  }

  def persistedOneArrayOfOneUrls_= (value: Array[java.net.URI]) {
    _persistedOneArrayOfOneUrls = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneUrls") oneArrayOfOneUrls: Array[java.net.URI]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfOneUrls") calculatedOneArrayOfOneUrls: Array[java.net.URI]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfOneUrls") persistedOneArrayOfOneUrls: Array[java.net.URI]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneArrayOfOneUrls = if (oneArrayOfOneUrls == null) Array.empty else oneArrayOfOneUrls, _calculatedOneArrayOfOneUrls = calculatedOneArrayOfOneUrls, _persistedOneArrayOfOneUrls = persistedOneArrayOfOneUrls)

}

object OneArrayOfOneUrls_4 extends AggregateRootCompanion[OneArrayOfOneUrls_4]{

  def apply(
    oneArrayOfOneUrls: Array[java.net.URI] = Array.empty
  ) = {
    com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneUrls)
    require(oneArrayOfOneUrls ne null, "Null value was provided for property \"oneArrayOfOneUrls\"")
    new OneArrayOfOneUrls_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneArrayOfOneUrls = oneArrayOfOneUrls
    , _calculatedOneArrayOfOneUrls = Array.empty
    , _persistedOneArrayOfOneUrls = Array.empty)
  }

}
