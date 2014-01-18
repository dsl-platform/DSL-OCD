package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfNullableTimestamps_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneArrayOfNullableTimestamps: Array[Option[org.joda.time.DateTime]],
    private var _calculatedOneArrayOfNullableTimestamps: Array[Option[org.joda.time.DateTime]],
    private var _persistedOneArrayOfNullableTimestamps: Array[Option[org.joda.time.DateTime]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfNullableTimestamps_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfNullableTimestamps_4("+ URI +")"

   def copy(oneArrayOfNullableTimestamps: Array[Option[org.joda.time.DateTime]] = this._oneArrayOfNullableTimestamps): OneArrayOfNullableTimestamps_4 = {

  require(oneArrayOfNullableTimestamps ne null, "Null value was provided for property \"oneArrayOfNullableTimestamps\"")
  com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableTimestamps)
    new OneArrayOfNullableTimestamps_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneArrayOfNullableTimestamps = oneArrayOfNullableTimestamps, _calculatedOneArrayOfNullableTimestamps = _calculatedOneArrayOfNullableTimestamps, _persistedOneArrayOfNullableTimestamps = _persistedOneArrayOfNullableTimestamps)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfNullableTimestamps_4): this.type = {
    this._URI = result._URI
    this._oneArrayOfNullableTimestamps = result._oneArrayOfNullableTimestamps
    this._calculatedOneArrayOfNullableTimestamps = result._calculatedOneArrayOfNullableTimestamps
    this._persistedOneArrayOfNullableTimestamps = result._persistedOneArrayOfNullableTimestamps
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfNullableTimestamps_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableTimestamps")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfNullableTimestamps = {
    _oneArrayOfNullableTimestamps
  }

  def oneArrayOfNullableTimestamps_= (value: Array[Option[org.joda.time.DateTime]]) {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(value)
    _oneArrayOfNullableTimestamps = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfNullableTimestamps")
  def calculatedOneArrayOfNullableTimestamps = {
    _calculatedOneArrayOfNullableTimestamps
  }

  def calculatedOneArrayOfNullableTimestamps_= (value: Array[Option[org.joda.time.DateTime]]) {
    _calculatedOneArrayOfNullableTimestamps = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfNullableTimestamps")
  def persistedOneArrayOfNullableTimestamps = {
    _persistedOneArrayOfNullableTimestamps
  }

  def persistedOneArrayOfNullableTimestamps_= (value: Array[Option[org.joda.time.DateTime]]) {
    _persistedOneArrayOfNullableTimestamps = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableTimestamps") oneArrayOfNullableTimestamps: Array[Option[org.joda.time.DateTime]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfNullableTimestamps") calculatedOneArrayOfNullableTimestamps: Array[Option[org.joda.time.DateTime]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfNullableTimestamps") persistedOneArrayOfNullableTimestamps: Array[Option[org.joda.time.DateTime]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneArrayOfNullableTimestamps = if (oneArrayOfNullableTimestamps == null) Array.empty else oneArrayOfNullableTimestamps, _calculatedOneArrayOfNullableTimestamps = calculatedOneArrayOfNullableTimestamps, _persistedOneArrayOfNullableTimestamps = persistedOneArrayOfNullableTimestamps)

}

object OneArrayOfNullableTimestamps_4 extends AggregateRootCompanion[OneArrayOfNullableTimestamps_4]{

  def apply(
    oneArrayOfNullableTimestamps: Array[Option[org.joda.time.DateTime]] = Array.empty
  ) = {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableTimestamps)
    require(oneArrayOfNullableTimestamps ne null, "Null value was provided for property \"oneArrayOfNullableTimestamps\"")
    new OneArrayOfNullableTimestamps_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneArrayOfNullableTimestamps = oneArrayOfNullableTimestamps
    , _calculatedOneArrayOfNullableTimestamps = Array.empty
    , _persistedOneArrayOfNullableTimestamps = Array.empty)
  }

}
