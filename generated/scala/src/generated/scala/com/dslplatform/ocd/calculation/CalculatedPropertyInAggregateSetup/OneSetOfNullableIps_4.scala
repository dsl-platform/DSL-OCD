package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfNullableIps_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneSetOfNullableIps: Set[Option[java.net.InetAddress]],
    private var _calculatedOneSetOfNullableIps: Set[Option[java.net.InetAddress]],
    private var _persistedOneSetOfNullableIps: Set[Option[java.net.InetAddress]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfNullableIps_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfNullableIps_4("+ URI +")"

   def copy(oneSetOfNullableIps: Set[Option[java.net.InetAddress]] = this._oneSetOfNullableIps): OneSetOfNullableIps_4 = {

  require(oneSetOfNullableIps ne null, "Null value was provided for property \"oneSetOfNullableIps\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableIps)
    new OneSetOfNullableIps_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneSetOfNullableIps = oneSetOfNullableIps, _calculatedOneSetOfNullableIps = _calculatedOneSetOfNullableIps, _persistedOneSetOfNullableIps = _persistedOneSetOfNullableIps)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfNullableIps_4): this.type = {
    this._URI = result._URI
    this._oneSetOfNullableIps = result._oneSetOfNullableIps
    this._calculatedOneSetOfNullableIps = result._calculatedOneSetOfNullableIps
    this._persistedOneSetOfNullableIps = result._persistedOneSetOfNullableIps
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfNullableIps_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableIps")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfNullableIps = {
    _oneSetOfNullableIps
  }

  def oneSetOfNullableIps_= (value: Set[Option[java.net.InetAddress]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _oneSetOfNullableIps = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableIps")
  def calculatedOneSetOfNullableIps = {
    _calculatedOneSetOfNullableIps
  }

  def calculatedOneSetOfNullableIps_= (value: Set[Option[java.net.InetAddress]]) {
    _calculatedOneSetOfNullableIps = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableIps")
  def persistedOneSetOfNullableIps = {
    _persistedOneSetOfNullableIps
  }

  def persistedOneSetOfNullableIps_= (value: Set[Option[java.net.InetAddress]]) {
    _persistedOneSetOfNullableIps = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableIps") oneSetOfNullableIps: Set[Option[java.net.InetAddress]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableIps") calculatedOneSetOfNullableIps: Set[Option[java.net.InetAddress]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableIps") persistedOneSetOfNullableIps: Set[Option[java.net.InetAddress]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneSetOfNullableIps = if (oneSetOfNullableIps == null) Set.empty else oneSetOfNullableIps, _calculatedOneSetOfNullableIps = calculatedOneSetOfNullableIps, _persistedOneSetOfNullableIps = persistedOneSetOfNullableIps)

}

object OneSetOfNullableIps_4 extends AggregateRootCompanion[OneSetOfNullableIps_4]{

  def apply(
    oneSetOfNullableIps: Set[Option[java.net.InetAddress]] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableIps)
    require(oneSetOfNullableIps ne null, "Null value was provided for property \"oneSetOfNullableIps\"")
    new OneSetOfNullableIps_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneSetOfNullableIps = oneSetOfNullableIps
    , _calculatedOneSetOfNullableIps = Set.empty
    , _persistedOneSetOfNullableIps = Set.empty)
  }

}
