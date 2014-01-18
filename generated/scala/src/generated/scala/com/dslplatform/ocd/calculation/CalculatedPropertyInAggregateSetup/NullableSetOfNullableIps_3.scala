package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableSetOfNullableIps_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableSetOfNullableIps: Option[Set[Option[java.net.InetAddress]]],
    private var _calculatedNullableSetOfNullableIps: Option[Set[Option[java.net.InetAddress]]],
    private var _persistedNullableSetOfNullableIps: Option[Set[Option[java.net.InetAddress]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableSetOfNullableIps_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableSetOfNullableIps_3("+ URI +")"

   def copy(nullableSetOfNullableIps: Option[Set[Option[java.net.InetAddress]]] = this._nullableSetOfNullableIps): NullableSetOfNullableIps_3 = {

  require(nullableSetOfNullableIps ne null, "Null value was provided for property \"nullableSetOfNullableIps\"")
  if(nullableSetOfNullableIps.isDefined) require(nullableSetOfNullableIps.get ne null, "Null value was provided for property \"nullableSetOfNullableIps\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullableIps)
    new NullableSetOfNullableIps_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableSetOfNullableIps = nullableSetOfNullableIps, _calculatedNullableSetOfNullableIps = _calculatedNullableSetOfNullableIps, _persistedNullableSetOfNullableIps = _persistedNullableSetOfNullableIps)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfNullableIps_3): this.type = {
    this._URI = result._URI
    this._nullableSetOfNullableIps = result._nullableSetOfNullableIps
    this._calculatedNullableSetOfNullableIps = result._calculatedNullableSetOfNullableIps
    this._persistedNullableSetOfNullableIps = result._persistedNullableSetOfNullableIps
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfNullableIps_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableIps")
  def nullableSetOfNullableIps = {
    _nullableSetOfNullableIps
  }

  def nullableSetOfNullableIps_= (value: Option[Set[Option[java.net.InetAddress]]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _nullableSetOfNullableIps = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfNullableIps")
  def calculatedNullableSetOfNullableIps = {
    _calculatedNullableSetOfNullableIps
  }

  def calculatedNullableSetOfNullableIps_= (value: Option[Set[Option[java.net.InetAddress]]]) {
    _calculatedNullableSetOfNullableIps = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfNullableIps")
  def persistedNullableSetOfNullableIps = {
    _persistedNullableSetOfNullableIps
  }

  def persistedNullableSetOfNullableIps_= (value: Option[Set[Option[java.net.InetAddress]]]) {
    _persistedNullableSetOfNullableIps = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableIps") nullableSetOfNullableIps: Option[Set[Option[java.net.InetAddress]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfNullableIps") calculatedNullableSetOfNullableIps: Option[Set[Option[java.net.InetAddress]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfNullableIps") persistedNullableSetOfNullableIps: Option[Set[Option[java.net.InetAddress]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableSetOfNullableIps = nullableSetOfNullableIps, _calculatedNullableSetOfNullableIps = calculatedNullableSetOfNullableIps, _persistedNullableSetOfNullableIps = persistedNullableSetOfNullableIps)

}

object NullableSetOfNullableIps_3 extends AggregateRootCompanion[NullableSetOfNullableIps_3]{

  def apply(
    nullableSetOfNullableIps: Option[Set[Option[java.net.InetAddress]]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullableIps)
    require(nullableSetOfNullableIps ne null, "Null value was provided for property \"nullableSetOfNullableIps\"")
    if (nullableSetOfNullableIps.isDefined) require(nullableSetOfNullableIps.get ne null, "Null value was provided for property \"nullableSetOfNullableIps\"")
    new NullableSetOfNullableIps_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableSetOfNullableIps = nullableSetOfNullableIps
    , _calculatedNullableSetOfNullableIps = None
    , _persistedNullableSetOfNullableIps = None)
  }

}
