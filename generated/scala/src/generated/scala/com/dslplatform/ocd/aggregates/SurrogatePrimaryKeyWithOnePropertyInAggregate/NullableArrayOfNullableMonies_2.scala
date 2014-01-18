package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableArrayOfNullableMonies_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableArrayOfNullableMonies: Option[Array[Option[BigDecimal]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonGetter("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableArrayOfNullableMonies_2 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableArrayOfNullableMonies_2("+ URI +")"

   def copy(nullableArrayOfNullableMonies: Option[Array[Option[BigDecimal]]] = this._nullableArrayOfNullableMonies): NullableArrayOfNullableMonies_2 = {

  require(nullableArrayOfNullableMonies ne null, "Null value was provided for property \"nullableArrayOfNullableMonies\"")
  if(nullableArrayOfNullableMonies.isDefined) require(nullableArrayOfNullableMonies.get ne null, "Null value was provided for property \"nullableArrayOfNullableMonies\"")
  com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableMonies)
    new NullableArrayOfNullableMonies_2(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableArrayOfNullableMonies = nullableArrayOfNullableMonies)
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

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableArrayOfNullableMonies_2): this.type = {
    this._URI = result._URI
    this._nullableArrayOfNullableMonies = result._nullableArrayOfNullableMonies
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableArrayOfNullableMonies_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("nullableArrayOfNullableMonies")
  def nullableArrayOfNullableMonies = {
    _nullableArrayOfNullableMonies
  }

  def nullableArrayOfNullableMonies_= (value: Option[Array[Option[BigDecimal]]]) {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(value)
    _nullableArrayOfNullableMonies = value

    _nullableArrayOfNullableMonies = com.dslplatform.api.Guards.setArrayOptionScale(_nullableArrayOfNullableMonies, 2)
  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableMonies") nullableArrayOfNullableMonies: Option[Array[Option[BigDecimal]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableArrayOfNullableMonies = nullableArrayOfNullableMonies)

}

object NullableArrayOfNullableMonies_2 extends AggregateRootCompanion[NullableArrayOfNullableMonies_2]{

  def apply(
    nullableArrayOfNullableMonies: Option[Array[Option[BigDecimal]]] = None
  ) = {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableMonies)
    require(nullableArrayOfNullableMonies ne null, "Null value was provided for property \"nullableArrayOfNullableMonies\"")
    if (nullableArrayOfNullableMonies.isDefined) require(nullableArrayOfNullableMonies.get ne null, "Null value was provided for property \"nullableArrayOfNullableMonies\"")
    new NullableArrayOfNullableMonies_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableArrayOfNullableMonies = nullableArrayOfNullableMonies)
  }

}
