package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneIp_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneIp: java.net.InetAddress
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonGetter("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneIp_3 => c.URI == URI
    case _ => false
  }

  override def toString = "OneIp_3("+ URI +")"

   def copy(oneIp: java.net.InetAddress = this._oneIp): OneIp_3 = {

  require(oneIp ne null, "Null value was provided for property \"oneIp\"")
    new OneIp_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneIp = oneIp)
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

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneIp_3): this.type = {
    this._URI = result._URI
    this._oneIp = result._oneIp
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneIp_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("oneIp")
  def oneIp = {
    _oneIp
  }

  def oneIp_= (value: java.net.InetAddress) {
    _oneIp = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneIp") oneIp: java.net.InetAddress
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneIp = if (oneIp == null) null else oneIp)

}

object OneIp_3 extends AggregateRootCompanion[OneIp_3]{

  def apply(
    oneIp: java.net.InetAddress = null
  ) = {
    require(oneIp ne null, "Null value was provided for property \"oneIp\"")
    new OneIp_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneIp = oneIp)
  }

}
