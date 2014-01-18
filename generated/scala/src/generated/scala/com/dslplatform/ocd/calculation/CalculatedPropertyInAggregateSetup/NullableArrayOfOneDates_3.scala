package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableArrayOfOneDates_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableArrayOfOneDates: Option[Array[org.joda.time.LocalDate]],
    private var _calculatedNullableArrayOfOneDates: Option[Array[org.joda.time.LocalDate]],
    private var _persistedNullableArrayOfOneDates: Option[Array[org.joda.time.LocalDate]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableArrayOfOneDates_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableArrayOfOneDates_3("+ URI +")"

   def copy(nullableArrayOfOneDates: Option[Array[org.joda.time.LocalDate]] = this._nullableArrayOfOneDates): NullableArrayOfOneDates_3 = {

  require(nullableArrayOfOneDates ne null, "Null value was provided for property \"nullableArrayOfOneDates\"")
  if(nullableArrayOfOneDates.isDefined) require(nullableArrayOfOneDates.get ne null, "Null value was provided for property \"nullableArrayOfOneDates\"")
  com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneDates)
    new NullableArrayOfOneDates_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableArrayOfOneDates = nullableArrayOfOneDates, _calculatedNullableArrayOfOneDates = _calculatedNullableArrayOfOneDates, _persistedNullableArrayOfOneDates = _persistedNullableArrayOfOneDates)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfOneDates_3): this.type = {
    this._URI = result._URI
    this._nullableArrayOfOneDates = result._nullableArrayOfOneDates
    this._calculatedNullableArrayOfOneDates = result._calculatedNullableArrayOfOneDates
    this._persistedNullableArrayOfOneDates = result._persistedNullableArrayOfOneDates
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfOneDates_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneDates")
  def nullableArrayOfOneDates = {
    _nullableArrayOfOneDates
  }

  def nullableArrayOfOneDates_= (value: Option[Array[org.joda.time.LocalDate]]) {
    com.dslplatform.api.Guards.checkArrayNulls(value)
    _nullableArrayOfOneDates = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfOneDates")
  def calculatedNullableArrayOfOneDates = {
    _calculatedNullableArrayOfOneDates
  }

  def calculatedNullableArrayOfOneDates_= (value: Option[Array[org.joda.time.LocalDate]]) {
    _calculatedNullableArrayOfOneDates = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfOneDates")
  def persistedNullableArrayOfOneDates = {
    _persistedNullableArrayOfOneDates
  }

  def persistedNullableArrayOfOneDates_= (value: Option[Array[org.joda.time.LocalDate]]) {
    _persistedNullableArrayOfOneDates = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneDates") nullableArrayOfOneDates: Option[Array[org.joda.time.LocalDate]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfOneDates") calculatedNullableArrayOfOneDates: Option[Array[org.joda.time.LocalDate]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfOneDates") persistedNullableArrayOfOneDates: Option[Array[org.joda.time.LocalDate]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableArrayOfOneDates = nullableArrayOfOneDates, _calculatedNullableArrayOfOneDates = calculatedNullableArrayOfOneDates, _persistedNullableArrayOfOneDates = persistedNullableArrayOfOneDates)

}

object NullableArrayOfOneDates_3 extends AggregateRootCompanion[NullableArrayOfOneDates_3]{

  def apply(
    nullableArrayOfOneDates: Option[Array[org.joda.time.LocalDate]] = None
  ) = {
    com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneDates)
    require(nullableArrayOfOneDates ne null, "Null value was provided for property \"nullableArrayOfOneDates\"")
    if (nullableArrayOfOneDates.isDefined) require(nullableArrayOfOneDates.get ne null, "Null value was provided for property \"nullableArrayOfOneDates\"")
    new NullableArrayOfOneDates_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableArrayOfOneDates = nullableArrayOfOneDates
    , _calculatedNullableArrayOfOneDates = None
    , _persistedNullableArrayOfOneDates = None)
  }

}
