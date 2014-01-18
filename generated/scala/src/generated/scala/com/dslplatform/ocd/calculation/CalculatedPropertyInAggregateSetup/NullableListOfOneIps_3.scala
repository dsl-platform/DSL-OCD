package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableListOfOneIps_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableListOfOneIps: Option[IndexedSeq[java.net.InetAddress]],
    private var _calculatedNullableListOfOneIps: Option[IndexedSeq[java.net.InetAddress]],
    private var _persistedNullableListOfOneIps: Option[IndexedSeq[java.net.InetAddress]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableListOfOneIps_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableListOfOneIps_3("+ URI +")"

   def copy(nullableListOfOneIps: Option[IndexedSeq[java.net.InetAddress]] = this._nullableListOfOneIps): NullableListOfOneIps_3 = {

  require(nullableListOfOneIps ne null, "Null value was provided for property \"nullableListOfOneIps\"")
  if(nullableListOfOneIps.isDefined) require(nullableListOfOneIps.get ne null, "Null value was provided for property \"nullableListOfOneIps\"")
  com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneIps)
    new NullableListOfOneIps_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableListOfOneIps = nullableListOfOneIps, _calculatedNullableListOfOneIps = _calculatedNullableListOfOneIps, _persistedNullableListOfOneIps = _persistedNullableListOfOneIps)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfOneIps_3): this.type = {
    this._URI = result._URI
    this._nullableListOfOneIps = result._nullableListOfOneIps
    this._calculatedNullableListOfOneIps = result._calculatedNullableListOfOneIps
    this._persistedNullableListOfOneIps = result._persistedNullableListOfOneIps
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfOneIps_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneIps")
  def nullableListOfOneIps = {
    _nullableListOfOneIps
  }

  def nullableListOfOneIps_= (value: Option[IndexedSeq[java.net.InetAddress]]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _nullableListOfOneIps = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfOneIps")
  def calculatedNullableListOfOneIps = {
    _calculatedNullableListOfOneIps
  }

  def calculatedNullableListOfOneIps_= (value: Option[IndexedSeq[java.net.InetAddress]]) {
    _calculatedNullableListOfOneIps = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfOneIps")
  def persistedNullableListOfOneIps = {
    _persistedNullableListOfOneIps
  }

  def persistedNullableListOfOneIps_= (value: Option[IndexedSeq[java.net.InetAddress]]) {
    _persistedNullableListOfOneIps = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneIps") nullableListOfOneIps: Option[IndexedSeq[java.net.InetAddress]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfOneIps") calculatedNullableListOfOneIps: Option[IndexedSeq[java.net.InetAddress]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfOneIps") persistedNullableListOfOneIps: Option[IndexedSeq[java.net.InetAddress]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableListOfOneIps = nullableListOfOneIps, _calculatedNullableListOfOneIps = calculatedNullableListOfOneIps, _persistedNullableListOfOneIps = persistedNullableListOfOneIps)

}

object NullableListOfOneIps_3 extends AggregateRootCompanion[NullableListOfOneIps_3]{

  def apply(
    nullableListOfOneIps: Option[IndexedSeq[java.net.InetAddress]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneIps)
    require(nullableListOfOneIps ne null, "Null value was provided for property \"nullableListOfOneIps\"")
    if (nullableListOfOneIps.isDefined) require(nullableListOfOneIps.get ne null, "Null value was provided for property \"nullableListOfOneIps\"")
    new NullableListOfOneIps_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableListOfOneIps = nullableListOfOneIps
    , _calculatedNullableListOfOneIps = None
    , _persistedNullableListOfOneIps = None)
  }

}
