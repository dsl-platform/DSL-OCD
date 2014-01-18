package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfNullableDates_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneArrayOfNullableDates: Array[Option[org.joda.time.LocalDate]],
    private var _calculatedOneArrayOfNullableDates: Array[Option[org.joda.time.LocalDate]],
    private var _persistedOneArrayOfNullableDates: Array[Option[org.joda.time.LocalDate]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfNullableDates_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfNullableDates_4("+ URI +")"

   def copy(oneArrayOfNullableDates: Array[Option[org.joda.time.LocalDate]] = this._oneArrayOfNullableDates): OneArrayOfNullableDates_4 = {

  require(oneArrayOfNullableDates ne null, "Null value was provided for property \"oneArrayOfNullableDates\"")
  com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableDates)
    new OneArrayOfNullableDates_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneArrayOfNullableDates = oneArrayOfNullableDates, _calculatedOneArrayOfNullableDates = _calculatedOneArrayOfNullableDates, _persistedOneArrayOfNullableDates = _persistedOneArrayOfNullableDates)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfNullableDates_4): this.type = {
    this._URI = result._URI
    this._oneArrayOfNullableDates = result._oneArrayOfNullableDates
    this._calculatedOneArrayOfNullableDates = result._calculatedOneArrayOfNullableDates
    this._persistedOneArrayOfNullableDates = result._persistedOneArrayOfNullableDates
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfNullableDates_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableDates")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfNullableDates = {
    _oneArrayOfNullableDates
  }

  def oneArrayOfNullableDates_= (value: Array[Option[org.joda.time.LocalDate]]) {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(value)
    _oneArrayOfNullableDates = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfNullableDates")
  def calculatedOneArrayOfNullableDates = {
    _calculatedOneArrayOfNullableDates
  }

  def calculatedOneArrayOfNullableDates_= (value: Array[Option[org.joda.time.LocalDate]]) {
    _calculatedOneArrayOfNullableDates = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfNullableDates")
  def persistedOneArrayOfNullableDates = {
    _persistedOneArrayOfNullableDates
  }

  def persistedOneArrayOfNullableDates_= (value: Array[Option[org.joda.time.LocalDate]]) {
    _persistedOneArrayOfNullableDates = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableDates") oneArrayOfNullableDates: Array[Option[org.joda.time.LocalDate]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfNullableDates") calculatedOneArrayOfNullableDates: Array[Option[org.joda.time.LocalDate]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfNullableDates") persistedOneArrayOfNullableDates: Array[Option[org.joda.time.LocalDate]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneArrayOfNullableDates = if (oneArrayOfNullableDates == null) Array.empty else oneArrayOfNullableDates, _calculatedOneArrayOfNullableDates = calculatedOneArrayOfNullableDates, _persistedOneArrayOfNullableDates = persistedOneArrayOfNullableDates)

}

object OneArrayOfNullableDates_4 extends AggregateRootCompanion[OneArrayOfNullableDates_4]{

  def apply(
    oneArrayOfNullableDates: Array[Option[org.joda.time.LocalDate]] = Array.empty
  ) = {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableDates)
    require(oneArrayOfNullableDates ne null, "Null value was provided for property \"oneArrayOfNullableDates\"")
    new OneArrayOfNullableDates_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneArrayOfNullableDates = oneArrayOfNullableDates
    , _calculatedOneArrayOfNullableDates = Array.empty
    , _persistedOneArrayOfNullableDates = Array.empty)
  }

}
