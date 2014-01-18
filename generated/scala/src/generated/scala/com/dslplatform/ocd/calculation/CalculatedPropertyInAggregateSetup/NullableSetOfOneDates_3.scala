package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableSetOfOneDates_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableSetOfOneDates: Option[Set[org.joda.time.LocalDate]],
    private var _calculatedNullableSetOfOneDates: Option[Set[org.joda.time.LocalDate]],
    private var _persistedNullableSetOfOneDates: Option[Set[org.joda.time.LocalDate]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableSetOfOneDates_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableSetOfOneDates_3("+ URI +")"

   def copy(nullableSetOfOneDates: Option[Set[org.joda.time.LocalDate]] = this._nullableSetOfOneDates): NullableSetOfOneDates_3 = {

  require(nullableSetOfOneDates ne null, "Null value was provided for property \"nullableSetOfOneDates\"")
  if(nullableSetOfOneDates.isDefined) require(nullableSetOfOneDates.get ne null, "Null value was provided for property \"nullableSetOfOneDates\"")
  com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneDates)
    new NullableSetOfOneDates_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableSetOfOneDates = nullableSetOfOneDates, _calculatedNullableSetOfOneDates = _calculatedNullableSetOfOneDates, _persistedNullableSetOfOneDates = _persistedNullableSetOfOneDates)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfOneDates_3): this.type = {
    this._URI = result._URI
    this._nullableSetOfOneDates = result._nullableSetOfOneDates
    this._calculatedNullableSetOfOneDates = result._calculatedNullableSetOfOneDates
    this._persistedNullableSetOfOneDates = result._persistedNullableSetOfOneDates
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfOneDates_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneDates")
  def nullableSetOfOneDates = {
    _nullableSetOfOneDates
  }

  def nullableSetOfOneDates_= (value: Option[Set[org.joda.time.LocalDate]]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _nullableSetOfOneDates = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfOneDates")
  def calculatedNullableSetOfOneDates = {
    _calculatedNullableSetOfOneDates
  }

  def calculatedNullableSetOfOneDates_= (value: Option[Set[org.joda.time.LocalDate]]) {
    _calculatedNullableSetOfOneDates = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfOneDates")
  def persistedNullableSetOfOneDates = {
    _persistedNullableSetOfOneDates
  }

  def persistedNullableSetOfOneDates_= (value: Option[Set[org.joda.time.LocalDate]]) {
    _persistedNullableSetOfOneDates = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneDates") nullableSetOfOneDates: Option[Set[org.joda.time.LocalDate]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfOneDates") calculatedNullableSetOfOneDates: Option[Set[org.joda.time.LocalDate]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfOneDates") persistedNullableSetOfOneDates: Option[Set[org.joda.time.LocalDate]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableSetOfOneDates = nullableSetOfOneDates, _calculatedNullableSetOfOneDates = calculatedNullableSetOfOneDates, _persistedNullableSetOfOneDates = persistedNullableSetOfOneDates)

}

object NullableSetOfOneDates_3 extends AggregateRootCompanion[NullableSetOfOneDates_3]{

  def apply(
    nullableSetOfOneDates: Option[Set[org.joda.time.LocalDate]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneDates)
    require(nullableSetOfOneDates ne null, "Null value was provided for property \"nullableSetOfOneDates\"")
    if (nullableSetOfOneDates.isDefined) require(nullableSetOfOneDates.get ne null, "Null value was provided for property \"nullableSetOfOneDates\"")
    new NullableSetOfOneDates_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableSetOfOneDates = nullableSetOfOneDates
    , _calculatedNullableSetOfOneDates = None
    , _persistedNullableSetOfOneDates = None)
  }

}
