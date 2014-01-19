package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableIp_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableIp: Option[java.net.InetAddress]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableIp_2 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableIp_2("+ URI +")"

   def copy(nullableIp: Option[java.net.InetAddress] = this._nullableIp): NullableIp_2 = {

  require(nullableIp ne null, "Null value was provided for property \"nullableIp\"")
  if(nullableIp.isDefined) require(nullableIp.get ne null, "Null value was provided for property \"nullableIp\"")
    new NullableIp_2(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableIp = nullableIp)
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

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableIp_2): this.type = {
    this._URI = result._URI
    this._nullableIp = result._nullableIp
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableIp_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableIp")
  def nullableIp = {
    _nullableIp
  }

  def nullableIp_= (value: Option[java.net.InetAddress]) {
    _nullableIp = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableIp") nullableIp: Option[java.net.InetAddress]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableIp = nullableIp)

}

object NullableIp_2 extends AggregateRootCompanion[NullableIp_2]{

  def apply(
    nullableIp: Option[java.net.InetAddress] = None
  ) = {
    require(nullableIp ne null, "Null value was provided for property \"nullableIp\"")
    if (nullableIp.isDefined) require(nullableIp.get ne null, "Null value was provided for property \"nullableIp\"")
    new NullableIp_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableIp = nullableIp)
  }

}