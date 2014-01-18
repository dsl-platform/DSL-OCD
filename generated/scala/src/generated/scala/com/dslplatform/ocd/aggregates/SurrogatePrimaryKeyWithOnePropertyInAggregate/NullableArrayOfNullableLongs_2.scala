package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableArrayOfNullableLongs_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableArrayOfNullableLongs: Option[Array[Option[Long]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonGetter("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableArrayOfNullableLongs_2 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableArrayOfNullableLongs_2("+ URI +")"

   def copy(nullableArrayOfNullableLongs: Option[Array[Option[Long]]] = this._nullableArrayOfNullableLongs): NullableArrayOfNullableLongs_2 = {

  require(nullableArrayOfNullableLongs ne null, "Null value was provided for property \"nullableArrayOfNullableLongs\"")
  if(nullableArrayOfNullableLongs.isDefined) require(nullableArrayOfNullableLongs.get ne null, "Null value was provided for property \"nullableArrayOfNullableLongs\"")
  com.dslplatform.api.Guards.checkArrayOptionValNulls(nullableArrayOfNullableLongs)
    new NullableArrayOfNullableLongs_2(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableArrayOfNullableLongs = nullableArrayOfNullableLongs)
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

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableArrayOfNullableLongs_2): this.type = {
    this._URI = result._URI
    this._nullableArrayOfNullableLongs = result._nullableArrayOfNullableLongs
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableArrayOfNullableLongs_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("nullableArrayOfNullableLongs")
  def nullableArrayOfNullableLongs = {
    _nullableArrayOfNullableLongs
  }

  def nullableArrayOfNullableLongs_= (value: Option[Array[Option[Long]]]) {
    com.dslplatform.api.Guards.checkArrayOptionValNulls(value)
    _nullableArrayOfNullableLongs = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableLongs") nullableArrayOfNullableLongs: Option[Array[Option[Long]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableArrayOfNullableLongs = nullableArrayOfNullableLongs)

}

object NullableArrayOfNullableLongs_2 extends AggregateRootCompanion[NullableArrayOfNullableLongs_2]{

  def apply(
    nullableArrayOfNullableLongs: Option[Array[Option[Long]]] = None
  ) = {
    com.dslplatform.api.Guards.checkArrayOptionValNulls(nullableArrayOfNullableLongs)
    require(nullableArrayOfNullableLongs ne null, "Null value was provided for property \"nullableArrayOfNullableLongs\"")
    if (nullableArrayOfNullableLongs.isDefined) require(nullableArrayOfNullableLongs.get ne null, "Null value was provided for property \"nullableArrayOfNullableLongs\"")
    new NullableArrayOfNullableLongs_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableArrayOfNullableLongs = nullableArrayOfNullableLongs)
  }

}
