package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableSetOfOneIps_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableSetOfOneIps: Option[Set[java.net.InetAddress]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonGetter("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableSetOfOneIps_2 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableSetOfOneIps_2("+ URI +")"

   def copy(nullableSetOfOneIps: Option[Set[java.net.InetAddress]] = this._nullableSetOfOneIps): NullableSetOfOneIps_2 = {

  require(nullableSetOfOneIps ne null, "Null value was provided for property \"nullableSetOfOneIps\"")
  if(nullableSetOfOneIps.isDefined) require(nullableSetOfOneIps.get ne null, "Null value was provided for property \"nullableSetOfOneIps\"")
  com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneIps)
    new NullableSetOfOneIps_2(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableSetOfOneIps = nullableSetOfOneIps)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("ID")
  def ID = {
    _ID
  }

  private def ID_= (value: Int) {
    _ID = value

  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableSetOfOneIps_2): this.type = {
    this._URI = result._URI
    this._nullableSetOfOneIps = result._nullableSetOfOneIps
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableSetOfOneIps_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("nullableSetOfOneIps")
  def nullableSetOfOneIps = {
    _nullableSetOfOneIps
  }

  def nullableSetOfOneIps_= (value: Option[Set[java.net.InetAddress]]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _nullableSetOfOneIps = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneIps") nullableSetOfOneIps: Option[Set[java.net.InetAddress]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableSetOfOneIps = nullableSetOfOneIps)

}

object NullableSetOfOneIps_2 extends AggregateRootCompanion[NullableSetOfOneIps_2]{

  def apply(
    nullableSetOfOneIps: Option[Set[java.net.InetAddress]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneIps)
    require(nullableSetOfOneIps ne null, "Null value was provided for property \"nullableSetOfOneIps\"")
    if (nullableSetOfOneIps.isDefined) require(nullableSetOfOneIps.get ne null, "Null value was provided for property \"nullableSetOfOneIps\"")
    new NullableSetOfOneIps_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableSetOfOneIps = nullableSetOfOneIps)
  }

}
