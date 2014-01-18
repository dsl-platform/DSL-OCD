package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfNullableIps_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneArrayOfNullableIps: Array[Option[java.net.InetAddress]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonGetter("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfNullableIps_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfNullableIps_2("+ URI +")"

   def copy(oneArrayOfNullableIps: Array[Option[java.net.InetAddress]] = this._oneArrayOfNullableIps): OneArrayOfNullableIps_2 = {

  require(oneArrayOfNullableIps ne null, "Null value was provided for property \"oneArrayOfNullableIps\"")
  com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableIps)
    new OneArrayOfNullableIps_2(_URI = this.URI, __locator = this.__locator, _oneArrayOfNullableIps = oneArrayOfNullableIps)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneArrayOfNullableIps_2): this.type = {
    this._URI = result._URI
    this._oneArrayOfNullableIps = result._oneArrayOfNullableIps
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneArrayOfNullableIps_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("oneArrayOfNullableIps")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfNullableIps = {
    _oneArrayOfNullableIps
  }

  def oneArrayOfNullableIps_= (value: Array[Option[java.net.InetAddress]]) {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(value)
    _oneArrayOfNullableIps = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableIps") oneArrayOfNullableIps: Array[Option[java.net.InetAddress]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneArrayOfNullableIps = if (oneArrayOfNullableIps == null) Array.empty else oneArrayOfNullableIps)

}

object OneArrayOfNullableIps_2 extends AggregateRootCompanion[OneArrayOfNullableIps_2]{

  def apply(
    oneArrayOfNullableIps: Array[Option[java.net.InetAddress]] = Array.empty
  ) = {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableIps)
    require(oneArrayOfNullableIps ne null, "Null value was provided for property \"oneArrayOfNullableIps\"")
    new OneArrayOfNullableIps_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneArrayOfNullableIps = oneArrayOfNullableIps)
  }

}
