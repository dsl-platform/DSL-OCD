package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableListOfNullableTimestamps_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableListOfNullableTimestamps: Option[IndexedSeq[Option[org.joda.time.DateTime]]],
    private var _calculatedNullableListOfNullableTimestamps: Option[IndexedSeq[Option[org.joda.time.DateTime]]],
    private var _persistedNullableListOfNullableTimestamps: Option[IndexedSeq[Option[org.joda.time.DateTime]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableListOfNullableTimestamps_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableListOfNullableTimestamps_3("+ URI +")"

   def copy(nullableListOfNullableTimestamps: Option[IndexedSeq[Option[org.joda.time.DateTime]]] = this._nullableListOfNullableTimestamps): NullableListOfNullableTimestamps_3 = {

  require(nullableListOfNullableTimestamps ne null, "Null value was provided for property \"nullableListOfNullableTimestamps\"")
  if(nullableListOfNullableTimestamps.isDefined) require(nullableListOfNullableTimestamps.get ne null, "Null value was provided for property \"nullableListOfNullableTimestamps\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableTimestamps)
    new NullableListOfNullableTimestamps_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableListOfNullableTimestamps = nullableListOfNullableTimestamps, _calculatedNullableListOfNullableTimestamps = _calculatedNullableListOfNullableTimestamps, _persistedNullableListOfNullableTimestamps = _persistedNullableListOfNullableTimestamps)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfNullableTimestamps_3): this.type = {
    this._URI = result._URI
    this._nullableListOfNullableTimestamps = result._nullableListOfNullableTimestamps
    this._calculatedNullableListOfNullableTimestamps = result._calculatedNullableListOfNullableTimestamps
    this._persistedNullableListOfNullableTimestamps = result._persistedNullableListOfNullableTimestamps
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfNullableTimestamps_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableTimestamps")
  def nullableListOfNullableTimestamps = {
    _nullableListOfNullableTimestamps
  }

  def nullableListOfNullableTimestamps_= (value: Option[IndexedSeq[Option[org.joda.time.DateTime]]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _nullableListOfNullableTimestamps = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfNullableTimestamps")
  def calculatedNullableListOfNullableTimestamps = {
    _calculatedNullableListOfNullableTimestamps
  }

  def calculatedNullableListOfNullableTimestamps_= (value: Option[IndexedSeq[Option[org.joda.time.DateTime]]]) {
    _calculatedNullableListOfNullableTimestamps = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfNullableTimestamps")
  def persistedNullableListOfNullableTimestamps = {
    _persistedNullableListOfNullableTimestamps
  }

  def persistedNullableListOfNullableTimestamps_= (value: Option[IndexedSeq[Option[org.joda.time.DateTime]]]) {
    _persistedNullableListOfNullableTimestamps = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableTimestamps") nullableListOfNullableTimestamps: Option[IndexedSeq[Option[org.joda.time.DateTime]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfNullableTimestamps") calculatedNullableListOfNullableTimestamps: Option[IndexedSeq[Option[org.joda.time.DateTime]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfNullableTimestamps") persistedNullableListOfNullableTimestamps: Option[IndexedSeq[Option[org.joda.time.DateTime]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableListOfNullableTimestamps = nullableListOfNullableTimestamps, _calculatedNullableListOfNullableTimestamps = calculatedNullableListOfNullableTimestamps, _persistedNullableListOfNullableTimestamps = persistedNullableListOfNullableTimestamps)

}

object NullableListOfNullableTimestamps_3 extends AggregateRootCompanion[NullableListOfNullableTimestamps_3]{

  def apply(
    nullableListOfNullableTimestamps: Option[IndexedSeq[Option[org.joda.time.DateTime]]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableTimestamps)
    require(nullableListOfNullableTimestamps ne null, "Null value was provided for property \"nullableListOfNullableTimestamps\"")
    if (nullableListOfNullableTimestamps.isDefined) require(nullableListOfNullableTimestamps.get ne null, "Null value was provided for property \"nullableListOfNullableTimestamps\"")
    new NullableListOfNullableTimestamps_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableListOfNullableTimestamps = nullableListOfNullableTimestamps
    , _calculatedNullableListOfNullableTimestamps = None
    , _persistedNullableListOfNullableTimestamps = None)
  }

}
