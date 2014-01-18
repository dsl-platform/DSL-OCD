package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableArrayOfNullableDates_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableArrayOfNullableDates: Option[Array[Option[org.joda.time.LocalDate]]],
    private var _calculatedNullableArrayOfNullableDates: Option[Array[Option[org.joda.time.LocalDate]]],
    private var _persistedNullableArrayOfNullableDates: Option[Array[Option[org.joda.time.LocalDate]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableArrayOfNullableDates_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableArrayOfNullableDates_3("+ URI +")"

   def copy(nullableArrayOfNullableDates: Option[Array[Option[org.joda.time.LocalDate]]] = this._nullableArrayOfNullableDates): NullableArrayOfNullableDates_3 = {

  require(nullableArrayOfNullableDates ne null, "Null value was provided for property \"nullableArrayOfNullableDates\"")
  if(nullableArrayOfNullableDates.isDefined) require(nullableArrayOfNullableDates.get ne null, "Null value was provided for property \"nullableArrayOfNullableDates\"")
  com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableDates)
    new NullableArrayOfNullableDates_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableArrayOfNullableDates = nullableArrayOfNullableDates, _calculatedNullableArrayOfNullableDates = _calculatedNullableArrayOfNullableDates, _persistedNullableArrayOfNullableDates = _persistedNullableArrayOfNullableDates)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfNullableDates_3): this.type = {
    this._URI = result._URI
    this._nullableArrayOfNullableDates = result._nullableArrayOfNullableDates
    this._calculatedNullableArrayOfNullableDates = result._calculatedNullableArrayOfNullableDates
    this._persistedNullableArrayOfNullableDates = result._persistedNullableArrayOfNullableDates
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfNullableDates_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableDates")
  def nullableArrayOfNullableDates = {
    _nullableArrayOfNullableDates
  }

  def nullableArrayOfNullableDates_= (value: Option[Array[Option[org.joda.time.LocalDate]]]) {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(value)
    _nullableArrayOfNullableDates = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfNullableDates")
  def calculatedNullableArrayOfNullableDates = {
    _calculatedNullableArrayOfNullableDates
  }

  def calculatedNullableArrayOfNullableDates_= (value: Option[Array[Option[org.joda.time.LocalDate]]]) {
    _calculatedNullableArrayOfNullableDates = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfNullableDates")
  def persistedNullableArrayOfNullableDates = {
    _persistedNullableArrayOfNullableDates
  }

  def persistedNullableArrayOfNullableDates_= (value: Option[Array[Option[org.joda.time.LocalDate]]]) {
    _persistedNullableArrayOfNullableDates = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableDates") nullableArrayOfNullableDates: Option[Array[Option[org.joda.time.LocalDate]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfNullableDates") calculatedNullableArrayOfNullableDates: Option[Array[Option[org.joda.time.LocalDate]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfNullableDates") persistedNullableArrayOfNullableDates: Option[Array[Option[org.joda.time.LocalDate]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableArrayOfNullableDates = nullableArrayOfNullableDates, _calculatedNullableArrayOfNullableDates = calculatedNullableArrayOfNullableDates, _persistedNullableArrayOfNullableDates = persistedNullableArrayOfNullableDates)

}

object NullableArrayOfNullableDates_3 extends AggregateRootCompanion[NullableArrayOfNullableDates_3]{

  def apply(
    nullableArrayOfNullableDates: Option[Array[Option[org.joda.time.LocalDate]]] = None
  ) = {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableDates)
    require(nullableArrayOfNullableDates ne null, "Null value was provided for property \"nullableArrayOfNullableDates\"")
    if (nullableArrayOfNullableDates.isDefined) require(nullableArrayOfNullableDates.get ne null, "Null value was provided for property \"nullableArrayOfNullableDates\"")
    new NullableArrayOfNullableDates_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableArrayOfNullableDates = nullableArrayOfNullableDates
    , _calculatedNullableArrayOfNullableDates = None
    , _persistedNullableArrayOfNullableDates = None)
  }

}
