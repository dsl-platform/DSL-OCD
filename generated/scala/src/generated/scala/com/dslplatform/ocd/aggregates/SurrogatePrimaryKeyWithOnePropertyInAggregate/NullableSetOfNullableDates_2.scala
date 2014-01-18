package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableSetOfNullableDates_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableSetOfNullableDates: Option[Set[Option[org.joda.time.LocalDate]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableSetOfNullableDates_2 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableSetOfNullableDates_2("+ URI +")"

   def copy(nullableSetOfNullableDates: Option[Set[Option[org.joda.time.LocalDate]]] = this._nullableSetOfNullableDates): NullableSetOfNullableDates_2 = {

  require(nullableSetOfNullableDates ne null, "Null value was provided for property \"nullableSetOfNullableDates\"")
  if(nullableSetOfNullableDates.isDefined) require(nullableSetOfNullableDates.get ne null, "Null value was provided for property \"nullableSetOfNullableDates\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullableDates)
    new NullableSetOfNullableDates_2(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableSetOfNullableDates = nullableSetOfNullableDates)
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

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableSetOfNullableDates_2): this.type = {
    this._URI = result._URI
    this._nullableSetOfNullableDates = result._nullableSetOfNullableDates
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableSetOfNullableDates_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableDates")
  def nullableSetOfNullableDates = {
    _nullableSetOfNullableDates
  }

  def nullableSetOfNullableDates_= (value: Option[Set[Option[org.joda.time.LocalDate]]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _nullableSetOfNullableDates = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableDates") nullableSetOfNullableDates: Option[Set[Option[org.joda.time.LocalDate]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableSetOfNullableDates = nullableSetOfNullableDates)

}

object NullableSetOfNullableDates_2 extends AggregateRootCompanion[NullableSetOfNullableDates_2]{

  def apply(
    nullableSetOfNullableDates: Option[Set[Option[org.joda.time.LocalDate]]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullableDates)
    require(nullableSetOfNullableDates ne null, "Null value was provided for property \"nullableSetOfNullableDates\"")
    if (nullableSetOfNullableDates.isDefined) require(nullableSetOfNullableDates.get ne null, "Null value was provided for property \"nullableSetOfNullableDates\"")
    new NullableSetOfNullableDates_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableSetOfNullableDates = nullableSetOfNullableDates)
  }

}
