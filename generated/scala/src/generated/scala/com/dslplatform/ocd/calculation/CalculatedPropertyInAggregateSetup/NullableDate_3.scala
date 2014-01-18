package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableDate_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableDate: Option[org.joda.time.LocalDate],
    private var _calculatedNullableDate: Option[org.joda.time.LocalDate],
    private var _persistedNullableDate: Option[org.joda.time.LocalDate]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableDate_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableDate_3("+ URI +")"

   def copy(nullableDate: Option[org.joda.time.LocalDate] = this._nullableDate): NullableDate_3 = {

  require(nullableDate ne null, "Null value was provided for property \"nullableDate\"")
  if(nullableDate.isDefined) require(nullableDate.get ne null, "Null value was provided for property \"nullableDate\"")
    new NullableDate_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableDate = nullableDate, _calculatedNullableDate = _calculatedNullableDate, _persistedNullableDate = _persistedNullableDate)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableDate_3): this.type = {
    this._URI = result._URI
    this._nullableDate = result._nullableDate
    this._calculatedNullableDate = result._calculatedNullableDate
    this._persistedNullableDate = result._persistedNullableDate
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableDate_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableDate")
  def nullableDate = {
    _nullableDate
  }

  def nullableDate_= (value: Option[org.joda.time.LocalDate]) {
    _nullableDate = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableDate")
  def calculatedNullableDate = {
    _calculatedNullableDate
  }

  def calculatedNullableDate_= (value: Option[org.joda.time.LocalDate]) {
    _calculatedNullableDate = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableDate")
  def persistedNullableDate = {
    _persistedNullableDate
  }

  def persistedNullableDate_= (value: Option[org.joda.time.LocalDate]) {
    _persistedNullableDate = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableDate") nullableDate: Option[org.joda.time.LocalDate]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableDate") calculatedNullableDate: Option[org.joda.time.LocalDate]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableDate") persistedNullableDate: Option[org.joda.time.LocalDate]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableDate = nullableDate, _calculatedNullableDate = calculatedNullableDate, _persistedNullableDate = persistedNullableDate)

}

object NullableDate_3 extends AggregateRootCompanion[NullableDate_3]{

  def apply(
    nullableDate: Option[org.joda.time.LocalDate] = None
  ) = {
    require(nullableDate ne null, "Null value was provided for property \"nullableDate\"")
    if (nullableDate.isDefined) require(nullableDate.get ne null, "Null value was provided for property \"nullableDate\"")
    new NullableDate_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableDate = nullableDate
    , _calculatedNullableDate = None
    , _persistedNullableDate = None)
  }

}
