package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableIp_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableIp: Option[java.net.InetAddress],
    private var _calculatedNullableIp: Option[java.net.InetAddress],
    private var _persistedNullableIp: Option[java.net.InetAddress]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableIp_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableIp_3("+ URI +")"

   def copy(nullableIp: Option[java.net.InetAddress] = this._nullableIp): NullableIp_3 = {

  require(nullableIp ne null, "Null value was provided for property \"nullableIp\"")
  if(nullableIp.isDefined) require(nullableIp.get ne null, "Null value was provided for property \"nullableIp\"")
    new NullableIp_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableIp = nullableIp, _calculatedNullableIp = _calculatedNullableIp, _persistedNullableIp = _persistedNullableIp)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableIp_3): this.type = {
    this._URI = result._URI
    this._nullableIp = result._nullableIp
    this._calculatedNullableIp = result._calculatedNullableIp
    this._persistedNullableIp = result._persistedNullableIp
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableIp_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableIp")
  def nullableIp = {
    _nullableIp
  }

  def nullableIp_= (value: Option[java.net.InetAddress]) {
    _nullableIp = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableIp")
  def calculatedNullableIp = {
    _calculatedNullableIp
  }

  def calculatedNullableIp_= (value: Option[java.net.InetAddress]) {
    _calculatedNullableIp = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableIp")
  def persistedNullableIp = {
    _persistedNullableIp
  }

  def persistedNullableIp_= (value: Option[java.net.InetAddress]) {
    _persistedNullableIp = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableIp") nullableIp: Option[java.net.InetAddress]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableIp") calculatedNullableIp: Option[java.net.InetAddress]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableIp") persistedNullableIp: Option[java.net.InetAddress]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableIp = nullableIp, _calculatedNullableIp = calculatedNullableIp, _persistedNullableIp = persistedNullableIp)

}

object NullableIp_3 extends AggregateRootCompanion[NullableIp_3]{

  def apply(
    nullableIp: Option[java.net.InetAddress] = None
  ) = {
    require(nullableIp ne null, "Null value was provided for property \"nullableIp\"")
    if (nullableIp.isDefined) require(nullableIp.get ne null, "Null value was provided for property \"nullableIp\"")
    new NullableIp_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableIp = nullableIp
    , _calculatedNullableIp = None
    , _persistedNullableIp = None)
  }

}
