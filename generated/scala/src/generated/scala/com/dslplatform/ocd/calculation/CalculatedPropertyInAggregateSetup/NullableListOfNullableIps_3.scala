package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableListOfNullableIps_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableListOfNullableIps: Option[IndexedSeq[Option[java.net.InetAddress]]],
    private var _calculatedNullableListOfNullableIps: Option[IndexedSeq[Option[java.net.InetAddress]]],
    private var _persistedNullableListOfNullableIps: Option[IndexedSeq[Option[java.net.InetAddress]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableListOfNullableIps_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableListOfNullableIps_3("+ URI +")"

   def copy(nullableListOfNullableIps: Option[IndexedSeq[Option[java.net.InetAddress]]] = this._nullableListOfNullableIps): NullableListOfNullableIps_3 = {

  require(nullableListOfNullableIps ne null, "Null value was provided for property \"nullableListOfNullableIps\"")
  if(nullableListOfNullableIps.isDefined) require(nullableListOfNullableIps.get ne null, "Null value was provided for property \"nullableListOfNullableIps\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableIps)
    new NullableListOfNullableIps_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableListOfNullableIps = nullableListOfNullableIps, _calculatedNullableListOfNullableIps = _calculatedNullableListOfNullableIps, _persistedNullableListOfNullableIps = _persistedNullableListOfNullableIps)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfNullableIps_3): this.type = {
    this._URI = result._URI
    this._nullableListOfNullableIps = result._nullableListOfNullableIps
    this._calculatedNullableListOfNullableIps = result._calculatedNullableListOfNullableIps
    this._persistedNullableListOfNullableIps = result._persistedNullableListOfNullableIps
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfNullableIps_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableIps")
  def nullableListOfNullableIps = {
    _nullableListOfNullableIps
  }

  def nullableListOfNullableIps_= (value: Option[IndexedSeq[Option[java.net.InetAddress]]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _nullableListOfNullableIps = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfNullableIps")
  def calculatedNullableListOfNullableIps = {
    _calculatedNullableListOfNullableIps
  }

  def calculatedNullableListOfNullableIps_= (value: Option[IndexedSeq[Option[java.net.InetAddress]]]) {
    _calculatedNullableListOfNullableIps = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfNullableIps")
  def persistedNullableListOfNullableIps = {
    _persistedNullableListOfNullableIps
  }

  def persistedNullableListOfNullableIps_= (value: Option[IndexedSeq[Option[java.net.InetAddress]]]) {
    _persistedNullableListOfNullableIps = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableIps") nullableListOfNullableIps: Option[IndexedSeq[Option[java.net.InetAddress]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfNullableIps") calculatedNullableListOfNullableIps: Option[IndexedSeq[Option[java.net.InetAddress]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfNullableIps") persistedNullableListOfNullableIps: Option[IndexedSeq[Option[java.net.InetAddress]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableListOfNullableIps = nullableListOfNullableIps, _calculatedNullableListOfNullableIps = calculatedNullableListOfNullableIps, _persistedNullableListOfNullableIps = persistedNullableListOfNullableIps)

}

object NullableListOfNullableIps_3 extends AggregateRootCompanion[NullableListOfNullableIps_3]{

  def apply(
    nullableListOfNullableIps: Option[IndexedSeq[Option[java.net.InetAddress]]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableIps)
    require(nullableListOfNullableIps ne null, "Null value was provided for property \"nullableListOfNullableIps\"")
    if (nullableListOfNullableIps.isDefined) require(nullableListOfNullableIps.get ne null, "Null value was provided for property \"nullableListOfNullableIps\"")
    new NullableListOfNullableIps_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableListOfNullableIps = nullableListOfNullableIps
    , _calculatedNullableListOfNullableIps = None
    , _persistedNullableListOfNullableIps = None)
  }

}
