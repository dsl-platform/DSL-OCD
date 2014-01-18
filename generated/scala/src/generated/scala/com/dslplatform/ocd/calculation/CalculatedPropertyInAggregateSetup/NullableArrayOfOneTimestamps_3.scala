package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableArrayOfOneTimestamps_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableArrayOfOneTimestamps: Option[Array[org.joda.time.DateTime]],
    private var _calculatedNullableArrayOfOneTimestamps: Option[Array[org.joda.time.DateTime]],
    private var _persistedNullableArrayOfOneTimestamps: Option[Array[org.joda.time.DateTime]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableArrayOfOneTimestamps_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableArrayOfOneTimestamps_3("+ URI +")"

   def copy(nullableArrayOfOneTimestamps: Option[Array[org.joda.time.DateTime]] = this._nullableArrayOfOneTimestamps): NullableArrayOfOneTimestamps_3 = {

  require(nullableArrayOfOneTimestamps ne null, "Null value was provided for property \"nullableArrayOfOneTimestamps\"")
  if(nullableArrayOfOneTimestamps.isDefined) require(nullableArrayOfOneTimestamps.get ne null, "Null value was provided for property \"nullableArrayOfOneTimestamps\"")
  com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneTimestamps)
    new NullableArrayOfOneTimestamps_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableArrayOfOneTimestamps = nullableArrayOfOneTimestamps, _calculatedNullableArrayOfOneTimestamps = _calculatedNullableArrayOfOneTimestamps, _persistedNullableArrayOfOneTimestamps = _persistedNullableArrayOfOneTimestamps)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfOneTimestamps_3): this.type = {
    this._URI = result._URI
    this._nullableArrayOfOneTimestamps = result._nullableArrayOfOneTimestamps
    this._calculatedNullableArrayOfOneTimestamps = result._calculatedNullableArrayOfOneTimestamps
    this._persistedNullableArrayOfOneTimestamps = result._persistedNullableArrayOfOneTimestamps
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfOneTimestamps_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneTimestamps")
  def nullableArrayOfOneTimestamps = {
    _nullableArrayOfOneTimestamps
  }

  def nullableArrayOfOneTimestamps_= (value: Option[Array[org.joda.time.DateTime]]) {
    com.dslplatform.api.Guards.checkArrayNulls(value)
    _nullableArrayOfOneTimestamps = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfOneTimestamps")
  def calculatedNullableArrayOfOneTimestamps = {
    _calculatedNullableArrayOfOneTimestamps
  }

  def calculatedNullableArrayOfOneTimestamps_= (value: Option[Array[org.joda.time.DateTime]]) {
    _calculatedNullableArrayOfOneTimestamps = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfOneTimestamps")
  def persistedNullableArrayOfOneTimestamps = {
    _persistedNullableArrayOfOneTimestamps
  }

  def persistedNullableArrayOfOneTimestamps_= (value: Option[Array[org.joda.time.DateTime]]) {
    _persistedNullableArrayOfOneTimestamps = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneTimestamps") nullableArrayOfOneTimestamps: Option[Array[org.joda.time.DateTime]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfOneTimestamps") calculatedNullableArrayOfOneTimestamps: Option[Array[org.joda.time.DateTime]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfOneTimestamps") persistedNullableArrayOfOneTimestamps: Option[Array[org.joda.time.DateTime]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableArrayOfOneTimestamps = nullableArrayOfOneTimestamps, _calculatedNullableArrayOfOneTimestamps = calculatedNullableArrayOfOneTimestamps, _persistedNullableArrayOfOneTimestamps = persistedNullableArrayOfOneTimestamps)

}

object NullableArrayOfOneTimestamps_3 extends AggregateRootCompanion[NullableArrayOfOneTimestamps_3]{

  def apply(
    nullableArrayOfOneTimestamps: Option[Array[org.joda.time.DateTime]] = None
  ) = {
    com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneTimestamps)
    require(nullableArrayOfOneTimestamps ne null, "Null value was provided for property \"nullableArrayOfOneTimestamps\"")
    if (nullableArrayOfOneTimestamps.isDefined) require(nullableArrayOfOneTimestamps.get ne null, "Null value was provided for property \"nullableArrayOfOneTimestamps\"")
    new NullableArrayOfOneTimestamps_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableArrayOfOneTimestamps = nullableArrayOfOneTimestamps
    , _calculatedNullableArrayOfOneTimestamps = None
    , _persistedNullableArrayOfOneTimestamps = None)
  }

}
