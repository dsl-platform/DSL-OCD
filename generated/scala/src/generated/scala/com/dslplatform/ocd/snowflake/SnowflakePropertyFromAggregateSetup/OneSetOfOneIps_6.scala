package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfOneIps_6 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneSetOfOneIps: Set[java.net.InetAddress]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfOneIps_6 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfOneIps_6("+ URI +")"

   def copy(oneSetOfOneIps: Set[java.net.InetAddress] = this._oneSetOfOneIps): OneSetOfOneIps_6 = {

  require(oneSetOfOneIps ne null, "Null value was provided for property \"oneSetOfOneIps\"")
  com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneIps)
    new OneSetOfOneIps_6(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneSetOfOneIps = oneSetOfOneIps)
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

  private def updateWithAnother(result: com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfOneIps_6): this.type = {
    this._URI = result._URI
    this._oneSetOfOneIps = result._oneSetOfOneIps
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.OneSetOfOneIps_6](URI), duration)
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

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneIps") oneSetOfOneIps: Set[java.net.InetAddress]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneSetOfOneIps = if (oneSetOfOneIps == null) Set.empty else oneSetOfOneIps)

}

object OneSetOfOneIps_6 extends AggregateRootCompanion[OneSetOfOneIps_6]{

  def apply(
    oneSetOfOneIps: Set[java.net.InetAddress] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneIps)
    require(oneSetOfOneIps ne null, "Null value was provided for property \"oneSetOfOneIps\"")
    new OneSetOfOneIps_6(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneSetOfOneIps = oneSetOfOneIps)
  }

}
