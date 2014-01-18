package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableTimestamp_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableTimestamp: Option[org.joda.time.DateTime],
    private var _calculatedNullableTimestamp: Option[org.joda.time.DateTime],
    private var _persistedNullableTimestamp: Option[org.joda.time.DateTime]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableTimestamp_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableTimestamp_3("+ URI +")"

   def copy(nullableTimestamp: Option[org.joda.time.DateTime] = this._nullableTimestamp): NullableTimestamp_3 = {

  require(nullableTimestamp ne null, "Null value was provided for property \"nullableTimestamp\"")
  if(nullableTimestamp.isDefined) require(nullableTimestamp.get ne null, "Null value was provided for property \"nullableTimestamp\"")
    new NullableTimestamp_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableTimestamp = nullableTimestamp, _calculatedNullableTimestamp = _calculatedNullableTimestamp, _persistedNullableTimestamp = _persistedNullableTimestamp)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableTimestamp_3): this.type = {
    this._URI = result._URI
    this._nullableTimestamp = result._nullableTimestamp
    this._calculatedNullableTimestamp = result._calculatedNullableTimestamp
    this._persistedNullableTimestamp = result._persistedNullableTimestamp
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableTimestamp_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableTimestamp")
  def nullableTimestamp = {
    _nullableTimestamp
  }

  def nullableTimestamp_= (value: Option[org.joda.time.DateTime]) {
    _nullableTimestamp = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableTimestamp")
  def calculatedNullableTimestamp = {
    _calculatedNullableTimestamp
  }

  def calculatedNullableTimestamp_= (value: Option[org.joda.time.DateTime]) {
    _calculatedNullableTimestamp = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableTimestamp")
  def persistedNullableTimestamp = {
    _persistedNullableTimestamp
  }

  def persistedNullableTimestamp_= (value: Option[org.joda.time.DateTime]) {
    _persistedNullableTimestamp = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableTimestamp") nullableTimestamp: Option[org.joda.time.DateTime]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableTimestamp") calculatedNullableTimestamp: Option[org.joda.time.DateTime]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableTimestamp") persistedNullableTimestamp: Option[org.joda.time.DateTime]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableTimestamp = nullableTimestamp, _calculatedNullableTimestamp = calculatedNullableTimestamp, _persistedNullableTimestamp = persistedNullableTimestamp)

}

object NullableTimestamp_3 extends AggregateRootCompanion[NullableTimestamp_3]{

  def apply(
    nullableTimestamp: Option[org.joda.time.DateTime] = None
  ) = {
    require(nullableTimestamp ne null, "Null value was provided for property \"nullableTimestamp\"")
    if (nullableTimestamp.isDefined) require(nullableTimestamp.get ne null, "Null value was provided for property \"nullableTimestamp\"")
    new NullableTimestamp_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableTimestamp = nullableTimestamp
    , _calculatedNullableTimestamp = None
    , _persistedNullableTimestamp = None)
  }

}
