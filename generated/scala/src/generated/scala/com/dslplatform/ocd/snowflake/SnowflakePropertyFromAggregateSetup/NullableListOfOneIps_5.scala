package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableListOfOneIps_5 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableListOfOneIps: Option[IndexedSeq[java.net.InetAddress]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableListOfOneIps_5 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableListOfOneIps_5("+ URI +")"

   def copy(nullableListOfOneIps: Option[IndexedSeq[java.net.InetAddress]] = this._nullableListOfOneIps): NullableListOfOneIps_5 = {

  require(nullableListOfOneIps ne null, "Null value was provided for property \"nullableListOfOneIps\"")
  if(nullableListOfOneIps.isDefined) require(nullableListOfOneIps.get ne null, "Null value was provided for property \"nullableListOfOneIps\"")
  com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneIps)
    new NullableListOfOneIps_5(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableListOfOneIps = nullableListOfOneIps)
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

  private def updateWithAnother(result: com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfOneIps_5): this.type = {
    this._URI = result._URI
    this._nullableListOfOneIps = result._nullableListOfOneIps
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfOneIps_5](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneIps")
  def nullableListOfOneIps = {
    _nullableListOfOneIps
  }

  def nullableListOfOneIps_= (value: Option[IndexedSeq[java.net.InetAddress]]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _nullableListOfOneIps = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneIps") nullableListOfOneIps: Option[IndexedSeq[java.net.InetAddress]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableListOfOneIps = nullableListOfOneIps)

}

object NullableListOfOneIps_5 extends AggregateRootCompanion[NullableListOfOneIps_5]{

  def apply(
    nullableListOfOneIps: Option[IndexedSeq[java.net.InetAddress]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneIps)
    require(nullableListOfOneIps ne null, "Null value was provided for property \"nullableListOfOneIps\"")
    if (nullableListOfOneIps.isDefined) require(nullableListOfOneIps.get ne null, "Null value was provided for property \"nullableListOfOneIps\"")
    new NullableListOfOneIps_5(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableListOfOneIps = nullableListOfOneIps)
  }

}
