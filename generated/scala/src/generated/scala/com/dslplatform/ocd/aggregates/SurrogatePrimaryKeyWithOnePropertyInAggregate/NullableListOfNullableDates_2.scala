package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableListOfNullableDates_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableListOfNullableDates: Option[IndexedSeq[Option[org.joda.time.LocalDate]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableListOfNullableDates_2 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableListOfNullableDates_2("+ URI +")"

   def copy(nullableListOfNullableDates: Option[IndexedSeq[Option[org.joda.time.LocalDate]]] = this._nullableListOfNullableDates): NullableListOfNullableDates_2 = {

  require(nullableListOfNullableDates ne null, "Null value was provided for property \"nullableListOfNullableDates\"")
  if(nullableListOfNullableDates.isDefined) require(nullableListOfNullableDates.get ne null, "Null value was provided for property \"nullableListOfNullableDates\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableDates)
    new NullableListOfNullableDates_2(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableListOfNullableDates = nullableListOfNullableDates)
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

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableListOfNullableDates_2): this.type = {
    this._URI = result._URI
    this._nullableListOfNullableDates = result._nullableListOfNullableDates
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableListOfNullableDates_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableDates")
  def nullableListOfNullableDates = {
    _nullableListOfNullableDates
  }

  def nullableListOfNullableDates_= (value: Option[IndexedSeq[Option[org.joda.time.LocalDate]]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _nullableListOfNullableDates = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableDates") nullableListOfNullableDates: Option[IndexedSeq[Option[org.joda.time.LocalDate]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableListOfNullableDates = nullableListOfNullableDates)

}

object NullableListOfNullableDates_2 extends AggregateRootCompanion[NullableListOfNullableDates_2]{

  def apply(
    nullableListOfNullableDates: Option[IndexedSeq[Option[org.joda.time.LocalDate]]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableDates)
    require(nullableListOfNullableDates ne null, "Null value was provided for property \"nullableListOfNullableDates\"")
    if (nullableListOfNullableDates.isDefined) require(nullableListOfNullableDates.get ne null, "Null value was provided for property \"nullableListOfNullableDates\"")
    new NullableListOfNullableDates_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableListOfNullableDates = nullableListOfNullableDates)
  }

}
