package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfNullableTimestamps_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneSetOfNullableTimestamps: Set[Option[org.joda.time.DateTime]],
    private var _calculatedOneSetOfNullableTimestamps: Set[Option[org.joda.time.DateTime]],
    private var _persistedOneSetOfNullableTimestamps: Set[Option[org.joda.time.DateTime]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfNullableTimestamps_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfNullableTimestamps_4("+ URI +")"

   def copy(oneSetOfNullableTimestamps: Set[Option[org.joda.time.DateTime]] = this._oneSetOfNullableTimestamps): OneSetOfNullableTimestamps_4 = {

  require(oneSetOfNullableTimestamps ne null, "Null value was provided for property \"oneSetOfNullableTimestamps\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableTimestamps)
    new OneSetOfNullableTimestamps_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneSetOfNullableTimestamps = oneSetOfNullableTimestamps, _calculatedOneSetOfNullableTimestamps = _calculatedOneSetOfNullableTimestamps, _persistedOneSetOfNullableTimestamps = _persistedOneSetOfNullableTimestamps)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfNullableTimestamps_4): this.type = {
    this._URI = result._URI
    this._oneSetOfNullableTimestamps = result._oneSetOfNullableTimestamps
    this._calculatedOneSetOfNullableTimestamps = result._calculatedOneSetOfNullableTimestamps
    this._persistedOneSetOfNullableTimestamps = result._persistedOneSetOfNullableTimestamps
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfNullableTimestamps_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableTimestamps")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfNullableTimestamps = {
    _oneSetOfNullableTimestamps
  }

  def oneSetOfNullableTimestamps_= (value: Set[Option[org.joda.time.DateTime]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _oneSetOfNullableTimestamps = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableTimestamps")
  def calculatedOneSetOfNullableTimestamps = {
    _calculatedOneSetOfNullableTimestamps
  }

  def calculatedOneSetOfNullableTimestamps_= (value: Set[Option[org.joda.time.DateTime]]) {
    _calculatedOneSetOfNullableTimestamps = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableTimestamps")
  def persistedOneSetOfNullableTimestamps = {
    _persistedOneSetOfNullableTimestamps
  }

  def persistedOneSetOfNullableTimestamps_= (value: Set[Option[org.joda.time.DateTime]]) {
    _persistedOneSetOfNullableTimestamps = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableTimestamps") oneSetOfNullableTimestamps: Set[Option[org.joda.time.DateTime]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableTimestamps") calculatedOneSetOfNullableTimestamps: Set[Option[org.joda.time.DateTime]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableTimestamps") persistedOneSetOfNullableTimestamps: Set[Option[org.joda.time.DateTime]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneSetOfNullableTimestamps = if (oneSetOfNullableTimestamps == null) Set.empty else oneSetOfNullableTimestamps, _calculatedOneSetOfNullableTimestamps = calculatedOneSetOfNullableTimestamps, _persistedOneSetOfNullableTimestamps = persistedOneSetOfNullableTimestamps)

}

object OneSetOfNullableTimestamps_4 extends AggregateRootCompanion[OneSetOfNullableTimestamps_4]{

  def apply(
    oneSetOfNullableTimestamps: Set[Option[org.joda.time.DateTime]] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableTimestamps)
    require(oneSetOfNullableTimestamps ne null, "Null value was provided for property \"oneSetOfNullableTimestamps\"")
    new OneSetOfNullableTimestamps_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneSetOfNullableTimestamps = oneSetOfNullableTimestamps
    , _calculatedOneSetOfNullableTimestamps = Set.empty
    , _persistedOneSetOfNullableTimestamps = Set.empty)
  }

}
