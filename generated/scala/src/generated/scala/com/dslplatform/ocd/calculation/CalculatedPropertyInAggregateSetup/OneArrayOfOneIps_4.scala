package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfOneIps_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneArrayOfOneIps: Array[java.net.InetAddress],
    private var _calculatedOneArrayOfOneIps: Array[java.net.InetAddress],
    private var _persistedOneArrayOfOneIps: Array[java.net.InetAddress]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfOneIps_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfOneIps_4("+ URI +")"

   def copy(oneArrayOfOneIps: Array[java.net.InetAddress] = this._oneArrayOfOneIps): OneArrayOfOneIps_4 = {

  require(oneArrayOfOneIps ne null, "Null value was provided for property \"oneArrayOfOneIps\"")
  com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneIps)
    new OneArrayOfOneIps_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneArrayOfOneIps = oneArrayOfOneIps, _calculatedOneArrayOfOneIps = _calculatedOneArrayOfOneIps, _persistedOneArrayOfOneIps = _persistedOneArrayOfOneIps)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfOneIps_4): this.type = {
    this._URI = result._URI
    this._oneArrayOfOneIps = result._oneArrayOfOneIps
    this._calculatedOneArrayOfOneIps = result._calculatedOneArrayOfOneIps
    this._persistedOneArrayOfOneIps = result._persistedOneArrayOfOneIps
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfOneIps_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneIps")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfOneIps = {
    _oneArrayOfOneIps
  }

  def oneArrayOfOneIps_= (value: Array[java.net.InetAddress]) {
    com.dslplatform.api.Guards.checkArrayNulls(value)
    _oneArrayOfOneIps = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfOneIps")
  def calculatedOneArrayOfOneIps = {
    _calculatedOneArrayOfOneIps
  }

  def calculatedOneArrayOfOneIps_= (value: Array[java.net.InetAddress]) {
    _calculatedOneArrayOfOneIps = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfOneIps")
  def persistedOneArrayOfOneIps = {
    _persistedOneArrayOfOneIps
  }

  def persistedOneArrayOfOneIps_= (value: Array[java.net.InetAddress]) {
    _persistedOneArrayOfOneIps = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneIps") oneArrayOfOneIps: Array[java.net.InetAddress]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfOneIps") calculatedOneArrayOfOneIps: Array[java.net.InetAddress]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfOneIps") persistedOneArrayOfOneIps: Array[java.net.InetAddress]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneArrayOfOneIps = if (oneArrayOfOneIps == null) Array.empty else oneArrayOfOneIps, _calculatedOneArrayOfOneIps = calculatedOneArrayOfOneIps, _persistedOneArrayOfOneIps = persistedOneArrayOfOneIps)

}

object OneArrayOfOneIps_4 extends AggregateRootCompanion[OneArrayOfOneIps_4]{

  def apply(
    oneArrayOfOneIps: Array[java.net.InetAddress] = Array.empty
  ) = {
    com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneIps)
    require(oneArrayOfOneIps ne null, "Null value was provided for property \"oneArrayOfOneIps\"")
    new OneArrayOfOneIps_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneArrayOfOneIps = oneArrayOfOneIps
    , _calculatedOneArrayOfOneIps = Array.empty
    , _persistedOneArrayOfOneIps = Array.empty)
  }

}
