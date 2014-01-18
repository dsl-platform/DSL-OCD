package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableListOfOneDates_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableListOfOneDates: Option[IndexedSeq[org.joda.time.LocalDate]],
    private var _calculatedNullableListOfOneDates: Option[IndexedSeq[org.joda.time.LocalDate]],
    private var _persistedNullableListOfOneDates: Option[IndexedSeq[org.joda.time.LocalDate]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableListOfOneDates_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableListOfOneDates_3("+ URI +")"

   def copy(nullableListOfOneDates: Option[IndexedSeq[org.joda.time.LocalDate]] = this._nullableListOfOneDates): NullableListOfOneDates_3 = {

  require(nullableListOfOneDates ne null, "Null value was provided for property \"nullableListOfOneDates\"")
  if(nullableListOfOneDates.isDefined) require(nullableListOfOneDates.get ne null, "Null value was provided for property \"nullableListOfOneDates\"")
  com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneDates)
    new NullableListOfOneDates_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableListOfOneDates = nullableListOfOneDates, _calculatedNullableListOfOneDates = _calculatedNullableListOfOneDates, _persistedNullableListOfOneDates = _persistedNullableListOfOneDates)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfOneDates_3): this.type = {
    this._URI = result._URI
    this._nullableListOfOneDates = result._nullableListOfOneDates
    this._calculatedNullableListOfOneDates = result._calculatedNullableListOfOneDates
    this._persistedNullableListOfOneDates = result._persistedNullableListOfOneDates
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfOneDates_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneDates")
  def nullableListOfOneDates = {
    _nullableListOfOneDates
  }

  def nullableListOfOneDates_= (value: Option[IndexedSeq[org.joda.time.LocalDate]]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _nullableListOfOneDates = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfOneDates")
  def calculatedNullableListOfOneDates = {
    _calculatedNullableListOfOneDates
  }

  def calculatedNullableListOfOneDates_= (value: Option[IndexedSeq[org.joda.time.LocalDate]]) {
    _calculatedNullableListOfOneDates = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfOneDates")
  def persistedNullableListOfOneDates = {
    _persistedNullableListOfOneDates
  }

  def persistedNullableListOfOneDates_= (value: Option[IndexedSeq[org.joda.time.LocalDate]]) {
    _persistedNullableListOfOneDates = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneDates") nullableListOfOneDates: Option[IndexedSeq[org.joda.time.LocalDate]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfOneDates") calculatedNullableListOfOneDates: Option[IndexedSeq[org.joda.time.LocalDate]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfOneDates") persistedNullableListOfOneDates: Option[IndexedSeq[org.joda.time.LocalDate]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableListOfOneDates = nullableListOfOneDates, _calculatedNullableListOfOneDates = calculatedNullableListOfOneDates, _persistedNullableListOfOneDates = persistedNullableListOfOneDates)

}

object NullableListOfOneDates_3 extends AggregateRootCompanion[NullableListOfOneDates_3]{

  def apply(
    nullableListOfOneDates: Option[IndexedSeq[org.joda.time.LocalDate]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneDates)
    require(nullableListOfOneDates ne null, "Null value was provided for property \"nullableListOfOneDates\"")
    if (nullableListOfOneDates.isDefined) require(nullableListOfOneDates.get ne null, "Null value was provided for property \"nullableListOfOneDates\"")
    new NullableListOfOneDates_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableListOfOneDates = nullableListOfOneDates
    , _calculatedNullableListOfOneDates = None
    , _persistedNullableListOfOneDates = None)
  }

}
