package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableListOfOneTimestamps_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableListOfOneTimestamps: Option[IndexedSeq[org.joda.time.DateTime]],
    private var _calculatedNullableListOfOneTimestamps: Option[IndexedSeq[org.joda.time.DateTime]],
    private var _persistedNullableListOfOneTimestamps: Option[IndexedSeq[org.joda.time.DateTime]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableListOfOneTimestamps_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableListOfOneTimestamps_3("+ URI +")"

   def copy(nullableListOfOneTimestamps: Option[IndexedSeq[org.joda.time.DateTime]] = this._nullableListOfOneTimestamps): NullableListOfOneTimestamps_3 = {

  require(nullableListOfOneTimestamps ne null, "Null value was provided for property \"nullableListOfOneTimestamps\"")
  if(nullableListOfOneTimestamps.isDefined) require(nullableListOfOneTimestamps.get ne null, "Null value was provided for property \"nullableListOfOneTimestamps\"")
  com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneTimestamps)
    new NullableListOfOneTimestamps_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableListOfOneTimestamps = nullableListOfOneTimestamps, _calculatedNullableListOfOneTimestamps = _calculatedNullableListOfOneTimestamps, _persistedNullableListOfOneTimestamps = _persistedNullableListOfOneTimestamps)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfOneTimestamps_3): this.type = {
    this._URI = result._URI
    this._nullableListOfOneTimestamps = result._nullableListOfOneTimestamps
    this._calculatedNullableListOfOneTimestamps = result._calculatedNullableListOfOneTimestamps
    this._persistedNullableListOfOneTimestamps = result._persistedNullableListOfOneTimestamps
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfOneTimestamps_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneTimestamps")
  def nullableListOfOneTimestamps = {
    _nullableListOfOneTimestamps
  }

  def nullableListOfOneTimestamps_= (value: Option[IndexedSeq[org.joda.time.DateTime]]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _nullableListOfOneTimestamps = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfOneTimestamps")
  def calculatedNullableListOfOneTimestamps = {
    _calculatedNullableListOfOneTimestamps
  }

  def calculatedNullableListOfOneTimestamps_= (value: Option[IndexedSeq[org.joda.time.DateTime]]) {
    _calculatedNullableListOfOneTimestamps = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfOneTimestamps")
  def persistedNullableListOfOneTimestamps = {
    _persistedNullableListOfOneTimestamps
  }

  def persistedNullableListOfOneTimestamps_= (value: Option[IndexedSeq[org.joda.time.DateTime]]) {
    _persistedNullableListOfOneTimestamps = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneTimestamps") nullableListOfOneTimestamps: Option[IndexedSeq[org.joda.time.DateTime]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfOneTimestamps") calculatedNullableListOfOneTimestamps: Option[IndexedSeq[org.joda.time.DateTime]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfOneTimestamps") persistedNullableListOfOneTimestamps: Option[IndexedSeq[org.joda.time.DateTime]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableListOfOneTimestamps = nullableListOfOneTimestamps, _calculatedNullableListOfOneTimestamps = calculatedNullableListOfOneTimestamps, _persistedNullableListOfOneTimestamps = persistedNullableListOfOneTimestamps)

}

object NullableListOfOneTimestamps_3 extends AggregateRootCompanion[NullableListOfOneTimestamps_3]{

  def apply(
    nullableListOfOneTimestamps: Option[IndexedSeq[org.joda.time.DateTime]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneTimestamps)
    require(nullableListOfOneTimestamps ne null, "Null value was provided for property \"nullableListOfOneTimestamps\"")
    if (nullableListOfOneTimestamps.isDefined) require(nullableListOfOneTimestamps.get ne null, "Null value was provided for property \"nullableListOfOneTimestamps\"")
    new NullableListOfOneTimestamps_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableListOfOneTimestamps = nullableListOfOneTimestamps
    , _calculatedNullableListOfOneTimestamps = None
    , _persistedNullableListOfOneTimestamps = None)
  }

}
