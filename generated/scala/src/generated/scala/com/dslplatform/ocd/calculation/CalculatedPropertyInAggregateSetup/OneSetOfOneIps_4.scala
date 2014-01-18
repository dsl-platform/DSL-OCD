package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfOneIps_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneSetOfOneIps: Set[java.net.InetAddress],
    private var _calculatedOneSetOfOneIps: Set[java.net.InetAddress],
    private var _persistedOneSetOfOneIps: Set[java.net.InetAddress]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfOneIps_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfOneIps_4("+ URI +")"

   def copy(oneSetOfOneIps: Set[java.net.InetAddress] = this._oneSetOfOneIps): OneSetOfOneIps_4 = {

  require(oneSetOfOneIps ne null, "Null value was provided for property \"oneSetOfOneIps\"")
  com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneIps)
    new OneSetOfOneIps_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneSetOfOneIps = oneSetOfOneIps, _calculatedOneSetOfOneIps = _calculatedOneSetOfOneIps, _persistedOneSetOfOneIps = _persistedOneSetOfOneIps)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfOneIps_4): this.type = {
    this._URI = result._URI
    this._oneSetOfOneIps = result._oneSetOfOneIps
    this._calculatedOneSetOfOneIps = result._calculatedOneSetOfOneIps
    this._persistedOneSetOfOneIps = result._persistedOneSetOfOneIps
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfOneIps_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneIps")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfOneIps = {
    _oneSetOfOneIps
  }

  def oneSetOfOneIps_= (value: Set[java.net.InetAddress]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _oneSetOfOneIps = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfOneIps")
  def calculatedOneSetOfOneIps = {
    _calculatedOneSetOfOneIps
  }

  def calculatedOneSetOfOneIps_= (value: Set[java.net.InetAddress]) {
    _calculatedOneSetOfOneIps = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfOneIps")
  def persistedOneSetOfOneIps = {
    _persistedOneSetOfOneIps
  }

  def persistedOneSetOfOneIps_= (value: Set[java.net.InetAddress]) {
    _persistedOneSetOfOneIps = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneIps") oneSetOfOneIps: Set[java.net.InetAddress]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfOneIps") calculatedOneSetOfOneIps: Set[java.net.InetAddress]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfOneIps") persistedOneSetOfOneIps: Set[java.net.InetAddress]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneSetOfOneIps = if (oneSetOfOneIps == null) Set.empty else oneSetOfOneIps, _calculatedOneSetOfOneIps = calculatedOneSetOfOneIps, _persistedOneSetOfOneIps = persistedOneSetOfOneIps)

}

object OneSetOfOneIps_4 extends AggregateRootCompanion[OneSetOfOneIps_4]{

  def apply(
    oneSetOfOneIps: Set[java.net.InetAddress] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneIps)
    require(oneSetOfOneIps ne null, "Null value was provided for property \"oneSetOfOneIps\"")
    new OneSetOfOneIps_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneSetOfOneIps = oneSetOfOneIps
    , _calculatedOneSetOfOneIps = Set.empty
    , _persistedOneSetOfOneIps = Set.empty)
  }

}
