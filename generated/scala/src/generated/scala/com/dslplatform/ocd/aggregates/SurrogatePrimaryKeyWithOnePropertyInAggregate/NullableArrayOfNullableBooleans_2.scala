package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableArrayOfNullableBooleans_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableArrayOfNullableBooleans: Option[Array[Option[Boolean]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableArrayOfNullableBooleans_2 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableArrayOfNullableBooleans_2("+ URI +")"

   def copy(nullableArrayOfNullableBooleans: Option[Array[Option[Boolean]]] = this._nullableArrayOfNullableBooleans): NullableArrayOfNullableBooleans_2 = {

  require(nullableArrayOfNullableBooleans ne null, "Null value was provided for property \"nullableArrayOfNullableBooleans\"")
  if(nullableArrayOfNullableBooleans.isDefined) require(nullableArrayOfNullableBooleans.get ne null, "Null value was provided for property \"nullableArrayOfNullableBooleans\"")
  com.dslplatform.api.Guards.checkArrayOptionValNulls(nullableArrayOfNullableBooleans)
    new NullableArrayOfNullableBooleans_2(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableArrayOfNullableBooleans = nullableArrayOfNullableBooleans)
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

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableArrayOfNullableBooleans_2): this.type = {
    this._URI = result._URI
    this._nullableArrayOfNullableBooleans = result._nullableArrayOfNullableBooleans
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableArrayOfNullableBooleans_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableBooleans")
  def nullableArrayOfNullableBooleans = {
    _nullableArrayOfNullableBooleans
  }

  def nullableArrayOfNullableBooleans_= (value: Option[Array[Option[Boolean]]]) {
    com.dslplatform.api.Guards.checkArrayOptionValNulls(value)
    _nullableArrayOfNullableBooleans = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableBooleans") nullableArrayOfNullableBooleans: Option[Array[Option[Boolean]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableArrayOfNullableBooleans = nullableArrayOfNullableBooleans)

}

object NullableArrayOfNullableBooleans_2 extends AggregateRootCompanion[NullableArrayOfNullableBooleans_2]{

  def apply(
    nullableArrayOfNullableBooleans: Option[Array[Option[Boolean]]] = None
  ) = {
    com.dslplatform.api.Guards.checkArrayOptionValNulls(nullableArrayOfNullableBooleans)
    require(nullableArrayOfNullableBooleans ne null, "Null value was provided for property \"nullableArrayOfNullableBooleans\"")
    if (nullableArrayOfNullableBooleans.isDefined) require(nullableArrayOfNullableBooleans.get ne null, "Null value was provided for property \"nullableArrayOfNullableBooleans\"")
    new NullableArrayOfNullableBooleans_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableArrayOfNullableBooleans = nullableArrayOfNullableBooleans)
  }

}
