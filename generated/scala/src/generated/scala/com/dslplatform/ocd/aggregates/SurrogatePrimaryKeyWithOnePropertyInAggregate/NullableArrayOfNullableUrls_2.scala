package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableArrayOfNullableUrls_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableArrayOfNullableUrls: Option[Array[Option[java.net.URI]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonGetter("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableArrayOfNullableUrls_2 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableArrayOfNullableUrls_2("+ URI +")"

   def copy(nullableArrayOfNullableUrls: Option[Array[Option[java.net.URI]]] = this._nullableArrayOfNullableUrls): NullableArrayOfNullableUrls_2 = {

  require(nullableArrayOfNullableUrls ne null, "Null value was provided for property \"nullableArrayOfNullableUrls\"")
  if(nullableArrayOfNullableUrls.isDefined) require(nullableArrayOfNullableUrls.get ne null, "Null value was provided for property \"nullableArrayOfNullableUrls\"")
  com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableUrls)
    new NullableArrayOfNullableUrls_2(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableArrayOfNullableUrls = nullableArrayOfNullableUrls)
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

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableArrayOfNullableUrls_2): this.type = {
    this._URI = result._URI
    this._nullableArrayOfNullableUrls = result._nullableArrayOfNullableUrls
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableArrayOfNullableUrls_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("nullableArrayOfNullableUrls")
  def nullableArrayOfNullableUrls = {
    _nullableArrayOfNullableUrls
  }

  def nullableArrayOfNullableUrls_= (value: Option[Array[Option[java.net.URI]]]) {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(value)
    _nullableArrayOfNullableUrls = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableUrls") nullableArrayOfNullableUrls: Option[Array[Option[java.net.URI]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableArrayOfNullableUrls = nullableArrayOfNullableUrls)

}

object NullableArrayOfNullableUrls_2 extends AggregateRootCompanion[NullableArrayOfNullableUrls_2]{

  def apply(
    nullableArrayOfNullableUrls: Option[Array[Option[java.net.URI]]] = None
  ) = {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableUrls)
    require(nullableArrayOfNullableUrls ne null, "Null value was provided for property \"nullableArrayOfNullableUrls\"")
    if (nullableArrayOfNullableUrls.isDefined) require(nullableArrayOfNullableUrls.get ne null, "Null value was provided for property \"nullableArrayOfNullableUrls\"")
    new NullableArrayOfNullableUrls_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableArrayOfNullableUrls = nullableArrayOfNullableUrls)
  }

}
