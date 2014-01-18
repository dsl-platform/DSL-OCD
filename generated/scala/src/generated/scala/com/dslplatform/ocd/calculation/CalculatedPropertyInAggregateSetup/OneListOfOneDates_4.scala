package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneListOfOneDates_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneListOfOneDates: IndexedSeq[org.joda.time.LocalDate],
    private var _calculatedOneListOfOneDates: IndexedSeq[org.joda.time.LocalDate],
    private var _persistedOneListOfOneDates: IndexedSeq[org.joda.time.LocalDate]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneListOfOneDates_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneListOfOneDates_4("+ URI +")"

   def copy(oneListOfOneDates: IndexedSeq[org.joda.time.LocalDate] = this._oneListOfOneDates): OneListOfOneDates_4 = {

  require(oneListOfOneDates ne null, "Null value was provided for property \"oneListOfOneDates\"")
  com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneDates)
    new OneListOfOneDates_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneListOfOneDates = oneListOfOneDates, _calculatedOneListOfOneDates = _calculatedOneListOfOneDates, _persistedOneListOfOneDates = _persistedOneListOfOneDates)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfOneDates_4): this.type = {
    this._URI = result._URI
    this._oneListOfOneDates = result._oneListOfOneDates
    this._calculatedOneListOfOneDates = result._calculatedOneListOfOneDates
    this._persistedOneListOfOneDates = result._persistedOneListOfOneDates
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfOneDates_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneDates")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneListOfOneDates = {
    _oneListOfOneDates
  }

  def oneListOfOneDates_= (value: IndexedSeq[org.joda.time.LocalDate]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _oneListOfOneDates = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfOneDates")
  def calculatedOneListOfOneDates = {
    _calculatedOneListOfOneDates
  }

  def calculatedOneListOfOneDates_= (value: IndexedSeq[org.joda.time.LocalDate]) {
    _calculatedOneListOfOneDates = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfOneDates")
  def persistedOneListOfOneDates = {
    _persistedOneListOfOneDates
  }

  def persistedOneListOfOneDates_= (value: IndexedSeq[org.joda.time.LocalDate]) {
    _persistedOneListOfOneDates = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneDates") oneListOfOneDates: IndexedSeq[org.joda.time.LocalDate]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfOneDates") calculatedOneListOfOneDates: IndexedSeq[org.joda.time.LocalDate]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfOneDates") persistedOneListOfOneDates: IndexedSeq[org.joda.time.LocalDate]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneListOfOneDates = if (oneListOfOneDates == null) IndexedSeq.empty else oneListOfOneDates, _calculatedOneListOfOneDates = calculatedOneListOfOneDates, _persistedOneListOfOneDates = persistedOneListOfOneDates)

}

object OneListOfOneDates_4 extends AggregateRootCompanion[OneListOfOneDates_4]{

  def apply(
    oneListOfOneDates: IndexedSeq[org.joda.time.LocalDate] = IndexedSeq.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneDates)
    require(oneListOfOneDates ne null, "Null value was provided for property \"oneListOfOneDates\"")
    new OneListOfOneDates_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneListOfOneDates = oneListOfOneDates
    , _calculatedOneListOfOneDates = IndexedSeq.empty
    , _persistedOneListOfOneDates = IndexedSeq.empty)
  }

}
