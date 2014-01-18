package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfNullableUrls_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneArrayOfNullableUrls: Array[Option[java.net.URI]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfNullableUrls_3 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfNullableUrls_3("+ URI +")"

   def copy(oneArrayOfNullableUrls: Array[Option[java.net.URI]] = this._oneArrayOfNullableUrls): OneArrayOfNullableUrls_3 = {

  require(oneArrayOfNullableUrls ne null, "Null value was provided for property \"oneArrayOfNullableUrls\"")
  com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableUrls)
    new OneArrayOfNullableUrls_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneArrayOfNullableUrls = oneArrayOfNullableUrls)
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

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneArrayOfNullableUrls_3): this.type = {
    this._URI = result._URI
    this._oneArrayOfNullableUrls = result._oneArrayOfNullableUrls
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneArrayOfNullableUrls_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableUrls")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfNullableUrls = {
    _oneArrayOfNullableUrls
  }

  def oneArrayOfNullableUrls_= (value: Array[Option[java.net.URI]]) {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(value)
    _oneArrayOfNullableUrls = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableUrls") oneArrayOfNullableUrls: Array[Option[java.net.URI]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneArrayOfNullableUrls = if (oneArrayOfNullableUrls == null) Array.empty else oneArrayOfNullableUrls)

}

object OneArrayOfNullableUrls_3 extends AggregateRootCompanion[OneArrayOfNullableUrls_3]{

  def apply(
    oneArrayOfNullableUrls: Array[Option[java.net.URI]] = Array.empty
  ) = {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableUrls)
    require(oneArrayOfNullableUrls ne null, "Null value was provided for property \"oneArrayOfNullableUrls\"")
    new OneArrayOfNullableUrls_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneArrayOfNullableUrls = oneArrayOfNullableUrls)
  }

}
