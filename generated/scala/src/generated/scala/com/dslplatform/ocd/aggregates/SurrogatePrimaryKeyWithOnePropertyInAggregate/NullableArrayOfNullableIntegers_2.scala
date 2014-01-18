package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableArrayOfNullableIntegers_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableArrayOfNullableIntegers: Option[Array[Option[Int]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableArrayOfNullableIntegers_2 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableArrayOfNullableIntegers_2("+ URI +")"

   def copy(nullableArrayOfNullableIntegers: Option[Array[Option[Int]]] = this._nullableArrayOfNullableIntegers): NullableArrayOfNullableIntegers_2 = {

  require(nullableArrayOfNullableIntegers ne null, "Null value was provided for property \"nullableArrayOfNullableIntegers\"")
  if(nullableArrayOfNullableIntegers.isDefined) require(nullableArrayOfNullableIntegers.get ne null, "Null value was provided for property \"nullableArrayOfNullableIntegers\"")
  com.dslplatform.api.Guards.checkArrayOptionValNulls(nullableArrayOfNullableIntegers)
    new NullableArrayOfNullableIntegers_2(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableArrayOfNullableIntegers = nullableArrayOfNullableIntegers)
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

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableArrayOfNullableIntegers_2): this.type = {
    this._URI = result._URI
    this._nullableArrayOfNullableIntegers = result._nullableArrayOfNullableIntegers
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableArrayOfNullableIntegers_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableIntegers")
  def nullableArrayOfNullableIntegers = {
    _nullableArrayOfNullableIntegers
  }

  def nullableArrayOfNullableIntegers_= (value: Option[Array[Option[Int]]]) {
    com.dslplatform.api.Guards.checkArrayOptionValNulls(value)
    _nullableArrayOfNullableIntegers = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableIntegers") nullableArrayOfNullableIntegers: Option[Array[Option[Int]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableArrayOfNullableIntegers = nullableArrayOfNullableIntegers)

}

object NullableArrayOfNullableIntegers_2 extends AggregateRootCompanion[NullableArrayOfNullableIntegers_2]{

  def apply(
    nullableArrayOfNullableIntegers: Option[Array[Option[Int]]] = None
  ) = {
    com.dslplatform.api.Guards.checkArrayOptionValNulls(nullableArrayOfNullableIntegers)
    require(nullableArrayOfNullableIntegers ne null, "Null value was provided for property \"nullableArrayOfNullableIntegers\"")
    if (nullableArrayOfNullableIntegers.isDefined) require(nullableArrayOfNullableIntegers.get ne null, "Null value was provided for property \"nullableArrayOfNullableIntegers\"")
    new NullableArrayOfNullableIntegers_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableArrayOfNullableIntegers = nullableArrayOfNullableIntegers)
  }

}
