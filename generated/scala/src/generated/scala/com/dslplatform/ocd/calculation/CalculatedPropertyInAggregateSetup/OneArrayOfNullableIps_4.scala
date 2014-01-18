package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfNullableIps_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneArrayOfNullableIps: Array[Option[java.net.InetAddress]],
    private var _calculatedOneArrayOfNullableIps: Array[Option[java.net.InetAddress]],
    private var _persistedOneArrayOfNullableIps: Array[Option[java.net.InetAddress]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfNullableIps_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfNullableIps_4("+ URI +")"

   def copy(oneArrayOfNullableIps: Array[Option[java.net.InetAddress]] = this._oneArrayOfNullableIps): OneArrayOfNullableIps_4 = {

  require(oneArrayOfNullableIps ne null, "Null value was provided for property \"oneArrayOfNullableIps\"")
  com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableIps)
    new OneArrayOfNullableIps_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneArrayOfNullableIps = oneArrayOfNullableIps, _calculatedOneArrayOfNullableIps = _calculatedOneArrayOfNullableIps, _persistedOneArrayOfNullableIps = _persistedOneArrayOfNullableIps)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfNullableIps_4): this.type = {
    this._URI = result._URI
    this._oneArrayOfNullableIps = result._oneArrayOfNullableIps
    this._calculatedOneArrayOfNullableIps = result._calculatedOneArrayOfNullableIps
    this._persistedOneArrayOfNullableIps = result._persistedOneArrayOfNullableIps
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfNullableIps_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableIps")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfNullableIps = {
    _oneArrayOfNullableIps
  }

  def oneArrayOfNullableIps_= (value: Array[Option[java.net.InetAddress]]) {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(value)
    _oneArrayOfNullableIps = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfNullableIps")
  def calculatedOneArrayOfNullableIps = {
    _calculatedOneArrayOfNullableIps
  }

  def calculatedOneArrayOfNullableIps_= (value: Array[Option[java.net.InetAddress]]) {
    _calculatedOneArrayOfNullableIps = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfNullableIps")
  def persistedOneArrayOfNullableIps = {
    _persistedOneArrayOfNullableIps
  }

  def persistedOneArrayOfNullableIps_= (value: Array[Option[java.net.InetAddress]]) {
    _persistedOneArrayOfNullableIps = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableIps") oneArrayOfNullableIps: Array[Option[java.net.InetAddress]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfNullableIps") calculatedOneArrayOfNullableIps: Array[Option[java.net.InetAddress]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfNullableIps") persistedOneArrayOfNullableIps: Array[Option[java.net.InetAddress]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneArrayOfNullableIps = if (oneArrayOfNullableIps == null) Array.empty else oneArrayOfNullableIps, _calculatedOneArrayOfNullableIps = calculatedOneArrayOfNullableIps, _persistedOneArrayOfNullableIps = persistedOneArrayOfNullableIps)

}

object OneArrayOfNullableIps_4 extends AggregateRootCompanion[OneArrayOfNullableIps_4]{

  def apply(
    oneArrayOfNullableIps: Array[Option[java.net.InetAddress]] = Array.empty
  ) = {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableIps)
    require(oneArrayOfNullableIps ne null, "Null value was provided for property \"oneArrayOfNullableIps\"")
    new OneArrayOfNullableIps_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneArrayOfNullableIps = oneArrayOfNullableIps
    , _calculatedOneArrayOfNullableIps = Array.empty
    , _persistedOneArrayOfNullableIps = Array.empty)
  }

}
