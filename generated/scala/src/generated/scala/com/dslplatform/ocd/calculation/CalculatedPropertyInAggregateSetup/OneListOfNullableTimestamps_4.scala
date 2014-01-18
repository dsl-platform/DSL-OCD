package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneListOfNullableTimestamps_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneListOfNullableTimestamps: IndexedSeq[Option[org.joda.time.DateTime]],
    private var _calculatedOneListOfNullableTimestamps: IndexedSeq[Option[org.joda.time.DateTime]],
    private var _persistedOneListOfNullableTimestamps: IndexedSeq[Option[org.joda.time.DateTime]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneListOfNullableTimestamps_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneListOfNullableTimestamps_4("+ URI +")"

   def copy(oneListOfNullableTimestamps: IndexedSeq[Option[org.joda.time.DateTime]] = this._oneListOfNullableTimestamps): OneListOfNullableTimestamps_4 = {

  require(oneListOfNullableTimestamps ne null, "Null value was provided for property \"oneListOfNullableTimestamps\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableTimestamps)
    new OneListOfNullableTimestamps_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneListOfNullableTimestamps = oneListOfNullableTimestamps, _calculatedOneListOfNullableTimestamps = _calculatedOneListOfNullableTimestamps, _persistedOneListOfNullableTimestamps = _persistedOneListOfNullableTimestamps)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfNullableTimestamps_4): this.type = {
    this._URI = result._URI
    this._oneListOfNullableTimestamps = result._oneListOfNullableTimestamps
    this._calculatedOneListOfNullableTimestamps = result._calculatedOneListOfNullableTimestamps
    this._persistedOneListOfNullableTimestamps = result._persistedOneListOfNullableTimestamps
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfNullableTimestamps_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableTimestamps")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneListOfNullableTimestamps = {
    _oneListOfNullableTimestamps
  }

  def oneListOfNullableTimestamps_= (value: IndexedSeq[Option[org.joda.time.DateTime]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _oneListOfNullableTimestamps = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfNullableTimestamps")
  def calculatedOneListOfNullableTimestamps = {
    _calculatedOneListOfNullableTimestamps
  }

  def calculatedOneListOfNullableTimestamps_= (value: IndexedSeq[Option[org.joda.time.DateTime]]) {
    _calculatedOneListOfNullableTimestamps = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfNullableTimestamps")
  def persistedOneListOfNullableTimestamps = {
    _persistedOneListOfNullableTimestamps
  }

  def persistedOneListOfNullableTimestamps_= (value: IndexedSeq[Option[org.joda.time.DateTime]]) {
    _persistedOneListOfNullableTimestamps = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableTimestamps") oneListOfNullableTimestamps: IndexedSeq[Option[org.joda.time.DateTime]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfNullableTimestamps") calculatedOneListOfNullableTimestamps: IndexedSeq[Option[org.joda.time.DateTime]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfNullableTimestamps") persistedOneListOfNullableTimestamps: IndexedSeq[Option[org.joda.time.DateTime]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneListOfNullableTimestamps = if (oneListOfNullableTimestamps == null) IndexedSeq.empty else oneListOfNullableTimestamps, _calculatedOneListOfNullableTimestamps = calculatedOneListOfNullableTimestamps, _persistedOneListOfNullableTimestamps = persistedOneListOfNullableTimestamps)

}

object OneListOfNullableTimestamps_4 extends AggregateRootCompanion[OneListOfNullableTimestamps_4]{

  def apply(
    oneListOfNullableTimestamps: IndexedSeq[Option[org.joda.time.DateTime]] = IndexedSeq.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableTimestamps)
    require(oneListOfNullableTimestamps ne null, "Null value was provided for property \"oneListOfNullableTimestamps\"")
    new OneListOfNullableTimestamps_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneListOfNullableTimestamps = oneListOfNullableTimestamps
    , _calculatedOneListOfNullableTimestamps = IndexedSeq.empty
    , _persistedOneListOfNullableTimestamps = IndexedSeq.empty)
  }

}
